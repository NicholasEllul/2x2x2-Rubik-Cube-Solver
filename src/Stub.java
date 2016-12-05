
/*****************************************************************************
 *
 * Created by: Nicholas Ellul
 * Created on: Dec 2016
 * This file contains the code for the stub class that interacts with the cube
 * object.
 *****************************************************************************/

import java.util.Scanner;

public class Stub {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		// These variables hold the colors the user inputs for each face
		String top;
		String bottom;
		String front; 
		String back;
		String left;
		String right;
		
		// This variable is where we put all the faces together that the
		// user inputs
		String cubeLayout;
		
		// Instructions asking for the users input
		System.out.println("Welcome to the 2x2x2 Rubik's cube solver.");
		System.out.println("I will need you to enter your cube in a specific"
				+ " order.");
		
		System.out.println("");
		
		System.out.println("First hold your cube in your hand so that one"
				+ " face is facing towards you.");
		
		System.out.println("Remember this face because it will be your FRONT"
				+ " FACE.");
		
		System.out.println("Remember the face facing up because this will be"
				+ " your TOP FACE.");
		
		System.out.println("\nWhite = 'w'\n"
						+ "Green = 'g'\n"
						+ "Blue = 'b'\n"
						+ "Red = 'r'\n"
						+ "Orange = 'o'\n"
						+ "Yellow = 'y'");
			
		System.out.println("_________\n"
						+ "|_1_|_2_|\n"
						+ "|_3_|_4_|\n");
		
		System.out.println("Please enter the colors on the front face in the"
				+ " order shown above.");
	
		front = reader.nextLine();
		
		System.out.println("Look at the top face without rotating the cube."
				+ " Please enter the colors of the top face.");
		
		top = reader.nextLine();
		
		System.out.println("While keeping the top face facing up, enter"
				+ " the colors on the face to the right of your front face.");
		
		right = reader.nextLine();
		
		System.out.println("While keeping the top face facing up, enter"
				+ " the colors on the face opposite to your front face.");
		
		back = reader.nextLine();
		
		System.out.println("While keeping the top face facing up, enter"
				+ " the colors on the face to the left of your front face.");
		
		left = reader.nextLine();
		
		System.out.println("Face the front face towards you again. Now flip "
				+ "the cube backwards so that the bottom face is facing you"
				+ " and your front face is now pointing up.");
		
		System.out.println("Please enter the colors of the bottom face.");
		
		bottom = reader.nextLine();
		
		System.out.println("Please return the cube to its original position"
				+ " with the front face facing towards you and the top face"
				+ " facing up.");
			
		cubeLayout = bottom + front + top + back + right + left ;

		System.out.println("Make sure you know what sides are the front,"
				+ "top, and right faces. You will be asked to rotate these sides.\n"
				+ "While you wait please verify that you entered your cube"
				+ " in correctly.");


		// Builds Cube
		Cube rubiksCube = new Cube(cubeLayout);
		
		// Finds solution
		rubiksCube.findSolution();

		
		System.out.println("Done.");

	}

}
