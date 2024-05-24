public class LunchItem extends Menu {
    public LunchItem(String name, double price) {
        super(name, price);
    }

    @Override
    public String getDescription() {
        return getName();
    }
}
