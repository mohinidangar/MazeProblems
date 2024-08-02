package Recursion.MazeBackTracking;

public class Rat{
    public static void main(String[] args) {
        int matrix[][] = {
            {1,0,0,0},
            {1,1,0,1},
            {0,1,0,0},
            {1,1,1,1}
        };
        ratInMaze(matrix, 0, 0, "");
    }
    static void ratInMaze(int[][] mat,int r,int c,String p){
        if(r==mat.length-1 && c==mat[0].length-1){
            System.out.println(p);
            return;
        }
        if(mat[r][c] == 0){
            return;
        }
        mat[r][c] = 0;
        if(r<mat.length-1){
            ratInMaze(mat, r+1, c, p+'D');
        }
        if(c<mat[0].length-1){
            ratInMaze(mat, r, c+1, p+'R');
        }
        if(r>0){
            ratInMaze(mat, r-1, c, p+'U');
        }
        if(c>0){
            ratInMaze(mat, r, c-1, p+'L');
        }
        mat[r][c] = 1;
    }
}