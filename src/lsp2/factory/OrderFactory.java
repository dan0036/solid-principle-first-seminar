package lsp2.factory;

import lsp2.model.OrderAbstr;
import lsp2.model.OrderBonus;
import lsp2.model.OrderPlain;
import srp2.model.Order;

public class OrderFactory {
    public OrderAbstr createOrderPlain(int price, int quantity) {
        return new OrderPlain(quantity, price);
    }
    public OrderAbstr createOrderBonus(int price, int quantity) {
        return new OrderBonus(price, quantity);
    }

}
