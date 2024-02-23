package main.linkedList;

import main.linkedList.exceptions.EmptyListException;

public class LinkedList<TYPE> {

    private Node<TYPE> begin;

    private Integer size;


    public LinkedList() {
        this.begin = null;
        this.size = 0;
    }

    public void add(TYPE element){
        Node<TYPE> newElement = new Node<>();
        newElement.setElement(element);
        newElement.setNext(null);
        if(begin == null){
            begin = newElement;
        }else {
            Node<TYPE> aux;
            aux = begin;
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(newElement);
        }
        size++;
    }

    public TYPE delete(){
        TYPE element = begin.getElement();
        if(!isEmpty()){
            Node<TYPE> aux = begin.getNext();
            this.begin = aux;
            this.size--;
            return element;
        }else {
            throw new EmptyListException("The list is empty, add something.");
        }
    }

    public void list(){
        if(begin == null){
            System.out.println("List is empty");
        }else {
            Node<TYPE> aux = begin;
            int i = 1;
            while (aux != null){
                System.out.println("Element "+ i + " "+ aux.getElement());
                aux = aux.getNext();
                i++;
            }
        }
    }
    public Boolean isEmpty(){
        return this.begin == null;
    }

    public Integer size(){
        return this.size;
    }

}
