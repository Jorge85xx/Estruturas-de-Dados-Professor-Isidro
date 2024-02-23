struct Node{
    int element;
    struct Node *next;
};

struct List{
    struct Node *begin;
};

void add(struct List *list, int element);
int isEmpty(struct List list);
int removee(struct List *list);
void listt(struct List list);
void create(struct List *list);