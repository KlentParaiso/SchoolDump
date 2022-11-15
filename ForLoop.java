
package Activity;
import javax.swing.JOptionPane;
public class ForLoop {
    public static void main (String []args){
        String numberStr;
        double number, total = 0;
        final int N= 5;
        for (int i=0; i< N;i++)
            
        {
            numberStr = JOptionPane.showInputDialog("Enter a number: ");
            number = Double.parseDouble(numberStr);
            total += number;
        } JOptionPane.showMessageDialog(null,"The total is : " + total);
    }
}
