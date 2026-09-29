import javax.swing.JOptionPane;
public class LabQuizThree {
    public static void main (String[] args){

      JOptionPane.showMessageDialog(null, "Welcome to XYZ's Pizza Parlor!");
    double grossBill = Double.parseDouble(JOptionPane.showInputDialog("How much is your gross bill?:"));
    double amount = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the amount: "));
    double serviceCharge = grossBill * 0.12;
    double salesTax = grossBill * 0.07;
    double netBill = grossBill + serviceCharge + salesTax;
    double change = amount - netBill;

    JOptionPane.showMessageDialog(null, "Your grossbill is: " + grossBill+ "\nService Charge: " + serviceCharge + "\nSales Tax: " + salesTax + "\nNet Bill: " + netBill + "\nChange: " + change);
    }
}
