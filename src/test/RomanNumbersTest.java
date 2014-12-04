package test;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class RomanNumbersTest {

    @Test
    public void whenPassingIntegerOne_returnRomanI() {
        final RomanNumber romanNumber = new RomanNumber();

        assertThat(romanNumber.getRomanNumberFor(1), is(equalTo("I")));
    }
}
