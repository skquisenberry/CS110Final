import java.util.Scanner;

//Scott Quisenberry
//CS 110
//Final Project: Card Class

public class Card
{
   //constants for rank
   public static final int ACE = 1;
   public static final int JACK = 11;
   public static final int QUEEN = 12;
   public static final int KING = 13;
   
   //constants for suit
   public static final int HEARTS = 1;
   public static final int DIAMONDS = 2;
   public static final int CLUBS = 3;
   public static final int SPADES = 4;
   
   //values for rank and suit
   private int rank, suit;
   
   /**
      The contstuctor accepts two integers to set the rank and suit of the card.
      If the rank given is invalid, the card is set to an ace.
      If the suit given is invalid, the card is set to hearts.
   */
   public Card(int suit, int rank)
   {
      if (rank >= 1 && rank <= 13)
         this.rank = rank;
      else
      {
         System.out.println("Invalid input for rank, card set to Ace.");
         this.rank = ACE;
      }
      if (suit >= 1 && suit <= 4)
         this.suit = suit;
      else
      {
         System.out.println("Invalid input for suit, card set to Hearts.");
         this.suit = HEARTS;
      }
   }
   
   /**
      The getSuit method returns the suit as an integer value.
      1 is Hearts.
      2 is Diamonds.
      3 is Clubs.
      4 is Spades.
   */
   public int getSuit()
   {
      return suit;
   }
   
   /**
      The getRank method returns the rank as an integer value.
      1 is Ace.
      11 is Jack.
      12 is Queen.
      13 is King.
      Any other number is the number returned.
   */
   public int getRank()
   {
      return rank;
   }
   
   /**
      The toString method returns the suit and rank of the card as a string.
   */
   public String toString()
   {
      String suitStr, rankStr, output;
      
      //checks for suit
      switch(suit)
      {
         case 1:
            suitStr = "Hearts";
            break;
         case 2:
            suitStr = "Diamonds";
            break;
         case 3:
            suitStr = "Clubs";
            break;
         default:
            suitStr = "Spades";
            break;
      }
      
      //checks for rank
      switch(rank)
      {
         case 1:
            rankStr = "Ace";
            break;
         case 11:
            rankStr = "Jack"; 
            break;
         case 12:
            rankStr = "Queen";
            break;
         case 13:
            rankStr = "King";
            break;
         default:
            rankStr = rank + "";
            break;
      }
      
      //builds and returns String
      output = "The " + rankStr + " of " + suitStr + ".";
      return output;
   }
   
   /**
      The equals method tests to see if two cards have the same rank.
      @param otherCard The card that is being compared.
   */
   public boolean equals(Card otherCard)
   {
      if (this.rank == otherCard.rank)
         return true;
      else
         return false;
   }
   
   /**
      The greaterThan method returns true if the rank of the card is greater than the rank of the card given as a parameter.
      @param otherCard The Card that is compared.
   */
   public boolean greaterThan(Card otherCard)
   {
      if(this.rank > otherCard.rank)
         return true;
      else
         return false;
   }
   
}