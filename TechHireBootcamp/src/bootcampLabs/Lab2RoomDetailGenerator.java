package bootcampLabs;
import java.util.Scanner;

public class Lab2RoomDetailGenerator {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		float roomLength;
		float roomWidth;
		
		String userChoice;
		
		
		do {
		System.out.println();
		System.out.println("Please enter a room length: ");
		roomLength = scnr.nextFloat();
		
		System.out.println("Please enter a room width: ");
		roomWidth = scnr.nextFloat();
		
		float roomArea = roomLength * roomWidth;
		float roomPerimeter = (roomLength + roomWidth) * 2;
		
		
		System.out.println("Area: " + roomArea);
		System.out.println("Perimeter: " + roomPerimeter);
		System.out.println();
		
		System.out.println("Would you like to continue? (y/n)");
		userChoice = scnr.next();
		
		
		} while (userChoice.equals ("y"));
		
		
		
		
		scnr.close();
	}

}
