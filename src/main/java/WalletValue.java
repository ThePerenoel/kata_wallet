import java.util.Objects;

public class WalletValue {
    private int value;
    private StockCurrency stockCurrency;

    public WalletValue(int value, StockCurrency stockCurrency) {
        this.value = value;
        this.stockCurrency = stockCurrency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WalletValue)) return false;
        WalletValue that = (WalletValue) o;
        return value == that.value && stockCurrency == that.stockCurrency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, stockCurrency);
    }
}
