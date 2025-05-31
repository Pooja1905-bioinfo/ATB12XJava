package ex12_ATBX_Functions;

public class Lab002_Functions {
    public static void main(String[] args) {

        non_ret_type_func();
        int a = return_type_function();
        System.out.println(a);

    }
        static void non_ret_type_func(){
            System.out.println("Hi, Non Return type");
        }


        static int return_type_function(){
            System.out.println("Hi");
            return 10;
        }
    }



