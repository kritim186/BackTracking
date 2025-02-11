public class GridWays {
        public static int ways(char grid[][], int row, int col){
                if(row == grid.length-1 || col == grid.length-1){
                    return 1;
                }
                int right = ways(grid, row, col+1);
                int down = ways(grid, row+1, col);
                int ans = right + down;
                return ans;
        }
    public static void main(String[] args) {
        //nxm grid is there
        int n = 3;
        char[][] grid = new char[n][n];
        System.out.println(ways(grid, 0, 0));

    }
    
}
