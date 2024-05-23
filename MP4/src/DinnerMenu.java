import java.util.LinkedList;

public class DinnerMenu extends Menu {
    public DinnerMenu(LinkedList<String> menuItems) {
        super(menuItems);
    }

    public void displayMenuItems() {
        System.out.println("Dinner Menu:");
        for (String item : menuItems) {
            System.out.println("- " + item);
        }
    }

    public static void main(String[] args) {
        LinkedList<String> items = new LinkedList<>();
        items.add("Burger");
        items.add("Pasta");
        items.add("Pizza");

        DinnerMenu dinnerMenu = new DinnerMenu(items);

        dinnerMenu.displayMenuItems();
    }

}
