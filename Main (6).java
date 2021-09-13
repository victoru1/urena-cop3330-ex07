/*
*  UCF COP3330 Fall 2021 Assignment 1 Solution
*  Copyright 2021 Victor Urena
*/

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
    final double CONST = 0.09290304;
		
    int length;
    int width;
		
		System.out.print("What is the length of the room in feet? ");
		length = input.nextInt();

    System.out.print("What is the width of the room in feet? ");
		width = input.nextInt();

    int f2 = length * width;
    double m2 = f2 * CONST;

    System.out.printf("You entered dimensions %d feet by %d feet. ", length, width);

    System.out.printf("\nThe area is ");

    System.out.printf("\n%d square feet", f2);

    System.out.printf("\n%.3f square meters", m2);
	}

}
