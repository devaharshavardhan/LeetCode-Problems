class Solution {
    public boolean rotateString(String s, String goal) {
        int len = s.length();
        if (len != goal.length()) return false;

        int k = 1;

        while (k <= len) {
            int c = len - k;
            char[] arr = new char[len];  // use char array

            for (int i = 0; i < len; i++) {
                arr[(i + c) % len] = s.charAt(i);
            }

            if (new String(arr).equals(goal)) return true;

            k++;
        }

        return false;
    }
}