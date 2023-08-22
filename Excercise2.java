import java.util.Scanner;

public class Excercise2{
    public static void main(String[] args) {
        Scanner entry = new Scanner( System.in);
        String names [] = new String[5];

        System.out.println("Names");
        for(int i =0; i< names.length; i++){

            System.out.println("enter the names the your friends: ");
            names[i] = entry.nextLine();

        }

        System.out.println("your friends are: ");
        for(String i: names){
            System.out.println(i);
        }
      
    }
}