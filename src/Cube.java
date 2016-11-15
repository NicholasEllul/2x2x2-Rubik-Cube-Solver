
public class Cube {
	Face[] faces = new Face[6];
	
	public Cube(){
		
		String[] faceInput = {"w","y","g","b"};
		faces[1] = new Face(faceInput);
	}
}
