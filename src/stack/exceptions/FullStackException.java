package stack.exceptions;

import java.util.Stack;

public class FullStackException extends RuntimeException{
    public FullStackException(String message){
        super(message);
    }
}
