import java.util.HashMap;
import java.util.Map;
class Inventory {
    Map<String, Product> stock;

    public Inventory() {
        stock = new HashMap<>();
        stock.put("Milk", new Product("P001", "Milk", 5, 25.0));
        stock.put("Bread", new Product("P002", "Bread", 3, 30.0));
        stock.put("Eggs", new Product("P003", "Eggs", 0, 6.0)); // out of stock
    }

    public boolean isAvailable(String item) {
        return stock.containsKey(item) && stock.get(item).quantity > 0;
    }

    public Product getProduct(String item) {
        return stock.get(item);
    }

    public void reduceStock(String item, int qty) {
        Product p = stock.get(item);
        if (p != null && p.quantity >= qty) {
            p.quantity -= qty;
        }
    }

    public void viewStock() {
        System.out.println("\n📦 Current Inventory Status:");
        for (Product p : stock.values()) {
            System.out.println("- " + p.name + " (ID: " + p.id + ") - Quantity: " + p.quantity + " | Price: ₹" + p.price);
        }
    }
    public void displayItem(String itemName) {
        if (stock.containsKey(itemName)) {
            Product p = stock.get(itemName);
            System.out.println("\n🧾 Product Details:");
            System.out.println("ID       : " + p.id);
            System.out.println("Name     : " + p.name);
            //System.out.println("Quantity : " + p.quantity);
            System.out.println("Price    : ₹" + p.price);
        } else {
            System.out.println("❌ Item \"" + itemName + "\" not found in inventory.");
        }
    }

}