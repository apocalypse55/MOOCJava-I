
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        // System.out.println("Enter a positive no.:");
        int end = Integer.valueOf(scanner.nextLine());
        for (i = 0; i <= end; i++) {
            System.out.println(i);
        }
    }
}
