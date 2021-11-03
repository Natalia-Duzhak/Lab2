package task1;

public class B  extends A{
    public static int b = 20;

    public B() {
        System.out.println(" public static int a = " + a);
        System.out.println(" public static int b = " + b);
    }

    private String name = "B";

    public B(final String name) {
        this.name = name;
    }
    {
        System.out.print(" public  name = " + name + '\n');
    }
}
