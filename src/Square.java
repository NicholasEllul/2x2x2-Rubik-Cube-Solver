
public class Square {
	
	COLOR _colorOfFace;
	int _position;
	
	public enum COLOR
	{
		red ("w"),
		green ("g"),
		orange ("o"),
		blue ("b"),
		white ("w"),
		yellow ("y")
		
	    private final String name;       

	    private COLOR (String s) {
	        name = s;
	    }

	};
	
	public Square(int position, COLOR colorOfFace){
		this._position = position;
		this._colorOfFace = colorOfFace;
	}
	
	
	
	
	/*public enum POSITION
	{
		1,
		2,
		3,
		4,
		5,
		6,
		7,
		8,
		9,
		10,
		11,
		12,
		13,
		14,
		15,
		16,
		17,
		18,
		19,
		20,
		21,
		22,
		23,
		24
	};*/
}
