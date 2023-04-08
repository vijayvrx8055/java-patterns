package com.vrx;

public class RightTrianglePattern {

	public static void main(String[] args) {
		int row = 4;
		int column = 5;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j < column - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
