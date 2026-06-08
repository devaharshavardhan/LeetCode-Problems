class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> y=new HashMap<>();
        int res=0;
        int sum=0;
        y.put(0,1);
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            int ques=sum-k;
            if (y.containsKey(ques)){
                res+=y.get(ques);
            }
            y.put(sum,y.getOrDefault(sum,0)+1);
        }return res;
        
    }
}