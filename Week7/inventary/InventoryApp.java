import java.util.Scanner;
public class InventoryApp {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);
        InventoryManager manager = new InventoryManager(inventory);

        String item;
        int qty;

        while (true) {
            System.out.println("\n=== Inventory Menu ===");
            System.out.println("1. View Stock");
            System.out.println("2. Check Item Availability");
            System.out.println("3. Purchase Item");
            System.out.println("4. Exit");
            System.out.println("5. Update Item Price");
            System.out.println("6. Increase All Prices (%)");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    inventory.viewStock();
                    break;

                case 2:
                    System.out.print("Enter item name to check: ");
                    item = scanner.nextLine();
                    if (inventory.isAvailable(item)) {
                        System.out.println("✅ " + item + " is available.");
                    } else {
                        System.out.println("❌ " + item + " is not available or out of stock.");
                    }
                    break;

                case 3:
                    System.out.print("Enter item name to purchase: ");
                    item = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    qty = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    if (inventory.isAvailable(item) && inventory.getProduct(item).quantity >= qty) {
                        inventory.reduceStock(item, qty);
                        double cost = inventory.getProduct(item).price * qty;
                        System.out.println("🛒 Purchased " + qty + " " + item + "(s) for ₹" + cost);
                    } else {
                        System.out.println("❌ Not enough stock or item unavailable.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting... 👋");
                    scanner.close();
                    return;
                // Add a new menu option:

                // In the switch statement:
                case 5:
                    System.out.print("Enter item name to update price: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter new price: ₹");
                    double newPrice = scanner.nextDouble();
                    scanner.nextLine(); // consume newline
                    manager.updatePrice(itemName, newPrice);
                    break;

                case 6:
                    System.out.print("Enter percentage increase (e.g., 10 for 10%): ");
                    double percent = scanner.nextDouble();
                    scanner.nextLine(); // consume newline
                    manager.increaseAllPricesByPercentage(percent);
                    break;


                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
