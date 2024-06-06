
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scanner.nextLine());
        int product = firstNum * secondNum;
        String a = String.valueOf(firstNum);
        String b = String.valueOf(secondNum);
        
        System.out.println (a + " * " + b + " = " + product );

    }
}
