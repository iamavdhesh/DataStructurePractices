package linkedlist;

/**
 *
 * Merge two sorted linked lists and return it as a new sorted list. The new list should be made by splicing together the nodes of the first two lists.

    Example:

    Input: 1->2->4, 1->3->4
    Output: 1->1->2->3->4->4
    * */
public class MergeSortedList {
    public static void main(String[] args) {



    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode headNode = new ListNode(0);
        ListNode curTempNode = headNode;

        while (l1 != null && l2 != null) {

            if (l1.val >= l2.val) {
                curTempNode.next = l2;
                l2 = l2.next;
            } else {
                curTempNode.next = l1;
                l1 = l1.next;
            }
            curTempNode = curTempNode.next;
        }
        if (l1 != null) {
            curTempNode.next = l1;
            l1 = l1.next;
        }

        if (l2 != null) {
            curTempNode.next = l2;
            l2 = l2.next;
        }
        return headNode.next;
    }

    //  Definition for singly-linked list.
    public class ListNode {
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
}
