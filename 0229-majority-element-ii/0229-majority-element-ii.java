class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int check=(int)nums.length/3;
        HashMap<Integer,Integer> map =new HashMap<>();
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>check && !res.contains(nums[i])) res.add(nums[i]);
        }
        return res;
    }
}