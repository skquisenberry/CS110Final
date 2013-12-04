import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Scott Quisenberry
//CS 110
//Final Project: Game Class

public class Game2
{
   /*
      The game of war.
      Aces are low.
      player is player 1
      comp is player 2
   */
   
   private boolean cont;
   private CardPile deck, compHand, playerHand, pot;
   private Scanner input;
   private Card p1, p2;
   
   /**
      The constructor deals out the cards from the shuffled deck into the hands of player 1 and player 2
   */
   public Game2()
   {
      //create deck and hands and deal cards
      deck = new Deck();
      compHand = new Hand();
      playerHand = new Hand();
      pot = new CardPile();
      while(!deck.isEmpty())
      {
         compHand.add(deck.get());
         playerHand.add(deck.get());
      }
      
      
   }
   
   /**
      The turn method represents a single turn in the game, wars included.
   */
   public void turn()
   {
      int wars = 0;
      boolean p1Win;
      do
      {
         if(wars > 0)
            System.out.println("War number " + wars);
         
         //get the cards for each player
         p1 = playerHand.get();
         p2 = compHand.get();  
         
         //print the cards
         System.out.println("Player 1 has " + p1 + "\nPlayer 2 has " + p2);
         
         //add cards to the pot
         pot.add(p1);
         pot.add(p2);
         
         //decide winner
         if(p1.compareTo(p2) > 0)
            p1Win = true;
         else
            p1Win = false;
            
         wars++;
      }
      while(war(p1, p2));  //loop while there is a war
      
      //add pot to appropriate hand
      if(p1Win)
      {
         while(!pot.isEmpty())
            playerHand.add(pot.get());
      }
      else
      {
         while(!pot.isEmpty())
            compHand.add(pot.get());
      }
   }
   
   
   public boolean war(Card p1, Card p2)
   {
      if(p1.equals(p2))
         return true;
      else
         return false;
   }
   
}