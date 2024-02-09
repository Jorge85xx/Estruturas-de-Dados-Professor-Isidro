struct Stack{
    int top;
    int values[10];
};

void create(struct Stack *s);
void push(struct Stack *s, int element);
int pop(struct Stack *s);
int isEmpty(struct Stack s);
int isFull(struct Stack s);

