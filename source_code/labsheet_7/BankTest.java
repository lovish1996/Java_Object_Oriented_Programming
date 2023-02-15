package source_code.labsheet_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ListIterator;
import java.util.Scanner;

public class BankTest {
    private static Scanner scanner;
    private static File file;

    public static Account readSingleAccount(Scanner scanner) {
        long accountNumber = scanner.nextLong();
        double balance = scanner.nextDouble();
        String name = scanner.next();
        Account account = new Account(accountNumber, balance, name);
        return account;
    }

    public static void readAccounts(Scanner scanner, Bank bank) {
        for (int i = 0; i < 23; i++) {
            bank.addNewAccount(readSingleAccount(scanner));
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Bank bank = new Bank(24);
        file = new File("/Users/lovisharora/Documents/Java_Object_Oriented_Programming/source_code/labsheet_7/account_records.txt");
        scanner = new Scanner(file);
        readAccounts(scanner, bank);

        System.out.println("Current count of accounts: " + bank.currentActiveAccounts());

        bank.addNewAccount(readSingleAccount(scanner));
        if (!bank.addNewAccount(readSingleAccount(scanner))) {
            System.out.println("Maximum limit reached for the bank.");
        }

        System.out.println("New count of accounts: " + bank.currentActiveAccounts());

        System.out.println();
        System.out.println("List of Active Accounts:");
        System.out.println(bank);

        bank.removeAccount(11000110102L);
        bank.removeAccount(11000110103L);
        bank.removeAccount(11000110105L);

        System.out.println();
        System.out.println("List of Active Accounts:");
        ListIterator listIterator = bank.getAccounts().listIterator();
        while (listIterator.hasNext()) {
            System.out.println((Account) listIterator.next());
        }

        System.out.println();
        System.out.println("Deposit money into first account");
        bank.deposit(11000110101L, 5000.00);

        System.out.println(bank.getAccounts().get(0));

        System.out.println();
        System.out.println("Withdraw money from second account");
        bank.withdraw(11000110104L, 50.00);

        System.out.println(bank.getAccounts().get(1));

        System.out.println();
        System.out.println("Withdraw money from second account");
        bank.withdraw(11000110106L, 650.00);    // Can't withdraw more than the balance

        System.out.println(bank.getAccounts().get(2));

    }
}
