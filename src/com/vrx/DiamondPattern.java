package com.vrx;

public class DiamondPattern {

	public static void main(String[] args) {
		int row = 4;
		int column = 4;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= (column - i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		for (int i = row; i >= 1; i--) {
			for (int j = column-1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = (2 * i - 1); j >= 1; j--) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
