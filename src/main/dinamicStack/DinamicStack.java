package main.dinamicStack;


import java.util.Stack;

public class DinamicStack<Type> {

    private Node<Type> top;


    public DinamicStack() {
        this.top = null;
    }

    public void push(Type element){
        Node<Type> newElement = new Node<>();
        newElement.setElement(element);
        newElement.setNext(top);
        top = newElement;
    }

    public Type pop(){
        Type element = top.getElement();
        top = top.getNext();
        return element;
    }

    public boolean isEmpty(){
        return (top == null);
    }
}
