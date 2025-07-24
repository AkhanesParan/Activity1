package activity;
import java.util.Scanner;

public class Activity3 {
      public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        
        System.out.print("Enter a number: ");
        number = scan.nextInt();
        
        if (number == 0) {
            System.out.println("Inputted number Zero");
        } else if (number % 2 == 0) {
            System.out.println("Inputted number is even");
        } else {
            System.out.println("Inputted number is odd");
        }
    }
}