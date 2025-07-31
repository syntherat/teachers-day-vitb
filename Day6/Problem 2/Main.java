class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Main {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        return prev;
    }

    public static void main(String[] args) {
        // Test case 1: [1,2,3,4,5]
        ListNode list1 = createList(new int[]{1,2,3,4,5});
        System.out.print("Original: ");
        printList(list1);
        ListNode reversed1 = reverseList(list1);
        System.out.print("Reversed: ");
        printList(reversed1);

        // Test case 2: [1,2]
        ListNode list2 = createList(new int[]{1,2});
        System.out.print("Original: ");
        printList(list2);
        ListNode reversed2 = reverseList(list2);
        System.out.print("Reversed: ");
        printList(reversed2);

        // Test case 3: []
        ListNode list3 = createList(new int[]{});
        System.out.print("Original: ");
        printList(list3);
        ListNode reversed3 = reverseList(list3);
        System.out.print("Reversed: ");
        printList(reversed3);
    }
}