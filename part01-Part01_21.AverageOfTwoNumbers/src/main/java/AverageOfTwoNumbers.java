
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        float firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        float secondNum = Integer.valueOf(scanner.nextLine());
        float average = (firstNum + secondNum) / 2 ;
        
        System.out.println("The average is " + average);

    }
}
