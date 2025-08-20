package assignment3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        // Adding some items
        library.addItem(new Book(101, "half girlfriend", "chetan bhagat"));
        library.addItem(new Book(102, "House of Cards", "sudha murthy"));
        library.addItem(new Magazine(201, "Tech Today", 45));
        library.addItem(new Magazine(202, "times of india", 12));

        // Show all items
        library.showAllItems();

        // Search by title
        System.out.print("\nEnter title to search: ");
        String searchTitle = sc.nextLine();
        library.searchByTitle(searchTitle);

        sc.close();
    }
}
