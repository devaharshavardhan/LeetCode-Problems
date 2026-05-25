class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int m=0;
        int res=Integer.MIN_VALUE;
        HashMap<Character,Integer> x=new HashMap<>();
        int n=s.length();
        for(int h=0;h<n;h++){
            char t=s.charAt(h);
            x.put(t,x.getOrDefault(t,0)+1);
            m=Math.max(m,x.get(t));
            int len=h-l+1;
            int d=len-m;
            while(d>k){
                char e=s.charAt(l);
                x.put(e,x.get(e)-1);
                l++;
                m=Math.max(m,x.get(e));
                len=h-l+1;
                d=len-m;
            }
            res=Math.max(res,h-l+1);
        }return res;
    }
}