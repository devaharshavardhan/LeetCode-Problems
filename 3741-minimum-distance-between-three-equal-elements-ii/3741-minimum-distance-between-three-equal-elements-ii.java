
class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int res = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                map.get(nums[i]).add(i);
                List<Integer> list = map.get(nums[i]);

                if (list.size() >= 3) {
                    int n = list.size();
                    int first = list.get(n - 3);
                    int third = list.get(n - 1);
                    int mid=list.get(n-2);
                    int dist = Math.abs(first-mid)+Math.abs(mid-third)+Math.abs(third-first);
                    res = Math.min(res, dist);
                }

            } else {
                List<Integer> m = new ArrayList<>();
                m.add(i);
                map.put(nums[i], m);
            }
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
                