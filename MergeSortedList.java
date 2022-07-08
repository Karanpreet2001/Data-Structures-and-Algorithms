

public class MergeSortedList {
    

    public ListNode mergeList(ListNode list1, ListNode list2){

        ListNode new_head = null;
        ListNode merged = null;

        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }

        if(list1.val < list2.val){
            merged=list1;
            list1 = list1.next;
        }else{
            merged=list2;
            list1 = list2.next;
        }

        new_head = merged;

        while(list1 != null && list2 != null){

            if(list1.val < list2.val){
                merged.next = list1;
                merged=list1;
                list1 = list1.next;
            }else{
                merged.next = list2;
                merged=list2;
                list2 = list2.next;
            }

            if(list1 == null){
                merged.next = list2;
            }
            if(list2 == null){
                merged.next = list1;
            }
        }

        return new_head;
    }
}
