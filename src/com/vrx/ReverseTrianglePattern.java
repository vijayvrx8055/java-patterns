package com.vrx;

public class ReverseTrianglePattern {

	public static void main(String[] args) {
		int row = 4;
		int column = 5;
		for (int i = 1; i <= row; i++) {
			for (int j = column; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
