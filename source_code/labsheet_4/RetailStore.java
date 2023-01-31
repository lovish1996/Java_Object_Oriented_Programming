package source_code.labsheet_4;

public class RetailStore {
    private int[] itemIds;
    private double[] prices;
    private String[] itemNames;

    public RetailStore() {
        itemIds = new int[]{1001, 1002, 1003, 1004, 1005};
        prices = new double[]{950.00, 750.00, 450.00, 350.00, 250.00};
        itemNames = new String[]{"Yonex Tennis Racket-950", "Yonex Badminton Racket-750", "Silvers Badminton Racket-450", "Cosco Badminton Shuttle-450", "Cosco Tennis Racket-250"};
    }

    protected double computePrice(int itemId) {   // private because we are accessing it in the same class
        int n = itemIds.length;

        for (int i = 0; i < n; i++) {
            if (itemId == itemIds[i]) {
                return prices[i];
            }
        }
        return prices[itemId];      // in case we pass index instead of itemId
    }

    protected String fetchDescription(int itemId) {
        for (int i = 0; i < prices.length; i++) {
            if (itemIds[i] == itemId) {
                return itemNames[i];
            }
        }
        return itemNames[itemId];   // in case we pass index instead of itemId
    }

    public static void main(String[] args) {
        RetailStore retailStore = new RetailStore();
        System.out.println("Price of item id: 1002 is " + retailStore.computePrice(1002));
        System.out.println("Price of item id: 1005 is " + retailStore.computePrice(1005));

        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1009 out of bounds for length 5
        System.out.println("Price of item id: 1009 is " + retailStore.computePrice(1009));

    }
}
