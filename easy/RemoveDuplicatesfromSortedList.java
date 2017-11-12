package easy;

/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * <p>
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 */

//Definition for singly-linked list.


public class RemoveDuplicatesfromSortedList {
    //Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
//        ListNode tmp = head;
//        while(!(tmp == null)){
//            while (tmp.next != null && tmp.val == tmp.next.val){
//                tmp.next = tmp.next.next;
//            }
//            tmp = tmp.next;
//        }
//        return head;
        if (head == null || head.next == null) return head;
        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val ? head.next : head;
    }
}
