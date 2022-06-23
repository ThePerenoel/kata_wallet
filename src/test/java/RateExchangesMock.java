import java.math.BigDecimal;

public class RateExchangesMock implements RateExchanges{
    @Override
    public BigDecimal get(StockCurrency currentStockCurrency, StockCurrency expectedStockCurrency) {
        if (currentStockCurrency == StockCurrency.DOLLARS && expectedStockCurrency == StockCurrency.EURO) {
            return new BigDecimal("0.90");

        }
        return BigDecimal.ONE;
    }
}
