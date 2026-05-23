class Solution {
    public boolean check(int[] nums) {
        int k=1;
        int[] t=nums.clone();
        Arrays.sort(nums);
        int[] x=new int[nums.length];
        while(k<=nums.length){
            for(int i =0;i<nums.length;i++){
                x[(i+k)%nums.length]=t[i];
            }
            if(Arrays.equals(x, nums)) return true;
            k++;
        }return false;
    }
}