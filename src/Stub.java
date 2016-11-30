import java.util.ArrayList;

public class Stub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long startTime = System.currentTimeMillis();
		
	
		System.out.println("Calculating");
		String userTest = "yyyyggggwwwwbbbbrrrroooo";
		String userTestTwo = "yygggwoowbwbybrrrrgwooyb";
		String userTestThree = "yyyyrrggwwwwoobbbbrrggoo";
		String userTestFour =  "ooyyggggwwrrbbbbyryrowow";
		String userTestFive = "yorgoobgywwwboyggryrbbwr";
		Cube testCube = new Cube(userTestFive);
		
//		testCube.rotateRight();
		
	//	testCube.findSolution(testCube);
		

		
	//	testCube.rotateUp();
		
		
		//for(int counter = 0; counter < 3; counter ++){
	//		testCube.rotateUp();
	//	}
		
		testCube.findSolution(testCube);

		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		
		System.out.println(totalTime);
		
		
				System.out.println("Done");
		System.out.println("");
	}

}
