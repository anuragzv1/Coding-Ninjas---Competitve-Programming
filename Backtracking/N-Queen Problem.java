
public class Solution {

    public static boolean isSafe(int[][]board , int i , int j){
        
        //check coloumn
        for(int row = 0;row <board.length;row++){
            if(board[row][j]==1)return false;
        }
        
        //check row
        for(int col = 0;col<board.length;col++){
            if(board[i][col]==1)return false;
        }
        
        //check left diagonal above the index
        int row = i ,  col = j;
        while(row>=0 && col >=0){
            if(board[row--][col--]==1)return false;
        }
        
        //check left diagonal below the index
        row = i+1; 
        col = j+1;
        while(row<board.length && col<board.length){
            if(board[row++][col++]==1)return false;
        }
        
        //checking right diagonal above index
        row = i;
        col=j;
        while(row>=0 && col <board.length){
            if(board[row--][col++]==1)return false;
        }
        
        
        row = i+1;
        col = j-1;
        while(row <board.length && col >=0){
            if(board[row++][col--]==1)return false;
        }
        
        return true;
    }

    public static void printQueenPositions(int [][] board , int row){
        if(row == board.length){
            for(int i =0;i<board.length;i++){
                for(int j = 0;j<board.length;j++){
                    System.out.print(board[i][j]+" ");
                }
            }
            System.out.println();
            return;
        }
		
        //if the position is safe then call recursion on next row
        for(int i = 0;i<board.length;i++){
            if(isSafe(board ,row , i)){
                board[row][i]=1;
                printQueenPositions(board , row+1);
                board[row][i] = 0;
            }
        }

    }

    public static void placeNQueens(int n){
        int [][] board = new int[n][n];
        printQueenPositions(board , 0);
    }

}
