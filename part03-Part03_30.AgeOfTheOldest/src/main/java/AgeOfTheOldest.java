
import java.util.Scanner;
import java.util.ArrayList;

public class AgeOfTheOldest {

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

        for(int age : ages){
            int number = age;
            if(largest < number){
                largest = number;
            }
        }

        System.out.println("Age of the oldest: " + largest);


    }
}
