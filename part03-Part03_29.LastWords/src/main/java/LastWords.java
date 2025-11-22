
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String lastWords = scanner.nextLine();
            if(lastWords.equals("")){
                break;
            }

            String[] pieces = lastWords.split(" ");
            System.out.println(pieces[pieces.length - 1]);
        }


    }
}
