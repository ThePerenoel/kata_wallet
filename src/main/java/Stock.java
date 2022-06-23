import java.math.BigDecimal;
import java.math.RoundingMode;

public class Stock {
    private BigDecimal value;
    private StockCurrency stockCurrency;
    private RateExchanges rateExchanges;

    public Stock(BigDecimal value, StockCurrency stockCurrency, RateExchanges rateExchanges) {
        this.value = value;
        this.stockCurrency = stockCurrency;
        this.rateExchanges = rateExchanges;
    }

    public BigDecimal getValue() {
        return value;
    }

    public StockCurrency getStockCurrency() {
        return stockCurrency;
    }

    public BigDecimal getValueIn(StockCurrency expectedStockCurrency) {
        if (expectedStockCurrency == this.stockCurrency) {
            return value;
        }
        BigDecimal rateExchange = rateExchanges.get(this.stockCurrency, expectedStockCurrency);
        return value.multiply(rateExchange).setScale(2, RoundingMode.HALF_UP);
    }
}
