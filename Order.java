public class Order {
    public void placeOrder(Cart cart) {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty! Add items before ordering.");
        } else {
            cart.showCart();
            System.out.println("\nOrder placed successfully!");
            System.out.println("Thank you for ordering 😊");
        }
    }
}
