class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> c=new HashMap<>();
        int res=0;
        int z=0;
        int o=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) z++;
            else o++;
            int dif=z-o;
            if(dif==0){
                res=Math.max(res,i+1);
            }
            else if(c.containsKey(dif)){
                res=Math.max(res,i-c.get(dif));
            }
            else{
                c.put(dif,i);
            }
        }return res;
    }
}