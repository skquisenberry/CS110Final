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
      Anytime there is a war, the program runs through another step and flips a card
   */
   public void turn()
   {
      int wars = 0;
      boolean p1Win;
      do
      {  
         
         //if this is a war, announce the war round and add the top card from each player into the pot
         if(wars > 0)
         {
            System.out.println("War round " + wars);
            pot.add(playerHand.get());
            pot.add(compHand.get());
            
            //if there is a war and either player has less than two cards in their hand, the pot is added to the winning player's hand
            if(playerHand.isEmpty())
            {
               while(!pot.isEmpty())
                  compHand.add(pot.get());
               System.out.println("Player 2 ran out of cards in the war!");
               return;
            }
            else if(compHand.isEmpty())
            {
               while(!pot.isEmpty())
                  playerHand.add(pot.get());
               System.out.println("Player 2 ran out of cards in the war!");
               return;
            }
         }
         
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
      while(war(p1, p2) && !gameOver());  //loop while there is a war
      
      //add pot to appropriate hand
      if(p1Win)
      {
         while(!pot.isEmpty())
            playerHand.add(pot.get());
         System.out.println("Player 1 wins this round");
      }
      else
      {
         while(!pot.isEmpty())
            compHand.add(pot.get());
         System.out.println("Player 2 wins this round");
      }
   }
   
   /**
      The war method returns true if the cards are of equal rank, meaning there is a war.
      @param p1 A card to be tested
      @param p2 A card to be tested
   */
   public boolean war(Card p1, Card p2)
   {
      if(p1.equals(p2))
         return true;
      else
         return false;
   }
   
   /**
      The gameOver method returns true if either player's hand is empty, meaning the game is done.
      If the game is over, it will print the winner of the game.
   */
   public boolean gameOver()
   {
      if(playerHand.isEmpty() || compHand.isEmpty())
      {
         if(playerHand.isEmpty())
            System.out.println("Player 2 wins!");
         else
            System.out.println("Player 1 wins!");
         return true;
      }
      else
         return false;
   }
   
   
   public static void main(String [] args)
   {
      Game2 war = new Game2();
      Scanner input = new Scanner(System.in);
      String cont;
      
      //cont = input.nextLine();
      while(!war.gameOver())
      {
         war.turn();
      }
   }
}