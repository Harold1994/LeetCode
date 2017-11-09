package easy;

  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }


/**
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 */
public class MergeSortedLists {
//    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode ln = new ListNode(0);
//        ListNode p = ln;
//        while(l1 != null && l2 != null){
//            if(l1.val>l2.val){
//                p.next = new ListNode(l2.val);
//                l2 = l2.next;
//            }else{
//                p.next = new ListNode(l1.val);
//                l1 = l1.next;
//            }
//            p = p.next;
//        }
//        while(l1 != null){
//            p.next = new ListNode(l1.val);
//            l1 = l1.next;
//            p=p.next;
//        }
//        while(l2 != null){
//            p.next = new ListNode(l2.val);
//            l2 = l2.next;
//            p=p.next;
//        }
//        return ln.next;
//    }
public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if(l1 == null)
        return l2;
    if(l2 == null)
        return l1;
    ListNode mergeHead = null;
    if(l1.val < l2.val){
        mergeHead =l1;
        mergeHead.next = mergeTwoLists(l1.next,l2);
    }
    if(l1.val >= l2.val){
        mergeHead =l2;
        mergeHead.next = mergeTwoLists(l1,l2.next);
    }
    return mergeHead;
}
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(8);
        l1.next.next = new ListNode(150);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(10);
        ListNode l3 = mergeTwoLists(l1,l2);
        while (l3!=null){
            System.out.println(l3.val);
            l3 = l3.next;
        }


    }
}
