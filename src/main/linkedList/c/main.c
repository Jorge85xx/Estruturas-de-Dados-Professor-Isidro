#include "linkedList.h"
#include <stdio.h>

int main(int argc, char *argv[]){
    struct List list;
    create(&list);
    add(&list, 987);
    add(&list, 712);
    add(&list, 543);
    add(&list, 1276);
    add(&list, 7);
    add(&list, 997);
    while(!isEmpty(list)){
        int e = removee(&list);
        printf("Element removed = %d\n", e);
    }


    return 0;
}