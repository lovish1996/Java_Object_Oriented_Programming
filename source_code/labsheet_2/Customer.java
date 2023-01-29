package source_code.labsheet_2;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String idNo;
    private double balance;
    private List<Item> items;

    public Customer(String name, String idNo, double balance) {
        this.name = name;
        this.idNo = idNo;
        this.balance = balance;
        items = new ArrayList<>();
    }

    public Customer(String name, String idNo) {
        this.name = name;
        this.idNo = idNo;
        this.balance = 5000;
        items = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Item> getItems() {
        return items;
    }

    public void print(Item item) {
        double balanceAmount = getBalance() - item.getItemPrice() * item.getItemQuantity();
        System.out.println("Item: [" + " itemName: " + item.getItemName() + ", itemIdNo: "
                + item.getItemIdNo() + ", itemQuantity: " + item.getItemQuantity() +
                ", itemPrice: " + item.getItemPrice() + ", balanceAmount: " + balanceAmount + "]");
    }

    public void buyItem(Item item) {
        double remainingBalance = getBalance() - item.getItemPrice() * item.getItemQuantity();
        int quantity = item.getItemQuantity();

        if (remainingBalance >= 0 && quantity >= 1) {
            print(item);
            setBalance(remainingBalance);
            getItems().add(item);
        } else if (remainingBalance < 0) {
            System.out.println("Insufficient Balance!");
        } else if (quantity < 1) {
            System.out.println("Order is not valid.");
        }

    }
}
