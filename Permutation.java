//find the permutation of the given string--->
/*
 "abc" = abc, acb, bac, bca, cab, cba
 */

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        String str = "ABC";
        List<String> result = new ArrayList<>();
        //generatePermutations(str, "", result);
        System.out.println(result);
    }
    
}
