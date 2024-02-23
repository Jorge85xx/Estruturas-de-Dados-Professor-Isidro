package main.linkedList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(872);
        list.add(8123);
        list.add(123);
        list.add(2);
        System.out.println(list.size());
        list.list();
        while(!list.isEmpty()){
            Integer e = list.delete();
            System.out.println("Retirei o elemento " + e);
        }
        System.out.println(list.isEmpty());
        System.out.println(list.size());
    }
}
