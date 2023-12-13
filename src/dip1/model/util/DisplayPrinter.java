package dip1.model.util;

import dip1.model.ReportItem;
import dip1.model.Reportable;

import java.util.List;

public class DisplayPrinter implements Reportable {
    @Override
    public void output(List<ReportItem> items) {
        System.err.println("Display!!!");
        for (ReportItem item : items) {
            System.out.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
