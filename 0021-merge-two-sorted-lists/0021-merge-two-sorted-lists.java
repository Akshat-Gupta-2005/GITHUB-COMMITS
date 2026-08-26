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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // ListNode dummy = new ListNode(0);
        // ListNode temp = dummy;
        // while(list1 != null && list2 != null){
        //     if (list1.val < list2.val){
        //         temp.next = new ListNode(list1.val);
        //         list1 = list1.next;
        //     }else if (list1.val > list2.val){
        //         temp.next = new ListNode(list2.val);
        //         list2 = list2.next;
        //     }else{
        //         temp.next = new ListNode(list1.val);
        //         temp = temp.next;
        //         temp.next = new ListNode(list1.val);
        //         list1 = list1.next;
        //         list2 = list2.next;
        //     }
        //     temp = temp.next;
        // }

        // while(list1 != null){
        //     temp.next = new ListNode(list1.val);
        //     list1 = list1.next;
        //     temp = temp.next;
        // }
        // while(list2 != null){
        //     temp.next = new ListNode(list2.val);
        //     list2 = list2.next;
        //     temp = temp.next;
        // }
        // return dummy.next;

        ListNode dum = new ListNode(-1);

        ListNode cur = dum;
        ListNode t1 = list1;
        ListNode t2 = list2;

        while (t1 != null && t2 !=null){
            if (t1.val <= t2.val){
                cur.next = t1;
                cur = cur.next;
                t1 = t1.next;
            }else{
                cur.next = t2;
                cur = cur.next;
                t2 = t2.next;
            }
        }        

        while(t1!=null){
            cur.next = t1;
            cur = cur.next;
            t1 = t1.next;
        }
        while(t2!=null){
            cur.next = t2;
            cur = cur.next;
            t2 = t2.next;
        }

        return dum.next;
        
        
    }
}