import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WalletTest {

    @Test
    void given_ten_euros_getValue_should_return_10_euros() {
        Wallet wallet = new Wallet(10);
        String expectedValue = "10€";

        String result = wallet.getValue();

        assertThat(result).isEqualTo(expectedValue);
    }


}