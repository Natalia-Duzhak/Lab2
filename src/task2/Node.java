package task2;


public class Node {

    public int data;       // integer data
    public Node next;      // pointer to the next node

    public Node() {
    }

    public Node(final int node, final Node text) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(final int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(final Node next) {
        this.next = next;
    }
}
