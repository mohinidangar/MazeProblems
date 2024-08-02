package Recursion.MazeBackTracking;

import java.util.Arrays;

public class PrintPath {
    public static void main(String[] args) {
        boolean[][] board = {{true,true,true},
            {true,true,true},
            {true,true,true},
        };
        int[][] path = new int[board.length][board[0].length];
        path("",0,0,board,path,1);
    }
    static void path(String p,int r,int c,boolean maze[][],int[][] path,int step){
        if(r==maze.length-1 && c==maze[0].length-1){
            path[r][c] = step;
            for(int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        path[r][c] = step;
        if(r<maze.length-1){
            path(p+'D',r+1,c,maze,path,step+1);
        }
        if(c<maze[0].length-1){
            path(p+'R',r,c+1,maze,path,step+1);
        }
        if(r>0){
            path(p+'U',r-1,c,maze,path,step+1);
        }
        if(c>0){
            path(p+'L',r,c-1,maze,path,step+1);
        }
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
