import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            int pages = Integer.valueOf(scanner.nextLine());

            int publicationYear = Integer.valueOf(scanner.nextLine());

            books.add(new Book(name, pages, publicationYear));
        }

        System.out.println();
        String answer = scanner.nextLine();

        for (Book book : books) {
            if (answer.equals("everything")) {
                System.out.println(book.toString());
            } else if (answer.equals("name")) {
                System.out.println(book.getTitle());
            } else {
                break;
            }
        }
    }
}