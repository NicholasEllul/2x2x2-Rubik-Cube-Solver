
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
		yellow ("y");
		
	    private final String name;       

	    private COLOR (String charCode) {
	        name = charCode;
	    }

		public String getName() {
			return name;
		}

	};
	
	public Square(int position, COLOR colorOfFace){
		this._position = position;
		this._colorOfFace = colorOfFace;
	}
	
}
