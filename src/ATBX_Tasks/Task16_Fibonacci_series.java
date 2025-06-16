package ATBX_Tasks;

public class Task16_Fibonacci_series {
    public static void main(String[] args) {

        int n = 10;
        int f = 0, s = 1;

        for(int i =0; i<=n; i++){

           System.out.println(f);

            int fn = f + s;
            f = s;
            s = fn;

            //System.out.println(s);
        }





        }

    }

