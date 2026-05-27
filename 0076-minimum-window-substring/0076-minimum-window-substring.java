class Solution {
    static boolean check(int[] h,int[] n){
        for(int r=0;r<256;r++){
            if(h[r]<n[r]) return false;
        }
        return true;
    }
    public String minWindow(String s, String t) {
        int st=0;
        int[] h=new int[256];
        int[] n=new int[256];
        int res=Integer.MAX_VALUE;
        for(int j=0;j<t.length();j++){
            char w=t.charAt(j);
            n[w]++;
        }
        int l=0;
        for(int e=0;e<s.length();e++){
            char q=s.charAt(e);
            h[q]++;
            while(check(h,n)){
                int len=e-l+1;
                if(len<res){
                    res=len;
                    st=l;
                }
                h[s.charAt(l)]--;
                l++;
                
            }
        }
        return res == Integer.MAX_VALUE
                ? ""
                : s.substring(st, st + res);
    }
}