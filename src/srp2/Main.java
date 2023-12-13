package srp2;

import srp2.model.Order;
import srp2.model.OrderSaver;
import srp2.model.View;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter order:");
        Order order = new View().inputFromConsole();
        new OrderSaver().saveToJson(order);
    }
}
