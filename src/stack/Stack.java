package stack;

import stack.exceptions.EmptyStackException;
import stack.exceptions.FullStackException;

public class Stack {

    private int[] values;
    private int top;
    public Stack(){
        values = new int[10];
        top = -1;
    }

    public void push(int element){
        if(!isFull()){
            top++;
            values[top] = element;
        }else{
            throw new EmptyStackException("the stack is empty, stack something first");
        }
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == 9);
    }

    public int pop(){
        if(!isEmpty()){
            int elem = values[top];
            top--;
            return elem;
        }else {
            throw new FullStackException("the stack is full, pop something first");
        }

    }

}
