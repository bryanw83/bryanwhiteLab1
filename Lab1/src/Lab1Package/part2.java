package Lab1Package;
import java.util.Scanner;
import java.text.ParseException;
import java.time.Period;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Part2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/uuuu");
		
		String input1;
		String input2;
		
		
		
		//First we ask the user for a set of dates
		
		System.out.println("Please enter a date as MM/DD/YYYY");
		input1 = scnr.nextLine();
		
		LocalDate date1 = LocalDate.parse(input1, formatter);
		
		//Next, the dates are converted to a LocalDate variable
		
		System.out.println("Please enter a seccond date as MM/DD/YYYY");
		input2 = scnr.nextLine();
		LocalDate date2 = LocalDate.parse(input2, formatter);
		
		
		
		
	    /*Finally, the new variables are compared using Math.abs to account
		for potential negative differences and the results are printed*/
		 
		Period diff = Period.between(date1, date2);
		 
		System.out.printf("Difference is %d years, %d months and %d days",
		                  Math.abs(diff.getYears()), Math.abs(diff.getMonths()), Math.abs(diff.getDays()));		
		
		
		
		
		
		
	scnr.close();	

	}

}
