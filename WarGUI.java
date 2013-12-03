
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class WarGUI extends JFrame 
{
   private JPanel top, bottom, cardSpace;
   private JLabel label;
   WarGUI(String s) 
   {
      super(s);
      setLayout(new GridLayout(2, 1));
      top = new JPanel(new GridLayout(1, 4));
      add(top);
      bottom = new JPanel(new GridLayout(1, 1));
      add(bottom);
      JButton button = new JButton("Next Round");
      bottom.add(button);
      cardSpace = new JPanel(new GridLayout(1, 4));
      top.add(cardSpace);
      
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