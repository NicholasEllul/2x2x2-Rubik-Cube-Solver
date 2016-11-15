
public class Face {

	Square[] tiles = new Square[4];
	int x;
	
	public Face(String[] faceInput) {
		
		for(int counter = 0; counter < 4; counter++){
			tiles[counter] = new Square(counter, Square.COLOR.red);
		}
		
	}
}
