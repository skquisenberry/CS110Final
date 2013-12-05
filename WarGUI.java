
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class WarGUI extends JFrame 
{
   private JPanel statusPanel, bottom, titleSpace, cardSpace;
   private JLabel title, status, cardBack, cardBack2, cardOne, cardTwo;
   private ImageIcon back, cardOneImage, cardTwoImage;
   private Game game;
   
   public WarGUI(String s) 
   {
      super(s);
      game = new Game();
      //set layout for full GUI
      setLayout(new GridLayout(4, 1));
      
      //create title
      titleSpace = new JPanel(new FlowLayout());
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
      
      //create panel for status
      statusPanel = new JPanel(new FlowLayout());
      add(statusPanel);
      status = new JLabel("Waiting for the first move.");
      status.setFont(new Font("ARIAL", Font.BOLD, 35));
      statusPanel.add(status);
      
      //create panel for button
      bottom = new JPanel(new GridLayout(1, 1));
      add(bottom);
      JButton button = new JButton("Next Round");
      button.addActionListener(new ButtonListener());
      bottom.add(button);

      
      
   }
   
   
   private class ButtonListener implements ActionListener
   {
      
      /**
         The actionPerformed method steps the game through one turn at a time.
      */
      public void actionPerformed(ActionEvent e)
      {
         
         //step the game through one turn
         game.turn();
         
         //say the card
         cardOne.setText(game.getP1().toString());
         cardTwo.setText(game.getP2().toString());
         
         //set the status bar
         if(game.getNumWars() == 1) //if there were no wars
         {
            if(game.getP1().compareTo(game.getP2()) > 0)
               status.setText("Player 1 wins this round.");
            else
               status.setText("Player 2 wins this round.");
         }
         else                       //if there was at least one war
         {
            if(game.getP1().compareTo(game.getP2()) > 0)
               status.setText("Player 1 wins this round after " + (game.getNumWars() - 1) + " wars.");
            else
               status.setText("Player 2 wins this round after " + (game.getNumWars() - 1) + " wars.");
         }
         
      }
   
   }
   
   public static void main(String [] args)
   {
      JFrame frame = new WarGUI("Hello");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(650,800);
      frame.setResizable(false);
      frame.validate();
      frame.setVisible(true);
   }
}