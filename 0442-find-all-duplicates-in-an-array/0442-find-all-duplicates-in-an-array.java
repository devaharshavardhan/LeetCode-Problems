class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> res=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==2) res.add(entry.getKey());
        }
        System.out.println(res);
        return res;
        }
        
    }
