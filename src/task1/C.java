package task1;

public class C extends B{
    public static int c = 30;

    public C() {
        System.out.println(" public static int a = " + a);
        System.out.println(" public static int b = " + b);
        System.out.println(" public static int c = " + c);
    }

    private String name = "C";

    public C(final String name) {
        this.name = name;
    }
    {
        System.out.print(" public  name = " + name + '\n');
    }

}
