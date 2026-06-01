class Solution {
    static int max_sum(int[] nums){
        int res=0;
        int t=0;
        for(int i=0;i<nums.length;i++){
            t=Math.max(t+nums[i],nums[i]);
            res=Math.max(t,res);
        }return res;
    }
    static int min_sum(int[] nums){
        int res=Integer.MAX_VALUE;
        int t=0;
        for(int i=0;i<nums.length;i++){
            t=Math.min(t+nums[i],nums[i]);
            res=Math.min(t,res);
        }return res;
    }
    public int maxAbsoluteSum(int[] nums) {
        int q=max_sum(nums);
        int w=min_sum(nums);
        return Math.max(q,w*-1);
    }
}