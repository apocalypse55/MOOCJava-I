
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scanner.nextLine());
        int sum = firstNum + secondNum;
        String a = String.valueOf(firstNum);
        String b = String.valueOf(secondNum);
        
        System.out.println (a + " + " + b + " = " + sum );

    }
}
