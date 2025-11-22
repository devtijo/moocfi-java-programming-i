
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        double average = 0;

        while (true) {
            int n = Integer.valueOf(scanner.nextLine());

            if (n == 0){
                break;
            } else if (n > 0){
                counter ++;
                sum += n;
            }
        }
        
        if( counter == 0){
            System.out.println("Cannot calculate the average");
        } else {
            average = 1.0 * sum/counter;
            System.out.println(average);
        }



    }
}
