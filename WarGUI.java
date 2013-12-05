
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class WarGUI extends JFrame 
{
   private JPanel top, bottom, titleSpace, cardSpace;
   private JLabel title, cardBack, cardOne, cardTwo;
   private Game2 game;
   
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
      button.addActionListener(new ButtonListener());
      bottom.add(button);

      
      
   }
   
   
   private class ButtonListener implements ActionListener
   {
      
      Game2 game;
      public void actionPerformed(ActionEvent e)
      {
         game = new Game2();
         game.turn();
      }
   
   }
   
   public static void main(String [] args)
   {
      Game2 game = new Game2();
      JFrame frame = new WarGUI("Hello");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(500,500);
      frame.validate();
      frame.setVisible(true);
   }
}