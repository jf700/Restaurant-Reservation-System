import java.util.LinkedList;

public class LunchMenu extends Menu {
    public LunchMenu(LinkedList<String> menuItems) {
        super(menuItems);
    }

    public void displayMenuItems() {
        System.out.println("Lunch Menu:");
        for (String item : menuItems) {
            System.out.println("- " + item);
        }
    }

    public static void main(String[] args) {
        LinkedList<String> items = new LinkedList<>();
        items.add("Grilled Cheese Sandwich");
        items.add("Caesar Salad");
        items.add("Tomato Soup");
        items.add("Fries");

        LunchMenu lunchMenu = new LunchMenu(items);
        
        lunchMenu.displayMenuItems();
    }

}
