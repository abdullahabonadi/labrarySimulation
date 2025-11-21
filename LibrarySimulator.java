package labrarySimulation;
/*
 * Project Phase #1
 * * Group Members:
 * 1. Ahmed Abdullah Al-Musallam - ID: 446104786
 * 2. Abdullah Khalil Abu Nadi  - ID:  446103718
 * 3. Mohammed Saad Al-Rajhi    - ID: 446104643
 * * GitHub Repository: https://github.com/ANGAL123256/labrarySimulation
 */
import java.util.Scanner;

public class LibrarySimulator {

	public static void main(String[] args) {
        boolean running = true;  

        Scanner input = new Scanner(System.in);  

        Member U1 = new Member(1,"User 100",0);  
        Member U2 = new Member(2,"User 101",0);  
        Member U3 = new Member(3,"User 102 ", 0);  
		
        while (running) {  
            System.out.println("\n========== Welcome to the Library Simulation ==========");  
            System.out.println("Select an option:");  
            System.out.println("1. Login as " + U1.getName() + " ID: " + U1.getId() + ".");  
            System.out.println("2. Login as " + U2.getName() + " ID: " + U2.getId() + ".");  
            System.out.println("3. Login as " + U3.getName() + " ID: " + U3.getId() + ".");  
            System.out.println("4. Login as Administrator");  
            System.out.println("5. Exit Program");  
            System.out.print("Enter your choice: ");
            
            int choice = input.nextInt();  
            
            Member status=null;  

            if (choice >= 1 && choice <= 3) {  
                if (choice == 1)   
                	status = U1;  
                else if (choice == 2)   
                	status = U2;  
                else   
                	status = U3;
            

            
            boolean sessionActive = true;  
            while (sessionActive) {  
				
				System.out.println("\nWelcome, " +status.getName()  + "!");  
                System.out.println("1. View Borrowed Books Count");  
                System.out.println("2. Borrow Book");  
                System.out.println("3. Return Book");  
                System.out.println("4. View Session Summary");  
                System.out.println("5. Exit to Main Menu");  
                System.out.print("Choose an option: ");  
          
            int uOption= input.nextInt(); 
            
            
            switch (uOption) {  
            case 1:  
                status.viewBorrowedCount();  
                break;  
            case 2:  
            	status.borrowOne();  
                break;  
            case 3:  
            	status.returnOne();  
                break;  
            case 4:  
            	status.displayStatistics();  
                break;  
            case 5:  
                System.out.println("Session ended. Total books currently borrowed: " + status.getBorrowedCount());  
                sessionActive = false;
				status.reset();
                break;  
            default:  
                System.out.println("Invalid option. Try again.");  
                break;  
            }}
            
            
        }
            else if (choice == 4) {  
                
                  
                    boolean adminActive = true;  
                    while (adminActive) {  
                        System.out.println("\n===== Administrator Menu =====");  
                        System.out.println("1. View Total Revenue");  
                        System.out.println("2. Most Frequent Operation");  
                        System.out.println("3. Exit to Main Menu");  
                        System.out.print("Choose an option: ");  
  
                        int adminChoice = input.nextInt();  
  
                        switch (adminChoice) {  
                            case 1:  
                                System.out.printf("Total Revenue from all borrow operations: %.2f\n", Member.TotalRevenue);  
                                break;  
                            case 2:  
                                System.out.println("Most Frequent Operation:");  
                                if (Member.TotalBorrows == 0 && Member.TotalReturns == 0) {  
                                    System.out.println("- No operations performed yet.");  
                                } else if (Member.TotalBorrows > Member.TotalReturns) {  
                                    System.out.println("- Borrow");  
                                } else if (Member.TotalReturns > Member.TotalBorrows) {  
                                    System.out.println("- Return");  
                                } else {  
                                    System.out.println("- Borrow and Return (Tie)");  
                                }  
                                break;  
                            case 3:  
                                adminActive = false;  
                                break;  
                            default:  
                                System.out.println("Invalid option. Try again.");  
                                break;  
                        }  
                     
                }  
  
            } 
            else if (choice == 5) {
                System.out.println("Exiting Program. Goodbye!");
                running = false;
            }
            else {
                System.out.println("Invalid choice. Please try again.");
            }   }
        }}

	
	


