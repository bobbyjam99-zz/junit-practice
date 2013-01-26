package org.bobbyjam99.junit.practice.basic;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void toSnakeCaseはスネークケースを返す_aaaの場合() {
		assertThat(StringUtils.toSnakeCase("aaa"), is("aaa"));
	}

}
