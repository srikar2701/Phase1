package com.stack;

import java.util.Stack;

public class OperationOfStack {
	static void stack_push(Stack<Integer> stack) {
		stack.push(78);
		stack.push(55);
		stack.push(57);
		stack.push(70);
		stack.push(88);

		/*
		 * for(int i = 0; i < 5; i++) { stack.push(i); }
		 */
	}

	static void stack_pop(Stack<Integer> stack) {
		System.out.println("Pop Operation:");

		for (int i = 0; i < 5; i++) {
			Integer y = (Integer) stack.pop();
			System.out.println(y);
		}
	}

	static void stack_peek(Stack<Integer> stack) {
		Integer element = (Integer) stack.peek();
		System.out.println("Element on stack top: " + element);
	}

	static void stack_search(Stack<Integer> stack, int element) {
		Integer pos = (Integer) stack.search(element);

		if (pos == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element is found at position: " + pos);
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();

		stack_push(stack);
		stack_pop(stack);
		stack_push(stack);
		stack_peek(stack);
		stack_search(stack, 55);
		stack_search(stack, 88);
	}
}
