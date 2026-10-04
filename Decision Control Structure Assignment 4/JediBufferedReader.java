import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JediBufferedReader {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter height (cm): ");
            double height = Double.parseDouble(dataIn.readLine().trim());

            System.out.print("Enter age: ");
            int age = Integer.parseInt(dataIn.readLine().trim());

            System.out.print("Enter citizenship code (C for citizen of Endor, N for non-citizen): ");
            String citizen = dataIn.readLine().trim().toUpperCase();

            System.out.print("Enter recommendee code (R for recommendee, N for non-recommendee): ");
            String recommendee = dataIn.readLine().trim().toUpperCase();

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
                System.out.println("The applicant is ACCEPTED.");
            } else {
                System.out.println("The applicant is REJECTED.");
            }
        } catch (IOException e) {
            System.out.println("Error reading input.");
        }
    }
}