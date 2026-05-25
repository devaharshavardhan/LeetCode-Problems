class Solution {
    public int totalFruit(int[] f) {
        int l=0;
        int res=Integer.MIN_VALUE;
        HashMap<Integer,Integer> x=new HashMap<>();
        int n=f.length;
        if(n==1) return 1;
        for(int h=0;h<n;h++){
            int t=f[h];
            x.put(t,x.getOrDefault(t,0)+1);
            while(x.size()>2){
                int y=f[l];
                x.put(y,x.get(y)-1);
                if(x.get(y)==0){
                    x.remove(y);
                }
                l++;
            }
            if(x.size()<=2){
                res=Math.max(res,h-l+1);

            }
        }return res;
        
    }
}