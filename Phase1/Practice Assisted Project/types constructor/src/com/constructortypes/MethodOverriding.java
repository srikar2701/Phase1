package com.constructortypes;

public class MethodOverriding extends TypesConstructor {
	public static void main(String[] args) {
		MethodOverriding s1 = new MethodOverriding();
		s1.display();
	}

	void display() {
		System.out.println(id + " " + name);
	}
}
