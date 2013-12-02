import java.util.Random;

//Scott Quisenberry
//CS 110
//Final Project: Game Class

public class Game
{
   
   public static void main(String [] args)
   {
      Random r = new Random();
      int index;
      
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
   }
   
   
}