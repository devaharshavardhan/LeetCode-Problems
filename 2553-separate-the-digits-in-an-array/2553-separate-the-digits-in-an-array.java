class Solution {

    public int[] separateDigits(int[] nums) {

        ArrayList<Integer> x = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] <= 9) {
                x.add(nums[i]);
                continue;
            }

            else {

                ArrayList<Integer> temp = new ArrayList<>();

                int t = nums[i];

                while (t > 0) {

                    int k = t % 10;

                    temp.add(k);

                    t = t / 10;
                }

                for (int j = temp.size() - 1; j >= 0; j--) {
                    x.add(temp.get(j));
                }
            }
        }

        int[] ans = new int[x.size()];

        for (int i = 0; i < x.size(); i++) {
            ans[i] = x.get(i);
        }

        return ans;
    }
}