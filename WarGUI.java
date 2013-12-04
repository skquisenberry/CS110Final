
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class WarGUI extends JFrame 
{
   private JPanel top, bottom, titleSpace, cardSpace;
   private JLabel title, cardBack, cardOne, cardTwo;
   private Game game;
   
   WarGUI(String s) 
   {
      super(s);
      //set layout for full GUI
      setLayout(new GridLayout(3, 1));
      
      //create title
      titleSpace = new JPanel(new GridLayout(1, 1));
      add(titleSpace);
      title = new JLabel("War! Aces are low.");
      title.setFont(new Font("ARIAL", Font.BOLD, 40));
      titleSpace.add(title);
      
      //create panel for cards
      cardSpace = new JPanel(new GridLayout(1, 4));
      add(cardSpace);
      
      //create panel for button
      bottom = new JPanel(new GridLayout(1, 1));
      add(bottom);
      JButton button = new JButton("Next Round");
      bottom.add(button);

      
      
   }
   
   /**
      The cardInPlay method takes in a Card and sets the panel to the correct card.
      @param p1 The Card for player 1
   */
   public void cardInPlay(Card p1)
   {
      if(p1.getSuit() == 1)
      {
         switch(p1.getRank())
         {
            case 1:
              
               break;
            case 2:
               
               break;
            case 3:
               
               break;
            case 4:
               
               break;
            case 5:
               
               break;
            case 6:
               
               break;
            case 7:
               
               break;
            case 8:
               
               break;
            case 9:
               
               break;
            case 10:
               
               break;
            case 11:
               
               break;
            case 12:
               
               break;
            case 13:
               
               break;
         
         }
      }
      else if(p1.getSuit() == 2)
      {
         switch(p1.getRank())
         {
            case 1:
              
               break;
            case 2:
               
               break;
            case 3:
               
               break;
            case 4:
               
               break;
            case 5:
               
               break;
            case 6:
               
               break;
            case 7:
               
               break;
            case 8:
               
               break;
            case 9:
               
               break;
            case 10:
               
               break;
            case 11:
               
               break;
            case 12:
               
               break;
            case 13:
               
               break;
         }
      }
      else if(p1.getSuit() == 3)
      {
         switch(p1.getRank())
         {
            case 1:
              
               break;
            case 2:
               
               break;
            case 3:
               
               break;
            case 4:
               
               break;
            case 5:
               
               break;
            case 6:
               
               break;
            case 7:
               
               break;
            case 8:
               
               break;
            case 9:
               
               break;
            case 10:
               
               break;
            case 11:
               
               break;
            case 12:
               
               break;
            case 13:
               
               break;
         }
      }
      else
      {
         switch(p1.getRank())
         {
            case 1:
              
               break;
            case 2:
               
               break;
            case 3:
               
               break;
            case 4:
               
               break;
            case 5:
               
               break;
            case 6:
               
               break;
            case 7:
               
               break;
            case 8:
               
               break;
            case 9:
               
               break;
            case 10:
               
               break;
            case 11:
               
               break;
            case 12:
               
               break;
            case 13:
               
               break;
         }
      }
           
   }
   
   public static void main(String [] args)
   {
      JFrame frame = new WarGUI("Hello");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(500,500);
      frame.validate();
      frame.setVisible(true);
   }
}