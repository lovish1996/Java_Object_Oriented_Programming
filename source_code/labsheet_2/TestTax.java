package source_code.labsheet_2;

public class TestTax {
    public static void main(String[] args) {
        TaxOnSalary tax1 = new TaxOnSalary(false);
        TaxOnSalary tax2 = new TaxOnSalary();

        tax1.inputSalary();
        tax2.inputSalary();

        System.out.println(tax1.calculateTax());
        System.out.println(tax2.calculateTax());
    }
}
