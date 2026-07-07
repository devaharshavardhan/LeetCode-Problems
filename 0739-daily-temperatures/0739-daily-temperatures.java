class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> s=new Stack<>();
        int[] ans=new int[t.length];
        s.push(t.length - 1);
        for(int i=t.length-2;i>=0;i--){
            while(!s.empty() && t[s.peek()]<=t[i]){
                s.pop();
            }
            
            if(!s.empty() && t[s.peek()]>t[i]){
                ans[i]=s.peek()-i;
                
            }
            else{
                ans[i]=0;
            }
            s.push(i);
        }return ans;
    }
}