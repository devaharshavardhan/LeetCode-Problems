class Pair{
    char ch;
    int count;
    Pair(char ch,int count){
        this.ch=ch;
        this.count=count;
    }
}
class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(st.isEmpty()){
                st.push(new Pair(c,1));
                continue;
            }
            if(st.peek().ch!=c){
                st.push(new Pair(c,1));
                continue;
            }
            Pair p=st.pop();
            if(p.count<k-1){
                st.push(new Pair(p.ch,p.count+1));
            }}

        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()) {

            Pair p = st.pop();

            while (p.count-- > 0) {
                sb.append(p.ch);
            }
        }

        return sb.reverse().toString();
    }
}