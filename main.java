package oasis;

import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        ATMInterface op=new ATMOperations();
        String user="avra";
        int atmpin=1990;
        Scanner in=new Scanner(System.in);
        System.out.println("Welcome to your bank account !!!");
        System.out.print("Enter User id: ");
        String userId=in.next();
    	System.out.print("Enter ATM Pin: ");
        int pin=in.nextInt();
    	if(pin==atmpin) {
            while(true){
                System.out.println("\n1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.To Transfer\n6.Exit");
                System.out.print("Enter Choice : ");
                int ch=in.nextInt();
                
                if(ch==1){
                		 op.viewBalance();
                	  
                }
                
                else if(ch == 2){
                	
                		System.out.println("Enter amount to withdraw ");
                		double withdrawAmount=in.nextDouble();
                		op.withdrawAmount(withdrawAmount);
                	 }
             
                
                else if(ch == 3){
                	
                        System.out.println("Enter Amount to Deposit :");
                        double depositAmount=in.nextDouble();
                        op.depositAmount(depositAmount);
                }
                
                else if(ch == 4) {
                		 System .out.println("Mini Statement");
                         op.viewMiniStatement();
                	 }
                
                else if (ch==5) {
                		 System .out.println("Amount transferred ");
                		 int transferamt=in.nextInt();
                		 op.transfer(123, 234, transferamt);
                	}
                	
                
                else if(ch == 6){
                    System.out.println("Collect your ATM Card\n Thank you for using ATM Machine!!");
                    System.exit(0);
                }
                
                else
                {
                    System.out.println("Please enter valid choice");
                }
            }
        }
    	else {
    		System.out.println("Invalid Details!!!");
    	}
    }
    }