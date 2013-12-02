
//Scott Quisenberry
//CS 110
//Final Project: Game Class

public class Game
{
   
   public static void main(String [] args)
   {
      boolean win = false;
      Card tempC, tempP, tempC2, tempP2, tempCF, tempPF; //tempC3, tempP3, tempC4, tempP4;
      
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
         tempC = compHand.get();
         tempP = playerHand.get();
         System.out.println("Player 1 has  " + tempP + "\nPlayer 2 has " + tempC);
         if(tempC.compareTo(tempP) > 0)
         {
            System.out.println("Player 2 wins this round.");
            //add the cards into the Computer's hand
            compHand.add(tempP);
            compHand.add(tempC);
            if(compHand.isEmpty() || playerHand.isEmpty())
               win = true;
         }
         else if(tempC.compareTo(tempP) < 0)
         {
            System.out.println("Player 1 wins this round.");
            //add the cards into the Player's hand
            playerHand.add(tempC);
            playerHand.add(tempP);
            if(compHand.isEmpty() || playerHand.isEmpty())
               win = true;
         }
         else
         {
            if(compHand.size() < 1 || playerHand.size() < 1)
               win = true;
            else
            {
               System.out.println("War!");
               //place first card face down and store
               tempCF = compHand.get();
               tempPF = playerHand.get();
               //keep next card
               tempC2 = compHand.get();
               tempP2 = playerHand.get();
               System.out.println("Player 1 has  " + tempP2 + "\nPlayer 2 has " + tempC2);
               if(tempC2.compareTo(tempP2) > 0)
               {
                  System.out.println("Player 2 wins this round.");
                  //add the cards into the Computer's hand
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
                  //add the cards into the Player's hand
                  playerHand.add(tempC2);
                  playerHand.add(tempP2);
                  playerHand.add(tempCF);
                  playerHand.add(tempPF);
                  if(compHand.isEmpty() || playerHand.isEmpty())
                     win = true;
               }
               else
               {
                  
               }
            }
         }
      }
      
      //check for overall winner
      if(playerHand.isEmpty())
         System.out.println("Player 2 wins!");
      else
         System.out.println("Player 1 wins!");
      
   }
   
   
}