package main.queue;

import main.queue.exceptions.EmptyQueueException;
import main.queue.exceptions.FullQueueException;

public class Queue {

    private int[] values;
    private int total;
    private int begin;
    private int end;

    public Queue() {
        this.values = new int[10];
        this.begin = 0;
        this.end = 0;
        this.total = 0;
    }
    public void add(int number){
        if(!isFull()){
            values[this.end] = number;
            this.end = (this.end+1)%10; //Thus, zero will always go from 1 to 9, since 10/10 is remainder 0, and any number below will remain itself.
            this.total++;
        }else{
            throw new FullQueueException("The main.queue is full, remove something first.");
        }
    }

    public int remove(){
        if(!isEmpty()){
            int getOut = this.values[this.begin];
            this.begin = (this.begin+1)%10;
            this.total--;
            return getOut;
        }else{
            throw new EmptyQueueException("The main.queue is empty, add something first.");
        }
    }

    public boolean isEmpty(){
        return (this.total == 0);
    }

    public boolean isFull(){
        return (this.total == 10);
    }

    public int size(){
        return this.total;
    }

}
