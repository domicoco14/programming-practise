

import javax.swing.JOptionPane;

public class SumAverageGUI { // a program to get the sum and avaraage of 4 numbers
    
    public static void main(String [] args) {
    

    int a = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number: "));
    int b = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number: "));
    int c = Integer.parseInt(JOptionPane.showInputDialog("Enter the third number: "));
    int d = Integer.parseInt(JOptionPane.showInputDialog("Enter the fourth number: "));

    int Sum = a + b + c + d;
    int Average = Sum / 4;

    String Output = "The sum of the numbers is: " + Sum + "and the average is: " + Average;

    String title = "A program to get the sum and average of 4 numbers";

    JOptionPane.showMessageDialog(null,  Output, title, JOptionPane.PLAIN_MESSAGE);
    }
}
