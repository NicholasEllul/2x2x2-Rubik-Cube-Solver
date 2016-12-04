
/*****************************************************************************
 *
 * Created by: Nicholas Ellul
 * Created on: Dec 2016
 * This file contains the code for the square object that goes on the face
 * of a Rubik's cube.
 *****************************************************************************/

public class Square {
	
	COLOR _colorOfFace;
	
	public enum COLOR
	{
		// This enum contains all the possible colors that the squares
		// could have
		
		Red ("r"),
		Green ("g"),
		Orange ("o"),
		Blue ("b"),
		White ("w"),
		Yellow ("y");
		
	    private final String letterRepresentation;       

	    private COLOR (String colorAsLetter) {
	        this.letterRepresentation = colorAsLetter;
	    }
	    
	    public static COLOR fromString(String letter){
	    	// This method allows the user to provide a letter code
	    	// and it returns the corresponding color
	    
	    	// If they actually passed something in then continue
	    	if (letter != null) {
		      
		    	for (COLOR theColor : COLOR.values()) {
			      
	    			  // If the letter matches a color return the color.
		    		if (letter.equalsIgnoreCase(theColor.getColorLetter())) {
			          
		    			return theColor;
			          
		    		}
		    	}  
	    	}
    	  
    	  return null;
	    }
	    
		public String getColorLetter() {
			// returns the letter that corresponds with the color
			
			return this.letterRepresentation;
		}

	};
	
	public Square(String colorAsLetter){
		// Assigns color upon creation
		this._colorOfFace = COLOR.fromString(colorAsLetter);
	}
	
	public COLOR getColor(){
		// returns this squares color
		return this._colorOfFace;
	}
}
