
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
			
			for(int index = 0; index < listOfMoves.size(); index++){
				System.out.println(index + 1 + ". " + listOfMoves.get(index));
			}
			
		}
		catch(IndexOutOfBoundsException error){
			System.err.println("test");
		}

	}
	
	// MESS ZONE BELOW DO NOT ENTER //
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public ArrayList<String> findSolution(Cube cubeCopy, ArrayList<String> listOfMoves, int maxMoves){
		
		ArrayList<String> listOfMove = new ArrayList<String>(listOfMoves);
		
		ArrayList<String> bestMoveCombo = new ArrayList<String>();
		
		ArrayList<String> potentialSolution = new ArrayList<String>();
		
		int highestScoreSoFar = -1;
		
		if(listOfMove.size() < maxMoves){
			if(cubeCopy.checkIfSolved() == true){
				
				listOfMove.add(0, "1048576");
				
				return listOfMove;
			}
			else{
				
				for(int index = 0; index < 3; index++){
					switch(index){
						case 0:
							// Try by rotating the front
		
							listOfMove.add(cubeCopy.rotateFront());
							potentialSolution = new ArrayList<String>(findSolution(cubeCopy,listOfMove, maxMoves));
						
							for(int counter = 0; counter < 3; counter ++){
								cubeCopy.rotateFront();
							}
								
						
	
								
							break;
						
						
						case 1:
							
							listOfMove.add(cubeCopy.rotateUp());
							potentialSolution = new ArrayList<String>(findSolution(cubeCopy,listOfMove, maxMoves));
							
							for(int counter = 0; counter < 3; counter ++){
								cubeCopy.rotateUp();
							}
							

					
							break;
						case 2:
							
							// Try by rotating the right
							listOfMove.add(cubeCopy.rotateRight());
							potentialSolution = new ArrayList<String>(findSolution(cubeCopy,listOfMove, maxMoves));
							
							for(int counter = 0; counter < 3; counter ++){
								cubeCopy.rotateRight();
							}
							
				
						
							break;
					}
					
					int score = Integer.parseInt(potentialSolution.get(0));
					
					if(score > highestScoreSoFar){
						bestMoveCombo = potentialSolution;
						highestScoreSoFar = score;
					}
					
					listOfMove.remove(listOfMove.size()-1);
				}
				
				bestMoveCombo.set(0, String.valueOf(highestScoreSoFar / 2));
				return bestMoveCombo;
			
			}
		}
		
		listOfMove.add(0,"0");
		return listOfMove;
	}
	
	
	
	
	public boolean findSolutionRemake(Cube cubeCopy, ArrayList<String> listOfMoves, 
		int maxMoves){
	
		ArrayList<String> bestMoveCombo = new ArrayList<String>();
		ArrayList<String> potentialSolution = null;
		int highestScoreSoFar = -1;
	
			for(int index = 0; index < 3; index ++){
					
				if(index == 0){
					// Try by rotating the front
					listOfMoves.add(cubeCopy.rotateFront());
					potentialSolution = findSolution(cubeCopy,listOfMoves, maxMoves);
					System.out.println(potentialSolution.get(0));
					for(int counter = 0; counter < 3; counter ++){
						cubeCopy.rotateFront();
					}
						
					listOfMoves.remove(listOfMoves.size()-1);
						
						
				}
				if(index == 1){
					// Try by rotating the top
					listOfMoves.add(cubeCopy.rotateUp());
					potentialSolution = findSolution(cubeCopy,listOfMoves,maxMoves);
		
					for(int counter = 0; counter < 3; counter ++){
						cubeCopy.rotateUp();
					}
					
					listOfMoves.remove(listOfMoves.size()-1);
					
				}
				if(index == 2){
					// Try by rotating the right
					listOfMoves.add(cubeCopy.rotateRight());
					potentialSolution = findSolution(cubeCopy,listOfMoves,maxMoves);
		
					for(int counter = 0; counter < 3; counter ++){
						cubeCopy.rotateRight();
					}
					
					listOfMoves.remove(listOfMoves.size()-1);
				}
				
				
				int score = Integer.parseInt(potentialSolution.get(0));
				
				if(score > highestScoreSoFar){
					bestMoveCombo = potentialSolution;
					highestScoreSoFar = score;
				}
				
			}
			if(Integer.parseInt(bestMoveCombo.get(0)) == 0){
				return false;	
			}
			else{
			
				printMoves(bestMoveCombo);
				return true;
			}
		
		}
	
	public void findSolution(Cube cubeCopy){
		
		if(cubeCopy.checkIfSolved() == false){
		
			System.out.println("\nPlease wait a second...");
			if(!findSolutionRemake(cubeCopy,new ArrayList<String>(), 16)){
				
				 findSolutionRemake(cubeCopy,new ArrayList<String>(), 20);
				 
			 }	
		}else{
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
