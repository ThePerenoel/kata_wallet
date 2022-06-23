import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class WalletTest {

    @Test
    void given_ten_euros_getValue_should_return_10_euros() {
        RateExchangesMock rateExchanges = new RateExchangesMock();
        Stock stock = new Stock(new BigDecimal("10.00"), StockCurrency.EURO, rateExchanges);
        Wallet wallet = new Wallet(Arrays.asList(stock));
        WalletValue walletValue = new WalletValue(new BigDecimal("10.00"), StockCurrency.EURO);

        WalletValue result = wallet.getValue(StockCurrency.EURO);

        assertThat(result).isEqualTo(walletValue);
    }

    @Test
    void given_twenty_dollars_getValue_should_return_twenty_dollars() {
        RateExchangesMock rateExchanges = new RateExchangesMock();
        Stock stock = new Stock(new BigDecimal("20.00"), StockCurrency.DOLLARS, rateExchanges);
        Wallet wallet = new Wallet(Arrays.asList(stock));
        WalletValue walletValue = new WalletValue(new BigDecimal("20.00"), StockCurrency.DOLLARS);

        WalletValue result = wallet.getValue(StockCurrency.DOLLARS);

        assertThat(result).isEqualTo(walletValue);
    }

    @Test
    void given_twenty_dollars_and_fifty_cent_getValue_should_return_twenty_dollars_and_fifty_cent() {
        RateExchangesMock rateExchanges = new RateExchangesMock();
        Stock stock = new Stock(new BigDecimal("20.50"), StockCurrency.DOLLARS, rateExchanges);
        Wallet wallet = new Wallet(Arrays.asList(stock));
        WalletValue walletValue = new WalletValue(new BigDecimal("20.50"), StockCurrency.DOLLARS);

        WalletValue result = wallet.getValue(StockCurrency.DOLLARS);

        assertThat(result).isEqualTo(walletValue);
    }

    @Test
    void given_ten_dollars_and_ten_euros_getValue_should_return_nineteen_euros() {
        RateExchangesMock rateExchanges = new RateExchangesMock();
        Stock dollarStock = new Stock(new BigDecimal("10.00"), StockCurrency.DOLLARS, rateExchanges); //9 euros
        Stock euroStock = new Stock(new BigDecimal("10.00"), StockCurrency.EURO, rateExchanges);
        Wallet wallet = new Wallet(Arrays.asList(dollarStock, euroStock));
        WalletValue walletValue = new WalletValue(new BigDecimal("19.00"), StockCurrency.EURO);

        WalletValue result = wallet.getValue(StockCurrency.EURO);

        assertThat(result).isEqualTo(walletValue);
    }
}
