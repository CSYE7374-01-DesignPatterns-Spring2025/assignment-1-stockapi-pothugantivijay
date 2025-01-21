package edu.neu.csye7374;

public interface Tradable {
    /**
     * Place a bid to buy a stock
     * @param bid a string representing the bid (e.g., a price or price change)
     */
    void setBid(String bid);

    /**
     * Return a metric indicating measure of positive performance of this stock.
     * A large positive index means consider buying this well performing stock, 
     * and a large negative index means consider selling this poorly performing stock.
     * @return the performance metric as an integer
     */
    int getMetric();
}