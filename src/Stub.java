import java.util.ArrayList;

public class Stub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long startTime = System.currentTimeMillis();
		
	
	
		String userTest = "yyyyggggwwwwbbbbrrrroooo";
		String userTestTwo = "yygggwoowbwbybrrrrgwooyb";
		String userTestThree = "yyyyrrggwwwwoobbbbrrggoo";
		String userTestFour =  "ooyyggggwwrrbbbbyryrowow";
		String userTestFive = "bwwggorgrwyyrboobgoywrby";
		Cube testCube = new Cube(userTestFive);
		
		testCube.findSolution();

		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		
	//	System.out.println(totalTime);
		
		System.out.println("Done.");

	}

}
