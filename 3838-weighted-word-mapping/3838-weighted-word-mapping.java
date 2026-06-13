class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String res="";
        for(int i=0;i<words.length;i++){
            String x=words[i];
            int sum=0;
            for(int j=0;j<x.length();j++){
                char g=x.charAt(j);
                int n=g-'a';
                sum+=weights[n];
            }
            int t=sum%26;
            char mapped = (char)('z' - t);
            res+=mapped;
        }return res;
        
    }
}