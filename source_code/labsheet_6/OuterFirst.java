package source_code.labsheet_6;

/**
 * Instantiating an inner class inside its outer class
 */
public class OuterFirst {
    InnerFirst innerFirst = new InnerFirst();
    private String s = "Outer class";

    public String getS() {
        return s;
    }

    public String getInnerS() {
        return innerFirst.getS();
    }

    class InnerFirst {
        private String s = "Inner class";

        public String getS() {
            return s;
        }

        public String getOuterS() {
            return OuterFirst.this.getS();
        }
    }

    public static void main(String[] args) {
        OuterFirst outerFirst = new OuterFirst();
        OuterFirst.InnerFirst innerFirst = outerFirst.new InnerFirst();

        System.out.println(outerFirst.getS());
        System.out.println(outerFirst.getInnerS());

        System.out.println(innerFirst.getS());
        System.out.println(innerFirst.getOuterS());
    }
}
