package com.jinhe.smart.utils;

import java.util.Collection;

/**
 * 字符串处理工具
 * @author lazyeraser
 * 
 */
public class TextUtils {

	/**
	 * @param str
	 * @return true-string is empty
	 * 字符串查空
	 */
	public static boolean isEmpty(String str) {
		return (str == null || str.equals(""));
	}
	
	public static <T> boolean isEmpty(Collection<T> collection) {
		return !(collection != null && collection.size() > 0);
	}
	
	/**
	 * @param str
	 * @param strings
	 * @return true str equals one or more in strings
	 * 检查第一个string是否等于之后的某个字符串
	 */
	public static boolean equalsIn(String str, String... strings){
		for (String string : strings) {
			if (str.equals(string)) {
				return true;
			}
		}
		return false;
	}
	
}
