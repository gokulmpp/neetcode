package array;


class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
    public class LLCycleDetection {


        public static boolean hasCycle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            if (head == null) return false;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) {
                    return true;
                }
            }
            return false;
        }

        public static void main(String[] args) {
            ListNode node1 = new ListNode(1);
            ListNode node2 = new ListNode(2);
            ListNode node3 = new ListNode(3);
            ListNode node4 = new ListNode(4);

            node1.next = node2;
            node2.next = node3;
            node3.next = node4;
            node4.next = node2;
            boolean result = hasCycle(node1);
            System.out.println("result "+result );

        }
    }

