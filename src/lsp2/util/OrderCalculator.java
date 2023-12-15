package lsp2.util;

import lsp2.model.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OrderCalculator implements Iterable<OrderAbstr> {
    private List<OrderAbstr> orders = new ArrayList<>();

    public void add(OrderAbstr o) {
        orders.add(o);
    }

    public int calcAmount() {
        int sum = 0;
        for (OrderAbstr o : orders) {
            sum += o.getAmount();
        }
        return sum;
    }

    @Override
    public Iterator<OrderAbstr> iterator() {
        return orders.iterator();
    }
}
