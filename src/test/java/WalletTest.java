import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WalletTest {

    @Test
    void given_ten_euros_getValue_should_return_10_euros() {
        Stock stock = new Stock(10, StockCurrency.EURO);
        Wallet wallet = new Wallet(stock);
        WalletValue walletValue = new WalletValue(10, StockCurrency.EURO);

        WalletValue result = wallet.getValue();

        assertThat(result).isEqualTo(walletValue);
    }

    @Test
    void given_twenty_dollars_getValue_should_return_twenty_dollars() {
        Stock stock = new Stock(20, StockCurrency.DOLLARS);
        Wallet wallet = new Wallet(stock);
        WalletValue walletValue = new WalletValue(20, StockCurrency.DOLLARS);

        WalletValue result = wallet.getValue();

        assertThat(result).isEqualTo(walletValue);
    }
}
