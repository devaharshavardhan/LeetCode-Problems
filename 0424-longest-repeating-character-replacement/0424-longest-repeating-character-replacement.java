class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0;
        int l = 0;
        int r = 0;
        int[] map=new int[26];
        int comp = 0;

        while (r < s.length()) {
            char t = s.charAt(r);
            map[t-'A']++;
            comp=Math.max(comp,map[t-'A']);
            if ((r - l + 1) - comp > k) {
                map[s.charAt(l)-'A']--;
                l++;
            }

            res = Math.max(res, r - l + 1);

            r++;        }

        return res;
    }
}