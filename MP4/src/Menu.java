public abstract class Menu {
    private String name;
    private double price;

    public Menu(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract String getDescription();

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return getDescription() + ": $" + String.format("%.2f", price);
    }
}
