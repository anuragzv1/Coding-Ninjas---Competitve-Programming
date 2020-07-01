
public class Solution {

    public static void ratInMazeHelper(int [][] maze ,int row , int col, int n, int ans[][],boolean visited[][]){
        if(row >=maze.length || row < 0 || col >=maze.length || col <0)return;
        if(row ==n-1 && col == n-1){
            ans[row][col] = 1;
            for(int i = 0;i<n;i++){
                for(int j = 0;j<n;j++){
                    System.out.print(ans[i][j]+" ");
                }
            }
            System.out.println();
            ans[row][col] = 0;
            return;
        }
        if(maze[row][col]==0)return;
		if(visited[row][col])return;
        
		visited[row][col]=true;
        
        ans[row][col]=1;
        ratInMazeHelper(maze , row+1 ,col , n, ans,visited);
        ratInMazeHelper(maze , row ,col+1 , n ,ans,visited);
        ratInMazeHelper(maze , row ,col-1 , n, ans,visited);
        ratInMazeHelper(maze , row-1 ,col , n ,ans,visited);
        ans[row][col] = 0;
        visited[row][col] = false;
    }

    public static void ratInAMaze(int maze[][]){
        int n  = maze.length;
        int temp_ans[][]  = new int[n][n];
    	boolean visited[][] = new boolean[n][n];
        ratInMazeHelper(maze ,0,0,n , temp_ans,visited);
    }
}
