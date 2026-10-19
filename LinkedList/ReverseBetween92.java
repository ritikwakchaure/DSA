
package LinkedList;

public class ReverseBetween92 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode reverseBetween(
            ListNode head, int left, int right) {

        if (head == null || left == right) {
            return head;
        }

        ListNode t = head;
        ListNode before = null;
        int pos = 1;

        // Reach the node before left
        while (t != null && pos < left) {
            before = t;
            t = t.next;
            pos++;
        }

        ListNode start = t;
        ListNode prev = null;

        // Reverse nodes from left to right
        while (t != null && pos <= right) {
            ListNode nextNode = t.next;

            t.next = prev;
            prev = t;
            t = nextNode;

            pos++;
        }

        // Reconnect the reversed portion
        start.next = t;

        if (before != null) {
            before.next = prev;
        } else {
            head = prev;
        }

        return head;
    }

    static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for (int value : arr) {
            curr.next = new ListNode(value);
            curr = curr.next;
        }

        return dummy.next;
    }

    static void printList(ListNode head) {
        ListNode curr = head;

        while (curr != null) {
            System.out.print(curr.val);

            if (curr.next != null) {
                System.out.print(" -> ");
            }

            curr = curr.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        ListNode head = createList(arr);

        System.out.println("Original list:");
        printList(head);

        int left = 2;
        int right = 4;

        head = reverseBetween(head, left, right);

        System.out.println("Reversed list:");
        printList(head);
    }
}
