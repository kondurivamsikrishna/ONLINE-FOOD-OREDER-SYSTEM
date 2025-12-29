import java.util.ArrayList;
public class Menu {
    private ArrayList<FoodItem> items = new ArrayList<>();
    public Menu() {
        items.add(new FoodItem(1, "Pizza", 250));
        items.add(new FoodItem(2, "Burger", 120));
        items.add(new FoodItem(3, "Biryani", 200));
        items.add(new FoodItem(4, "Pasta", 180));
        items.add(new FoodItem(5, "Cold Drink", 50));
    }
    public void showMenu() {
        System.out.println("\n----- MENU -----");
        for (FoodItem item : items) {
            item.display();
        }
    }
    public FoodItem getItemById(int id) {
        for (FoodItem item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}
