import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class Order extends JFrame implements ActionListener
{
   
   Order()
   {
      super("Welcome to Jinky Diners");
      super.setLayout(null);
      super.setResizable(false);
      super.setSize(800,800);
      super.setDefaultCloseOperation(EXIT_ON_CLOSE);
     Container c  = getContentPane();
     c.setBackground(Color.BLACK);
       
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
       
   }
   
     @Override
   public void actionPerformed(ActionEvent e)
   {
       
     
     if(e.getSource()==icedtea)
     {
         
         JOptionPane.showMessageDialog(this, "You ordered Ice tea ", "Dialog",JOptionPane.PLAIN_MESSAGE);
        
         System.out.println("Ice tea"+order.add("Iced tea"));
       
     }
     else if(e.getSource()==beef)
     {
         
         JOptionPane.showMessageDialog(this,"You ordered beef","Dialog",JOptionPane.PLAIN_MESSAGE);
         System.out.println("Beef"+order.add("Beef"));
     }
     else if(e.getSource()==pork)
     {  
         JOptionPane.showMessageDialog(this,"You ordered Pork","Dialog",JOptionPane.PLAIN_MESSAGE);
        order.add("Pork");
     }
     else if(e.getSource() == chicken)
     {
         JOptionPane.showMessageDialog(this,"You ordered Chicken","Dialog",JOptionPane.PLAIN_MESSAGE);
         System.out.println("Chicken"+order.add("Chicken"));
     }
     else if(e.getSource() == pineapplejuice)
     {
         JOptionPane.showMessageDialog(this,"You ordered Pineapple Juice","Dialog",JOptionPane.PLAIN_MESSAGE);
         System.out.println("Pineapple Juice"+order.add("Pineapple Juice"));
     }
     else if(e.getSource() == milkshake)
     {
         JOptionPane.showMessageDialog(this,"You ordered Milkshake","Dialog",JOptionPane.PLAIN_MESSAGE);
         System.out.println("Milkshake"+order.add("Milkshake"));
     }
     else if(e.getSource() == extrarice)
     {
         JOptionPane.showMessageDialog(this,"You ordered Extra rice","Dialog",JOptionPane.PLAIN_MESSAGE);
         System.out.println("Extra rice"+order.add("Extra rice"));
     }
     else if(e.getSource() == egg)
     {
         JOptionPane.showMessageDialog(this,"You ordered eggs","Dialog",JOptionPane.PLAIN_MESSAGE);
         System.out.println("Eggs"+order.add("Egg"));
     }
     else if(e.getSource() == brownies)
     {
         JOptionPane.showMessageDialog(this,"You ordered brownies","Dialog",JOptionPane.PLAIN_MESSAGE);
         System.out.println("Brownies"+order.add("Brownies"));
        
         
         
     }
     
     
     
     if(e.getSource()==submit)
     {
         if(order.isEmpty())
         {
             JOptionPane.showMessageDialog(this,"Please place an order first","Dialog",JOptionPane.WARNING_MESSAGE);
         }
         else
         {
             String details = "";
             for (int i=0; i<order.size();i++)
             {
                 details +=order.get(i) + "\n";
             }
             int result = JOptionPane.showConfirmDialog(this,"These are the orders you requested: \n"+details,"Dialog",JOptionPane.YES_NO_OPTION);
             if(result == JOptionPane.YES_OPTION)
             {
                 JOptionPane.showMessageDialog(this,"Thank you for ordering");
                 order.clear();
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
                order.clear();
             }
        
         }
        
     }
     
     
     if(e.getSource()==cancelBeef)
     {
         if(order.contains("Beef"))
         {
            System.out.println(order.remove("Beef"));
            JOptionPane.showMessageDialog(this,"Order has been cancelled");  
         }else
         {
            
            JOptionPane.showMessageDialog(this,"There is nothing to cancel","Dialog",JOptionPane.WARNING_MESSAGE);
         }
     }
     else if(e.getSource()==cancelBrownies)
     {
         if(order.contains("Brownies"))
         {
             System.out.println(order.remove("Brownies"));
             JOptionPane.showMessageDialog(this,"Order has been cancelled");
         }else
         {
             
             JOptionPane.showMessageDialog(this,"There is nothing to cancel","Dialog",JOptionPane.WARNING_MESSAGE);
         }
     }
     else if(e.getSource()==cancelChicken)
     {
         if(order.contains("Chicken"))
         {
             System.out.println(order.remove("Chicken"));
             JOptionPane.showMessageDialog(this,"Order has been cancelled");
         }
         else
         {
             
              JOptionPane.showMessageDialog(this,"There is nothing to cancel","Dialog",JOptionPane.WARNING_MESSAGE);
         }
     }
     else if(e.getSource()==cancelEgg)
     {
         if(order.contains("Egg"))
         {
             System.out.println(order.remove("Egg"));
             JOptionPane.showMessageDialog(this,"Order has been cancelled");
         }
         else
         {
            
             JOptionPane.showMessageDialog(this,"There is nothing to cancel","Dialog",JOptionPane.WARNING_MESSAGE);
         }
         
     }
     else if(e.getSource()==cancelExtrarice)
     {
         if(order.contains("Extra rice"))
         {
              System.out.println(order.remove("Extra rice"));
              JOptionPane.showMessageDialog(this,"Order has been cancelled");
         }
         else
         {
              
              
              JOptionPane.showMessageDialog(this,"There is nothing to cancle","Dialog",JOptionPane.WARNING_MESSAGE);
         }
        
     }
     else if(e.getSource()==cancelIcedtea)
     {
         if(order.contains("Iced tea"))
         {
              
              System.out.println(order.remove("Iced tea"));
              JOptionPane.showMessageDialog(this,"Order has been cancelled");
         }    
         else
         {
              JOptionPane.showMessageDialog(this,"There is nothing to cancel","Dialog",JOptionPane.WARNING_MESSAGE);
         }
        
     }
     else if(e.getSource()==cancelMilkshake)
     {
         if(order.contains("Milkshake"))
         {
           
            System.out.println(order.remove("Milkshake"));
            JOptionPane.showMessageDialog(this,"Order has been cancelled");
         }
         else
         {
            JOptionPane.showMessageDialog(this,"There is nothing to cancel","Dialog",JOptionPane.WARNING_MESSAGE);
         }
         
     }
     else if(e.getSource()==cancelPineapplejuice)
     {
         if(order.contains("Pineapple Juice"))
         {
             
             System.out.println(order.remove("Pineapple Juice"));
             JOptionPane.showMessageDialog(this,"Order has been cancelled");
         }
         else
         {
             JOptionPane.showMessageDialog(this,"There is nothing to cancel","Dialog",JOptionPane.WARNING_MESSAGE);
         }
         
     }
     else if(e.getSource()==cancelPork)
     {
         if(order.contains("Pork"))
         {
             
             System.out.println(order.remove("Pork"));
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
       
       n.setVisible(true);
   }
   
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
}
