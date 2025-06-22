package ATBX_Test01;

public class ATBX_Question13_Solution {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            System.out.println("****Table of " + i + "****");
            for(int j = 1; j <= 10; j++) {
                System.out.printf("%d * %d =%d%n",i ,j, i * j);
            }
        }
    }
}
