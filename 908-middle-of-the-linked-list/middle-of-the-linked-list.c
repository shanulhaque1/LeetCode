
/*Definition for singly-linked list.
  struct ListNode {
      int val;
      struct ListNode *next;
  };
  */
 
struct ListNode* middleNode(struct ListNode* head) {
    int count =0;

    struct ListNode *temp = head;
    while(temp!=NULL){
        count ++;
        temp = temp -> next;
    }


    int middle = 0;
    if(count %2!= 0){
         middle = (count +1)/2;
    }

    if(count %2==0) { middle =(count/2) +1 ;}

    struct ListNode *mid = head;

    int find =1;
    while( mid != NULL){
        if(find==middle)
        return mid;
        find ++;
        mid= mid->next;

    }
    return 0;


}