package be.ucll.StockExercise;

import java.util.ArrayList;
import java.util.List;

public class ConcreteStock implements Stock {
    private String stockSymbol;
    private double price;
    private List<Investor> investors;

    public ConcreteStock(String stockSymbol, double initialPrice) {
        this.stockSymbol = stockSymbol;
        this.price = initialPrice;
        this.investors = new ArrayList<>();
    }

    @Override
    public void addInvestor(Investor investor) {
        this.investors.add(investor);
    }

    @Override
    public void removeInvestor(Investor investor) {
        this.investors.remove(investor);
    }

    @Override
    public void notifyInvestors() {
        for (Investor investor : investors) {
            investor.update(stockSymbol, price);
        }
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
        notifyInvestors();
    }

    public double getPrice() {
        return price;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }
}
