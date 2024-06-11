
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPositiveNumbers = 0;
        int sumOfpositiveNumbers = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
                
            }
            if (number > 0) {
                totalPositiveNumbers = totalPositiveNumbers + 1;
                sumOfpositiveNumbers = sumOfpositiveNumbers + number;
            }
            continue;
            
        }
        if (totalPositiveNumbers == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double average = (double) sumOfpositiveNumbers / (double) totalPositiveNumbers;
            System.out.println(average);
        }
    }
}
