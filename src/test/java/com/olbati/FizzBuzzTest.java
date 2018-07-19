package com.olbati;


import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void should_return_input_when_input_is_not_divisible_by_3_and_5() {
        assertThat(fizzBuzz.process(1)).isEqualTo("1");
        assertThat(fizzBuzz.process(2)).isEqualTo("2");
    }

    @Test
    public void should_return_fizz_when_input_is_divisible_by_3() {
        assertThat(fizzBuzz.process(3)).isEqualTo("fizz");
        assertThat(fizzBuzz.process(6)).isEqualTo("fizz");
        assertThat(fizzBuzz.process(9)).isEqualTo("fizz");
    }

    @Test
    public void should_return_buzz_when_input_is_divisible_by_5() {
        assertThat(fizzBuzz.process(5)).isEqualTo("buzz");
        assertThat(fizzBuzz.process(10)).isEqualTo("buzz");
        assertThat(fizzBuzz.process(20)).isEqualTo("buzz");
    }

    @Test
    public void should_return_fizzbuzz_when_input_is_divisible_by_3_and_5() {
        assertThat(fizzBuzz.process(15)).isEqualTo("fizzbuzz");
        assertThat(fizzBuzz.process(30)).isEqualTo("fizzbuzz");
        assertThat(fizzBuzz.process(45)).isEqualTo("fizzbuzz");
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_if_input_is_lower_than_1() {
        fizzBuzz.process(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_if_input_is_upper_than_100() {
        fizzBuzz.process(101);
    }


}
