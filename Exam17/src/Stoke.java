class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public double changePercent() {
        return (currentPrice - previousClosingPrice) / previousClosingPrice;
    }
}