package com.vrx;

public class PalindromeTriangle {

	public static void main(String[] args) {
		int row = 5;
		int column = 5;
		for (int i = 1; i <= row; i++) {
			for (int j = column - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}

			for (int j = 2; j <= i; j++) {
				if (i == 1)
					continue;
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
