import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;
//        node5.next = node2;

        System.out.println(isListCycle(head));
    }

    private static boolean isListCycle(ListNode head) {
//        ListNode curr = head;
//        Set<ListNode> listSet = new HashSet<>();
//        boolean flag = false;
//        while (curr != null) {
//            if (listSet.contains(curr)) {
//                flag = true;
//                break;
//            }
//            listSet.add(curr);
//            curr = curr.next;
//        }
//        return flag;

        //---2nd Approach- Using hare and tortoise
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}