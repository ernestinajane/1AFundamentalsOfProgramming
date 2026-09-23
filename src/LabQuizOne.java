import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class LabQuizOne {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter your Birth Year: ");
            String birthInput = dataIn.readLine();
            int birthYear = Integer.parseInt(birthInput);
            System.out.println("You were born last " + birthYear + ".");
            System.out.println("You are now " + (2026 - birthYear) + " yrs old.");
        } catch (IOException e) {
            System.err.println("Error reading input stream.");
        } catch (NumberFormatException e) {
            // This happens if the user types "twenty" instead of "20"
            System.err.println("Invalid number format! Please enter digits only.");
        }
    }
}