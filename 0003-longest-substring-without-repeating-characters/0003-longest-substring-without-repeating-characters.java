class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int res=0;
        HashMap<Character,Integer> x=new HashMap<>();
        int n=s.length();
        int k=0;
        for(int h=0;h<n;h++){
            char t=s.charAt(h);
            x.put(t,x.getOrDefault(t,0)+1);
            k=h-l+1;
            while(x.size()<k){
                char r=s.charAt(l);
                x.put(r,x.get(r)-1);
                if(x.get(r)==0){
                    x.remove(r);
                }
                l++;
                k=h-l+1;
            }
            res=Math.max(res,h-l+1);
        }return res;
    }
}