import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int[] x=new int[2];
        for(int i=0;i<nums.length;i++){
            int res=target-nums[i];
            if (h.containsKey(nums[i])){
                x=new int[]{h.get(nums[i]),i};
                return x;}
            else{
                h.put(res,i);

            }
        }
        return x;

    }
}