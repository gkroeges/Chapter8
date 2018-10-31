
import java.util.Scanner;

public class Project8_3
{
    public static void main(String[] args)
    {
        int years;
        double principal;
        double rate;
        String again;
        
        
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
                    System.out.println("Enter the interest rate as a decimal (ex: 10%% = .10)");
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

            //  checks if user wants to continue, if they say no then it breaks the loop
            input.nextLine();
            System.out.println("Would you like to calculate again (y/n)");
            again = input.nextLine();
            if(again.charAt(0) == 'n' || again.charAt(0) == 'N') break;
        }
        System.out.println("Thanks for using the interest calculator!!");
    }
}