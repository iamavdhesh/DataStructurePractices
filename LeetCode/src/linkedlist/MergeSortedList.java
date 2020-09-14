package linkedlist;

public class MergeSortedList {
    public static void main(String[] args) {

        /*[1,2,4]
          [1,3,4]*/




    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode resNode = new ListNode();

        ListNode item1 = l1.next;
        ListNode item2 = l2.next;
        while (item1 != null || item2 != null) {

            if (item1 == null)
                resNode = l2;
            else if (item2 == null)
                resNode = l1;
            else if (item1.val >= item2.val) {
                resNode.next = item1.next;
                resNode.next.next = item2.next;
            } else {
                resNode.next = item2.next;
                resNode.next.next = item1.next;

                item1 = item1.next;
                item2 = item2.next;
            }

        }

        return resNode;


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
