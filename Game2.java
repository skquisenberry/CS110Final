import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Scott Quisenberry
//CS 110
//Final Project: Game Class

public class Game2
{
   private boolean cont;
   private CardPile deck, compHand, playerHand;
   
   public Game2()
   {
      //create deck and deal cards
      deck = new Deck();
      while(!deck.isEmpty())
      {
         compHand.add(deck.get());
         playerHand.add(deck.get());
      }
      
      
   }
   
}