class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        boolean insert=false;
        ArrayList<ArrayList<Integer>> c=new ArrayList<>();
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            int start=intervals[i][0];
            int t=newInterval[0];
            if(start>t && insert==false){
                c.add(new ArrayList<>(Arrays.asList(newInterval[0],newInterval[1])));
                insert=true;
            }
            c.add(new ArrayList<>(Arrays.asList(start,intervals[i][1])));
        }
        if(!insert){
    c.add(new ArrayList<>(Arrays.asList(newInterval[0], newInterval[1])));
}
        int start1=c.get(0).get(0);
        int end1=c.get(0).get(1);
        for(int j=1;j<c.size();j++){
            int start2=c.get(j).get(0);
            int end2=c.get(j).get(1);
            if(end1>=start2){
                end1=Math.max(end1,end2);
            }else{
            res.add(new ArrayList<>(Arrays.asList(start1,end1)));
            start1=start2;
            end1=end2;}

        }res.add(new ArrayList<>(Arrays.asList(start1,end1)));
        int[][] ans = new int[res.size()][2];

        for(int i = 0; i < res.size(); i++){

            ans[i][0] = res.get(i).get(0);
            ans[i][1] = res.get(i).get(1);
        }

        return ans;

    }
}