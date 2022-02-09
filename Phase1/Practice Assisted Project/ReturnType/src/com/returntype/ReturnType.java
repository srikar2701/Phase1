package com.returntype;

public class ReturnType {
	public int integer() {
		return 10;
	}

	public String word() {
		return "Srikar";
	}

	public char alphabet() {
		return 'a';
	}

	public float Decimal() {
		return 34.9f;
	}

	public boolean condition() {
		return true;
	}

	public double Decimals() {
		return 36.2222;
	}

	public long longinteger() {
		return 12222;
	}

	public short shortinteger() {
		return 1;
	}

	public static void main(String args[]) {
		ReturnType a = new ReturnType();
		String name = a.word();
		int number = a.integer();
		char character = a.alphabet();
		float decimalpoint = a.Decimal();
		boolean answer = a.condition();
		double value = a.Decimals();
		long longvalue = a.longinteger();
		short shortvalue = a.shortinteger();
		System.out.println(name);
		System.out.println(number);
		System.out.println(character);
		System.out.println(decimalpoint);
		System.out.println(answer);
		System.out.println(value);
		System.out.println(longvalue);
		System.out.println(shortvalue);
	}
}
