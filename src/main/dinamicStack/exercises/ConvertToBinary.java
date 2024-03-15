package main.dinamicStack.exercises;

import main.dinamicStack.DinamicStack;
import main.dinamicStack.Node;
import main.stack.Stack;

public class ConvertToBinary {

    public static void main(String[] args){

        int number = Integer.parseInt(args[0]);
        int rest;
        DinamicStack<Integer> s = new DinamicStack();
        //phase 1 - stacking
        while(number != 0){
            rest = number % 2; // i take the remainder of this division by 2
            s.push(rest); //storage in the main.stack
            number = number/2;
        }
        //phase 2 - unstacking
        while (!s.isEmpty()){
            rest = s.pop(); // Remove the guy at the top from the main.stack
            System.out.print(rest);
        }
        System.out.println("\nend of program");
    }

    //ex:
    /*172 / 2
     * 0    86 / 2
     *       0   43 / 2
     *            1   21  /  2
     *                 1     10  / 2
     *                        0     5  / 2
     *                               1    2 / 2
     *                                    0   1  / 2
     *                                         1    0
     * in other words (172)(10) = (010101100)*/
}
