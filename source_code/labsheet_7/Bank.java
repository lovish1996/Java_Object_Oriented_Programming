package source_code.labsheet_7;

import java.util.ArrayList;
import java.util.ListIterator;

public class Bank {
    private ArrayList<Account> accounts;
    int maxActiveAccounts;

    public Bank(int maxActiveAccounts) {
        this.accounts = new ArrayList();
        this.maxActiveAccounts = maxActiveAccounts;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public boolean addNewAccount(Account account) {
        if (accounts.size() == maxActiveAccounts)
            return false;

        accounts.add(account);
        return true;
    }

    public boolean removeAccount(long accountNumber) {
        if (accounts.size() == 0)
            return false;

        ListIterator accountsIterator = accounts.listIterator();
        while (accountsIterator.hasNext()) {
            Account account = (Account) accountsIterator.next();
            if (account.getAccountNumber() == accountNumber) {
                accountsIterator.remove();
                return true;
            }
        }
        return false;
    }

    public double deposit(long accountNumber, double amount) {
        ListIterator accountsIterator = accounts.listIterator();

        while (accountsIterator.hasNext()) {
            Account account = (Account) accountsIterator.next();
            if (account.getAccountNumber() == accountNumber) {
                account.setBalance(account.getBalance() + amount);
                return account.getBalance();
            }
        }
        return -1;
    }

    public double withdraw(long accountNumber, double amount) {
        ListIterator accountsIterator = accounts.listIterator();
        double balance;

        while (accountsIterator.hasNext()) {
            Account account = (Account) accountsIterator.next();
            if (account.getAccountNumber() == accountNumber) {
                balance = account.getBalance();
                if (amount > balance) {
                    return -1;
                }
                account.setBalance(account.getBalance() - amount);
                return account.getBalance();
            }
        }
        return -1;
    }

    public int currentActiveAccounts() {
        return accounts.size();
    }

    @Override
    public String toString() {
        ListIterator listIterator = accounts.listIterator();

        StringBuilder bank = new StringBuilder("maxActiveAccounts: " + maxActiveAccounts + "\n");

        while (listIterator.hasNext()) {
            Account account = (Account) listIterator.next();
            bank.append(account.toString() + "\n");
        }
        return bank.toString();
    }
}
