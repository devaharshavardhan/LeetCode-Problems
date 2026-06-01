class Solution {
    public int maxProduct(int[] nums) {
        int min_end=1;
        int max_end=1;
        int res=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int x1=nums[i];
            int x2=min_end*nums[i];
            int x3=max_end*nums[i];
            min_end=Math.min(x1,Math.min(x2,x3));
            max_end=Math.max(x1,Math.max(x2,x3));
            res=Math.max(res,Math.max(min_end,max_end));
        }return res;
    }
}