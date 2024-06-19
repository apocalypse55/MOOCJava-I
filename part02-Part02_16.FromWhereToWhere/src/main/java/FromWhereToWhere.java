
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        // Write your program here
        
        // System.out.println("Where to?");
        // int upperLimit = Integer.valueOf(scanner.nextLine());
        // for (int i = 1; i <= upperLimit; i++) {
        //     System.out.println(i);
        // }
    
    //---------------------Part2--------------------
        System.out.println("Where to?");
        int higherLimit = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int lowerLimit = Integer.valueOf(scanner.nextLine());
        if (lowerLimit > higherLimit) {
            return;
        }
        for (int i = lowerLimit; i <= higherLimit; i++) {
            System.out.println(i);
        }
    }
}

