public class Menu {
    private final String food;
    private final int price;

    public Menu(String food, int price) {
        this.food = food;
        this.price = price;
    }

    public String getFood() {
        return food;
    }

    public int getPrice() {
        return price;
    }
}
