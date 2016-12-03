
/*****************************************************************************
 *
 * Created by: Nicholas Ellul
 * Created on: Nov 2016
 * This file contains the code for the dice object.  
 *****************************************************************************/

import java.util.ArrayList;
import java.util.Collections;


public class Cube {
	Face _topFace;
	Face _bottomFace;
	Face _rightFace;
	Face _leftFace;
	Face _frontFace;
	Face _backFace;
	
	public Cube(String cubeInput){
		
		this._bottomFace = new Face(cubeInput.substring(0, 4));
		this._frontFace = new Face(cubeInput.substring(4, 8));
		this._topFace = new Face(cubeInput.substring(8, 12));
		this._backFace = new Face(cubeInput.substring(12, 16));
		this._rightFace = new Face(cubeInput.substring(16, 20));
		this._leftFace = new Face(cubeInput.substring(20, 24));
		
	}
	
	public String rotateRight(){
		
		// These two variables hold item temporarily.
		// Read the next comment to find out why.
		
		Square[] tempSquareHolder = new Square[2];
		Square tempSquareOnRotatingFace;
		
		// Removes these squares and puts them to the side so that
		// they aren't over written once other tiles start moving around
		
		tempSquareHolder[0] = this._topFace.getSquareAt(1);
		tempSquareHolder[1] = this._topFace.getSquareAt(3);
		
		// Shifts from front to now open space on top.
		this._topFace.setSquareAt(this._frontFace.getSquareAt(1), 1);
		this._topFace.setSquareAt(this._frontFace.getSquareAt(3), 3);
		
		// Shifts form bottom to front
		this._frontFace.setSquareAt(this._bottomFace.getSquareAt(1), 1);
		this._frontFace.setSquareAt(this._bottomFace.getSquareAt(3), 3);
		
		// shifts from back to bottom 
		this._bottomFace.setSquareAt(this._backFace.getSquareAt(0), 3);
		this._bottomFace.setSquareAt(this._backFace.getSquareAt(2), 1);
		
		// plugs squares that were on top into the back
		this._backFace.setSquareAt(tempSquareHolder[1], 0);
		this._backFace.setSquareAt(tempSquareHolder[0], 2);
		
		// The next part of the code rotates the squares counter clockwise
		// within the right face
		
		// Creates void
		tempSquareOnRotatingFace = this._rightFace.getSquareAt(0);
		
		// Shifts around
		this._rightFace.setSquareAt(this._rightFace.getSquareAt(2),0);
		this._rightFace.setSquareAt(this._rightFace.getSquareAt(3),2);
		this._rightFace.setSquareAt(this._rightFace.getSquareAt(1),3);
		
		// Fills void
		this._rightFace.setSquareAt(tempSquareOnRotatingFace,1);
		
		
		return "Rotate right side clockwise.";
	}
	
	public String rotateUp(){
		// These two variables hold item temporarily.
		// Read the next comment to find out why.
		
		Square[] tempSquareHolder = new Square[2];
		Square tempSquareOnRotatingFace;
		
		// Removes these squares and puts them to the side so that
		// they aren't over written once other tiles start moving around
		
		tempSquareHolder[0] = this._frontFace.getSquareAt(0);
		tempSquareHolder[1] = this._frontFace.getSquareAt(1);
		
		// Shifts from right to front.
		this._frontFace.setSquareAt(this._rightFace.getSquareAt(0), 0);
		this._frontFace.setSquareAt(this._rightFace.getSquareAt(1), 1);
		
		// Shifts form back to right
		this._rightFace.setSquareAt(this._backFace.getSquareAt(0), 0);
		this._rightFace.setSquareAt(this._backFace.getSquareAt(1), 1);
		
		// shifts from left to back 
		this._backFace.setSquareAt(this._leftFace.getSquareAt(0), 0);
		this._backFace.setSquareAt(this._leftFace.getSquareAt(1), 1);
		
		// plugs squares that were on the front into the left
		this._leftFace.setSquareAt(tempSquareHolder[0], 0);
		this._leftFace.setSquareAt(tempSquareHolder[1], 1);
		
		// The next part of the code rotates the squares counter clockwise
		// within the right face
		
		// Creates void
		tempSquareOnRotatingFace = this._topFace.getSquareAt(0);
		
		// Shifts around
		this._topFace.setSquareAt(this._topFace.getSquareAt(2),0);
		this._topFace.setSquareAt(this._topFace.getSquareAt(3),2);
		this._topFace.setSquareAt(this._topFace.getSquareAt(1),3);
		
		// Fills void
		this._topFace.setSquareAt(tempSquareOnRotatingFace,1);
		
		
		return "Rotate top side clockwise.";
	}
	
	public String rotateFront(){
		
		// These two variables hold item temporarily.
		// Read the next comment to find out why.
		
		Square[] tempSquareHolder = new Square[2];
		Square tempSquareOnRotatingFace;
		
		// Removes these squares and puts them to the side so that
		// they aren't over written once other tiles start moving around
		
		tempSquareHolder[0] = this._topFace.getSquareAt(2);
		tempSquareHolder[1] = this._topFace.getSquareAt(3);
		
		// Shifts from left to now open space on top.
		this._topFace.setSquareAt(this._leftFace.getSquareAt(3), 2);
		this._topFace.setSquareAt(this._leftFace.getSquareAt(1), 3);
		
		// Shifts from bottom to left
		this._leftFace.setSquareAt(this._bottomFace.getSquareAt(0), 1);
		this._leftFace.setSquareAt(this._bottomFace.getSquareAt(1), 3);
		
		// shifts from right to bottom 
		this._bottomFace.setSquareAt(this._rightFace.getSquareAt(2), 0);
		this._bottomFace.setSquareAt(this._rightFace.getSquareAt(0), 1);
		
		// plugs squares that were on top into the right
		this._rightFace.setSquareAt(tempSquareHolder[1], 2);
		this._rightFace.setSquareAt(tempSquareHolder[0], 0);
		
		// The next part of the code rotates the squares counter clockwise
		// within the right face
		
		// Creates void
		tempSquareOnRotatingFace = this._frontFace.getSquareAt(0);
		
		// Shifts around
		this._frontFace.setSquareAt(this._frontFace.getSquareAt(2),0);
		this._frontFace.setSquareAt(this._frontFace.getSquareAt(3),2);
		this._frontFace.setSquareAt(this._frontFace.getSquareAt(1),3);
		
		// Fills void
		this._frontFace.setSquareAt(tempSquareOnRotatingFace,1);
		
		
		return "Rotate front side clockwise.";
	}
	
	private void printMoves(ArrayList<String> listOfMoves){
		
		try{
			
			for(int index = 1; index < listOfMoves.size(); index++){
				System.out.println(index + ". " + listOfMoves.get(index));
			}
			
		}
		catch(IndexOutOfBoundsException error){
			System.err.println("test");
		}

	}
	
	// MESS ZONE BELOW DO NOT ENTER //
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public ArrayList<String> findSolution(Cube cubeCopy, ArrayList<String> listOfMoves, int maxMoves){
		
		// Variables
		
		// listOfMoves was assigned listOfMoves because in Java when you pass an array list
		// you pass its reference not a copy. I wanted a copy so I copy it manually.
		ArrayList<String> listOfMove = new ArrayList<String>(listOfMoves);
		ArrayList<String> bestMoveCombo = new ArrayList<String>();
		ArrayList<String> potentialSolution = new ArrayList<String>();
		int highestScoreSoFar = -1;
		
		// I need to limit the range of moves so that it doesn't recurse forever
		if(listOfMove.size() < maxMoves){
			
			
			if(cubeCopy.checkIfSolved() == true){
			
				// The reason I added this super huge number is because the 
				// way I check what the best solution is is by checking this number
				// each time this list is returned the number is divided by 2
				// This means that if the cube was solved in 10 moves,
				// The number would be divided by 2 10 times. (1024)
				// If a cube was solved in 3 moves the number would be 131072.
				// I know that the second solution is the optimal solution because
				// it has a higher value since it was divided less times.
				
				// This algorithm works as long as the number below is 
				// greater than or equal to 2^maxMoves.
				listOfMove.add(0, "1048576");
				
				return listOfMove;
			}
			else{
				
				// If the cube isn't solved, try each of these moves.
				for(int index = 0; index < 3; index++){
					
					switch(index){
						case 0:	// Try by rotating the front clockwise
							
							listOfMove.add(cubeCopy.rotateFront());
							potentialSolution = new ArrayList<String>(findSolution(cubeCopy,listOfMove, maxMoves));
						
							// Undo the rotation by rotating it 3 more times.
							for(int counter = 0; counter < 3; counter ++){
								cubeCopy.rotateFront();
							}
							
							break;			
						
						case 1: // Try rotating the top clockwise
							
							listOfMove.add(cubeCopy.rotateUp());
							potentialSolution = new ArrayList<String>(findSolution(cubeCopy,listOfMove, maxMoves));
							
							// Undo the rotation by rotating it 3 more times.
							for(int counter = 0; counter < 3; counter ++){
								cubeCopy.rotateUp();
							}
							break;
							
						case 2:
							
							// Try by rotating the right side clockwise
							listOfMove.add(cubeCopy.rotateRight());
							potentialSolution = new ArrayList<String>(findSolution(cubeCopy,listOfMove, maxMoves));
							
							// Undo the rotation by rotating it 3 more times.
							for(int counter = 0; counter < 3; counter ++){
								cubeCopy.rotateRight();
							}
							break;
							
					}
					
					// The score is the number we added to the front of the array when a cube is solved.
					// If no solution was found with a set of moves, this number is 0.
					// Score is basically an indication of how many moves it took to solve the cube.
					int score = Integer.parseInt(potentialSolution.get(0));
					
					// If this is the new best solution.
					if(score > highestScoreSoFar){
						// King this list of moves as the best combo
						bestMoveCombo = potentialSolution;
						highestScoreSoFar = score;
					}
					
					// Remove the move I just made so that I can try the next possible move.
					listOfMove.remove(listOfMove.size()-1);
				}
				
				// Divide that "score" in front by 2 since its taken an extra move to solve.
				bestMoveCombo.set(0, String.valueOf(highestScoreSoFar / 2));
				return bestMoveCombo;
			
			}
		}
		
		// No solution found for this given move combination. Score is 0.
		listOfMove.add(0,"0");
		return listOfMove;
	}
	
	
	
	
	
	public void findSolution(){
		// This is the method the user calls. 
		// It inputs the necessary parameters into the recursive function
		// that the user shouldnt have to type in.
		
		Cube cubeCopy = this;
		Boolean solved;
		
		System.out.println("\n Calculating please wait...");
		// Try solving in less than 16 moves. (Takes 10-20s)
		ArrayList<String> bestMoveCombo = cubeCopy.findSolution(cubeCopy, new ArrayList<String>(), 16);
			
		// If the cube isn't solved
		if(cubeCopy.checkIfSolved() == false){
		
			// If the score of the best move combo is 0, that means no solution found.
			if(Integer.parseInt(bestMoveCombo.get(0)) == 0){
				solved = false;	
			}
			else{
			
				solved =  true;
			}
			
			
			// If the above didn't solve the cube,
			// do the function again but with a higher move
			// threshold 
			if(solved == false){
				
				System.out.println("Quick solve didn't find a solution.");
				System.out.println("Deep solve will find a solution in ~30 min.");

				// With a limit of 20 moves, the recursion takes ~30 min.
				bestMoveCombo = findSolution(cubeCopy,new ArrayList<String>(), 20);
				 
			 }	
				// Now that we have a solution print out the steps.
				printMoves(bestMoveCombo);
				
		}else{
			// This was if the user entered an already solved cube.
			System.out.println("\nYour cube is already solved!");
		}
		 

		
		//ArrayList<String> optimalSolution;
		
		
	}
	
	// MESS ZONE ABOVE DO NOT ENTER //
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	public boolean checkIfSolved(){
		
		if(  this._topFace.checkIfFaceIsSolved() == true &&
			 this._bottomFace.checkIfFaceIsSolved() == true &&
			 this._leftFace.checkIfFaceIsSolved() == true &&
			 this._rightFace.checkIfFaceIsSolved() == true &&
			 this._frontFace.checkIfFaceIsSolved() == true &&
			 this._backFace.checkIfFaceIsSolved() == true){
		
			return true;
		}
		else{
			return false;
		}
			
		
	}
}
