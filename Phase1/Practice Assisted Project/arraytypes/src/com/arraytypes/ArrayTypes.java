package com.arraytypes;

public class ArrayTypes {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 6, 78 };
		int[][] multiarray = { { 3, 4 }, { 6, 4 }, { 33, 55 } };
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
		for (int i = 0; i < multiarray.length; i++) {
			for (int j = 0; j < multiarray[i].length; j++) {
				System.out.print(multiarray[i][j]);
			}

		}
	}
}
