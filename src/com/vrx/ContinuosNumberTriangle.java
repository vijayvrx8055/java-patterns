package com.vrx;

public class ContinuosNumberTriangle {

	public static void main(String[] args) {
		int row = 5;
		int column = 5;
		int counter = 1;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(counter + " ");
				counter++;
			}
			System.out.println();

		}

	}

}
