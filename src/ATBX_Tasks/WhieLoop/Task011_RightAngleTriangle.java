package ATBX_Tasks.WhieLoop;

public class Task011_RightAngleTriangle {
    public static void main(String[] args) {
        int n = 6;
        int i = 1;
        while(i<=n){
            System.out.println();
            i++;
            int j = 2;
            while(j<=i){
                System.out.print("* ");
                j++;
            }
        }
    }

}
