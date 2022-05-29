package practiceEnv.addTwoNumbers;

public class addTwoNumbersSource {

    public addTwoNumbersSource() {
        // Declare ListNodes
        // Each Number is stored in Linked List
        // This number is 342.
        ListNode num3 = new ListNode(2);
        ListNode num2 = new ListNode(4, num3);
        ListNode l1 = new ListNode(3, num2);
        // This number is 465
        ListNode newNum3 = new ListNode(5);
        ListNode newNum2 = new ListNode(6, newNum3);
        ListNode l2 = new ListNode(4, newNum2);

        //Returned value of the two numbers summed together in reverse.
        ListNode returned = addTwoNumbers(l1, l2);

        // Create new array to reverse it back to normal
        int[] corrected = new int[3];
        int i = 0;
        while (returned!=null){
            corrected[i]= returned.val;
            i++;
            returned = returned.next;
        }
        for (int j = 0; j < corrected.length-1; j++){
            int temp = corrected[j];
            corrected[j] = corrected[corrected.length-1-j];
            corrected[corrected.length-1-j] = temp;
        }
        StringBuilder answer = new StringBuilder();
        for (int j : corrected) {
            answer.append(j);
        }
        System.out.println(answer);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        ListNode current = dummyHead;
        int carry = 0;

        // Make sure either are null, continue with arithmetic inside the linked list.
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
