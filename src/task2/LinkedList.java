package task2;

import java.util.Iterator;

public class LinkedList implements Stack,Iterable<Integer> {

    private Node top;

    public LinkedList(final Node top) {
        this.top = top;
    }

    public LinkedList() {
        this.top = null;
    }

    @Override
    public int size() {
        int size = 0;
        if (top == null) {
            return size;
        }
        Node pointer = top;

        while (pointer != null) {
            ++size;
            pointer = pointer.getNext();
        }
        return size;
    }

    @Override
    public void push(final int data) {

        final Node pointer = new Node();

        pointer.setData(data);
        pointer.setNext(top);
        top = pointer;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public int peek() {
        if (!isEmpty()) {
            return top.getData();
        } else {
            return -1;
        }
    }

    public int pop() {
        if (top == null) {
            System.out.print("\nStack Underflow");
            return 0;
        }
        System.out.println(peek());
         final Node pointer = top;
        top = pointer.getNext();
        return pointer.getData();


    }

    @Override
    public Iterator<Integer> iterator() {
        return new LinkedListIterator();
    }
    private class LinkedListIterator implements Iterator<Integer>{

        Node next = top;

        @Override
        public boolean hasNext() {
            return next != null;
        }

        @Override
        public Integer next() {
            final int value = next.getData();
            next = next.getNext();
            return value;
        }
    }
}