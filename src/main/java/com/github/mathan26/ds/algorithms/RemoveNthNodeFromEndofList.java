package com.github.mathan26.ds.algorithms;

/*
19. Remove Nth Node From End of List
Given the head of a linked list, remove the nth node from the end of the list and return its head.
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
*/
public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        //create dummy
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // assign the dummy to both
        ListNode slow = dummy;
        ListNode fast = dummy;

        // first move the offset of fast
        for(int i =1; i<= n+1; i++){
            fast = fast.next;
        }

        // now slow pointer will be in the node before it is deleted
        while(fast != null){
            slow  = slow.next;
            fast = fast.next;
        }

        // delete the node link and point to the next
        slow.next = slow.next.next;

        return dummy.next;
    }
}
