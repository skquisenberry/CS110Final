
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class WarGUI extends JFrame 
{
   private JPanel top, bottom, titleSpace, cardSpace;
   private JLabel title, cardBack, cardBack2, cardOne, cardTwo;
   private ImageIcon back, cardOneImage, cardTwoImage;
   private Game2 game;
   
   public WarGUI(String s) 
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
      
      //create the card labels
      cardBack = new JLabel();
      back = new ImageIcon("cards/back.jpg");
      cardBack = new JLabel(back);
      cardOne = new JLabel("Player 1's card");
      cardTwo = new JLabel("Player 2's card");
      cardBack2 = new JLabel(back);
      
      //add in the card labels
      cardSpace.add(cardBack);
      cardSpace.add(cardOne);
      cardSpace.add(cardTwo);
      cardSpace.add(cardBack2);
      
      
      //create panel for button
      bottom = new JPanel(new GridLayout(1, 1));
      add(bottom);
      JButton button = new JButton("Next Round");
      button.addActionListener(new ButtonListener());
      bottom.add(button);

      
      
   }
   
   
   private class ButtonListener implements ActionListener
   {
      
      Game2 game;
      
      /**
         The ButtonListener constructor creates a game to step through
      */
      public ButtonListener()
      {
         game = new Game2();
      }
      
      /**
         The actionPerformed method steps the game through one turn at a time.
      */
      public void actionPerformed(ActionEvent e)
      {
         game.turn();
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