package InsertionSort;

public class InsertionSortList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode insertionSortList(ListNode head) {
            if (head == null)
                return head;
            ListNode curr = head;
            ListNode pre = new ListNode(0);
            ListNode start = pre, nex = null;

            while (curr != null) {
                if (pre.val > curr.val)
                    pre = start;
                while (pre.next != null && pre.next.val < curr.val)
                    pre = pre.next;
                nex = curr.next;
                curr.next = pre.next;
                pre.next = curr;
                curr = nex;
            }
            return start.next;
        }
    }
}
