
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        ArrayList<Integer> list = new ArrayList<>();
        // adding them on a list until user gives -1.
        while(true) {
            int input = Integer.valueOf(scanner.nextLine());
            if ( input == -1){
                break;
            }
        list.add(input);
        }
        // Then it computes the average of the numbers on the list
        int sum = 0;
        for (int i = 0; i < list.size(); i++){
            sum = sum + list.get(i);
        }
        double avg = (double)sum / (double)list.size();
        System.out.println("Average: " + avg);
        // and prints it.
        
    }
}
