/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        if (nullptr == list1) return list2; 
        if (nullptr == list2) return list1; 
        ListNode * l1 = list1; 
        ListNode * l2 = list2; 
        ListNode * l3 = nullptr; 
        /* assign new head */ 
        if (l1->val < l2->val) {
            l3 = l1; l1 = l1->next; 
        } else {
            l3 = l2; l2 = l2->next; 
        }
        /* move next */ 
        ListNode * l3Mov = l3; 
        while ((nullptr != l1) && (nullptr != l2)) {
            if(l1->val < l2->val) {
                l3Mov->next = l1; l3Mov = l3Mov->next; l1 = l1->next; 
            } else {
                l3Mov->next = l2; l3Mov = l3Mov->next; l2 = l2->next; 
            }
        }
        /* l1 left */ 
        while (nullptr != l1) {
            l3Mov->next = l1; l3Mov = l3Mov->next; l1 = l1->next; 
        }
        /* l2 left */ 
        while (nullptr != l2) {
            l3Mov->next = l2; l3Mov = l3Mov->next; l2 = l2->next; 
        }
        l3Mov->next = nullptr; 
        return l3; 
    }
};