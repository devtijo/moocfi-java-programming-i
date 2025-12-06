import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String fileName = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();

        int counter = 0;
        int winCounter = 0;
        int loseCounter = 0;

        try (Scanner fscanner = new Scanner(Paths.get(fileName))) {
            while (fscanner.hasNextLine()) {
                String line = fscanner.nextLine();
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int awayPoints = Integer.valueOf(parts[3]);
                boolean IsHomeTeam = team.equals(homeTeam);
                boolean IsAwayTeam = team.equals(awayTeam);

                if (IsHomeTeam || IsAwayTeam) {
                    counter++;

                    if (IsHomeTeam) {
                        if (homePoints > awayPoints) {
                            winCounter++;
                        } else {
                            loseCounter++;
                        }
                    }

                    if (IsAwayTeam) {
                        if (awayPoints > homePoints) {
                            winCounter++;
                        } else {
                            loseCounter++;
                        }
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Games: " + counter);
        System.out.println("Wins: " + winCounter);
        System.out.println("Losses: " + loseCounter);

    }

}
