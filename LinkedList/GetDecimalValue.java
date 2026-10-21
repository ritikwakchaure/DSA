// LeetCode 1290. Convert Binary Number in a Linked List to Integer

public class GetDecimalValue {

    
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    // LeetCode pe sirf ye method (Solution class) paste karna
    static class Solution {
        public int getDecimalValue(ListNode head) {
            int result = 0;
            while (head != null) {
                result = result * 2 + head.val;
                head = head.next;
            }
            return result;
        }
    }

    // array se linked list banata hai
    static ListNode buildList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int x : arr) {
            curr.next = new ListNode(x);
            curr = curr.next;
        }
        return dummy.next;
    }

    // list print karne ke liye: 1 -> 0 -> 1
    static void printList(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            if (head.next != null)
                sb.append(" -> ");
            head = head.next;
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] tests = {
                { 1, 0, 1 }, // 5
                { 0 }, // 0
                { 1 }, // 1
                { 1, 1, 1, 1 }, // 15
                { 1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0 } // 18880
        };

        for (int[] t : tests) {
            ListNode head = buildList(t);
            System.out.print("List   : ");
            printList(head);
            System.out.println("Decimal: " + sol.getDecimalValue(head));
            System.out.println("-----------------------");
        }
    }
}