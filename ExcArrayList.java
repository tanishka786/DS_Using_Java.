import java.util.ArrayList;
import java.util.List;

class Order {
    private List<String> items;

    public Order(List<String> items) {
        this.items = items;
    }

    public List<String> getItems() {
        return items;
    }
}

public class Tester {

    public static void main(String[] args) {
        // Creating orders with items
        Order order1 = new Order(List.of("Burger", "Fries", "Coke"));
        Order order2 = new Order(List.of("Pizza", "Salad", "Coke"));
        Order order3 = new Order(List.of("Steak", "Salad", "Ice Cream"));

        // Adding orders to a list
        List<Order> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);

        // Retrieve and print all items
        List<String> allItems = getItems(orders);
        System.out.println("All items in orders: " + allItems);
    }

    public static List<String> getItems(List<Order> orders) {
        List<String> allItems = new ArrayList<>();

        for (Order order : orders) {
            allItems.addAll(order.getItems());
        }

        return allItems;
    }
}
