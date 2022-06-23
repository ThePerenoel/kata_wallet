public class Wallet {
    private Stock stock;

    public Wallet(Stock stock) {
        this.stock = stock;
    }

    public WalletValue getValue() {
        return new WalletValue(stock.getValue(), stock.getStockCurrency());
    }
}
