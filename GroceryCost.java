 /*Programmer: Martin Ly*/
import java.util.Scanner;
public class Cost5 {
    public static void main(String[] args) 
	{
		//initialize cost and loop to zero
        int total = 0;
        int itemLoop = 0;
		int sum;
		int quantity; //value will change to input
        double price; //price may have decimal input
        
        
		Scanner input = new Scanner(System.in);
        while(itemLoop < 5)
		{
			//prompt the user to enter price of item
			input = new Scanner(System.in);
            System.out.print("Enter cost of item:	\t");
            price = input.nextDouble();
			
			//prompt the user to enter quantity
            System.out.print("Enter quantity of item:	\t");
            quantity = input.nextInt();
           
			if(price > 0 && quantity > 0)//both conditions of a price and cost 
            {
               sum = (price*quantity);
			   total += sum;
            }
          itemLoop ++;//increment loop by 1
        }
      
        System.out.println("Total cost for 5 items is: " + total);
		System.out.print ("\n");
    }    
}
