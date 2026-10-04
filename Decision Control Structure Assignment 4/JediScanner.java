import java.util.Scanner;

public class JediScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter height (cm): ");
        double height = input.nextDouble();

        System.out.print("Enter age: ");
        int age = input.nextInt();

        System.out.print("Enter citizenship code (C for citizen of Endor, N for non-citizen): ");
        String citizen = input.next().toUpperCase();

        System.out.print("Enter recommendee code (R for recommendee, N for non-recommendee): ");
        String recommendee = input.next().toUpperCase();

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

        input.close();
    }
}
