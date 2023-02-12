package source_code.labsheet_6;

import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Math.abs;

public class OneComplement implements BinaryInterface {
    public ArrayList<Integer> arr;

    public OneComplement() {
        this.arr = new ArrayList<>();
    }

    @Override
    public void toBinary(int number) {
        int num = abs(number);
        int count = 0;
        while (num != 0 || count < 8) {
            int digit = (num + 1) % 2;
            num /= 2;
            arr.add(digit);
            count++;
        }
        Collections.reverse(arr);
        if (number >= 0)
            arr.set(0, 0);
    }

    public static void main(String[] args) {
        OneComplement oneComplement = new OneComplement();
        oneComplement.toBinary(16);
        System.out.println(oneComplement.arr);
    }
}
