package assignment3;
import java.util.ArrayList;

public class Library {
    private ArrayList<Item> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
        System.out.println("Added: " + item.getTitle());
    }

    public void showAllItems() {
        System.out.println("\nLibrary Items:");
        for (Item item : items) {
            item.display();
        }
    }

    public void searchByTitle(String title) {
        System.out.println("\nSearch results for: " + title);
        boolean found = false;
        for (Item item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                item.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No item found with title: " + title);
        }
    }
}
