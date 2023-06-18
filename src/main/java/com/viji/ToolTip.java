package com.viji;

public class ToolTip {

	public static void main(String[] args) {
		int[] fav_number = { 1, 2, 3, 4, 5, 6 };
		for (int i = 0; i < fav_number.length; i++) {
			if (fav_number[i] % 2 == 0) {
				System.out.println("My fav number is even" + fav_number[i]);
			}
		}

		for (int favorite : fav_number) {
			if (favorite % 2 == 0) {
				System.out.println("My fav number" + favorite);
			}
		}
	}

}
