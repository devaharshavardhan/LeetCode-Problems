class Solution {
    public boolean isGood(int[] nums) {
        HashMap<Integer,Integer> x=new HashMap<>();
        int c=0;
       
        for(int i=0;i<nums.length;i++){
            int t=nums[i];
             if(t < 1 || t > nums.length - 1){
                return false;
            }
            x.put(t,x.getOrDefault(t,0)+1);
            int z=x.get(t);
            System.out.println(z);
            if(t==nums.length-1 && z==2) {c++;
            System.out.println(z);}
            if(z>1 && t!=nums.length-1) return false;
            if(z > 2 && t == nums.length - 1) return false;
        }
        System.out.println(x);
        if(c==1) return true;
        return false;
    }
}