import java.math.BigDecimal;

public interface RateExchanges {
    BigDecimal get(StockCurrency currentStockCurrency, StockCurrency expectedStockCurrency);
}
