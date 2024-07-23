package Task2;

import java.util.Scanner;

public class starLine {

	/**
 26) Write a program to print the following pattern for the given input number.
	Eg 1: Input: 4
		   Output:
				********
				***__***
				**____**
				*______*
				**____**
				***__***
				********
	 */
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter the number: ");
//		int n = scanner.nextInt();
//		scanner.close();
//
//		int totalRows = 2 * n;
//			        
//        for (int i = 0; i < totalRows; i++) {
//            int stars = n - Math.abs(n - 1 - i);
//            int underscores = totalRows - 2 * stars;
//            
//            // Print leading stars
//            for (int j = 0; j < stars; j++) {
//                System.out.print("*");
//            }
//            
//            // Print underscores
//            for (int j = 0; j < underscores; j++) {
//                System.out.print("_");
//            }
//            
//            // Print trailing stars
//            for (int j = 0; j < stars; j++) {
//                System.out.print("*");
//            }
//            
//            // Move to the next line
//            System.out.println();
//        }
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the character");
		int alpha = sc.nextInt();
		int in = 2 * (alpha);
		int temp;
		for (int i = 0; i <= in; i++) {
			temp = (i <= (alpha) ? i : (in - i));

			for (int j = 0; j <= in; j++) {
				if (i + j == in / 2)
					System.out.print(temp);
				else if (j - i == in / 2)
					System.out.print(temp);
//				else if (i - j == in / 2)
//					System.out.print(temp);
//				else if (i + j == 3 * (in / 2))
//					System.out.print(temp);
			else
					System.out.print(".");

			}

			System.out.println();
		}

    }

    }

