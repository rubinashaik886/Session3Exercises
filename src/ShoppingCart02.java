public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase a "+itemDesc;

        // Declare and initialize numeric fields: price, tax, quantity.

        double price = 10.50;
        double tax = 0.60;
        int quantity = 2;

        // Declare and assign a calculated totalPrice

        double totalPrice = (price * quantity) + tax;

        // Modify message to include quantity

        System.out.println("Alex wants to purchase " + quantity + " shirts");

        // Print another message with the total cost

        System.out.println("Total cost with tax is " + totalPrice);

    }
}
