class Solution {
    public int findMin(int[] nums) {
        int s=0;
        int e=nums.length-1;
        int res=Integer.MAX_VALUE;
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[s]<=nums[m]){
                res=Math.min(res,nums[s]);
                s=m+1;
            }
            else{
                res=Math.min(res,nums[m]);
                e=m-1;
            }        }return res;
    }
}