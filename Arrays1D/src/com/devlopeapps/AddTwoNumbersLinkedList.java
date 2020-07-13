package com.avi;


import java.util.ArrayList;

/**
 * Problem Statement
 * <p>
 * ///////////////////
 * 2. Add Two Numbers
 * ///////////////////
 * <p>
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example:
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */

public class AddTwoNumbersLinkedList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(0);
        ListNode current = head;
        boolean carry = false;

        while (l1 != null || l2 != null) {
            int sum = 0;

            if (l1 == null) {       //If l1 is null, only proceed l2
                sum = l2.val;
                l2 = l2.next;
            } else if (l2 == null) {  //If l2 is null, only proceed l1
                sum = l1.val;
                l1 = l1.next;
            } else {               //If l1,l2 not null, proceed both
                sum = l1.val + l2.val;
                l1 = l1.next;
                l2 = l2.next;
            }

            if (carry)           //check carry
                sum++;

            if (sum >= 10) {        //check overflow
                sum = sum - 10;
                carry = true;
            } else
                carry = false;

            current.next = new ListNode(sum);
            current = current.next;
        }

        if (carry)               //check last carry
            current.next = new ListNode(1);

        return head.next;


    }


    public static void main(String[] args) {

        var item = new ArrayList<Integer>();
        item.add(2);
        item.add(4);
        item.add(3);

        var item2 = new ArrayList<Integer>();
        item2.add(5);
        item2.add(6);
        item2.add(4);


        ListNode l1Node = null, temp1;
        ListNode l2Node = null, temp2 = null;

        temp1 = null;


        l1Node = addItem(item, l1Node, temp1);
        l2Node = addItem(item2, l2Node, temp2);


        printList(addTwoNumbers(l1Node, l2Node));

    }

    private static boolean printList(ListNode addTwoNumbers) {
        while (addTwoNumbers != null) {

            System.out.println("Items: " + addTwoNumbers.val);
            addTwoNumbers = addTwoNumbers.next;
        }

        return true;
    }

    private static ListNode addItem(ArrayList<Integer> item, ListNode l1Node, ListNode temp1) {
        for (int i = 0; i < item.size(); i++) {
            if (l1Node == null) {
                l1Node = new ListNode(item.get(i));
                temp1 = l1Node;
            } else {
                temp1.next = new ListNode(item.get(i));
                temp1 = temp1.next;
            }
        }
        return l1Node;
    }


}
