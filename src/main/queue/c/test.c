#include <stdio.h>
#include "queue.h"

int main(int argc, char *argv[]){
    struct Queue q;
    create(&q);
    add(&q,347);
    add(&q,917);
    add(&q,14);
    add(&q,872);
    add(&q,5763);
    printf("-----Teste com senhas de banco-----");
    while(!isEmpty(q)){
        int element = removee(&q);
        printf("\n%d", element);
    }

    return 0;
}