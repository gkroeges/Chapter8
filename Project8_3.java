
import java.util.Scanner;

public class Project8_3
{
    public static void main(String[] args)
    {
        int years;
        double principal, initPrincipal = 0;
        double rate;
        String again;
        String[] header = {"Year", "Princiapl", "Interest", "Total"};
        
        
        Scanner input = new Scanner(System.in);
        
        while(true)     // loop will continue unless the user chooses to exit allowing
                        // multiple calculations to take place
        {
            while(true)     //loop continues until a valid double is entered
            {               //for the principal
                try {
                    System.out.println("Enter the principal value");
                    principal = input.nextDouble();
                    break;
                } catch(Exception e) {
                    System.out.println("Error in number format!");
                    input.nextLine();
                }
            }
            
            while(true)     //loop continues until a valid double is entered
            {               //for the rate
                try {
                    System.out.println("Enter the interest rate as a percentage without the % sign.");
                    rate = input.nextDouble();
                    break;
                } catch(Exception e) {
                    System.out.println("Error in number format!");
                    input.nextLine();
                }
            }
            
            while(true)     //loop continues until a valid int is entered
            {               //for the years
                try {
                    System.out.println("Componded Quarterly over how many years?");
                    years = input.nextInt();
                    break;
                } catch(Exception e) {
                    System.out.println("Error in number format!");
                    input.nextLine();
                }
            }
            
            System.out.printf("%-6s%-16s%-16s%-16s",header[0],header[1],header[2],header[3]);
            
            //do all of the calculations and outputs
            for(int i = 1; i <= years*4; i++)
            {
                if(i % 4 == 1)
                    initPrincipal = principal;
                principal *= (1+(rate/400));
                if(i % 4 == 0) 
                    System.out.printf("%-6d$%-,15.2f$%-,15.2f$%-,15.2f%n",(i/4), initPrincipal, principal - initPrincipal, principal);
            }

            //  checks if user wants to continue, if they say no then it breaks the loop
            input.nextLine();
            System.out.println("Would you like to calculate again (y/n)");
            again = input.nextLine();
            if(again.charAt(0) == 'n' || again.charAt(0) == 'N') break;
        }
        System.out.println("Thanks for using the interest calculator!!");
    }
}