/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeElements(struct ListNode* head, int val) {

    while(head!=NULL){
    if(head->val==val){
        head=head->next;
    }
    else break;
    }

    struct ListNode*temp = head;
    
    
    
    while(temp != NULL && temp->next!=NULL){
        if(temp->next->val == val){
            temp->next = temp->next->next;
        }
        else
        temp = temp->next;
    }
    
    return head;
}