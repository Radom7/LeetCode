package com.haiyu;

/**
 * @Desc:
 *  给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author: liuxing
 * @Date: 2020/5/14 0:05
 * @Version 1.0
 */
public class AddTwoNumbersTest {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next= new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next= new ListNode(4);

        ListNode l3 = addTwoNumbers(l1,l2);
        System.out.println(l3);
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        int num1 = l1.val +l2.val ;
        int temp = 0;
        if(num1 >= 10){
            result = new ListNode(num1 - 10);
            temp = 1;
        }else{
            result = new ListNode(num1);
        }
        if(l1.next == null && l2.next == null){
            if(temp > 0 ){
                result.next = new ListNode(temp);
            }
        }else{
            l1.next = l1.next == null ? new ListNode(0): l1.next;
            l2.next = l2.next == null ? new ListNode(0): l2.next;
            l1.next.val = l1.next.val+ temp;
            result.next = addTwoNumbers(l1.next,l2.next);
        }
        return result;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}
