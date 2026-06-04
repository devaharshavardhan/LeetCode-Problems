class Solution {
    static int max_sum(int[] nums){
        int res=nums[0];
        int t=0;
        for(int i =0;i<nums.length;i++){
            t=Math.max(nums[i],t+nums[i]);
            res=Math.max(res,t);
        }return res;
    }
    static int min_sum(int[] nums){
        int res=nums[0];
        int t=nums[0];
        for(int i =1;i<nums.length;i++){
            t=Math.min(nums[i],t+nums[i]);
            res=Math.min(res,t);
        }return res;
    }
    public int maxSubarraySumCircular(int[] nums) {
       
        int maximum=max_sum(nums);
        if(maximum < 0){
            return maximum;
        }
        int minimum=min_sum(nums);
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        return Math.max(maximum, total - minimum);
    }
}