package Lab1Package;
import java.util.Scanner;

public class Part1 {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);

		
//Here we have the initial set up and prompt to receive our variables		
		int userNum1;
		int userNum2;
		
		System.out.println("Please enter your first 3-digit number and press 'Enter'.");
			userNum1 = scnr.nextInt();
			
		System.out.println("Please enter your second 3-digit number and press 'Enter'.");
			userNum2 = scnr.nextInt();
	
	
			
			
/*Next we isolate the individual values of each variable into new separate 			
variables using modulus*/	
			
		int num1a = userNum1 / 100 % 10;
		int num2a = userNum1 / 10 % 10;
		int num3a = userNum1 % 10;
			
		int num1b = userNum2 / 100 % 10;
		int num2b = userNum2 / 10 % 10;
		int num3b = userNum2 % 10;
			
			
			
			
//Next we perform the following equations in order to get our final variables			
			
		int finNum1 = num1a + num1b;
		int finNum2 = num2a + num2b;
		int finNum3 = num3a + num3b;
			
			
			
			
//Finally, we use an if/else statement to compare our final variables			
			
		if ((finNum1 == finNum2) && (finNum2 == finNum3) && (finNum1 == finNum3)) {
				System.out.println("True");
			}
		else {
				System.out.println("False");
			}


scnr.close();
	}
}
