package lsp2;

import lsp2.factory.OrderFactory;
import lsp2.model.OrderAbstr;
import lsp2.model.OrderPlain;
import lsp2.util.OrderCalculator;

public class Main {
    public static void main(String[] args) {
        OrderFactory creator = new OrderFactory();
        OrderCalculator calculator = new OrderCalculator();
        calculator.add(creator.createOrderPlain(3, 2));
        calculator.add(creator.createOrderBonus(1, 3));

        for (OrderAbstr o : calculator) {
            System.out.println(o);
        }

        System.out.printf("Orders sum %d", calculator.calcAmount());
    }
}
