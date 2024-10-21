class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Q5 {
    public static ListNode detectCycle(ListNode head) {
        //Detect if a cycle exists using two pointers (Floyd's Cycle Detection Algorithm)
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // Move slow pointer by 1 step
            fast = fast.next.next;     // Move fast pointer by 2 steps
            // Cycle detected
            if (slow == fast) {
                // Step 2: Find the cycle start node
                ListNode pointer = head;

                while (pointer != slow) {
                    pointer = pointer.next;  // Move both pointers 1 step at a time
                    slow = slow.next;
                }
                return pointer;  // This is the start of the cycle
            }
        }

        return null;  // No cycle detected
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;  

        ListNode cycleNode = detectCycle(head);
        
        if (cycleNode != null) {
            System.out.println("Cycle detected at node with value: " + cycleNode.val);
        } else {
            System.out.println("No cycle detected");
        }
    }
}
