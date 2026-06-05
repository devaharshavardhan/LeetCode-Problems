class Solution {
    static int func(int n){
        int ans=0;
        String t=String.valueOf(n);
        for(int i=1;i<t.length()-1;i++){
            int f=t.charAt(i-1)-'0';
            int s=t.charAt(i)-'0';
            int m=t.charAt(i+1)-'0';
            if((s-f)*(s-m)>0) ans++;
        }return ans;
    }
    public int totalWaviness(int num1, int num2) {

        int res = 0;

        for(int i = num1; i <= num2; i++) {
            res+=func(i);}


        return res;
    }
}