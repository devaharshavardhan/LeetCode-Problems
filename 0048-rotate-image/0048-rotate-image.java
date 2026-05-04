class Solution {
    public void rotate(int[][] matrix) {
        int[][] temp=new int[matrix.length][matrix.length];
        int s=matrix.length;
        for (int i=0;i<matrix.length;i++){
            s=matrix.length-1;
            for(int j=0;j<matrix.length;j++){
                temp[i][j]=matrix[s][i];
                System.out.println(s);
                System.out.println(i);
                s-=1;
            }
        }
        for(int q=0;q<matrix.length;q++){
            for(int w=0;w<matrix.length;w++){
                matrix[q][w]=temp[q][w];
            }
        }
    }
}