public class Maze {
 public static int maze(int[][] arr, int r, int c){
    if(r == arr.length-1 || c == arr.length-1){
        return 1;
    }
    int right = maze(arr, r, c+1);
    int down = maze(arr, r+1, c);
    return right + down;
 }
 public static void main(String[] args) {
    int[][] arr = new int[6][6];
    System.out.println(maze(arr, 0,0));
 }

}
