import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.util.Scanner;
import java.io.IOException;
import java.io.OutputStream;
import static java.lang.System.out;

public class Order extends JFrame implements ActionListener
{
   

    private static JTextArea text1;
  
   
   Order()
   {
      super("Welcome to Jinky Diners");
      super.setLayout(null);
      super.setResizable(false);
      super.setSize(1200,800);
      super.setDefaultCloseOperation(EXIT_ON_CLOSE);
     Container c  = getContentPane();
     c.setBackground(Color.BLACK);
       
       area.setSize(500,800);
       area.setEnabled(false);
       
       storeName.setFont(new Font("Serif",Font.BOLD,30));
       storeName.setForeground(Color.GRAY);
       storeName.setBounds(100,0,600,100);
       
       submit.setBounds(589,649,120,30);
       submit.setBackground(Color.red);
       
       help.setBounds(339,649,120,30);
       help.setBackground(Color.red);
       
       reset.setBounds(89,649,120,30);
       reset.setBackground(Color.red);
       
       beef.setBounds(50,120,200,100);
       pork.setBounds(300,120,200,100);
       chicken.setBounds(550,120,200,100);
       
       cancelBeef.setBounds(250,120,50,50);
       cancelPork.setBounds(500,120,50,50);
       cancelChicken.setBounds(750,120,50,50);
       
       icedtea.setBounds(50,300,200,100);
       pineapplejuice.setBounds(300,300,200,100);
       milkshake.setBounds(550,300,200,100);
       
       cancelIcedtea.setBounds(250,300,50,50);
       cancelPineapplejuice.setBounds(500,300,50,50);
       cancelMilkshake.setBounds(750,300,50,50);
       
       extrarice.setBounds(50,480,200,100);
       egg.setBounds(300,480,200,100);
       brownies.setBounds(550,480,200,100);
       
       cancelExtrarice.setBounds(250,480,50,50);
       cancelEgg.setBounds(500,480,50,50);
       cancelBrownies.setBounds(750,480,50,50);
       area.setBounds(800,0,500,1000);
       
       submit.addActionListener(this);
       icedtea.addActionListener(this);
       beef.addActionListener(this);
       pork.addActionListener(this);
       chicken.addActionListener(this);
       pineapplejuice.addActionListener(this);
       milkshake.addActionListener(this);
       extrarice.addActionListener(this);
       egg.addActionListener(this);
       brownies.addActionListener(this);
       cancelBeef.addActionListener(this);
       cancelBrownies.addActionListener(this);
       cancelChicken.addActionListener(this);
       cancelEgg.addActionListener(this);
       cancelExtrarice.addActionListener(this);
       cancelIcedtea.addActionListener(this);
       cancelMilkshake.addActionListener(this);
       cancelPineapplejuice.addActionListener(this);
       cancelPork.addActionListener(this);
       reset.addActionListener(this);
       help.addActionListener(this);
       
       
       add(area);
       add(storeName);
       add(submit);
       add(help);
       add(reset);
       add(beef);
       add(pork);
       add(chicken);
       add(icedtea);
       add(pineapplejuice);
       add(milkshake);
       add(extrarice);
       add(egg);
       add(brownies);
       add(cancelBeef);
       add(cancelPork);
       add(cancelChicken);
       add(cancelIcedtea);
       add(cancelMilkshake);
       add(cancelPineapplejuice);
       add(cancelExtrarice);
       add(cancelEgg);
       add(cancelBrownies);
      System.setOut(out);
     System.setErr(out);
       System.out.println("Welcome table 4");
       
       
   }
   
     @Override
   public void actionPerformed(ActionEvent e)
   {
      // System.setOut(out);
      //System.setErr(out);
      
       
     if(e.getSource()==icedtea)
     {   
         prices.add(100);
         order.add("Iced tea");
         JOptionPane.showMessageDialog(this, "You ordered Ice tea ", "Dialog",JOptionPane.PLAIN_MESSAGE);
         System.out.println("Iced tea..................................P100");
       
     }
     else if(e.getSource()==beef)
     {
         prices.add(200);
         order.add("Beef");
         JOptionPane.showMessageDialog(this,"You ordered beef","Dialog",JOptionPane.PLAIN_MESSAGE);
         System.out.println("Beef..................................P200");
         
     }
     else if(e.getSource()==pork)
     {   prices.add(300);
         order.add("Pork");
         JOptionPane.showMessageDialog(this,"You ordered Pork","Dialog",JOptionPane.PLAIN_MESSAGE);
         System.out.println("Pork..................................P300");
     }
     else if(e.getSource() == chicken)
     {   
         prices.add(150);
         order.add("Chicken");
         JOptionPane.showMessageDialog(this,"You ordered Chicken","Dialog",JOptionPane.PLAIN_MESSAGE);
         System.out.println("Chicken..................................P150");
     }
     else if(e.getSource() == pineapplejuice)
     {
         prices.add(80);
         order.add("Pineapple Juice");
         JOptionPane.showMessageDialog(this,"You ordered Pineapple Juice","Dialog",JOptionPane.PLAIN_MESSAGE);
         System.out.println("Pineapple Juice..................................P80");
     }
     else if(e.getSource() == milkshake)
     {
         prices.add(100);
         order.add("Milkshake");
         JOptionPane.showMessageDialog(this,"You ordered Milkshake","Dialog",JOptionPane.PLAIN_MESSAGE);
         System.out.println("Milkshake..................................P100");
     }
     else if(e.getSource() == extrarice)
     {
         prices.add(10);
         order.add("Extra rice");
         JOptionPane.showMessageDialog(this,"You ordered Extra rice","Dialog",JOptionPane.PLAIN_MESSAGE);
         System.out.println("Extra rice..................................P10");
     }
     else if(e.getSource() == egg)
     {
         prices.add(6);
         order.add("Egg");
         JOptionPane.showMessageDialog(this,"You ordered eggs","Dialog",JOptionPane.PLAIN_MESSAGE);
         System.out.println("Eggs..................................P6");
     }
     else if(e.getSource() == brownies)
     {
         prices.add(50);
         order.add("Brownies");
         JOptionPane.showMessageDialog(this,"You ordered brownies","Dialog",JOptionPane.PLAIN_MESSAGE);
       
         System.out.println("Brownies..................................P50");
        
     }
     
     
     
     
     if(e.getSource()==submit)
     {
         if(order.isEmpty())
         {
             JOptionPane.showMessageDialog(this,"Please place an order first","Dialog",JOptionPane.WARNING_MESSAGE);
         }
         else
         {
             int total=0;
             String details = "";
             for (int i=0; i<order.size();i++)
             {
                 details +=order.get(i) + "\n";
             }
            for (Integer i : prices)
            {
                total +=i;
            }
             int result = JOptionPane.showConfirmDialog(this,"These are the orders you requested: \n"+details+"\n"+total,"Dialog",JOptionPane.YES_NO_OPTION);
             System.out.println("_______________________________________________");
             System.out.println("Total................................."+total);
             if(result == JOptionPane.YES_OPTION)
             {
                 JOptionPane.showMessageDialog(this,"Thank you for ordering please wait for 20 minutes to be serve");
                 area.setText("Welcome table 4 \n");
                 order.clear();
                 prices.clear();
             }else if(result == JOptionPane.NO_OPTION)
             {
                area.setText("Welcome table 4 \n");
                order.clear();
                prices.clear();
             }
         }
         
     }
     
     if(e.getSource() == reset)
     {
        
         if(order.isEmpty())
         {
             JOptionPane.showMessageDialog(this,"The order is empty",null,JOptionPane.WARNING_MESSAGE);
         }
         else
         {
             
            int result = JOptionPane.showConfirmDialog(this,"Want to reset the order?",null,JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.YES_OPTION)
             {
                 area.setText("Welcome Table 4 \n");
                order.clear();
                prices.clear();
                
               
             }
        
         }
        
     }
     
     if(e.getSource() == help)
     {
         JOptionPane.showMessageDialog(this,"Please wait, a waiter will come");
     }
     
     
     if(e.getSource()==cancelBeef)
     {
         if(order.contains("Beef")&& prices.contains(200))
         {
            order.remove("Beef");
            prices.remove(new Integer(200));
             System.out.println("Beef order cancelled");
            JOptionPane.showMessageDialog(this,"Order has been cancelled");  
         }else
         {
            
            JOptionPane.showMessageDialog(this,"There is nothing to cancel","Dialog",JOptionPane.WARNING_MESSAGE);
         }
         
        
     }
     else if(e.getSource()==cancelBrownies)
     {
         if(order.contains("Brownies")&&prices.contains(50))
         {
             order.remove("Brownies");
             prices.remove(new Integer(50));
              System.out.println("Brownies order cancelled");
             JOptionPane.showMessageDialog(this,"Order has been cancelled");
         }else
         {
             
             JOptionPane.showMessageDialog(this,"There is nothing to cancel","Dialog",JOptionPane.WARNING_MESSAGE);
         }
     }
     else if(e.getSource()==cancelChicken)
     {
         if(order.contains("Chicken")&&prices.contains(150))
         {
            order.remove("Chicken");
            prices.remove(new Integer(150));
             System.out.println("Chicken order cancelled");
             JOptionPane.showMessageDialog(this,"Order has been cancelled");
         }
         else
         {
             
              JOptionPane.showMessageDialog(this,"There is nothing to cancel","Dialog",JOptionPane.WARNING_MESSAGE);
         }
     }
     else if(e.getSource()==cancelEgg )
     {
         if(order.contains("Egg") && prices.contains(6))
         {
             order.remove("Egg");
             prices.remove(new Integer(6));
              System.out.println("Egg order cancelled");
             JOptionPane.showMessageDialog(this,"Order has been cancelled");
         }
         else
         {
            
             JOptionPane.showMessageDialog(this,"There is nothing to cancel","Dialog",JOptionPane.WARNING_MESSAGE);
         }
         
     }
     else if(e.getSource()==cancelExtrarice)
     {
         if(order.contains("Extra rice") && prices.contains(10))
         {
              order.remove("Extra rice");
              prices.remove(new Integer(10));
               System.out.println("Extra rice order cancelled");
              JOptionPane.showMessageDialog(this,"Order has been cancelled");
         }
         else
         {
              
              
              JOptionPane.showMessageDialog(this,"There is nothing to cancle","Dialog",JOptionPane.WARNING_MESSAGE);
         }
        
     }
     else if(e.getSource()==cancelIcedtea)
     {
         if(order.contains("Iced tea") && prices.contains(100))
         {
              
              order.remove("Iced tea");
              prices.remove(new Integer(100));
               System.out.println("Iced tea order cancelled");
              JOptionPane.showMessageDialog(this,"Order has been cancelled");
         }    
         else
         {
              JOptionPane.showMessageDialog(this,"There is nothing to cancel","Dialog",JOptionPane.WARNING_MESSAGE);
         }
        
     }
     else if(e.getSource()==cancelMilkshake)
     {
         if(order.contains("Milkshake") && prices.contains(100))
         {
           
            order.remove("Milkshake");
            prices.remove(new Integer(100));
             System.out.println("Milkshake order cancelled");
            JOptionPane.showMessageDialog(this,"Order has been cancelled");
         }
         else
         {
            JOptionPane.showMessageDialog(this,"There is nothing to cancel","Dialog",JOptionPane.WARNING_MESSAGE);
         }
         
     }
     else if(e.getSource()==cancelPineapplejuice)
     {
         if(order.contains("Pineapple Juice") && prices.contains(80))
         {
             
             order.remove("Pineapple Juice");
             prices.remove(new Integer(80));
              System.out.println("Pineapple juice order cancelled");
             JOptionPane.showMessageDialog(this,"Order has been cancelled");
         }
         else
         {
             JOptionPane.showMessageDialog(this,"There is nothing to cancel","Dialog",JOptionPane.WARNING_MESSAGE);
         }
         
     }
     else if(e.getSource()==cancelPork)
     {
         if(order.contains("Pork") && prices.contains(300))
         {
             
             order.remove("Pork");
             prices.remove(new Integer(300));
              System.out.println("Pork order cancelled");
            JOptionPane.showMessageDialog(this,"Order has been cancelled"); 
         }
         else
         {
            JOptionPane.showMessageDialog(this,"There is nothing to cancel","Dialog",JOptionPane.WARNING_MESSAGE);
         }
         
     }
     
   }
   



   public static void main(String args[])
   {
       
      
       Order n =  new Order();
        text1 = new JTextArea();
        
        text1.setVisible(true);
        
       
       n.setVisible(true);
   }
   
      ArrayList<Integer> prices = new ArrayList<>();  
      ArrayList<String> order = new ArrayList<>();
      JButton reset = new JButton("Reset");
      JButton help = new JButton("Help");
      JButton submit = new JButton("Order");
      JLabel storeName  = new JLabel("Welcome to Jinky Diners");
      JButton beef = new JButton("Beef");
      JButton pork = new JButton("Pork");
      JButton chicken = new JButton("Chicken");
      JButton icedtea = new JButton("Iced Tea");
      JButton pineapplejuice = new JButton("Pineapple Juice");
      JButton milkshake = new JButton("Milkshake");
      JButton extrarice = new JButton("Extra Rice");
      JButton egg = new JButton("Eggs");
      JButton brownies = new JButton("brownies");
      JButton cancelBeef = new JButton("X");
      JButton cancelPork = new JButton("X");
      JButton cancelChicken = new JButton("X");
      JButton cancelIcedtea = new JButton("X");
      JButton cancelPineapplejuice = new JButton("X");
      JButton cancelMilkshake = new JButton("X");
      JButton cancelExtrarice = new JButton("X");
      JButton cancelEgg = new JButton("X");
      JButton cancelBrownies = new JButton("X");
      JTextArea area = new JTextArea();
      PrintStream out = new PrintStream( new TextAreaOutputStream(area));
      
}
