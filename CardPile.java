import java.util.ArrayList;

//Scott Quisenberry
//CS 110
//Final Project: CardPile class

public class CardPile
{
   
   //Create ArrayList to hold all cards
   ArrayList<Card> pile;
   
   /**
      The constructor initializes the ArrayList to hold Card objects.
   */
   public CardPile()
   {
      pile = new ArrayList<Card>();
   }
   
   /**
      The add method adds a card to a given index in the ArrayList.
      A 1 base is for index is used rather than a 0 base.
      @param index The index to add the card.
      @param card The card to be added.
   */
   public void add(int index, Card card)
   {
     
      try
      {
         pile.add((index - 1), card);
      }
      catch(IndexOutOfBoundsException e)
      {
         System.out.println(e.getMessage());
         System.exit(0);
      }   
    
   }
   
   /**
      The second add method adds a card to the end of the ArrayList.
      @param card The card to be added.
   */
   public void add(Card card)
   {
      pile.add(pile.size(), card);
   }
   
   /**
      The get method returns a card and then removes that card from the ArrayList.
      A 1 base for index is used rather than a 0 base.
      @param index The index to remove the card from.
   */
   public Card get(int index)
   {
      Card card = pile.get(index - 1);
      pile.remove(index - 1);
      return card;
   }
   
   /**
      The second get method returns and removes the card in the first position in the ArrayList.
   */
   public Card get()
   {
      Card card = pile.get(0);
      pile.remove(0);
      return card;
   }
   
   
   
}