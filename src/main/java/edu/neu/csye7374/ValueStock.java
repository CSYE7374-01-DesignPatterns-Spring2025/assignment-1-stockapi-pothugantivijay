package edu.neu.csye7374;

public class ValueStock extends StockAPI {
    private static final double REFERENCE_PRICE = 1500.0; 
    private int performanceScore;

    public ValueStock(String ID, double price, String description) {
        super(ID, price, description);
    }

    @Override
    public void setBid(String bid) {
        try {
            double newPrice = Double.parseDouble(bid);
            // Update the main price
            setPrice(newPrice);

            // If newPrice is close to REFERENCE_PRICE, we consider it stable (score +1)
            // If newPrice is far from REFERENCE_PRICE, we consider it riskier (score -1)
            double difference = Math.abs(newPrice - REFERENCE_PRICE);

            if (difference <= 50) {
                // Very close to reference => good performance
                performanceScore += 1; 
            } else if (difference > 200) {
                // Far from reference => poor performance
                performanceScore -= 2;
            } else {
                // Moderately away => slight negative
                performanceScore -= 1; 
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid bid format. Please provide a numeric price.");
        }
    }

    @Override
    public int getMetric() {
        // For ValueStock, higher performanceScore means better performance
        return performanceScore;
    }
}