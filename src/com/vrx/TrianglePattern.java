package com.vrx;

public class TrianglePattern {

	public static void main(String[] args) {
		int row = 4;
		int column = 5;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
