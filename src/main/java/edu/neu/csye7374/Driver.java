package edu.neu.csye7374;

/**
 * 
 * @author Yesha
 * 
 */

public class Driver {
	public static void main(String[] args) {
        System.out.println("============Main Execution Start===================\n\n");

        // Add your code in between these two print statements
        GrowthStock growthStock = new GrowthStock("AAPL", 150.00, "Apple Inc. Stock");
        ValueStock valueStock = new ValueStock("GOOG", 2500.00, "Google LLC Stock");

        // Provide 6 bids for each
        String[] growthBids = {"151.00", "153.00", "152.00", "155.00", "154.00", "160.00"};
        String[] valueBids  = {"1400.00", "1550.00", "1700.00", "1300.00", "1525.00", "1450.00"};

        // Simulate market trends for GrowthStock
        System.out.println("=== GrowthStock (AAPL) ===");
        for (String bid : growthBids) {
            growthStock.setBid(bid);
            System.out.println("Bid: " + bid + " | Price: " + growthStock.getPrice() 
                               + " | Metric: " + growthStock.getMetric());
        }

        System.out.println();

        // Simulate market trends for ValueStock
        System.out.println("=== ValueStock (GOOG) ===");
        for (String bid : valueBids) {
            valueStock.setBid(bid);
            System.out.println("Bid: " + bid + " | Price: " + valueStock.getPrice() 
                               + " | Metric: " + valueStock.getMetric());
        }

        System.out.println();
        // Print final StockAPI toString() outputs
        System.out.println(growthStock.toString());
        System.out.println(valueStock.toString());

        System.out.println("\n\n============Main Execution End===================");
    }

}
