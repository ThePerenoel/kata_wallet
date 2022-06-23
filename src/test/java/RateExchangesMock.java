import java.math.BigDecimal;
import java.math.RoundingMode;

public class RateExchangesMock implements RateExchanges{
    @Override
    public BigDecimal get(StockCurrency currentStockCurrency, StockCurrency expectedStockCurrency) {
        if (currentStockCurrency == StockCurrency.DOLLARS && expectedStockCurrency == StockCurrency.EUROS) {
            return new BigDecimal("0.90");

        }
        if (currentStockCurrency == StockCurrency.EUROS && expectedStockCurrency == StockCurrency.DOLLARS) {
            return new BigDecimal("1.10");

        }
        return BigDecimal.ONE.setScale(2, RoundingMode.HALF_UP);
    }
}
