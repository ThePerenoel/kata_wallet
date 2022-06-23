import java.math.BigDecimal;
import java.util.Objects;

public class WalletValue {
    private BigDecimal value;
    private StockCurrency stockCurrency;

    public WalletValue(BigDecimal value, StockCurrency stockCurrency) {
        this.value = value;
        this.stockCurrency = stockCurrency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WalletValue)) return false;
        WalletValue that = (WalletValue) o;
        return value.equals(that.value) && stockCurrency == that.stockCurrency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, stockCurrency);
    }

    @Override
    public String toString() {
        return "WalletValue{" +
                "value=" + value +
                ", stockCurrency=" + stockCurrency +
                '}';
    }
}
