package ATBX_Tasks;

public class Task18_reverse_string_for_loop {
    public static void main(String[] args) {
        String str = "Pooja";
        String reverse = " ";

        for(int i = str.length()-1; i >= 0; i--){
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }
        System.out.println(reverse);
    }
}
