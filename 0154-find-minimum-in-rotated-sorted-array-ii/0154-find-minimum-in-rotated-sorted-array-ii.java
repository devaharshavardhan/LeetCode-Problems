class Solution {
    public int findMin(int[] nums) {
        int s=0;
        int e=nums.length-1;
        int res=Integer.MAX_VALUE;
        if(e==0) return nums[0];
        while(s<=e){
            int m=s+(e-s)/2;
            System.out.println(s);
            System.out.println(e);
            System.out.println(m);
           
            if(nums[s] == nums[m] && nums[m] == nums[e]){
                res = Math.min(res, nums[s]);
                s++;
                e--;
            }
            else if(nums[m]>=nums[s]){
                res=Math.min(res,nums[s]);
                s=m+1;
            }
            else{
                res=Math.min(nums[m],res);
                e=m-1;
            }
        }return res;
        
        
    }
}