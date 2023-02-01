package source_code.labsheet_4;

import java.util.StringTokenizer;

public class RetailStoreExample extends RetailStore {
    public static void main(String[] args) {
        int index;
        RetailStore retailStore = new RetailStore();
        retailStore.addItem(new Item(1001, 950.00, "Yonex Tennis Racket-950"));
        retailStore.addItem(new Item(1002, 750.00, "Yonex Badminton Racket-750"));
        retailStore.addItem(new Item(1003, 450.00, "Silvers Badminton Racket-450"));
        retailStore.addItem(new Item(1004, 350.00, "Cosco Badminton Shuttle-450"));
        retailStore.addItem(new Item(1005, 250.00, "Cosco Tennis Racket-250"));

        String description = retailStore.fetchDescription(1005);

        String[] stringArray;
        stringArray = description.split("\\s");     // space character: \\s

        for (String s : stringArray) {
            System.out.println(s);
        }
        System.out.println();

        StringTokenizer stringTokenizer = new StringTokenizer(description);

        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
        System.out.println();

        String itemType = stringArray[2];
        System.out.println("The type of the item is: " + itemType);
        System.out.println("The character at starting position is: " + itemType.charAt(0));

        index = itemType.indexOf('-');
        String stringFromSubstring = itemType.substring(index + 1);

        System.out.println("The price computed using the substring method is: " + stringFromSubstring);

        String stringFromDouble = Double.toString(retailStore.computePrice(1005));
        System.out.println("The price of the item computed using Double.toString() method is: " + stringFromDouble);

        index = stringFromDouble.indexOf('.');

        System.out.println("Prices from last two calls are same: " + stringFromDouble.substring(0, index).equals(stringFromSubstring));

    }
}
