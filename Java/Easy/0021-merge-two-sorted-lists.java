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

class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode result = new ListNode();
        ListNode pointer;
        if (list1.val <= list2.val) {
            result = list1;
            list1 = list1.next;
            pointer = result;
        } else {
            result = list2;
            list2 = list2.next;
            pointer = result;
        }

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                pointer.next = list1;
                pointer = pointer.next;
                list1 = list1.next;
            } else {
                pointer.next = list2;
                pointer = pointer.next;
                list2 = list2.next;
            }
        }

        if (list1 != null) {
            pointer.next = list1;
        } else {
            pointer.next = list2;
        }

        return result;
    }
}