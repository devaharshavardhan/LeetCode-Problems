class Solution {
    public int longestOnes(int[] nums, int k) {
        HashMap<Integer,Integer> x=new HashMap<>();
        int l=0;
        int c=0;
        int res=Integer.MIN_VALUE;
        for(int h=0;h<nums.length;h++){
            if(nums[h]==1){
                c+=1;
            }
            int le=h-l+1;
            int d=le-c;
            while(d>k){
                if(nums[l]==1){
                    c-=1;
                }
                l++;
                le=h-l+1;
                d=le-c;
            }
            res=Math.max(res,h-l+1);
        }return res;
    }
}