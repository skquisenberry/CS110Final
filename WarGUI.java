
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class WarGUI extends JFrame 
{
   private JPanel statusPanel, bottom, titleSpace, cardSpace;
   private JLabel title, status, cardBack, cardBack2, cardOne, cardTwo;
   private ImageIcon back, aceh, aced, acec, aces, h2, d2, c2, s2, h3, d3, c3, s3, h4, d4, c4, s4, h5, d5, c5, s5, h6, d6, c6, s6,
      h7, d7, c7, s7, h8, d8, c8, s8, h9, d9, c9, s9, h10, d10, c10, s10, jackh, jackd, jackc, jacks, queenh, queend, queenc, queens,
      kingh, kingd, kingc, kings;
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
      
      //create ImageIcons for all cards
      aceh = new ImageIcon("cards/aceh.jpg");
      aced = new ImageIcon("cards/aced.jpg");
      acec = new ImageIcon("cards/acec.jpg");
      aces = new ImageIcon("cards/aces.jpg");
      h2 = new ImageIcon("cards/2h.jpg");
      d2 = new ImageIcon("cards/2d.jpg");
      c2 = new ImageIcon("cards/2c.jpg");
      s2 = new ImageIcon("cards/2s.jpg");
      h3 = new ImageIcon("cards/3h.jpg");
      d3 = new ImageIcon("cards/3d.jpg");
      c3 = new ImageIcon("cards/3c.jpg");
      s3 = new ImageIcon("cards/3s.jpg");
      h4 = new ImageIcon("cards/4h.jpg");
      d4 = new ImageIcon("cards/4d.jpg");
      c4 = new ImageIcon("cards/4c.jpg");
      s4 = new ImageIcon("cards/4s.jpg");
      h5 = new ImageIcon("cards/5h.jpg");
      d5 = new ImageIcon("cards/5d.jpg");
      c5 = new ImageIcon("cards/5c.jpg");
      s5 = new ImageIcon("cards/5s.jpg");
      h6 = new ImageIcon("cards/6h.jpg");
      d6 = new ImageIcon("cards/6d.jpg");
      c6 = new ImageIcon("cards/6c.jpg");
      s6 = new ImageIcon("cards/6s.jpg");
      h7 = new ImageIcon("cards/7h.jpg");
      d7 = new ImageIcon("cards/7d.jpg");
      c7 = new ImageIcon("cards/7c.jpg");
      s7 = new ImageIcon("cards/7s.jpg");
      h8 = new ImageIcon("cards/8h.jpg");
      d8 = new ImageIcon("cards/8d.jpg");
      c8 = new ImageIcon("cards/8c.jpg");
      s8 = new ImageIcon("cards/8s.jpg");
      h9 = new ImageIcon("cards/9h.jpg");
      d9 = new ImageIcon("cards/9d.jpg");
      c9 = new ImageIcon("cards/9c.jpg");
      s9 = new ImageIcon("cards/9s.jpg");
      h10 = new ImageIcon("cards/10h.jpg");
      d10 = new ImageIcon("cards/10d.jpg");
      c10 = new ImageIcon("cards/10c.jpg");
      s10 = new ImageIcon("cards/10s.jpg");
      jackh = new ImageIcon("cards/jackh.jpg");
      jackd = new ImageIcon("cards/jackd.jpg");
      jackc = new ImageIcon("cards/jackc.jpg");
      jacks = new ImageIcon("cards/jacks.jpg");
      queenh = new ImageIcon("cards/queenh.jpg");
      queend = new ImageIcon("cards/queend.jpg");
      queenc = new ImageIcon("cards/queenc.jpg");
      queens = new ImageIcon("cards/queens.jpg");
      kingh = new ImageIcon("cards/kingh.jpg");
      kingd = new ImageIcon("cards/kingd.jpg");
      kingc = new ImageIcon("cards/kingc.jpg");
      kings = new ImageIcon("cards/kings.jpg");
      
      
      
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
         
         try
         {
         //set the card images for player 1
         //hearts
         if(game.getP1().getSuit() == 1)
         {
            switch(game.getP1().getRank())
            {
               case 1:
                  cardOne.setIcon(aceh);
                  break;
               case 2:
                  cardOne.setIcon(h2);
                  break;
               case 3:
                  cardOne.setIcon(h3);
                  break;
               case 4:
                  cardOne.setIcon(h4);
                  break;
               case 5:
                  cardOne.setIcon(h5);
                  break;
               case 6:
                  cardOne.setIcon(h6);
                  break;
               case 7:
                  cardOne.setIcon(h7);
                  break;
               case 8:
                  cardOne.setIcon(h8);
                  break;
               case 9:
                  cardOne.setIcon(h9);
                  break;
               case 10:
                  cardOne.setIcon(h10);
                  break;
               case 11:
                  cardOne.setIcon(jackh);
                  break;
               case 12:
                  cardOne.setIcon(queenh);
                  break;
               case 13:
                  cardOne.setIcon(kingh);
                  break;
                  
            }
         }
         //diamonds
         else if(game.getP1().getSuit() == 2)
         {
            switch(game.getP1().getRank())
            {
               case 1:
                  cardOne.setIcon(aced);
                  break;
               case 2:
                  cardOne.setIcon(d2);
                  break;
               case 3:
                  cardOne.setIcon(d3);
                  break;
               case 4:
                  cardOne.setIcon(d4);
                  break;
               case 5:
                  cardOne.setIcon(d5);
                  break;
               case 6:
                  cardOne.setIcon(d6);
                  break;
               case 7:
                  cardOne.setIcon(d7);
                  break;
               case 8:
                  cardOne.setIcon(d8);
                  break;
               case 9:
                  cardOne.setIcon(d9);
                  break;
               case 10:
                  cardOne.setIcon(d10);
                  break;
               case 11:
                  cardOne.setIcon(jackd);
                  break;
               case 12:
                  cardOne.setIcon(queend);
                  break;
               case 13:
                  cardOne.setIcon(kingd);
                  break;
                  
            }
         }
         //clubs
         else if(game.getP1().getSuit() == 3)
         {
            switch(game.getP1().getRank())
            {
               case 1:
                  cardOne.setIcon(acec);
                  break;
               case 2:
                  cardOne.setIcon(c2);
                  break;
               case 3:
                  cardOne.setIcon(c3);
                  break;
               case 4:
                  cardOne.setIcon(c4);
                  break;
               case 5:
                  cardOne.setIcon(c5);
                  break;
               case 6:
                  cardOne.setIcon(c6);
                  break;
               case 7:
                  cardOne.setIcon(c7);
                  break;
               case 8:
                  cardOne.setIcon(c8);
                  break;
               case 9:
                  cardOne.setIcon(c9);
                  break;
               case 10:
                  cardOne.setIcon(c10);
                  break;
               case 11:
                  cardOne.setIcon(jackc);
                  break;
               case 12:
                  cardOne.setIcon(queenc);
                  break;
               case 13:
                  cardOne.setIcon(kingc);
                  break;
                  
            }
         }
         //spades
         else if(game.getP1().getSuit() == 4)
         {
            switch(game.getP1().getRank())
            {
               case 1:
                  cardOne.setIcon(aces);
                  break;
               case 2:
                  cardOne.setIcon(s2);
                  break;
               case 3:
                  cardOne.setIcon(s3);
                  break;
               case 4:
                  cardOne.setIcon(s4);
                  break;
               case 5:
                  cardOne.setIcon(s5);
                  break;
               case 6:
                  cardOne.setIcon(s6);
                  break;
               case 7:
                  cardOne.setIcon(s7);
                  break;
               case 8:
                  cardOne.setIcon(s8);
                  break;
               case 9:
                  cardOne.setIcon(s9);
                  break;
               case 10:
                  cardOne.setIcon(s10);
                  break;
               case 11:
                  cardOne.setIcon(jacks);
                  break;
               case 12:
                  cardOne.setIcon(queens);
                  break;
               case 13:
                  cardOne.setIcon(kings);
                  break;
                  
            }
         }
         }
         //if no cards in hand
         catch(NullPointerException nullPoint)
         {
            cardOne.setText("Out of cards");
         }
         
         //set the card images for player 2
         //hearts
         try
         {
         if(game.getP2().getSuit() == 1)
         {
            switch(game.getP2().getRank())
            {
               case 1:
                  cardTwo.setIcon(aceh);
                  break;
               case 2:
                  cardTwo.setIcon(h2);
                  break;
               case 3:
                  cardTwo.setIcon(h3);
                  break;
               case 4:
                  cardTwo.setIcon(h4);
                  break;
               case 5:
                  cardTwo.setIcon(h5);
                  break;
               case 6:
                  cardTwo.setIcon(h6);
                  break;
               case 7:
                  cardTwo.setIcon(h7);
                  break;
               case 8:
                  cardTwo.setIcon(h8);
                  break;
               case 9:
                  cardTwo.setIcon(h9);
                  break;
               case 10:
                  cardTwo.setIcon(h10);
                  break;
               case 11:
                  cardTwo.setIcon(jackh);
                  break;
               case 12:
                  cardTwo.setIcon(queenh);
                  break;
               case 13:
                  cardTwo.setIcon(kingh);
                  break;
                  
            }
         }
         //diamonds
         else if(game.getP2().getSuit() == 2)
         {
            switch(game.getP2().getRank())
            {
               case 1:
                  cardTwo.setIcon(aceh);
                  break;
               case 2:
                  cardTwo.setIcon(h2);
                  break;
               case 3:
                  cardTwo.setIcon(h3);
                  break;
               case 4:
                  cardTwo.setIcon(h4);
                  break;
               case 5:
                  cardTwo.setIcon(h5);
                  break;
               case 6:
                  cardTwo.setIcon(h6);
                  break;
               case 7:
                  cardTwo.setIcon(h7);
                  break;
               case 8:
                  cardTwo.setIcon(h8);
                  break;
               case 9:
                  cardTwo.setIcon(h9);
                  break;
               case 10:
                  cardTwo.setIcon(h10);
                  break;
               case 11:
                  cardTwo.setIcon(jackh);
                  break;
               case 12:
                  cardTwo.setIcon(queenh);
                  break;
               case 13:
                  cardTwo.setIcon(kingh);
                  break;
                  
            }
         }
         //clubs
         else if(game.getP2().getSuit() == 3)
         {
            switch(game.getP2().getRank())
            {
               case 1:
                  cardTwo.setIcon(acec);
                  break;
               case 2:
                  cardTwo.setIcon(c2);
                  break;
               case 3:
                  cardTwo.setIcon(c3);
                  break;
               case 4:
                  cardTwo.setIcon(c4);
                  break;
               case 5:
                  cardTwo.setIcon(c5);
                  break;
               case 6:
                  cardTwo.setIcon(c6);
                  break;
               case 7:
                  cardTwo.setIcon(c7);
                  break;
               case 8:
                  cardTwo.setIcon(c8);
                  break;
               case 9:
                  cardTwo.setIcon(c9);
                  break;
               case 10:
                  cardTwo.setIcon(c10);
                  break;
               case 11:
                  cardTwo.setIcon(jackc);
                  break;
               case 12:
                  cardTwo.setIcon(queenc);
                  break;
               case 13:
                  cardTwo.setIcon(kingc);
                  break;
                  
            }

         }
         //spades
         else if(game.getP2().getSuit() == 4)
         {
            switch(game.getP2().getRank())
            {
               case 1:
                  cardTwo.setIcon(aces);
                  break;
               case 2:
                  cardTwo.setIcon(s2);
                  break;
               case 3:
                  cardTwo.setIcon(s3);
                  break;
               case 4:
                  cardTwo.setIcon(s4);
                  break;
               case 5:
                  cardTwo.setIcon(s5);
                  break;
               case 6:
                  cardTwo.setIcon(s6);
                  break;
               case 7:
                  cardTwo.setIcon(s7);
                  break;
               case 8:
                  cardTwo.setIcon(s8);
                  break;
               case 9:
                  cardTwo.setIcon(s9);
                  break;
               case 10:
                  cardTwo.setIcon(s10);
                  break;
               case 11:
                  cardTwo.setIcon(jacks);
                  break;
               case 12:
                  cardTwo.setIcon(queens);
                  break;
               case 13:
                  cardTwo.setIcon(kings);
                  break;
                  
            }

         }
         }
         //if no cards
         catch (NullPointerException nullPoint2)
         {
            cardTwo.setText("Out of cards");
         }
         
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
      frame.setSize(650,850);
      frame.setResizable(false);
      frame.validate();
      frame.setVisible(true);
   }
}