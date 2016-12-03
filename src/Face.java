
/*****************************************************************************
 *
 * Created by: Nicholas Ellul
 * Created on: Nov 2016
 * This file contains the code for the face of a 2x2x2 Rubik's cube object
 *****************************************************************************/
public class Face {

	Square[] _squares = new Square[4];
	
	/* Here is how the faces look relative to the index in the
	 * _squares array
	   ________
	  /___/___/|
	 /___/___/||
	|_0_|_1_| |/
	|_2_|_3_|/
	
	
	*/
	
	public Face(String fourColors) {
		
		String colorAsLetter;
		
		// Create am array the contains the 4 tiles that make
		// up a sides face.
		for(int index = 0; index < 4; index ++){
			
			colorAsLetter = Character.toString(fourColors.charAt(index));
			this._squares[index] = new Square(colorAsLetter);
			
		}
		
	}
	
	protected void setSquareAt(Square replacementSquare, int squareIndex){
		// Replaces a specific square with another one. This is used when
		// trying to fake a cube rotation.
		
		// There are only 4 squares on each side so the index
		// should be within range
		if(squareIndex > 3 || squareIndex < 0){
			
			throw new Error();
		
		}else{
			
			// assign the new square
			this._squares[squareIndex] = replacementSquare;
			
		}
	
	}
	
	public Square getSquareAt(int squareIndex){
		// gets the square at a certain spot on the face
		// and returns a copy of it.
		
		// There are only 4 squares on each side so the index
		// should be within range
		if(squareIndex > 3 || squareIndex < 0){
			
			throw new Error();
		
		}else{
			
			return this._squares[squareIndex];
			
		}
	}
	
	public Square.COLOR getColorAt(int squareIndex){
		// similar to the getSquareAt method, but this time
		// it only returns the color of the square.
		
		// There are only 4 squares on each side so the index
		// should be within range
		if(squareIndex > 3 || squareIndex < 0){
				
			throw new Error();
			
		}else{
				
			return this._squares[squareIndex].getColor();
				
		}
	}
	
	public boolean checkIfFaceIsSolved(){
		// Checks if all the squares on this face are 
		// the same color.
		
		Square.COLOR firstColor = this._squares[0].getColor();
		
		// Iterates through each square and compares 
		// to the variable above.
		for(Square tile : this._squares){
			
			// If they aren't the same return false
			if(tile.getColor() != firstColor){
				return false;
			}
		}
		
		// if they pass that filter above, return true
		return true;
	}
}
