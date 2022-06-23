import java.util.List;
import java.util.Optional;

public class Wallet {
    public static final int NULL_VALUE = 0;
    private List<Stock> stocks;

    public Wallet(List<Stock> stocks) {
        this.stocks = stocks;
    }

    public WalletValue getValue(StockCurrency stockCurrency) {
        Integer value = stocks.stream().filter(stock -> stock.getStockCurrency().equals(stockCurrency))
                .map(stock -> stock.getValue())
                .reduce((value1, value2) -> value1 + value2)
                .orElse(NULL_VALUE);
        return new WalletValue(value, stockCurrency);
    }
}
