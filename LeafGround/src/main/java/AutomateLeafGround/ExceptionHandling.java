package AutomateLeafGround;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Connection1 is established");
		
		try
		{
	    Calculation calc = new Calculation();
	    
	    calc.fun();
		}
		catch (Exception e) {
			System.out.println("Exception handled in main()");
		}
	    System.out.println("connection1 is terminated");
	}
	}
 	class Calculation
 	{
 		void fun() throws Exception
 		{
 			System.out.println("Connection2 is established");
 			Scanner scan = new Scanner(System.in);
 			try
 			{
 			System.out.println("Enter the numerator:");
 			
 			int a = scan.nextInt();
 			
 			System.out.println("Enter the denominator:");
 			
 			int b = scan.nextInt();
 			
 			int c = a/b;
 			
 			System.out.println("result is: "+c);
 			}
 			
 			catch (Exception e) {
 				
 				System.out.println("Some problem occured");
 				throw e;
 			}
 			finally
 			{
 			System.out.println("Connection2 is terminated");
 			}
 	}
 	}
 	


