package com.stringbuilderbuffer;

public class StringBufferBuilder {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("Mphasis");
		System.out.println(sb);
		StringBuilder sb1 = new StringBuilder("Hello");
		sb1.append("Java");
		System.out.println(sb1);
	}
}
