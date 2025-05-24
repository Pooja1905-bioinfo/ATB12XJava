package ex07_ATBX_JAVA_If_Else;

public class Lab003_If_Else_age {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[2]);

        if(age > 25){
            System.out.println("You can go to Goa");}
        else{
            System.out.println("Sorry Dear! Not allowed");
        }
    }
}
