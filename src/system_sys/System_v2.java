package system_sys;

import java.util.Scanner;
import bank.banking;

public class System_v2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("WELCOME TO THE SYSTEM!");
        System.out.println("----------------------------");
        System.out.println("1. Banking");
        System.out.println("2. Shopping");
        System.out.println("3. Pay bills");
        System.out.println("");
        System.out.print("Enter: ");
        int ch1 = scan.nextInt();

        switch(ch1) {
            /* BANKING OPTION */
            case 1:
                banking[] Bank = new banking[20]; //20 lang tingali sir
                int numAcc = 0;//how many accounts already
                int attempt;

                boolean running = true;

                while (running) {
                    System.out.println("----------------------------");
                    System.out.println("1. Register Account");
                    System.out.println("2. Sign In");
                    System.out.println("3. View All Accounts");
                    System.out.println("4. Exit");
                    System.out.println("");
                    
                    System.out.println("Num of accounts: " + numAcc);
                    System.out.print("Enter: ");
                    int ch2 = scan.nextInt();

                    switch (ch2) {
                        
/* REGISTER ACCOUNT */case 1:
                            if (numAcc >= Bank.length) {
                                System.out.println("Bank is full! Cannot register more accounts.");
                                break;
                            }
                            Bank[numAcc] = new banking();
                            System.out.print("Enter Account No.: ");
                            Bank[numAcc].setAccNo(scan.nextInt());
                            System.out.print("Set Account Pin: ");
                            Bank[numAcc].setPin(scan.nextInt());
                            Bank[numAcc].setBalance(0);
                            
                            System.out.println("\nAccount Registered!");
                            numAcc++;
                            
                            System.out.println("Press Enter to continue...");
                            scan.nextLine();
                            scan.nextLine();
                            
                            System.out.println("");
                            break;
                        
                        
/* SIGN IN ACCOUNT */case 2:
                            attempt = 3;
                            boolean loggedIn = false;
                            
                            while (attempt > 0) {
                                System.out.print("Enter Account No.: ");
                                int account = scan.nextInt();
                                System.out.print("Enter Pin No.: ");
                                int pin = scan.nextInt();
                                
                                boolean found = false;
                                for (int i = 0; i < numAcc; i++) {
                                    if (Bank[i].verifyAccount(account, pin)) {
                                        found = true;
                                        loggedIn = true;
                                        break;
                                    }
                                }
                                
                                if (found) {
                                    System.out.println("LOGIN SUCCESS");
                                    System.out.println("Press Enter to continue...");
                                    scan.nextLine();
                                    scan.nextLine();
                                        
                                    for(int x = 0 ; x < numAcc ; x++){ // FIXED <= to <
                                        if(account == Bank[x].getAccNo()){
                                            
                                           boolean inAccountMenu = true;
                                            while (inAccountMenu){
                                            System.out.println("----------------------------");
                                            System.out.println("Current Balance: "+Bank[x].getBalance());
                                            System.out.println("1. Deposit");
                                            System.out.println("2. Withdraw");
                                            System.out.println("3. Exit");
                                            System.out.print("Enter: ");
                                            int choice = scan.nextInt();
                                            
                                                /*FOR THE WITHDRAW/DEPOSIT THING*/
                                                switch(choice){
                                                    case 1://DEPOSITS
                                                            System.out.println("----------------------------");
                                                            System.out.println("Enter amount to Deposit: ");
                                                            float depAmount = scan.nextFloat();
                                                            
                                                            float newBalance = (Bank[x].getBalance())+depAmount;
                                                            
                                                            Bank[x].setBalance(newBalance);
                                                            System.out.println("New balance: "+Bank[x].getBalance());
                                                            System.out.println("");
                                                            
                                                            System.out.println("Press Enter to continue...");
                                                            scan.nextLine();
                                                            scan.nextLine();
                                                        break;
                                                        
                                                        
                                                    case 2://WITHDRAWS
                                                        System.out.println("----------------------------");
                                                            System.out.println("Enter amount to Withdraw: ");
                                                            float withAmount = scan.nextFloat();
                                                            
                                                            if(withAmount > Bank[x].getBalance()){//if withdraw is higher than balance
                                                                while(withAmount > Bank[x].getBalance()){
                                                                    System.out.println("Not enough balance. Try again");
                                                                    withAmount = scan.nextFloat();
                                                                }
                                                            }    
                                                            
                                                            newBalance = (Bank[x].getBalance())-withAmount;
                                                            Bank[x].setBalance(newBalance);
                                                            
                                                            
                                                            System.out.println("New balance: "+Bank[x].getBalance());
                                                            System.out.println("");
                                                            
                                                            System.out.println("Press Enter to continue...");
                                                            scan.nextLine();
                                                            scan.nextLine();
                                                        break;
                                                        
                                                        
                                                    case 3://EXIT THE PROGRAM
                                                        System.out.println("Logging out...");
                                                        scan.nextLine();
                                                        scan.nextLine();
                                                        inAccountMenu = false; // FIXED so it exits
                                                        break;
                                                        
                                                        
                                                    default://ERROR
                                                            System.out.println("Invalid choice!");
                                                        break;
                                                    }
                                        }//while
                                    }//if it matches
                
                
                
                                    }//for loop to find
                                } else {
                                    System.out.println("INVALID ACCOUNT");
                                    attempt--;
                                    System.out.println("Attempts left: " + attempt);
                                }
                            }
                            break;
                        
                        
                            
                            
                            
                            
                            
/* VIEW ALL ACCOUNTS */case 3:
                            if (numAcc == 0) {
                                System.out.println("No accounts registered.");
                            } else {
                                for (int x = 0; x < numAcc; x++) {
                                    System.out.println("Account No.: " + Bank[x].getAccNo() + " | Balance: " + Bank[x].getBalance());
                                }
                            }
                            
                            System.out.println("Press Enter to continue...");
                            scan.nextLine();
                            scan.nextLine();
                            break;
                        
                        
/* EXITEXITEXITEXIT */case 4:
                            running = false;
                            break;

                        
/* INVALID INPUT */default:
                            System.out.println("Invalid choice!");
                            break;
                    }
                }
                break;

            case 2:
                System.out.println("Shopping module not implemented yet.");
                break;

            case 3:
                System.out.println("Bill payment module not implemented yet.");
                break;

            default:
                System.out.println("Invalid option!");
                break; 
        }
        scan.close();
    }
 
}
