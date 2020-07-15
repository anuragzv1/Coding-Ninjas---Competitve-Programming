
public class Solution {


    public static boolean isSafe(int board[][] , int num , int row , int col){

        //checking columns
        for(int i = 0 ;i<9;i++){
            if(board[i][col]== num)return false;
        }

        //checking rows
        for(int i=0;i<9;i++){
            if(board[row][i]==num)return false;
        }
        int TRI = row-row%3;
        int TCI = col-col%3;

        for(int c = TRI;c<TRI+3;c++){
            for(int d = TCI;d<TCI+3;d++){
                if(board[c][d]==num){
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isSudokuSolvable(int[][]board , int row){
        if(row == board.length)return true;

        for(int i=0;i<9;i++){
            if(board[row][i]==0){
                boolean filled = false;
                for(int num =1;num<=9;num++){
                    if(isSafe(board,num,row,i)){
                        board[row][i] = num;
                        if(isSudokuSolvable(board ,row)){
                            filled = true;
                        }
                        else board[row][i] = 0; 
                    }
                }
                if(!filled)return false;
            }
        }
        return isSudokuSolvable(board , row+1);

    }

    public static boolean sudokuSolver(int board[][]){
        return isSudokuSolvable(board,0);
    }
}
