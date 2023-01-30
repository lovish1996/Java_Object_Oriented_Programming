package source_code.labsheet_3;

/**
 * First object:
 * 0 1 2 3 4 5 6 7 8 9
 * Second object:
 * 100 1 2 3 100 5 6 7 8 9
 */
public class StaticBlock {
    static int[] values = initializeArray(10);

    private static int[] initializeArray(int n) {
        int[] values = new int[n];

        for (int i = 0; i < values.length; i++) {
            values[i] = i;
        }

        return values;
    }

    void listValues() {
        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StaticBlock staticBlock = new StaticBlock();
        System.out.println("First object: ");
        staticBlock.listValues();

        values[0] = values[4] = 100;

        staticBlock = new StaticBlock();
        System.out.println("Second object: ");
        staticBlock.listValues();
    }
}
