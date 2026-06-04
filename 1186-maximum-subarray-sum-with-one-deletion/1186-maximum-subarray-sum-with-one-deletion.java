class Solution {
    public int maximumSum(int[] arr) {
        int nodel=arr[0];
        int onedel=Integer.MIN_VALUE;
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            int prenodel=nodel;
            int preonedel=onedel;
            nodel=Math.max(prenodel+arr[i],arr[i]);
            int t;
            if(preonedel==Integer.MIN_VALUE){
                t=arr[i];
            }
            else{
                t=preonedel+arr[i];
            }
            onedel=Math.max(t,prenodel);
            res=Math.max(res,Math.max(onedel,nodel));
        }return res;
    }
}