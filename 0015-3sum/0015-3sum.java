class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {

        
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int s = i + 1;
            int e = nums.length - 1;

            while (s < e) {

                int c = nums[i] + nums[s] + nums[e];

                if (c == 0) {

                    arr.add(Arrays.asList(nums[i], nums[s], nums[e]));

                    s++;
                    e--;

                  
                    while (s < e && nums[s] == nums[s - 1]) {
                        s++;
                    }

                    while (s < e && nums[e] == nums[e + 1]) {
                        e--;
                    }
                }

                else if (c < 0) {
                    s++;
                }

                else {
                    e--;
                }
            }
        }

        return arr;
    }
}