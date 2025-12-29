import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        Cart cart = new Cart();
        Order order = new Order();
        while (true) {
            System.out.println("\n===== ONLINE FOOD ORDER SYSTEM =====");
            System.out.println("1. View Menu");
            System.out.println("2. Add Item to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Place Order");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    menu.showMenu();
                    break;
                case 2:
                    menu.showMenu();
                    System.out.print("Enter Item ID: ");
                    int id = sc.nextInt();
                    FoodItem item = menu.getItemById(id);
                    if (item != null) {
                        cart.addItem(item);
                    } else {
                        System.out.println("Invalid Item ID!");
                    }
                    break;
                case 3:
                    cart.showCart();
                    break;
                case 4:
                    order.placeOrder(cart);
                    return;
                case 5:
                    System.out.println("Thank you for using the system!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
