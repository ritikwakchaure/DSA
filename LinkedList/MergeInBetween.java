
package LinkedList;

public class MergeInBetween {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode left = null;
        ListNode right = list1;

        for (int i = 0; i <= b; i++) {

            if (i == a - 1) {
                left = right;
            }

            right = right.next;
        }

        left.next = list2;

        ListNode temp = list2;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = right;

        return list1;
    }

    // Print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // list1 = [0, 1, 2, 3, 4, 5]
        ListNode list1 = new ListNode(0);
        list1.next = new ListNode(1);
        list1.next.next = new ListNode(2);
        list1.next.next.next = new ListNode(3);
        list1.next.next.next.next = new ListNode(4);
        list1.next.next.next.next.next = new ListNode(5);

        // list2 = [100, 101, 102]
        ListNode list2 = new ListNode(100);
        list2.next = new ListNode(101);
        list2.next.next = new ListNode(102);

        int a = 2;
        int b = 4;

        MergeInBetween obj = new MergeInBetween();

        ListNode result = obj.mergeInBetween(list1, a, b, list2);

        System.out.println("Merged Linked List:");



printList(result);
    }
}
