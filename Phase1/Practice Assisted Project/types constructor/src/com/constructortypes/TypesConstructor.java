package com.constructortypes;

public class TypesConstructor {
	int id = 5;
	String name = "pradeep";

	TypesConstructor() {
	}

	TypesConstructor(int i, String n) {
		id = i;
		name = n;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	void display(int a, String b) {
		id = a;
		name = b;
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		TypesConstructor s1 = new TypesConstructor(111, "srikar");
		TypesConstructor s2 = new TypesConstructor();
		s1.display(12, "ram");
		s2.display();

	}

}
