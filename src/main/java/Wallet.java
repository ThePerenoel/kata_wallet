import java.math.BigDecimal;
import java.util.List;

public class Wallet {
    private List<Stock> stocks;

    public Wallet(List<Stock> stocks) {
        this.stocks = stocks;
    }

    public WalletValue getValue(StockCurrency stockCurrency) {
        return stocks.stream()
                .filter(stock -> stock.getStockCurrency().equals(stockCurrency))
                .map(stock -> stock.getValue())
                .reduce((value1, value2) -> value1.add(value2))
                .map(calculatedValue -> new WalletValue(calculatedValue, stockCurrency))
                .orElse(new WalletValue(BigDecimal.ZERO, stockCurrency));
    }
}
