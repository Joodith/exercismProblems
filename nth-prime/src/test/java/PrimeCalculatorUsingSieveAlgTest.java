import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;


import org.junit.jupiter.api.Test;

public class PrimeCalculatorUsingSieveAlgTest {

    private PrimeCalculatorUsingSieveAlg primeCalculatorUsingSieveAlg = new PrimeCalculatorUsingSieveAlg();

    @Test
    public void testFirstPrime() {
        assertThat(primeCalculatorUsingSieveAlg.nth(1)).isEqualTo(2);
    }

    //    @Disabled("Remove to run test")
    @Test
    public void testSecondPrime() {
        assertThat(primeCalculatorUsingSieveAlg.nth(2)).isEqualTo(3);
    }

    //    @Disabled("Remove to run test")
    @Test
    public void testSixthPrime() {
        assertThat(primeCalculatorUsingSieveAlg.nth(6)).isEqualTo(13);
    }

    //    @Disabled("Remove to run test")
    @Test
    public void testBigPrime() {
        assertThat(primeCalculatorUsingSieveAlg.nth(10001)).isEqualTo(104743);
    }

    //    @Disabled("Remove to run test")
    @Test
    public void testUndefinedPrime() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> primeCalculatorUsingSieveAlg.nth(0));
    }

}

