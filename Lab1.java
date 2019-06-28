// Lab_1_KYE_JOSHUA

import java.util.*;

class Lab1 {

        public static void main (String[] args) {	//main method
          
          int choice;
          int x = 0;
          int n = 0;
          double a = 0.0;
          boolean flag = true;
          
          Scanner scan = new Scanner(System.in);
          
 		do {	//Menu
          
          System.out.println("Choose an option 1, 2, 3, or 4.");
          System.out.println();
          	 
          System.out.println("1) Power function.");
          System.out.println("2) Add first terms in series, ascending order.");
          System.out.println("3) Add first terms in series, descending order.");
          System.out.println("4) Quit");
          
          System.out.println();

          choice = scan.nextInt();
          
          System.out.println();
            
             
          switch (choice) {		//Switch statement for the user input.
              
            case 1:
              
              boolean flagBase = false;	//Helps validate user input for the base number.
              boolean flagPower = false;	//Helps validate user input for the power number;
              
              do {
              
              try {
              
              System.out.println("Enter a base number x.");
              
              x = scan.nextInt();
                
              flagBase = false;  
                
              }
              
              catch (InputMismatchException e) {
                
                System.out.println("Please type a number.");	//Prints when the user's input is not a number.
                scan.next();	//New input line so the user can input a new value.
                flagBase = true;	//becomes true if the user input for the base is not a number. 
                
              }
                
              }
              
              while (flagBase);	//End of do while loop
              
              do {
                
              try {
              
              System.out.println("Enter a power number n.");
              
              n = scan.nextInt();
                
              flagPower = false;  
                
              }
              
              catch (InputMismatchException e) {
                
                System.out.println("Please type a number.");	//Prints when the user's input is not a number.
                scan.next();	//New input line so the user can input a new value.
                flagPower = true;	//becomes true if the user input for the power is not a number.
                
              }
                
              } while (flagPower);	//End of do while loop.
              
              int power = power(x, n);
              
              System.out.println();
              
              if (n < 0) {
              
              System.out.println(("1/" + power + "\n"));
                
              }
              
              else {
                
                System.out.println(power);
                
              }

              break;
              
            case 2:
              
              boolean isNumber = false;		//Helps check if the user inputed a number.
              
              do {
                
              try {
              
              System.out.println("Enter a number n.");
              
              a = scan.nextInt();
                
              isNumber = false;
                
              }
              
              catch (InputMismatchException e) {
                
                System.out.println("Please type a number.");	//Prints when the user's input is not a number.
                scan.next();	//New input line so the user can input a new value.	
                isNumber = true;	//becomes true if the user input for the power is not a number.
                
              }
                
          } while (isNumber);	//End of do while loop.
              
              System.out.println();
              System.out.println(seriesAscending(a, a));
              
              break; 
              
            case 3:
	  
              do {
                
              try {
              
              System.out.println("Enter a number n.");
              
              a = scan.nextInt();
                
              isNumber = false;
                
              }
              
              catch (InputMismatchException e) {
                
				System.out.println("Please type a number.");	//Prints when the user's input is not a number.
                scan.next();	//New input line so the user can input a new value.	
                isNumber = true;	//becomes true if the user input for the power is not a number.
                
              }
                
          } while (isNumber);	//End of do while loop.
              
              System.out.println();
              System.out.println(seriesDescending(a));

              break;
              
            case 4:

              System.out.println("You have chosen to quit.");
              
              flag = false;
              
              System.exit(0);
              
              break;
              
            default:
              
              System.out.println("Error. Please type 1, 2, 3, or 4");
                  
          }
          
        } while(flag = true);
          
        }
  
  		public static int power(int x, int n) {		//Recursive function for calculating powers.
         
      if (n == 0) {
        	
            return 1;
              
          }
          
      else if (n < 0) {
        
        	return (x * power(x, n+1));
            
          }
      
      else {
     
        return (x * power(x, n-1));
       
      }

        }
  
  		public static double seriesAscending(double n, double m) {	//Recursive function for adding up terms in a series in ascending order (1, 2, 3, ...);
          
    	if(n == 1) {
          
        System.out.print("1 + ");
              
        return 1.0;
              
    } 
          
        if (n == m) {
              
        double ascending = seriesAscending(n - 1, m);
          
        System.out.print("1/" + (int)n + " = ");
            
        return (1.0 / n) + ascending;
          
        }
          
        else {
          
        double ascending = seriesAscending(n - 1, m);
          
        System.out.print("1/" + (int)n + " + ");
            
        return (1.0 / n) + ascending;
          
    }
  }
  
  public static double seriesDescending(double n) {		//Recursive function for adding up terms in a series in ascending order (3, 2, 1, ...);
          
    	if (n == 1) {
          
        System.out.print("1 = ");
              
        return 1.0;
              
    } 
          
        else {     
          
        System.out.print("1/" + (int)n + " + ");
          
        double descending = seriesDescending(n - 1);

        return (1.0 / n) + descending;
          
    }
  }
}
