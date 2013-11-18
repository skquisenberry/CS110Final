

//Scott Quisenberry
//CS 110
//Final Project: Hand class

public class Hand extends CardPile
{
   
   /**
      The constructor creates the CardPile object.
   */
   public Hand()
   {
      super();
   }
   
   /**
      The peek method returns a Card without removing it from the ArrayList.
   */
   public Card peek(int index)
   {
      Card temp = super.get(index);
      super.add(index, temp);
      return temp;
   }
   

}