import java.util.LinkedList;

public abstract class Menu {
    protected LinkedList<String> menuItems;

    public Menu(LinkedList<String> menuItems) {
        this.menuItems = menuItems;
    }

    public abstract void displayMenuItems();

    public LinkedList<String> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(LinkedList<String> menuItems) {
        this.menuItems = menuItems;
    }

}

