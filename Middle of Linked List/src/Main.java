//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(
                1,
                new ListNode(
                        2,
                        new ListNode(
                                3,
                                new ListNode(
                                        4,
                                        new ListNode(5, null)
                                )
                        )
                )
        );
        ListNode middleElement = middleElementOfList(head);
        while (middleElement != null) {
            System.out.println(middleElement.val);
            if (middleElement.next != null) {
                System.out.println("->");
            }
            middleElement = middleElement.next;
        }
    }

    private static ListNode middleElementOfList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}