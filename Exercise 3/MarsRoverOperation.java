
import java.util.Scanner;
public class MarsRoverOperation {

	/**
	 * Accepts a command-line argument such as "LFFFRFFFRRFFF"
	 * where "L" => rotate 90 degrees left
	 *  	 "R" => rotate 90 degrees right
	 *    	 "F" => move forward one unit
	 *
	 * Method should print the appropriate and correct final position
	 * of the robot.
	 *
	 * Example:
	 * 		 For input "FFRF", the result should be [1,2].
	 */
	public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the Robo code in Capital letters: ");
			String robocode = scanner.next();
			System.out.println(String.format("User Entered Robo code is: %s", robocode));
			int codeLength = robocode.length();
			 int dx=0, dy=0, direction=0;
			for (int x=0; x< codeLength; x++){
				
				char forward= robocode.charAt(x);
				if (forward == 'R') 
			        direction = (direction + 1)%4; 
			      else if (forward == 'L') 
			        direction = (4 + direction - 1) % 4; 
			   
			     
			      else // for 'F'
			      { 
			         if (direction == 0) 
			            dy++; 
			         else if (direction == 1) 
			            dx++; 
			         else if (direction == 2) 
			           dy--; 
			         else // direction == 3 
			            dx--; 
			      } 
			}

		System.out.println("The coordinates are: [" + dx +" " + dy+"]");
	}  
}

