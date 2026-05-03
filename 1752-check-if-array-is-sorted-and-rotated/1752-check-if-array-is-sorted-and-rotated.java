import java.util.*;

class Solution {
    public boolean check(int[] nums) {
        int[] temp = nums.clone();
        int len = nums.length;

        Arrays.sort(nums);

        int k = 1;
        int c = len - k;

        while (k <= len) {
            int[] x = new int[len];

            for (int i = 0; i < len; i++) {
                x[(i + c) % len] = temp[i];
            }

            if (Arrays.equals(x, nums)) return true; 

            k++;
            c = len - k;
        }

        return false;
    }
}