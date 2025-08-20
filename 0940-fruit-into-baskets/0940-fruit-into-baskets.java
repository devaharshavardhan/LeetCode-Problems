class Solution {
    public int totalFruit(int[] fruits) {
        int left=0;
        int res=0;
        HashMap<Integer,Integer> b=new HashMap<>();
        for(int i=0;i<fruits.length;i++){
            int t=fruits[i];
            b.put(t,b.getOrDefault(t,0)+1);
            while(b.size()>2){
                int y=fruits[left];
                b.put(y,b.get(y)-1);
                if (b.get(y)==0){
                    b.remove(y);
                }
                left++;
            }  res=Math.max(res,i-left+1);      }return res;
    }
}