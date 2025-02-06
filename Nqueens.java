public class Nqueens {
    public static void nQueens(char board[][], int row){
        if(row==board.length){
            printB(board);
            return;
        }
        for(int i = 0; i < board.length; i++){          
                board[row][i] = 'Q';
                nQueens(board, row+1);
                board[row][i]='.';
            }
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
        
        int n = 2;
        char board[][] = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }
        nQueens(board, 0);
    }
    
}
