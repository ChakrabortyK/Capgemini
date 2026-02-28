import java.util.*;


abstract class FoodItem {
    private int id;
    private String name;
    private double price;

    public FoodItem(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }


    public abstract double calculateDiscount();
}

class VegItem extends FoodItem {

    public VegItem(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; 
    }
}

class NonVegItem extends FoodItem {

    public NonVegItem(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; 
    }
}


class Order {
    private List<FoodItem> items = new ArrayList<>();

    public void addItem(FoodItem item) {
        items.add(item);
    }

    public double calculateTotalBill() {
        double total = 0;

        for (FoodItem item : items) {
            double discount = item.calculateDiscount();
            total += (item.getPrice() - discount);
        }

        return total;
    }
}

public class Restaurant {
    public static void main(String[] args) {

        Order order = new Order();

        FoodItem veg = new VegItem(1, "Paneer", 200);
        FoodItem nonVeg = new NonVegItem(2, "Chicken", 300);

        order.addItem(veg);
        order.addItem(nonVeg);

        System.out.println("Total Bill: " + order.calculateTotalBill());
    }
}