
//Scott Quisenberry
//CS 110
//Final Project: Game Class

public class Game
{
   
   public static void main(String [] args)
   {
      boolean win = false;
      Card tempC, tempP;
      
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
      
      //the game of war
      while(!win)
      {
         tempC = compHand.get();
         tempP = playerHand.get();
         System.out.println("Computer has  " + tempC + "\nYou have " + tempP);
         if(tempC.compareTo(tempP) > 0)
         {
            System.out.println("Computer wins this round.");
            compHand.add(tempP);
            compHand.add(tempC);
            if(compHand.isEmpty() || playerHand.isEmpty())
               win = true;
         }
         else if(tempC.compareTo(tempP) < 0)
         {
            System.out.println("You win this round.");
            playerHand.add(tempC);
            playerHand.add(tempP);
            if(compHand.isEmpty() || playerHand.isEmpty())
               win = true;
         }
         else
         {
            
         }
      }
      
   }
   
   
}