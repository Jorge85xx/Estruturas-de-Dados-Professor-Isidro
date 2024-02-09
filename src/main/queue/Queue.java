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
            this.end = (this.end+1)%10; //assim zero vai sempre ir de 1 ate 9, ja que 10/10 é resto 0 e qualquer numero abaixo vai sobrar ele mesemo
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

}
