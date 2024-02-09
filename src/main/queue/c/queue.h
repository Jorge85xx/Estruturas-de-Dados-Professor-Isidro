struct Queue{
    int begin;
    int end;
    int total;
    int values[10];
};

void create(struct Queue *q);
void add(struct Queue *q, int element);
int removee(struct Queue *q);
int isEmpty(struct Queue q);
int isFull(struct Queue q);