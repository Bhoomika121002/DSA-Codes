package backtracking;

import java.util.ArrayList;

public class maze {
    public static void main(String[] args) {
        System.out.println(count(3,3));
        path("",3,3);
        System.out.println(pathlist("",3,3));
        System.out.println(pathlistdiagonally("",3,3));

        boolean[][] board= {
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };
        pathrestrictions("",board,0,0);
    } 
    
    static int count(int row, int col ){
        //endpoint 1,1
        if(row == 1||col == 1){
            return 1;

        }

        int left = count(row-1, col);
        int right = count ( row, col -1);

        return left + right; 
    }
    static void  path( String p, int row, int col ){
        //endpoint 1,1
        if(row == 1 && col == 1){
            System.out.println(p);
            return; 

        }
        if(row>1){
            path(p+'D', row-1,col);

        }
        if(col>1){
            path(p+'R', row,col-1);

        }

        
    }
    static ArrayList<String>  pathlist( String p, int row, int col ){
        //endpoint 1,1
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list; 

        }

        ArrayList<String> list = new ArrayList<>();

        if(row>1){
            list.addAll(pathlist(p+'D', row-1,col));

        }
        if(col>1){
            list.addAll(pathlist(p+'R', row,col-1));

        }
        return list;

        
    }

    //can go diagonally 
    static ArrayList<String>  pathlistdiagonally( String p, int row, int col){
        //endpoint 1,1
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list; 

        }

        ArrayList<String> list = new ArrayList<>();

        
        if(row>1 && col > 1){
            list.addAll(pathlistdiagonally(p+'D', row-1,col-1));

        }

        if(row>1){
            list.addAll(pathlistdiagonally(p+'V', row-1,col));

        }
        if(col>1){
            list.addAll(pathlistdiagonally(p+'H', row,col-1));

        }
        return list;

        
    }

    //obstacle river at 1,1
     static void  pathrestrictions( String p, boolean[][] maze, int row, int col ){
        
        if(row == maze.length -1 && col == maze[0].length -1){
            System.out.println(p);
            return; 

        }

        if(maze[row][col] == false ){
            return;
        }
        if(row<maze.length-1){
            pathrestrictions(p+'D', maze, row+1,col);

        }
        if(col<maze[0].length -1){
            pathrestrictions(p+'R', maze, row,col+1);

        }

        
    }
}
