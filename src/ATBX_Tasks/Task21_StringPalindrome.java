package ATBX_Tasks;

public class Task21_StringPalindrome {
    public static void main(String[] args) {
        String str = "POOJA";
        String reverse = "";
        for(int i = str.length()-1; i >= 0; i--){
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }
        System.out.println(reverse);
        if(reverse.equals(str)){
            System.out.println(str + " is palindromic");
        }
        else{
            System.out.println("Given String is not palindromic");
        }
    }
}
