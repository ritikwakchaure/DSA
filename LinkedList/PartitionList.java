public class PartitionList {

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

    public ListNode partition(ListNode head, int x) {

        ListNode small = new ListNode(0);
        ListNode large = new ListNode(0);

        ListNode smallP = small;
        ListNode largeP = large;

        ListNode curr = head;

        while (curr != null) {

            if (curr.val < x) {
                smallP.next = curr;
                smallP = smallP.next;
            } else {
                largeP.next = curr;
                largeP = largeP.next;
            }

            curr = curr.next;
        }
        largeP.next = null;
        smallP.next = large.next;

        

        return small.next;
    }

    // Create linked list
    public static ListNode createList(int[] arr) {

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        for (int value : arr) {
            temp.next = new ListNode(value);
            temp = temp.next;
        }

        return dummy.next;
    }

    // Print linked list
    public static void printList(ListNode head) {

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        PartitionList obj = new PartitionList();

        // Input linked list
        int[] arr = { 1, 4, 3, 2, 5, 2 };

        int x = 3;

        ListNode head = createList(arr);

        System.out.println("Original Linked List:");
        printList(head);

        ListNode result = obj.partition(head, x);

        System.out.println("After Partition:");
        printList(result);
    }
}
