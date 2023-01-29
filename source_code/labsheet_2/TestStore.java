package source_code.labsheet_2;

import java.util.Scanner;

public class TestStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer name: ");
        String customerName = scanner.next();
        scanner.nextLine();

        System.out.println("Enter customer id number: ");
        String customerIdNo = scanner.next();
        scanner.nextLine();

        System.out.println("Enter customer balance: ");
        double customerBalance = scanner.nextDouble();

        // Customer instance
        Customer customer = new Customer(customerName, customerIdNo, customerBalance);

        System.out.println("Enter first item name: ");
        String itemName1 = scanner.next();
        scanner.nextLine();

        System.out.println("Enter first item id number: ");
        String itemIdNo1 = scanner.next();
        scanner.nextLine();

        System.out.println("Enter first item quantity: ");
        int itemQuantity1 = scanner.nextInt();

        System.out.println("Enter first item price: ");
        double itemPrice1 = scanner.nextDouble();

        Item item1 = new Item(itemName1, itemIdNo1, itemQuantity1, itemPrice1);

        System.out.println("Enter second item name: ");
        String itemName2 = scanner.next();
        scanner.nextLine();

        System.out.println("Enter second item id number: ");
        String itemIdNo2 = scanner.next();
        scanner.nextLine();

        System.out.println("Enter second item quantity: ");
        int itemQuantity2 = scanner.nextInt();

        System.out.println("Enter second item price: ");
        double itemPrice2 = scanner.nextDouble();

        Item item2 = new Item(itemName2, itemIdNo2, itemQuantity2, itemPrice2);

        customer.buyItem(item1);
        customer.buyItem(item2);

        for (Item item : customer.getItems()) {
            System.out.println(item.toString());
        }
    }
}
