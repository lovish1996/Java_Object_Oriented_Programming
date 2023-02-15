package source_code.labsheet_7;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        System.out.println("Size of arrayList: " + arrayList.size());
        arrayList.add("B");
        arrayList.add("I");
        arrayList.add("T");
        arrayList.add("S");
        System.out.println("Size of arrayList: " + arrayList.size());
        System.out.println("Elements of arrayList: " + arrayList);

        arrayList.remove("B");      // remove by object
        System.out.println("Elements of arrayList: " + arrayList);

        arrayList.remove(2);    // remove by index
        System.out.println("Elements of arrayList: " + arrayList);

        System.out.println("Size of arrayList: " + arrayList.size());

        System.out.println(arrayList.contains("T"));    // Existence of element
    }
}
