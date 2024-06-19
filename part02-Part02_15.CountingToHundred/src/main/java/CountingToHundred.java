
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Where to?");
        int start = Integer.valueOf(scanner.nextLine());
        for (int i = start ; i <= 100; i++) {
            System.out.println(i);
        }

    }
}
