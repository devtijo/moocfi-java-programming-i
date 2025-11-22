
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String firstWords = scanner.nextLine();
            if(firstWords.equals("")){
                break;
            }

            String[] pieces = firstWords.split(" ");
            System.out.println(pieces[0]);
        }


    }
}
