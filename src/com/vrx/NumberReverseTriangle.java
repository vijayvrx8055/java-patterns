package com.vrx;

public class NumberReverseTriangle {

	public static void main(String[] args) {
		int row = 5;
		int column = 5;
		for (int i = row; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
