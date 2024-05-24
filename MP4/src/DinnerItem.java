public class DinnerItem extends Menu {
    public DinnerItem(String name, double price) {
        super(name, price);
    }

    @Override
    public String getDescription() {
        return getName();
    }
}
