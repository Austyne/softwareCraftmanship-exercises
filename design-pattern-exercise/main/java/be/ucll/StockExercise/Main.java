package be.ucll.StockExercise;

public class Main {
    public static void main(String[] args) {
        testStockMarketSystem();
    }

    private static void testStockMarketSystem() {
        ConcreteStock appleStock = new ConcreteStock("AAPL", 150.00);
        System.out.println("Created AAPL stock with initial price: $" + appleStock.getPrice());


        IndividualInvestor individualInvestor = new IndividualInvestor("Alice Johnson");
        InstitutionalInvestor institutionalInvestor = new InstitutionalInvestor("john Group");


        appleStock.addInvestor(individualInvestor);
        appleStock.addInvestor(institutionalInvestor);
        System.out.println("Both investors are now subscribed to AAPL updates.");



        System.out.println("\n1. First price change:");
        appleStock.setPrice(155.75);

        System.out.println("\n2. Second price change:");
        appleStock.setPrice(148.20);

        System.out.println("\n3. Third price change:");
        appleStock.setPrice(162.40);

    }
}