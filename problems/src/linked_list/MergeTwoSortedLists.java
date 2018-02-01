/**
 * Created by Orion on 06/2017
 * From LeetCode 021
 * Description:
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 *
 * Example:
 *
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 */
public class MergeTwoSortedLists {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        if(l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
    
    public static void main(String[] args) {
        ListNode ln1 = new ListNode(1);
        ln1.next = new ListNode(2);
        ln1.next.next = new ListNode(4);

        ListNode ln2 = new ListNode(1);
        ln2.next = new ListNode(3);
        ln2.next.next = new ListNode(4);

        ListNode res = new MergeTwoSortedLists().mergeTwoLists(ln1, ln2);
        while(res!=null) {
            System.out.println(res.val);
            res = res.next;
        }
        System.out.println(res.val);
    }
}
