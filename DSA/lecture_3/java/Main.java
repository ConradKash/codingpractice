package lecture_3.java;

public class Main {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode multiplyLinkedList(ListNode head, int k) {
        if (head == null || k == 0) return new ListNode(0);
        
        // Convert linked list to number
        long num = 0;
        ListNode current = head;
        while (current != null) {
            num = num * 10 + current.val;
            current = current.next;
        }
        
        // Multiply
        num *= k;
        
        // Convert number back to linked list
        if (num == 0) return new ListNode(0);
        
        ListNode result = null;
        while (num > 0) {
            ListNode newNode = new ListNode((int)(num % 10));
            newNode.next = result;
            result = newNode;
            num /= 10;
        }
        
        // Reverse the list
        ListNode prev = result;
        return prev;
    }
    public static void main(String[] args) {
        // Create linked list 1 -> 2 -> 3
        ListNode head = new ListNode(1);
        head.next = new ListNode(2 );
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(25);
        
        int k =2;
        
        ListNode result = multiplyLinkedList(head, k);
        
        // Print result
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) System.out.print(" -> ");
            result = result.next;
        }
    }
}
