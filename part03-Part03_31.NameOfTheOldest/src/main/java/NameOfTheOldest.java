
import java.util.Scanner;
import java.util.ArrayList;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> names = new ArrayList<>();
        ArrayList <Integer> ages = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }

            if(input.length() > 0){
                String[] spliting = input.split(",");
                names.add(spliting[0]);
                ages.add(Integer.valueOf(spliting[1]));

            }
        }

        int largest = ages.get(0);
        String oldestPerson = names.get(0);
        
        for(int i = 0; i < ages.size(); i++){
            int number = ages.get(i);
            if(largest < number){
                largest = number;
                oldestPerson = names.get(i);
            }
        }

        System.out.println("Name of the oldest: " + oldestPerson);

        



    }
}
