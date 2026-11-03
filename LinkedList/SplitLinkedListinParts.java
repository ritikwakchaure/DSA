package LinkedList;

public class SplitLinkedListinParts {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // LeetCode 725 solution
    static ListNode[] splitListToParts(ListNode head, int k) {
        // Step 1: length nikal
        int n = 0;
        ListNode temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }

        // Step 2: base size aur extra nodes
        int eachBucketNodes = n / k;
        int remainderNodes = n % k;

        // Step 3: Create an array to hold the resulting ListNode parts
        ListNode[] result = new ListNode[k];

        // Step 4: Reinitialize `curr` to the head of the list
        ListNode curr = head;
        ListNode prev = null;

        // Step 5: Loop over k parts
        for (int i = 0; curr != null && i < k; i++) {
            result[i] = curr;

            // Step 6: Loop over the nodes in the current part
            for (int count = 1; count <= eachBucketNodes + (remainderNodes > 0 ? 1 : 0); count++) {
                prev = curr;
                curr = curr.next;
            }

            // Step 7: Break the connection after the current part
            if (prev != null) {
                prev.next = null;
            }

            // Step 8: Decrease the remainder count
            remainderNodes--;
        }

        return result;

        // is bucket ki size (extra bacha hai toh +1)

    }

    // list print karne ke liye helper
    static void printList(ListNode head) {
        if (head == null) {
            System.out.println("[]");
            return;
        }
        StringBuilder sb = new StringBuilder("[");
        while (head != null) {
            sb.append(head.val);
            if (head.next != null)
                sb.append(" -> ");
            head = head.next;
        }
        sb.append("]");
        System.out.println(sb);
    }

    // 1..n ki list banane ka helper
    static ListNode build(int n) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        for (int i = 1; i <= n; i++) {
            tail.next = new ListNode(i);
            tail = tail.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        // Test 1: n=10, k=3 -> [1..4], [5..7], [8..10]
        System.out.println("Test 1: n=10, k=3");
        ListNode[] parts1 = splitListToParts(build(10), 3);
        for (ListNode p : parts1)
            printList(p);

        // // Test 2: n=3, k=5 -> [1], [2], [3], [], []
        // System.out.println("\nTest 2: n=3, k=5");
        // ListNode[] parts2 = splitListToParts(build(3), 5);
        // for (ListNode p : parts2)
        //     printList(p);

        // // Test 3: empty list, k=3 -> [], [], []
        // System.out.println("\nTest 3: empty list, k=3");
        // ListNode[] parts3 = splitListToParts(null, 3);
        // for (ListNode p : parts3)
        //     printList(p);
    }
}