#include <stdio.h>
#include "stack.h"

int main(int argc, char *argv[]){
    int value = 0, rest = 0;
    struct Stack s;
    printf("enter a value: ");
    scanf("%d", &value);
    create(&s);
    //part 1
    while(value != 0){
        rest = value%2;
        push(&s, rest);
        value = value/2;
    }
    //part 2
    while(!isEmpty(s)){
        rest = pop(&s);
        printf("%d", rest);
    }
    printf("\n\n\n");

    return 0;
}
