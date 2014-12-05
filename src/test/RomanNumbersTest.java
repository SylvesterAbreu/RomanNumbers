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

    @Test
    public void whenPassingIntegerThree_returnIII() throws Exception {
        final RomanNumber romanNumber = new RomanNumber();

        assertThat(romanNumber.getRomanNumberFor(3), is(equalTo("III")));
    }

    @Test
    public void whenPassingIntegerFour_returnIV() throws Exception {
        final  RomanNumber romanNumber = new RomanNumber();

        assertThat(romanNumber.getRomanNumberFor(4), is(equalTo("IV")));
    }

    @Test
    public void whenPassingIntegerFive_returnV() throws Exception {
        final RomanNumber romanNumber = new RomanNumber();

        assertThat(romanNumber.getRomanNumberFor(5), is(equalTo("V")));
    }

    @Test
    public void whenPassingIntegerSix_returnVI() throws Exception {
        final RomanNumber romanNumber = new RomanNumber();

        assertThat(romanNumber.getRomanNumberFor(6), is(equalTo("VI")));
    }
}
