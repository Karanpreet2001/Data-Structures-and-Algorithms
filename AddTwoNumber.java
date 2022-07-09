

public class AddTwoNumber {
    

    //          2 -> 4 -> 3 -> X
    //          5 -> 6 -> 7 -> 9 -> X
    //Result    7 -> 0 -> 1 -> 0 -> 1


    // Time complexity = 0(max(n1, n2))  Space complexity = 0(n)

    public ListNode addTwoNumber(ListNode l1, ListNode l2){

        int carry = 0;
        ListNode dummy = new ListNode();
        ListNode temp = dummy;

        while(l1 != null || l2 != null || carry == 1){
            int sum = 0;

            if(l1 != null){
                sum += l1.val;
                l1= l1.next;
            }

            if(l2 != null){
                sum += l2.val;
                l2= l2.next;
            }

            sum += carry;
            carry = sum/10;

            ListNode node = new ListNode(sum%10);
            temp.next = node;
            temp = node;
        }

        return dummy.next;
    }

}
