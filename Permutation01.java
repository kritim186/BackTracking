import java.util.*;
public class Permutation01 {
    public static void findPer(int[] arr, int idx, List<List<Integer>> ans){
        if(idx == arr.length){
            List<Integer> list = new ArrayList<>();
            for(int e : arr){
                    list.add(e);
            }
            ans.add(list);
            return;
                }
            for(int i = idx; i < arr.length; i++) {
                swap(arr, i, idx);
                findPer(arr, idx+1, ans);
                swap(arr, i, idx);
            }   
    }
    public static void swap(int[] arr, int f, int s){
        int t = arr[f];
        arr[f] = arr[s];
        arr[s] = t;
    }

    public static List<List<Integer>> permute(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        findPer(arr, 0, ans);
        return ans;
    }
     public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(permute(arr));
    }
    
}
