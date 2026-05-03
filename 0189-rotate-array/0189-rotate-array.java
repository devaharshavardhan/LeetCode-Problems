class Solution {
    public void rotate(int[] nums, int k) {
        int[] x=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            x[(i+k)%nums.length]=nums[i];       }
        System.out.println(Arrays.toString(x));
        for(int j=0;j<nums.length;j++){
            nums[j]=x[j];
        }
    }
}