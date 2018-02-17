/*Programmer: Martin Ly*/
public class Temp {
   import java.util.Scanner;
   
	//method returns fahrenheit equivalent of a celsius temperature using formula
   public static double C (double fahrenheit)
   {
	double celsius = (5.0/9.0)*fahrenheit - 32;
	return celsius;
	}
	System.out.println("Fahrenheit" + fahrenheit + "is" + celsius + "in celsius");
	
	//method returns celsius equivalent of a fahrenheit temperature using formula
	public static double F (double celsius) 
	{
		double fahrenheit = (9.0/5.0)*celsius + 32;
		return fahrenheit;
		}
		
		System.out.println("Celsius" + celsius + "is" + fahrenheit + "in fahrenheit");
	}
 //main body of program
   public static void main(String[] args)
   {
		double F;
		double C;
		
		Scanner in = new Scanner(System.in); //scanner to take input
		
		//menu option for user
		System.out.println("Pick one of the option");
		System.out.println("Press 1. Celsius to Fahrenheit");
		System.out.println("Press 2. Fahrenheit to Celsius");
		System.out.println("Enter your choice: \t");
		
		//take choice from user
		int choice = in.nextInt();
		System.out.println("");
		//options result
		if(choice == 1)
		{
			System.out.print("Enter Temp n celsius: \t");
			C = in.nextInt(); //take the input of the celsius
			System.out.println("\n Temp in fahrenheit = " + fahrenheit(c));//call fahrenheit method^
			System.out.print ("\n");
			
		}
			else(choice == 2)
		{
		System.out.print("Enter Temp in fahrenheit: \t");
		F = in.nextInt(); //take the input of the fahrenheit
		System.out.println("\n Temp in Celsius = " + celsius(F));//call the celsius method^
		System.out.print ("\n");
		}
	}

