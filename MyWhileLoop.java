package Activity;

import javax.swing.JOptionPane;
public class MyWhileLoop {
    public static void main ( String [] args){
        String numberStr;
        double number,total=0;
        
        int i =0;
        final int N = 5;
        while (i<N)
        {
            numberStr=JOptionPane.showInputDialog(" Enter a number");
            number =Double.parseDouble(numberStr);
            total +=number;
            i++;
           }     
    
   JOptionPane.showMessageDialog(null,"The total is " + total);
   String numberStr1;
   double number1,total1=0;
   final int SENTINEL = -999;
   
   
   numberStr1 = JOptionPane.showInputDialog("Enter a number to add(-999 to quit):");
   number1 = Double.parseDouble(numberStr1);
   while (number1 != SENTINEL)
   {
       total1+=number1;
       numberStr1 = JOptionPane.showInputDialog("Enter a number to add (-999 to quit):");
       number1 = Double.parseDouble(numberStr1);
   }   
   JOptionPane.showMessageDialog(null,"The total is " + total1);
    
   System.exit(0);

        }  
}
