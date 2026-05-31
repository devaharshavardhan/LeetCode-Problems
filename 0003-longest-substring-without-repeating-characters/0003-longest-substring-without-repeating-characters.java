class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int res=0;
        HashMap<Character,Integer> x=new HashMap<>();
        for(int h=0;h<s.length();h++){
            char t=s.charAt(h);
            x.put(t,x.getOrDefault(t,0)+1);
            while(x.size()<h-l+1){
                char e =s.charAt(l);
                x.put(e,x.get(e)-1);
                if(x.get(e)==0){
                    x.remove(e);
                }
                l++;
            }
            res=Math.max(res,h-l+1);

        }return res;
        
    }
}