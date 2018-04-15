package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static io.zipcoder.Problem4.canBePalindrome;

public class Problem4Test {

    @Test
    public void canBePalindromeTest() {
        String input = "aaabbbb";
        String expected = "YES";

        String actual = canBePalindrome(input);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void canBePalindromeTest2() {
        String input = "cdefghmnopqrstuvw";
        String expected = "NO";

        String actual = canBePalindrome(input);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void canBePalindromeTest3() {
        String input = "cdcdcdcdeeeef";
        String expected = "YES";

        String actual = canBePalindrome(input);

        Assert.assertEquals(expected, actual);

    }

}
