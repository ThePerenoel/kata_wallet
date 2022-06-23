public class Stock {
    private int value;
    private StockCurrency stockCurrency;

    public Stock(int value, StockCurrency stockCurrency) {
        this.value = value;
        this.stockCurrency = stockCurrency;
    }

    public int getValue() {
        return value;
    }

    public StockCurrency getStockCurrency() {
        return stockCurrency;
    }
}
