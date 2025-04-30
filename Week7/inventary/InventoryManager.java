class InventoryManager {
    private final Inventory inventory;

    public InventoryManager(Inventory inventory) {
        this.inventory = inventory;
    }

    // Update price of a specific item
    public void updatePrice(String itemName, double newPrice) {
        Product product = inventory.getProduct(itemName);
        if (product != null) {
            product.price = newPrice;
            System.out.println("🔧 Price of " + product.name + " updated to ₹" + newPrice);
        } else {
            System.out.println("❌ Item not found in inventory.");
        }
    }

    // Apply a percentage increase to all products
    public void increaseAllPricesByPercentage(double percentage) {
        for (Product product : inventory.stock.values()) {
            double oldPrice = product.price;
            product.price += product.price * (percentage / 100.0);
            System.out.println("💰 " + product.name + ": ₹" + oldPrice + " ➡ ₹" + product.price);
        }
    }

}

