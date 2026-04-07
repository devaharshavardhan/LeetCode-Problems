import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> used = new HashSet<>();

        String[] words = s.split(" ");

        if (pattern.length() != words.length) return false;

        for (int i = 0; i < pattern.length(); i++) {
            char key = pattern.charAt(i);

            if (map.containsKey(key)) {
                if (!map.get(key).equals(words[i])) {
                    return false;
                }
            } else {
                if (used.contains(words[i])) {
                    return false;
                }
                map.put(key, words[i]);
                used.add(words[i]);
            }
        }

        return true;
    }
}