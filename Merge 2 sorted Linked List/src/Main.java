//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        -----------------------------------------------------
//         ##       Manually creating the list {1, 2, 4}  ##
//        ListNode node4 = new ListNode(4);
//        ListNode node3 = new ListNode(3, node4);
//        ListNode node2 = new ListNode(2, node3);
//        ListNode head= new ListNode(1, node2);
//  -----------------------------------------------------------------
//      ##  Using Constructor chaining  ##
        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode head2 = new ListNode(1, new ListNode(3, new ListNode(4)));
// ------------------------------------------------------------------------
//   ##     Creating list from an array {1,2,4}  ##
//        ListNode head=null;
//        ListNode current=null;
//        int[] values={1,2,3,4};
//        for(int val:values){
//            if(head==null){
//                head=new ListNode(val);
//                current=head;
//            }
//            current.next=new ListNode(val);
//            current=current.next;
//        }
    ListNode result= mergeTwoLists(head1, head2);
    while(result!=null){
        System.out.print(result.val+"->");
        result=result.next;
    }
//    System.out.println(result);
    }
//    O/P: [1,1,2,3,4,4];

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curr.next=l1;
                l1=l1.next;

            }else{
                curr.next=l2;
                l2=l2.next;
            }
            curr=curr.next;
        }
        curr.next=(l1!=null?l1:l2);
        return dummy.next;
    }
}