package source_code.labsheet_5;

public class Example3Test {
    public static void main(String[] args) {
        new E().show();     // anonymous object, there is no reference variable.
        A a = new E();
        System.out.println("class A variable a =  " + a.a);
        D d = (D) a;
        System.out.println("class D variable a =  " + d.a);
    }
}

class A {
    public int a = 100;
}

class B extends A {
    public int a = 80;
}

class C extends B {
    public int a = 60;
}

class D extends C {
    public int a = 40;
}

class E extends D {
    public int a = 10;

    public void show() {
        int a = 0;
        System.out.println("Local variable a = " + a);
        System.out.println("class E variable a =  " + this.a);
        System.out.println("class D variable a = " + super.a);
        C c = this;
        System.out.println("class C variable a = " + c.a);
        B b = this;
        System.out.println("class B variable a = " + b.a);
        A a2 = this;
        System.out.println("class A variable a = " + a2.a);
    }


}