import java.util.ArrayList;

public class Stub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String userTest = "yyyyggggwwwwbbbbrrrroooo";
		String userTestTwo = "ybybgygywgwgbwbwrrrroooo";
		String userTestThree = "yyyyrrggwwwwoobbbbrrggoo";
		Cube testCube = new Cube(userTestThree);
		
//		testCube.rotateRight();
		
	//	testCube.findSolution(testCube);
		

		
	//	testCube.rotateUp();
		
		
		//for(int counter = 0; counter < 3; counter ++){
	//		testCube.rotateUp();
	//	}
		
		testCube.findSolution(testCube);

	
		
		
				System.out.println("Done");
		System.out.println("");
	}

}
