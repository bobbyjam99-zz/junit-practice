package org.bobbyjam99.junit.practice.basic;

public class StringUtils {

	/**
	 * 文字列をスネークケース(すべて小文字で単語区切りがアンダースコア)に変換する.
	 * 
	 * @param string 変換する文字列
	 * @return スネークケースに変換された文字列
	 */
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
