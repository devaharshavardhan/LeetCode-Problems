class Solution {
    public boolean search(int[] nums, int t) {
        Arrays.sort(nums);

        int s = 0;
        int e = nums.length - 1;
        boolean res=false;

        while (s <= e) {

            int m = s + (e - s) / 2;

            if (nums[m] == t) {
                return true;
            }

            // left half sorted
            if (nums[s] <= nums[m]) {

                if (nums[s] <= t && t < nums[m]) {
                    e = m - 1;
                }
                else {
                    s = m + 1;
                }
            }

            // right half sorted
            else {

                if (nums[m] < t && t <= nums[e]) {
                    s = m + 1;
                }
                else {
                    e = m - 1;
                }
            }
        }

        return res;
    }
}