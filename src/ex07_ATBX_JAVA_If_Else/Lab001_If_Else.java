package ex07_ATBX_JAVA_If_Else;

public class Lab001_If_Else {
    public static void main(String[] args) {
        //int a = args[0];
        int age = Integer.parseInt(args[2]);
        if(age > 18){
            System.out.println("You can vote");}
        else{
            System.out.println("You can't vote");
        }
    }
}
