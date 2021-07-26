package array.medium;
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(243);
        ListNode l2 = new ListNode(564);
        System.out.println(addTwoNumbers(l1,l2));
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int res = 0;
        for (int i = 0; i < Math.max(l1.val,l2.val); i++) {
        }
    }
}
