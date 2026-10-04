import javax.swing.JOptionPane;

public class JediJOption {
    public static void main(String[] args) {
        String heightInput = JOptionPane.showInputDialog("Enter height (cm):");
        double height = Double.parseDouble(heightInput.trim());

        String ageInput = JOptionPane.showInputDialog("Enter age:");
        int age = Integer.parseInt(ageInput.trim());

        String citizen = JOptionPane.showInputDialog(
                "Enter citizenship code (C for citizen of Endor, N for non-citizen):").trim().toUpperCase();

        String recommendee = JOptionPane.showInputDialog(
                "Enter recommendee code (R for recommendee, N for non-recommendee):").trim().toUpperCase();

        boolean accepted = false;

        if (recommendee.equals("R")) {
            accepted = true;
        } else if (height >= 200) {
            if (age >= 21) {
                if (age <= 25) {
                    if (citizen.equals("C")) {
                        accepted = true;
                    }
                }
            }
        }

        if (accepted) {
            JOptionPane.showMessageDialog(null, "The applicant is ACCEPTED.");
        } else {
            JOptionPane.showMessageDialog(null, "The applicant is REJECTED.");
        }
    }
}
