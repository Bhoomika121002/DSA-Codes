//backtracking 

package backtracking;

import java.util.Arrays;

public class allpathmaze {
    public static void main(String[] args) {
        boolean[][] board= {
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        int[][] path = new int[board.length][board[0].length];
        pathallmatrix("",board,0,0,path,1);
        pathall("",board,0,0);
    }
    static void  pathall( String p, boolean[][] maze, int row, int col ){
        
        if(row == maze.length -1 && col == maze[0].length -1){
            System.out.println(p);
            return; 

        }

        if(maze[row][col] == false ){
            return;   //if already visited means return
        }

        //i am considering this in my path
        //if not false  or blank set it as false 
        maze[row][col] = false;


        //down
        if(row<maze.length-1){
            pathall(p+'D', maze, row+1,col);

        }

        //right
        if(col<maze[0].length -1){
            pathall(p+'R', maze, row,col+1);

        }

        if(row>0){
            pathall(p+'U', maze, row-1,col);

        }
        if(col>0){
            pathall(p+'L', maze, row,col-1);

        } 

        //this line is where the function will be over 
        //so before the function gets removed remove the chnages made by function 
        maze[row][col] = true; 


        
    }



    //print matrix of path
    //the change is to have a path array and step in this 
    static void  pathallmatrix( String p, boolean[][] maze, int row, int col , int[][] path, int step){
        
        if(row == maze.length -1 && col == maze[0].length -1){
            //print path
            path[row][col] = step;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return; 

        }

        if(maze[row][col] == false ){
            return;   //if already visited means return
        }

        //i am considering this in my path
        //if not false  or blank set it as false 
        maze[row][col] = false;
        path[row][col] = step;




        //down
        if(row<maze.length-1){
            pathallmatrix(p+'D', maze, row+1,col, path, step+1);

        }

        //right
        if(col<maze[0].length -1){
            pathallmatrix(p+'R', maze, row,col+1,path, step+1);

        }

        if(row>0){
            pathallmatrix(p+'U', maze, row-1,col,path, step+1);

        }
        if(col>0){
            pathallmatrix(p+'L', maze, row,col-1,path, step+1);

        } 

        //this line is where the function will be over 
        //so before the function gets removed remove the chnages made by function 
        maze[row][col] = true;
        //when backtrack put it as 0
        path[row][col] = 0;  


        
    }
}
