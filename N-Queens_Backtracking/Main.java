import java.util.*;
public class Main {
	static void printSolution(int board[][], int N)
	{
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				System.out.print(" " + board[i][j]
								+ " ");
			System.out.println();
		}
	}
    public static boolean isSafe(int board[][], int row ,int col, int N){
    //check row wise
    for(int i=0;i<N;i++){
        if(board[row][i]==1){
            return false;
        }
    }
    //ckeck column wise
    for(int i=0;i<N;i++){
        if(board[i][col]==1){
            return false;
        }
    }
        //Lower left diagonal check
    for(int i=row, j=col; i<N&&j>=0; i++,j--){
        if(board[i][j]==1)
        return false;
    }
    // Lower right diagonal check
    for(int i=row, j=col; i<N&&j<N; i++,j++){
        if(board[i][j]==1)
        return false;
    }
    //Upper left diagonal check
    for(int i=row,  j=col;i>=0&&j>=0;i--,j--){
        if(board[i][j]==1)
        return false;
    }
    //Upper right diagonal check
    for(int i=row, j=col; i>=0&&j<N; i--,j++){
        if(board[i][j]==1)
        return false;
    }

    return true;
}
	static boolean solve(int board[][], int col , int N)
	{
		if(col >= N) // all are placed
			return true;
		for (int i = 0; i < N; i++) {
			if (isSafe(board, i, col, N)) {
			    board[i][col]=1;
				if (solve(board,col+1,N)==true)
					return true;
				board[i][col]=0; 
			}
		}
		return false;
	}
	static boolean solveNQ(int N)
	{
		int board[][] =new int[N][N];
		for(int i=0;i<N;i++)
		for(int j=0;j<N;j++)
		board[i][j]=0;
		if (solve(board, 0, N) == false) {
			System.out.print("Solution does not exist");
			return false;
		}

		printSolution(board, N);
		return true;
	}

	public static void main(String args[])
	{
       Scanner s=new Scanner(System.in);
	   int N=s.nextInt(); 
		solveNQ(N);
	}
}
