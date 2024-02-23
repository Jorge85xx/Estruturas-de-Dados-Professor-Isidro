package main.linkedList;

public class Node<TYPE> {

    private TYPE element;
    private Node<TYPE> next;

    public Node() {
    }

    public TYPE getElement() {
        return element;
    }

    public void setElement(TYPE element) {
        this.element = element;
    }

    public Node<TYPE> getNext() {
        return next;
    }

    public void setNext(Node<TYPE> next) {
        this.next = next;
    }
}
