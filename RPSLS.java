/* 
   Arianna Ali
   This program allows the user to play rock, paper, scissors, lizard spock as many times as they wish.
*/

import java.util.*;
public class RPSLS
{
   public static void main (String [] args)
   {
      System.out.println("Let's play Rock, Paper, Scissors, Lizard, Spock!");
      Scanner scnr = new Scanner(System.in);
      String choice;
      String input;
      int gameNumber;
      int userScore = 0;
      int computerScore = 0;
      int tieGames = 0;
      
      do 
      { 
         // User Input 
         System.out.println("Enter your choice: ");
         choice = scnr.next();
         
         boolean userInput = ((choice.equalsIgnoreCase("rock")) ||
                             (choice.equalsIgnoreCase("paper")) ||
                             (choice.equalsIgnoreCase("scissors"))||
                             (choice.equalsIgnoreCase("lizard")) ||
                             (choice.equalsIgnoreCase("spock")));
      
          while (userInput == false)
          {
             System.out.println("Illegal choice: " + choice);
             System.out.println("Re-enter your play: ");
             choice = scnr.next();
             
               
             userInput = ((choice.equalsIgnoreCase("rock")) ||
                          (choice.equalsIgnoreCase("paper")) ||
                          (choice.equalsIgnoreCase("scissors"))||
                          (choice.equalsIgnoreCase("lizard")) ||
                          (choice.equalsIgnoreCase("spock")));
          }
      
          // Computer Input
          Random gen = new Random();
          int computerInput;
          computerInput = gen.nextInt(5);
     
          switch (computerInput)
          {
             case 0: 
             System.out.println("Computer choses Rock.");
             break;
          
             case 1:
             System.out.println("Computer choses Paper.");
             break;
         
             case 2:
             System.out.println("Computer choses Scissors.");
             break;
         
             case 3:
             System.out.println("Computer choses Lizard.");
             break;
         
            case 4:
            System.out.println("Computer choses Spock.");
          }  
           
          // If user chooses "rock"
          if ( choice.equalsIgnoreCase("rock") && computerInput == 0)
             {    System.out.println("It's a tie!");
                  tieGames = tieGames + 1;
             }
      
          else if ( choice.equalsIgnoreCase("rock") && computerInput == 1)
               {    System.out.println("Paper covers Rock. Computer Wins!!");
                    computerScore = computerScore + 1;
               }
      
          else if ( choice.equalsIgnoreCase("rock") && computerInput == 2)
               {    System.out.println("Rock crushes Scissors. You Win!!");
                    userScore = userScore + 1;
               }
      
          else if ( choice.equalsIgnoreCase("rock") && computerInput == 3)
               {    System.out.println("Rock crushes Lizard. You Win!!");
                    userScore = userScore + 1;
               }
      
          else if ( choice.equalsIgnoreCase("rock") && computerInput == 4)
               {    System.out.println("Spock vapourizes Rock. Computer Wins!!");
                    computerScore = computerScore + 1;
               }
      
          // If user chooses "paper" 
      
          else if ( choice.equalsIgnoreCase("paper") && computerInput == 0)
             {    System.out.println("Paper covers Rock. You Win!!");
                  userScore = userScore + 1;
             }
          else if ( choice.equalsIgnoreCase("paper") && computerInput == 1)
            {    System.out.println("It's a tie!");
                 tieGames = tieGames + 1;
            }
          else if ( choice.equalsIgnoreCase("paper") && computerInput == 2)
            {    System.out.println("Scissors cuts Paper. Computer Wins!!");
                 computerScore = computerScore + 1;
            }
      
          else if ( choice.equalsIgnoreCase("paper") && computerInput == 3)
            {    System.out.println("Lizard eats Paper. Computer Wins!!");
                 computerScore = computerScore + 1;
            }
      
         else if ( choice.equalsIgnoreCase("paper") && computerInput == 4)
            {    System.out.println("Paper disproves Spock. You Win!!");
                 userScore = userScore + 1;
            }
      
         // If user chooses "scissors"
         else if ( choice.equalsIgnoreCase("scissors") && computerInput == 0)
            {    System.out.println("Rock smashes Scissors. Computer Wins!!");
                 computerScore = computerScore + 1;
            }
      
         else if ( choice.equalsIgnoreCase("scissors") && computerInput == 1)
            {    System.out.println("Scissors cuts Paper. You Win!!");
                 userScore = userScore + 1;
            }
      
         else if ( choice.equalsIgnoreCase("scissors") && computerInput == 2)
            {    System.out.println("It's a tie!");
                 tieGames = tieGames + 1;
            }
      
         else if ( choice.equalsIgnoreCase("scissors") && computerInput == 3)
            {    System.out.println("Scissors decapitates Lizard. You Win!!");
                 userScore = userScore + 1;
            }
      
         else if ( choice.equalsIgnoreCase("scissors") && computerInput == 4)
            {    System.out.println("Spock smashes Scissors. Computer Wins!!");
                 computerScore = computerScore + 1;
            }
      
         // If user chooses "lizard"
         else if ( choice.equalsIgnoreCase("lizard") && computerInput == 0)
            {    System.out.println("Rock crushes Lizard. Computer Wins!!");
                 computerScore = computerScore + 1;
            }

         else if ( choice.equalsIgnoreCase("lizard") && computerInput == 1)
            {    System.out.println("Lizard eats Paper. You Win!!");
                 userScore = userScore + 1;
            }
   
         else if ( choice.equalsIgnoreCase("lizard") && computerInput == 2)
            {    System.out.println("Scissors decapitates Lizard. Computer Wins!!");
                 computerScore = computerScore + 1;
            }

         else if ( choice.equalsIgnoreCase("lizard") && computerInput == 3)
            {    System.out.println("It's a tie!");
                 tieGames = tieGames + 1;
            }

         else if ( choice.equalsIgnoreCase("lizard") && computerInput == 4)
            {    System.out.println("Lizard poisons Spock. You Win!!");
                 userScore = userScore + 1;
            }

         // If user chooses "spock"
         
         else if ( choice.equalsIgnoreCase("spock") && computerInput == 0)
            {    System.out.println("Spock vapourizes Rock. You Win!!");
                 userScore = userScore + 1;
            }
      
         else if ( choice.equalsIgnoreCase("spock") && computerInput == 1)
            {    System.out.println("Paper disproves Spock. Computer Wins!!");
                 computerScore = computerScore + 1;
            }
      
         else if ( choice.equalsIgnoreCase("spock") && computerInput == 2)
            {    System.out.println("Spock smashes Scissors. Computer Wins!!");
                 computerScore = computerScore + 1;
            }
         
         else if ( choice.equalsIgnoreCase("spock") && computerInput == 3)
            {    System.out.println("Lizard poisons Spock. Computer Wins!!");
                 computerScore = computerScore + 1;
            }
         
         else if ( choice.equalsIgnoreCase("spock") && computerInput == 4)
            {    System.out.println("It's a tie!");
                 tieGames = tieGames + 1;
            }
            
         // Keep playing game
         
               System.out.println("Play again? Enter yes or no: ");
               input = scnr.next();
               
               boolean inputTest = ((input.equalsIgnoreCase("yes")) ||
                                   (input.equalsIgnoreCase("no"))); 
                
               while (inputTest == false)
               {
                  System.out.println("Invalid entry " + choice);
                  System.out.println("Re-enter your play: ");
                  input = scnr.next();
                  inputTest = ((input.equalsIgnoreCase("yes")) ||
                               (input.equalsIgnoreCase("no")));
               }
           
               
             } while (input.equalsIgnoreCase("yes"));
             
               if (input.equalsIgnoreCase("no"));
               {
                  gameNumber = userScore + computerScore + tieGames;
                  System.out.println("Number of games played: " + gameNumber);
                  System.out.println("You won: " + userScore + " times!");
                  System.out.println("Computer won: " + computerScore + " times!");
                  System.out.println("There were: " + tieGames + " tie games!");
                  System.out.println("Thanks for playing!");
               }
  
   }
}

