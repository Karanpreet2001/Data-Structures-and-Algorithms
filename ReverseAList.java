import java.util.List;

public class ReverseAList extends ListNode{

    public static void main(String[] args) {
        
    }

    /**
     * @param head
     * @return
     */
    ListNode reverse(ListNode head){


        ListNode curr=head;
        ListNode prev=null;

        while(curr!=null){
            ListNode temp = curr.next;
            curr.next= prev;
            prev =curr;
            curr = temp;
        }

        return prev;
    }
    
}
