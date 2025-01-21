package edu.neu.csye7374;

/**
 * Super class representing a generic Stock with common attributes.
 * 
 * Author: Yesha
 */
public class StockAPI implements Tradable {
    protected String ID;       // e.g. "AAPL"
    protected double price;    // e.g. 150.00
    protected String description; // e.g. "Apple Inc. Stock"

    public StockAPI(String ID, double price, String description) {
        this.ID = ID;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "StockAPI[ID=" + ID + ", price=" + price + 
               ", description=" + description + "]";
    }

    // Getters and setters (optional, if needed)
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void setBid(String bid) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setBid'");
    }

    @Override
    public int getMetric() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMetric'");
    }
}