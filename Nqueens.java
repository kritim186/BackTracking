public class Nqueens {
    public static void nQueens(char board[][], int row){
        if(row==board.length){
            printB(board);
            return;
        }
        for(int i = 0; i < board.length; i++){  
            if(isSafe(board, row, i)){        
                board[row][i] = 'Q';
                nQueens(board, row+1);//recursion call
                board[row][i]='.';//backtracking
            }
            }
    }
    public static boolean isSafe(char board[][], int row, int col){

        //vertically up
        for(int i = row-1; i >= 0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        // Left Diagonal Up
        for (int i = row-1, j=col-1; i >= 0 && j>=0; i--, j--) {
            if(board[i][j] == 'Q'){
                    return false;
            }
        }
        //Right Diagonal Up
        for (int i = row-1, j = col+1; i >= 0 && j < board.length; i--,j++) {
        if(board[i][j] == 'Q'){
            return false;
        } 
    }
    return true;   
    }
    public static void printB(char board[][]){
        System.out.println("---------------");
       for(int i = 0; i < board.length; i++){
          for (int j = 0; j < board.length; j++) {
            System.out.print(board[i][j]);
          }
          System.out.println();
       }
    }

    public static void main(String[] args) {
        
        int n = 4;
        char board[][] = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }
        nQueens(board, 0);
    }
    
}
