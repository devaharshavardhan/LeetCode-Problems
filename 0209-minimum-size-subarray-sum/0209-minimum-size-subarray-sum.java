class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int sum=0;
        int res=Integer.MAX_VALUE;
        for(int h=0;h<nums.length;h++){
            sum+=nums[h];
            while(sum>=target){
                int len=h-l+1;
                res=Math.min(res,len);
                sum-=nums[l];
                l++;
            }
        }return res == Integer.MAX_VALUE ? 0 : res;
    }
}