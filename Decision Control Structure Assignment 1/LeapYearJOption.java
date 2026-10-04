import javax.swing.JOptionPane;
public class LeapYearJOption {
    public static void main (String[] args){

        String input = JOptionPane.showInputDialog("Enter a year:");
        int year = Integer.parseInt(input.trim());

        if (year % 400 == 0) {
            JOptionPane.showMessageDialog(null, year + " is a leap year.");
                } else if (year % 100 == 0) {
                    JOptionPane.showMessageDialog(null, year + " is not a leap year.");
                } else if (year % 4 == 0) {
                    JOptionPane.showMessageDialog(null, year + " is a leap year.");
                } else {
                    JOptionPane.showMessageDialog(null, year + " is not a leap year.");
                }
            }
        }


