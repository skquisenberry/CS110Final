import java.util.Scanner;

//Scott Quisenberry
//CS 110
//Final Project: Game Class

public class Game
{
   
   public static void main(String [] args)
   {
      //comp is player 2, player is player 1
      //aces high
      
      //create Sanner
      Scanner input = new Scanner(System.in);
      
      //create variables
      boolean win = false;
      boolean cont;
      String contString;
      Card tempC, tempP, tempC2, tempP2, tempCF, tempPF, tempC3, tempP3, tempCF2, tempPF2;
      
      //create the deck and the hands
      CardPile deck = new Deck();
      CardPile playerHand = new Hand();
      CardPile compHand = new Hand();
      
      //deal out the cards
      while(!deck.isEmpty())
      {
         compHand.add(deck.get());
         playerHand.add(deck.get());
      }
      
      System.out.println("The game of War! Aces are low.");
      
      //the game of war
      while(!win)
      {
         //set continue to false
         cont = false;
         
         tempC = compHand.get();
         tempP = playerHand.get();
         System.out.println("Player 1 has  " + tempP + "\nPlayer 2 has " + tempC);
         if(tempC.compareTo(tempP) > 0)
         {
            System.out.println("Player 2 wins this round.");
            //add the cards into Player 2's hand
            compHand.add(tempP);
            compHand.add(tempC);
            if(compHand.isEmpty() || playerHand.isEmpty())
               win = true;
         }
         else if(tempC.compareTo(tempP) < 0)
         {
            System.out.println("Player 1 wins this round.");
            //add the cards into Player 1's hand
            playerHand.add(tempC);
            playerHand.add(tempP);
            if(compHand.isEmpty() || playerHand.isEmpty())
               win = true;
         }
         //if war
         else
         {
            if(compHand.isEmpty() || playerHand.isEmpty())
               win = true;
            else
            {
               System.out.println("War!");
               //place first card face down and store
               tempCF = compHand.get();
               tempPF = playerHand.get();
               //check if either player is out of cards
               if(compHand.isEmpty() || playerHand.isEmpty())
               {
                  win = true;
                  //if so, then determine which and decide winner appropriately
                  if(compHand.isEmpty())
                  {
                     playerHand.add(tempCF);
                     playerHand.add(tempPF);
                     System.out.println("Player 2 ran out of cards in the war!");
                  }
                  else
                  {
                     compHand.add(tempPF);
                     compHand.add(tempCF);
                     System.out.println("Player 1 ran out of cards in the war!");
                  }
               }
               else
               {
                  //keep next card
                  tempC2 = compHand.get();
                  tempP2 = playerHand.get();
                  System.out.println("Player 1 has  " + tempP2 + "\nPlayer 2 has " + tempC2);
                  if(tempC2.compareTo(tempP2) > 0)
                  {
                     System.out.println("Player 2 wins this round.");
                     //add the cards into Player 2's hand
                     compHand.add(tempP2);
                     compHand.add(tempC2);
                     compHand.add(tempPF);
                     compHand.add(tempCF);
                     if(compHand.isEmpty() || playerHand.isEmpty())
                        win = true;
                  }
                  else if(tempC2.compareTo(tempP2) < 0)
                  {
                     System.out.println("Player 1 wins this round.");
                     //add the cards into Player 1's hand
                     playerHand.add(tempC2);
                     playerHand.add(tempP2);
                     playerHand.add(tempCF);
                     playerHand.add(tempPF);
                     if(compHand.isEmpty() || playerHand.isEmpty())
                        win = true;
                  }
                  //double war
                  else
                  {
                     if(compHand.isEmpty() || playerHand.isEmpty())
                        win = true;
                     else
                     {
                        System.out.println("Double War!");
                        //place first card face down and store
                        tempCF2 = compHand.get();
                        tempPF2 = playerHand.get();
                        //check if either player is out of cards
                        if(compHand.isEmpty() || playerHand.isEmpty())
                        {
                           win = true;
                           //if so, then determine which and decide winner appropriately
                           if(compHand.isEmpty())
                           {
                              playerHand.add(tempCF2);
                              playerHand.add(tempPF2);
                              System.out.println("Player 2 ran out of cards in the double war!");
                           }
                           else
                           {
                              compHand.add(tempPF2);
                              compHand.add(tempCF2);
                              System.out.println("Player 1 ran out of cards in the double war!");
                           }
                        }
                        else
                        {
                           //keep next card
                           tempC3 = compHand.get();
                           tempP3 = playerHand.get();
                           System.out.println("Player 1 has  " + tempP3 + "\nPlayer 2 has " + tempC3);
                           if(tempC2.compareTo(tempP2) > 0)
                           {
                              System.out.println("Player 2 wins this round.");
                              //add the cards into Player 2's hand
                              compHand.add(tempP3);
                              compHand.add(tempC3);
                              compHand.add(tempPF2);
                              compHand.add(tempCF2);
                              if(compHand.isEmpty() || playerHand.isEmpty())
                                 win = true;
                           }
                           else if(tempC3.compareTo(tempP3) < 0)
                           {
                              System.out.println("Player 1 wins this round.");
                              //add the cards into Player 1's hand
                              playerHand.add(tempC3);
                              playerHand.add(tempP3);
                              playerHand.add(tempCF2);
                              playerHand.add(tempPF2);
                              if(compHand.isEmpty() || playerHand.isEmpty())
                                 win = true;
                           }
                        }
                     }
                  }
               }
            }
         }
         //stops the program to step through each round
         do
         {
            System.out.print("Continue? (y/n): ");
            contString = input.nextLine();
            if(contString.equals("y"))
               cont = true;
            else
               cont = false;
         }while(cont == false);
      }
      
      //check for overall winner
      if(playerHand.isEmpty())
         System.out.println("Player 2 wins!");
      else
         System.out.println("Player 1 wins!");
      
   }
   
   
}