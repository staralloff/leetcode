/**
 * Created by Orion on 06/2017
 * From LeetCode 002
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;

        int carry = 0;
        ListNode newhead = new ListNode(-1);
        ListNode l3 = newhead;

        while(l1!=null || l2!=null){
            if(l1!=null){
                carry += l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                carry += l2.val;
                l2 = l2.next;
            }

            l3.next = new ListNode(carry%10);
            carry = carry/10;
            l3 = l3.next;
        }

        if(carry == 1)
            l3.next=new ListNode(1);
        return newhead.next;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(2);
        node.next = new ListNode(4);
        node.next.next = new ListNode(3);

        ListNode node1 = new ListNode(5);
        node1.next = new ListNode(6);
        node1.next.next = new ListNode(4);

        ListNode res = new AddTwoNumbers().addTwoNumbers(node, node1);
        while(res.next != null){
            System.out.println(res.val);
            res = res.next;
        }
    }
}
