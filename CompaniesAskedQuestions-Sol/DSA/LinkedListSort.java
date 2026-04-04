class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListSort {

    // Merge two sorted lists
    static Node merge(Node left, Node right) {
        if (left == null) return right;
        if (right == null) return left;

        if (left.data < right.data) {
            left.next = merge(left.next, right);
            return left;
        } else {
            right.next = merge(left, right.next);
            return right;
        }
    }

    // Find middle using slow-fast pointer
    static Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Merge Sort
    static Node mergeSort(Node head) {
        if (head == null || head.next == null) return head;

        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null; // split

        Node left = mergeSort(head);
        Node right = mergeSort(rightHead);

        return merge(left, right);
    }

    // Print list
    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);

        head = mergeSort(head);

        printList(head);
    }
}