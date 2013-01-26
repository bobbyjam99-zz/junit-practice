package org.bobbyjam99.junit.practice.basic;

public class StringUtils {

	public static String toSnakeCase(String string) {
		String[] splitStr = string.split("(?<=[a-z])(?=[A-Z])");
		StringBuffer sb = new StringBuffer();
		for(String str : splitStr) {
			sb.append(str.toLowerCase());
			sb.append("_");
		}
		sb.deleteCharAt(sb.lastIndexOf("_"));
		return sb.toString();
	}

}
