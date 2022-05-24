package practiceEnv.addTwoNumbers;

public class addTwoNumbersSource {

    public addTwoNumbersSource() {
        ListNode num3 = new ListNode(3);
        ListNode num2 = new ListNode(4, num3);
        ListNode l1 = new ListNode(2, num2);

        ListNode newNum3 = new ListNode(4);
        ListNode newNum2 = new ListNode(6, newNum3);
        ListNode l2 = new ListNode(5, newNum2);

        addTwoNumbers(l1, l2);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        ListNode current = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p!=null) ? p.val : 0;
            int y = (q!=null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum/10;
            current.next = new ListNode(sum%10);
            current = current.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        return dummyHead.next;

    }
}
