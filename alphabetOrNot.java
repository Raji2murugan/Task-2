package Task2;

import java.util.Scanner;

public class alphabetOrNot {
	/*
	 * 12) Program to Check Whether a Character is an Alphabet or not
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character");
		char ch = sc.next().charAt(0);
		
		System.out.println(Character.isLetter(ch));
	}

}
