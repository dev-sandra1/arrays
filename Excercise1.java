import java.util.Scanner;

public class Excercise1{
    public static void main(String[] args) {
         Scanner entry = new Scanner (System.in);
         int num [] = new int [3];

         System.out.println("guardando los datos");
         for(int i=0;i<3; i++){
            System.out.println((i + 1) + ". dijite los valores de los datos: ");
            num[i] =  entry.nextInt();
         }

         System.out.println("los numeros son: ");
         for(int i: num){
            System.out.println(i);
         }

    }
}