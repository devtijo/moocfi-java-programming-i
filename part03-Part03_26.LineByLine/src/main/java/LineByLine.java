
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String phrase = scanner.nextLine();
            if(phrase.equals("")){
                break;
            }
            String spliting[] = phrase.split(" ");
            for(String split : spliting){
                System.out.println(split);
            }
        }

        
        }
        }


    
    

