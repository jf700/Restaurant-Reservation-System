import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DinnerMenu {
    private List<Menu> menuItems;

    public DinnerMenu() {
        this.menuItems = new ArrayList<>();
    }

    public void loadMenuItems(String filename) {
        File file = new File(filename);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    double price = Double.parseDouble(parts[1].trim());
                    menuItems.add(new DinnerItem(name, price)); // Use DinnerItem instead of MenuItem
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + filename);
        } catch (NumberFormatException e) {
            System.out.println("Error: Incorrect format in file. Price must be a number.");
        }
    }

    public void displayMenu() {
        if (menuItems.isEmpty()) {
            System.out.println("The menu is empty.");
        } else {
            System.out.println("Dinner Menu:");
            for (Menu item : menuItems) {
                System.out.println(item);
            }
        }
    }
}
