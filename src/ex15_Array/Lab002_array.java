package ex15_Array;

public class Lab002_array {
    public static void main(String[] args) {
        int [] marks = new int[6];
        int marks2[] = new int[5];

        //String names =  new String[3];

        //System.out.println(marks[0]);
        //System.out.println(marks2[2]);
       // System.out.println(names[2]);

        char ch = 'A';
        String name= "Pooja";
        String[] name_of_each_character = name.split("");
        System.out.println(name_of_each_character);
        for(int i =0; i< name_of_each_character.length; i++){
            System.out.println(name_of_each_character[i]);
        }

    }
}
