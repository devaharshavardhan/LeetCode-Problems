class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];

        // Push all elements once (simulate circular array)
        for(int i = n - 1; i >= 0; i--){
            st.push(nums[i]);
        }

        for(int j = n - 1; j >= 0; j--){

            while(!st.isEmpty() && st.peek() <= nums[j]){
                st.pop();
            }

            if(st.isEmpty()){
                res[j] = -1;
            }else{
                res[j] = st.peek();
            }

            st.push(nums[j]);
        }

        return res;
    }
}