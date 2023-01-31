package source_code.labsheet_4;

import java.util.StringTokenizer;

public class RetailStoreExample extends RetailStore {
    public static void main(String[] args) {
        int index;
        RetailStore retailStore = new RetailStore();

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

    }
}
