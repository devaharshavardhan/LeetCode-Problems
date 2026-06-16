class Solution {
    public int[][] intervalIntersection(int[][] fl, int[][] sl) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<fl.length && j<sl.length){
            int start1=fl[i][0];
            int end1=fl[i][1];
            int start2=sl[j][0];
            int end2=sl[j][1];
            if(start1<=start2){
                if(end1>=start2){
                    int s=Math.max(start1,start2);
                    int e=Math.min(end1,end2);
                    res.add(new ArrayList<>(Arrays.asList(s,e)));}
            }
            else if(start1>start2){
                if(end2>=start1){
                    int s=Math.max(start1,start2);
                    int e=Math.min(end1,end2);
                    res.add(new ArrayList<>(Arrays.asList(s,e)));
                }
            }
            if(end1<=end2){
                i++;
                            }
            else{
                j++;
                            }
        }
            int[][] ans = new int[res.size()][2];
            for(int k = 0; k < res.size(); k++){

            ans[k][0] = res.get(k).get(0);
            ans[k][1] = res.get(k).get(1);
        }

        return ans;
    }
}