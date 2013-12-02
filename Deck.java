import java.util.Random;

//Scott Quisenberry
//CS 110
//Final Project: Deck class

public class Deck extends CardPile
{
   //Create a random object
   Random rand;
   
   /**
      The constructor creates the random object, fills up CardPile's ArrayList with all cards in a deck, and shuffles them.
   */
   public Deck()
   {
      super();
      rand = new Random();
      
      for(int k = 1; k <= 4; k++)
      {
         for(int i = 1; i <= 13; i++)
         {
            super.add(new Card(k, i));
         }
      }
      shuffle();
   }
   
   /**
      The shuffle method mixes up the cards in the ArrayList randomly.
   */
   public void shuffle()
   {
      Card temp, temp2;
      int index;
      
      for(int k = 1; k <= 51; k++)
      {
         index = rand.nextInt(51) + 1;
         temp = super.get(index);
         temp2 = super.get(k);
         super.add(k, temp);
         super.add(index, temp2);
      }
   }
   
}