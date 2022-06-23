import java.math.BigDecimal;

public class Stock {
    private BigDecimal value;
    private StockCurrency stockCurrency;

    public Stock(BigDecimal value, StockCurrency stockCurrency) {
        this.value = value;
        this.stockCurrency = stockCurrency;
    }

    public BigDecimal getValue() {
        return value;
    }

    public StockCurrency getStockCurrency() {
        return stockCurrency;
    }
}
