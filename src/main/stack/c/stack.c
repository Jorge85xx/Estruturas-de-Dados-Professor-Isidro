#include "stack.h"

void create(struct Stack *s){
    s->top = -1;
}

void push(struct Stack *s, int element){
    s->top++;
    s->values[s->top] = element;
}

int pop(struct Stack *s){
    int element = s->values[s->top];
    s->top--;
    return element;
}

int isEmpty(struct Stack s){
    return (s.top == 1);
}

int isFull(struct Stack s){
    return (s.top == 9);
}



