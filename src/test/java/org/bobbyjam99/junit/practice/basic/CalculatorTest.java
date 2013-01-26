package org.bobbyjam99.junit.practice.basic;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void divide_4を2で割った場合() {
		Calculator calc = new Calculator();
		assertThat(calc.divide(4, 2), is(2));
	}

	@Test
	public void divide_10を2で割った場合() {
		Calculator calc = new Calculator();
		assertThat(calc.divide(10, 2), is(5));
	}

	@Test(expected = IllegalArgumentException.class)
	public void divide_2を0で割ると例外が発生する() {
		Calculator calc = new Calculator();
		calc.divide(2, 0);
	}
}
