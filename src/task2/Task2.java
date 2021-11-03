package task2;


import java.util.Iterator;

public class Task2 {
    public static void main(final String[] args) {
        final Stack stack = new LinkedList();


        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.print("Size of stack: " + stack.size());
        System.out.println();


        System.out.println("The top element is " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();

        if (stack.isEmpty()) {
            System.out.print("The stack is empty");
        } else {
            System.out.print("The stack is not empty");


        }
        System.out.println();


        final LinkedList iterable = new LinkedList();

        iterable.push(11);
        iterable.push(22);
        iterable.push(21);


        for (final int i : iterable) {
            System.out.println(i);
        }
    }
}
