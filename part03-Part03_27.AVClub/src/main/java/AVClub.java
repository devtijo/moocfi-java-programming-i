
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String avClub = scanner.nextLine();
            if(avClub.equals("")){
                break;
            }
            String [] splitling = avClub.split(" ");
            for(String split : splitling){
                if(split.contains("av")){
                    System.out.println(split);
                }
            }  
        }
    }
}
