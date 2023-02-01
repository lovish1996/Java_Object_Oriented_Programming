package source_code.labsheet_4;

import java.util.Vector;

public class RetailStore {
    private Vector<Item> items = new Vector<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public RetailStore() {

    }

    protected double computePrice(int itemId) {   // private because we are accessing it in the same class

        for (Item item : items) {
            if (item.getItemId() == itemId) {
                return item.getPrice();
            }
        }
        return items.elementAt(itemId).getPrice();      // in case we pass index instead of itemId
    }

    protected String fetchDescription(int itemId) {
        for (Item item : items) {
            if (item.getItemId() == itemId) {
                return item.getItemName();
            }
        }
        return items.elementAt(itemId).getItemName();   // in case we pass index instead of itemId
    }

    public static void main(String[] args) {
        RetailStore retailStore = new RetailStore();
        retailStore.addItem(new Item(1001, 950.00, "Yonex Tennis Racket-950"));
        retailStore.addItem(new Item(1002, 750.00, "Yonex Badminton Racket-750"));
        retailStore.addItem(new Item(1003, 450.00, "Silvers Badminton Racket-450"));
        retailStore.addItem(new Item(1004, 350.00, "Cosco Badminton Shuttle-450"));
        retailStore.addItem(new Item(1005, 250.00, "Cosco Tennis Racket-250"));
        System.out.println("Price of item id: 1002 is " + retailStore.computePrice(1002));
        System.out.println("Price of item id: 1005 is " + retailStore.computePrice(1005));

        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1009 out of bounds for length 5
        System.out.println("Price of item id: 1009 is " + retailStore.computePrice(1009));

    }
}
