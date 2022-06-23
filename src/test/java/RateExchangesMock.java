import java.math.BigDecimal;

public class RateExchangesMock implements RateExchanges{
    @Override
    public BigDecimal get(StockCurrency currentStockCurrency, StockCurrency expectedStockCurrency) {
        if (currentStockCurrency == StockCurrency.DOLLARS && expectedStockCurrency == StockCurrency.EUROS) {
            return new BigDecimal("0.90");

        }
        if (currentStockCurrency == StockCurrency.EUROS && expectedStockCurrency == StockCurrency.DOLLARS) {
            return new BigDecimal("11.0");

        }
        return BigDecimal.ONE;
    }
}
