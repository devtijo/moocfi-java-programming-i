
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Last number? ");
        int n = Integer.valueOf(scanner.nextLine());
        int i = 0;
        int sum = 0;
        
        while(i <= n){
            sum += i;
            i++;
        }
        System.out.println("The sum is " + sum);

    }
}
