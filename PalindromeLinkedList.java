


public class PalindromeLinkedList extends ListNode{

    

    ListNode middle(ListNode head){
        ListNode fast = head, slow=head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast= fast.next.next;
        }
        return slow;
    }

    ListNode reverse(ListNode head){
        ListNode curr = head, prev=null;

        while(curr!=null){
            ListNode temp = curr.next;
            curr.next=prev;
            prev=curr;
            curr = temp;
        }

        return prev;
    }


    boolean palindrome(ListNode head){


        if(head == null){
             return true;
        }
        ListNode mid = middle(head);
        ListNode last = reverse(mid.next);
        ListNode curr = head;

        while(last != null){
            if(last.val != curr.val){
                return false;
            }
            last= last.next;
            curr= curr.next;
        }
        return true;
    }
}
