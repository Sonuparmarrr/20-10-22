package exception.assignment;

import java.util.Scanner;

public class ArthmaticExcepresion {
	public static void main(String[] args) {
		// For user input 
  
        // Two objects of integer value created
		Scanner sc = new Scanner(System.in); //use Scanner for input values
		
		System.out.println("Enter dividend Value x : ");
		int x=sc.nextInt();
		System.out.println("Enter divisor value y :");
		int y=sc.nextInt();
		System.out.println("Result : "+Divide(x,y));
		sc.close();
	}
	
	
	
	public static float Divide(int x, int y)    // Using divide() method 
	
	{
		float Result = 0;
		try {
			Result = x/y;
	
        }
        catch (ArithmeticException e) //Try to use an ArithmeticException 
		{
            System.out.println( "Zero cannot divide any number");
        }
        catch (Exception e) {
            System.out.println( e.getMessage()); // If an exception is caught, print out a helpful message.

        }
		return Result;  // Display the result
	}}