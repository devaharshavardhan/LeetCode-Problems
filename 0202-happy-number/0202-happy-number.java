class Solution {
    static int func(int a){
        int r=0;
        while(a>0){
            int d=a%10;
            a=a/10;
            r+=d*d;
        }
        return r;
    }
    public boolean isHappy(int n) {
        int s=n;
        int f=n;
        while(f!=1){
            s=func(s);
            f=func(f);
            f=func(f);
            if(s==f){
                while(s==f && s!=1) return false;
            }
        }return true;

        
    }
}