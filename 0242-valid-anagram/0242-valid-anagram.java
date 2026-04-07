class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> x=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            x.put(c,x.getOrDefault(c,0)+1);
        }
        for(int k=0;k<t.length();k++){
            char m=t.charAt(k);
            if(!x.containsKey(m)) return false;
            x.put(m,x.get(m)-1);
            if(x.get(m)==0){
                x.remove(m);
            }

        }
        return x.isEmpty();
        
    }
}