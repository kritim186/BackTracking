// There are 3 types of backtracking
/* 
1. Decision = if there exists the solution or not
2. Optimization = most optimal solution[let's say shortest path]
3. Enumeration = List down all the possible combinations
*/
class BackTrack{
    public static void changeArr(int[] arr, int idx, int val){
        //BC
        if(idx == arr.length){
            printArr(arr);
            return;
        }
        // Recursion
        arr[idx] = val;
        changeArr(arr, idx+1, val+1);
        //Backtrack
        arr[idx] = arr[idx]-2;
    }
    public static void printArr(int[] arr){
        for (int i:arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}