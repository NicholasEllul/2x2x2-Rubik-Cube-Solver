
public class Cube {
	Face[] faces = new Face[6];
	
	public Cube(){
		
		// Unit test 1
		String[] faceInput = {"w","y","g","b"};
		faces[1] = new Face(faceInput);
	}
}
