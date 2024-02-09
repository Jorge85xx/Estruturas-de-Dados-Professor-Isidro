#include "queue.h"

void create(struct Queue *q){
    q->begin = 0;
    q->end = 0;
    q->total = 0;
}
void add(struct Queue *q, int element){
    q->values[q->end] = element;
    q->end = (q->end+1) % 10;
    q -> total = q->total + 1;
}
int removee(struct Queue *q){
    int element = q->values[q->begin];
    q->begin = (q->begin+1) % 10;
    q->total = q->total - 1;
    return element;
}
int isEmpty(struct Queue q){
    return (q.total == 0);
}
int isFull(struct Queue q){
    return (q.total == 10);
}