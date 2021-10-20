package com.github.mathan26.ds.algorithms;
/*
        876. Middle of the Linked List
        Given the head of a singly linked list, return the middle node of the linked list.

        If there are two middle nodes, return the second middle node.
        Input: head = [1,2,3,4,5]
        Output: [3,4,5]
        Explanation: The middle node of the list is node 3.
 */
public class MiddleoftheLinkedList {
    public ListNode middleNode(ListNode head) {
        // both pointer pointing to head initially
        ListNode slow = head;
        ListNode fast = head;

        // trick is move one pointer faster than the other, so
        // eventually slow pointer will point to the middle
        while(fast != null && fast.next !=null){ // fast.next also need to check
            slow = slow.next;
            fast = fast.next.next; // two pointer faster than slow
        }

        return slow;
    }
}



class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
