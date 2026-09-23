import javax.swing.JOptionPane;

public class LabQuizTwo {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Welcome to Adobo Cooking Show!");

        String name = JOptionPane.showInputDialog("Enter your name:");

        int pork;
        pork = Integer.parseInt(JOptionPane.showInputDialog("How many kilo of pork will you cook?"));
        // Standard ratio: 1/2 cup soy sauce and 1/3 cup vinegar per 1 kg of pork
        double soySauce = 0.5 * pork;
        double vinegar = 0.3 * pork;

        String msg = name + ",\nThe ratio of soy sauce for " + pork + " kg is = " + soySauce + " cup(s)\n"
                + "The ratio of vinegar for " + pork + " kg is = " + vinegar + " cup(s)";

        JOptionPane.showMessageDialog(null, msg);

    }
}