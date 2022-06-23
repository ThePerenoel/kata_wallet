import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Wallet {
    private List<Stock> stocks;

    public Wallet(List<Stock> stocks) {
        this.stocks = stocks;
    }

    public WalletValue getValue(StockCurrency stockCurrency) {
        return stocks.stream()
                .map(stock -> stock.getValueIn(stockCurrency))
                .reduce((value1, value2) -> value1.add(value2))
                .map(calculatedValue -> new WalletValue(calculatedValue, stockCurrency))
                .orElse(new WalletValue(BigDecimal.ZERO.setScale(2, RoundingMode.HALF_UP), stockCurrency));
    }
}
