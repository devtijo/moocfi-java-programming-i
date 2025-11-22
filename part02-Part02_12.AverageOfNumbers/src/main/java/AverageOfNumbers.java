
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        double average = 0;
        while(true){
            System.out.println("Give a number: ");
            int n = Integer.valueOf(scanner.nextLine());

            if (n==0) {
                break;
            } else {
                counter++;
                sum += n;
            }
        }

        average = 1.0 * sum/counter;
        System.out.println("Average of the numbers: " + average);
    }
}