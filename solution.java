import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean containsDuplicate(int[] nums) {
         Map<Integer, Integer> HM = new HashMap<>();
        
        for (int i=0; i<nums.length; i++){
            if (HM.containsKey(nums[i])){
                return true;
            }else{
                HM.put(nums[i], i);
            }
        }
        return false;
    }
}