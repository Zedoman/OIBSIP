package oasis;


import java.util.Scanner; 

public class GuessingGame {
     
        public static void main(String[] args) 
       {
           System.out.println("Guess a number between 1 to 100");
           System.out.println("You will have 10 guesses to guess the correct number.");
           Scanner sc1 = new Scanner(System.in); 
           boolean p;
           do {
              playGame();
              System.out.println("Would you like to play again?true/false");
              p = sc1.nextBoolean();  
              } while (p);
          System.out.println("Thanks for playing.");
        }  
        
        
        static void playGame() {
            int CN; 
            int UG;      
            int GC=0;     
            CN = (int)(100 * Math.random()) + 1;
            System.out.println();
            System.out.println("Your Guess?");
            Scanner sc= new Scanner(System.in);   
            while (true) {
               UG = sc.nextInt();  
               GC++;
               if (UG == CN) {
                  System.out.println("You got it in " + GC
                          + " guesses!  My number was " + CN);
                  break;  
               }
               if (GC == 10) {
                  System.out.println("You didn't get the number in 10 guesses.");
                  System.out.println("You lose.  Comp number was " + CN);
                  break;  
               }
               if (UG < CN)
                  System.out.println("That's too low.  Try again:");
               else if (UG > CN)
                  System.out.println("That's too high.  Try again:");
            }
            System.out.println();
            System.out.println("Your score is "+((11-GC)*10)+" out of 100");
            
        } 
                    
     } 


