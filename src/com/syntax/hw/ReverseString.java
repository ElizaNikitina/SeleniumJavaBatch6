package com.syntax.hw;

public class ReverseString {

	public static void main(String[] args) {

		String str = "We study Java";
		System.out.println(str);

		for (int i = str.length() - 1; i >= 0; i--) {

			System.out.print(str.charAt(i));
		}
		System.out.println(" ");
		System.out.println("=============");

		System.out.println(str);

		String[] f = str.split(" ");
		for (int i = 0; i < f.length; i++) {
			for (int j = f[i].length() - 1; j >= 0; j--) {
				System.out.print(f[i].charAt(j));
			}
			System.out.print(" ");

		}
	}
	
}
