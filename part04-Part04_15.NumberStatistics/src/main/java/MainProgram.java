
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics userStats = new Statistics();
        Statistics evenNumbers = new Statistics();
        Statistics oddNumbers = new Statistics();
        System.out.println("Enter numbers:");
        
        while(true){
            int userImput = Integer.valueOf(scanner.nextLine());
            if(userImput == -1){
                break;
            }
            else if(userImput % 2 == 0){
                evenNumbers.addNumber(userImput);
            }
            else{
                oddNumbers.addNumber(userImput);
            }
            userStats.addNumber(userImput);
        }

        System.out.println("Sum: " + userStats.sum());
        System.out.println("Sum of even numbers: " + evenNumbers.sum());
        System.out.println("Sum of odd numbers: " + oddNumbers.sum());
    }
}
