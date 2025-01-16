public class Subset {
    public static void sub(String str, String ans, int idx){
        // ..Bc
        if(idx == str.length()){
            System.out.println(ans);
            return;
        }
        sub(str, ans+str.charAt(idx), idx+1);
        sub(str, ans, idx+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        sub(str, "", 0);
    }
}
