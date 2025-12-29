import java.util.ArrayList;
public class Cart {
    private ArrayList<FoodItem> cartItems = new ArrayList<>();

    public void addItem(FoodItem item) {
        cartItems.add(item);
        System.out.println(item.getName() + " added to cart.");
    }
    public double getTotal() {
        double total = 0;
        for (FoodItem item : cartItems) {
            total += item.getPrice();
        }
        return total;
    }
    public void showCart() {
        System.out.println("\n----- YOUR CART -----");
        for (FoodItem item : cartItems) {
            System.out.println(item.getName() + " - ₹" + item.getPrice());
        }
        System.out.println("Total Amount: ₹" + getTotal());
    }
    public boolean isEmpty() {
        return cartItems.isEmpty();
    }
}
import java.util.ArrayList;
public class Cart {
    private ArrayList<FoodItem> cartItems = new ArrayList<>();

    public void addItem(FoodItem item) {
        cartItems.add(item);
        System.out.println(item.getName() + " added to cart.");
    }
    public double getTotal() {
        double total = 0;
        for (FoodItem item : cartItems) {
            total += item.getPrice();
        }
        return total;
    }
    public void showCart() {
        System.out.println("\n----- YOUR CART -----");
        for (FoodItem item : cartItems) {
            System.out.println(item.getName() + " - ₹" + item.getPrice());
        }
        System.out.println("Total Amount: ₹" + getTotal());
    }
    public boolean isEmpty() {
        return cartItems.isEmpty();
    }
}
