/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        // if (head == null) return null;
        // ListNode p = null;
        // ListNode c = head;
        // if (head.next == null) return head;
        // ListNode n = head.next;

        // while(c.next!= null){
        //     c.next = p;
        //     p = c;
        //     c = n;
        //     n = c.next;
        // }

        // c.next = p;

        // return c;

        // if (head == null || head.next == null) return head;
        // ListNode prev = null;
        // ListNode curr = head;
        // ListNode next = curr.next;

        // while(curr != null){
        //     next = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = next;
        // }    

        if (head == null || head.next == null) return head;

        ListNode prev = null;
        while(head!=null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        } 
        return prev;
        
    }
}