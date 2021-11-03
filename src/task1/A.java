package task1;

public class A {

    public static int a = 10;

    public A() {
        System.out.println(" public static int a = " + a);
    }
    private String name = "A";

    public A(final String name) {
        this.name = name;
    }
    {
        System.out.print(" public  name = " + name + '\n');
    }
}

