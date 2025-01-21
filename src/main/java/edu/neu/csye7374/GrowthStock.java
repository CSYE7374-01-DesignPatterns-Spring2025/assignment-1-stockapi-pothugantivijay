package edu.neu.csye7374;
public class GrowthStock extends StockAPI {
    private int performanceIndex;
    private double lastPrice; 

    public GrowthStock(String ID, double price, String description) {
        super(ID, price, description);
        this.lastPrice = price;
    }

    @Override
    public void setBid(String bid) {
        try {
            double newPrice = Double.parseDouble(bid); 
            // Update the price
            setPrice(newPrice);

            // If price has gone up from the last price, increase the performance index
            if (newPrice > lastPrice) {
                performanceIndex += 2; 
            } else if (newPrice < lastPrice) {
                performanceIndex -= 2; 
            }
            // Update the last price reference
            lastPrice = newPrice;
        } catch (NumberFormatException e) {
            System.out.println("Invalid bid format. Please provide a numeric price.");
        }
    }

    @Override
    public int getMetric() {
        // For GrowthStock, higher performanceIndex means better performance
        return performanceIndex;
    }
}