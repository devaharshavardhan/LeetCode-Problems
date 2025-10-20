class Solution {
    static int f(int x,int res){
        if(x==0) return res;
        if(x%2==0) return f(x/2,res+1);
        return f(x-1,res+1);
    }
    public int numberOfSteps(int num) {
        int fin=f(num,0);
        return fin;
        
    }
}