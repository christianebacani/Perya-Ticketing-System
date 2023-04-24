import java.util.Scanner;

public class PeryaTicketingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int price[] = {15,20}; // An array containing the prices of the two available tickets
        boolean sell = true; // A flag that will keep the loop running until the user is done buying tickets
        
        System.out.print("Press enter to start : ");
        String presEnter = input.nextLine();
        
        // Display the main menu options
        System.out.print("1.) Buy a ticket\n");
        System.out.print("2.) About\n");
        System.out.print("3.) Exit\n");
        
        System.out.print("Enter your choice here : ");
        int choice = input.nextInt(); // Get user's menu choice
        
        // Use a switch statement to handle the different menu choices
        switch(choice){
            case 1:
                while(sell){
                    // Display available tickets and prices
                    System.out.print("   AVAILABLE TICKETS\n\n");
                    System.out.print("TICKET\t\tPRICE\n\n");
                    System.out.print("1.) KIDS\tP 15\n\n");
                    System.out.print("2.) ADULT\tP 20\n\n");
                    
                    // Get user's ticket and quantity choices
                    System.out.print("Enter your choice here : ");
                    int userChoice = input.nextInt();
                    System.out.print("Enter quantity here : ");
                    int quantity = input.nextInt();
                    
                    // Calculate the total price of the tickets based on user's choices
                    total += price[userChoice - 1] * quantity;
                    
                    // If user chooses adult ticket, ask for the number of people eligible for a 20% discount and apply the discount to the total price
                    if (userChoice == 2) {
                        System.out.print("How many are the PWD/SENIOR CITIZEN/PREGNANT/STUDENT PEOPLE for the 20% discount?: ");
                        int discount = input.nextInt();
                        int discountedPrice = (int) ((20.0 / 100) * price[1] * discount);
                        total -= discountedPrice;
                    }
                    
                    // Ask user if they want to buy more tickets or if they are done
                    System.out.print("Do you want to buy more tickets ?(y/n): ");
                    input.nextLine(); // consume the newline character left by nextInt()
                    String buyMore = input.nextLine();
                    
                    // If user is done, display the total price, ask for payment, calculate change, and end the program
                    if(buyMore.equalsIgnoreCase("n")){
                       sell = false;
                       System.out.print("Total price is: P " + total + "\n" );
                       System.out.print("Enter payment here : P ");
                       int payment = input.nextInt();
                       
                       int change = payment - total;
                       System.out.print("Change : P " + change + "\n");
                       System.out.print("\n\nTHANK YOU,PLEASE COME AGAIN!");      
                    }
                    
                }
                break;
                
            case 2:
                // Display information about the ticketing system
                System.out.print("Welcome to Perya Ticketing System!\nWe are a ticketing platform designed to help you manage your events and streamline\nthe ticketing process. Whether you're planning a small gathering or a large-scale event, our\nsystem is here to make your ticketing experience easy and stress-free.");
                break;
                
            case 3:
                // Display a message indicating the program is exiting
                System.out.print("---EXITING---");
                break;
                
            default:
                // Display a message when user enters invalid choice
                System.out.print("\n\nINVALID CHOICE");
                    
        }
    }
}

            


