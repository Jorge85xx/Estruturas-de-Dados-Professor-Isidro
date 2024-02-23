#include "linkedList.h"
#include <stdlib.h>

void create(struct List *list){
    list->begin = NULL;
}

void add(struct List *list, int element){
    struct Node *new;
    struct Node *aux;
    new = (struct Node*) malloc(sizeof(struct Node));
    new->next = NULL;
    new->element = element;
    if(list->begin == NULL){
        list->begin = new;
    }else{
        aux = list->begin;
        while(aux->next != NULL){
            aux = aux->next;
        }
        aux->next = new;

    }

}
int isEmpty(struct List list){
    return (list.begin == NULL);
}
int removee(struct List *list){
    struct Node *aux = list->begin;
    int element = aux->element;
    list->begin = aux->next;
    free(aux);
    aux = NULL;
    return element;
}
void listt(struct List list){
}