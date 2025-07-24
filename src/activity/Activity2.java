package activity;
import java.util.Scanner;

public class Activity2 {
     public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int num;

        System.out.println("Enter a number");
        num = scan.nextInt();
        if(num > 0){
            System.out.println(num+" is a positive number");
        } else if(num < 0){
            System.out.println(num+" is a negative number");
        }
        else if(num == 0){
            System.out.println("Inputted number is 0");
        }
    }
}