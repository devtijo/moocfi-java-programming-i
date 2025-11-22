
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> names = new ArrayList<>();
        ArrayList <Integer> years = new ArrayList<>();

        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }

            if(input.length()>0){
                String[] spliting = input.split(",");
                names.add(spliting[0]);
                years.add(Integer.valueOf(spliting[1]));
            }
        }

        int largest = 0;
        String largestName = names.get(0);

        for(int i = 0 ; i < names.size() ; i++){
            int cantidad = names.get(i).length();
            if(cantidad > largest){
                largest = cantidad;
                largestName = names.get(i);
            }
        }

        System.out.println("Longest name: " + largestName);

    
        int counter = 0;
        int sum = 0;
        for(int year : years){
            sum += year;
            counter++;
        }

        double average = 1.0*sum / counter;

        System.out.println("Average of the birth years: " + average);
    }
}
