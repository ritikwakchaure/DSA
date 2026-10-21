package LinkedList;

public class oddEvenList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;

        ListNode even = head.next;
        ListNode evenStart = even;

        while (even != null && even.next != null) {

            odd.next = even.next;

            even.next = even.next.next;

            odd = odd.next;

            even = even.next;
        }

        odd.next = evenStart;

        return head;
    }

    // Print linked list
    public static void printList(ListNode head) {

        ListNode curr = head;

        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);

        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        printList(head);

        head = oddEvenList(head);

        System.out.println("After Odd-Even Arrangement:");
        printList(head);
    }
}
