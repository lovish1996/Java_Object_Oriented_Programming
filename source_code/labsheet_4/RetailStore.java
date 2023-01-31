package source_code.labsheet_4;

public class RetailStore {
    private int[] itemIds = {1001, 1002, 1003, 1004, 1005};
    private double[] prices = {13.50, 18.00, 19.50, 25.50, 20.00};

    private double computePrice(int itemId) {   // private because we are accessing it in the same class
        int n = itemIds.length;

        for (int i = 0; i < n; i++) {
            if (itemId == itemIds[i]) {
                return prices[i];
            }
        }
        return prices[itemId];      // in case we pass index instead of itemId
    }

    public static void main(String[] args) {
        RetailStore retailStore = new RetailStore();
        System.out.println("Price of item id: 1002 is " + retailStore.computePrice(1002));
        System.out.println("Price of item id: 1005 is " + retailStore.computePrice(1005));

        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1009 out of bounds for length 5
        System.out.println("Price of item id: 1009 is " + retailStore.computePrice(1009));

    }
}
