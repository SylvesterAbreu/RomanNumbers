package test;

import main.RomanNumber;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class RomanNumbersTest {

    @Test
    public void whenPassingIntegerOne_returnRomanI() throws Exception {
        final RomanNumber romanNumber = new RomanNumber();

        assertThat(romanNumber.getRomanNumberFor(1), is(equalTo("I")));
    }

    @Test
    public void whenPassingIntegerTwo_returnII() throws Exception {
        final RomanNumber romanNumber = new RomanNumber();

        assertThat(romanNumber.getRomanNumberFor(2), is(equalTo("II")));
    }
}
