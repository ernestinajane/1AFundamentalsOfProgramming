import java.util.Scanner;

public class PayrollScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter hourly pay rate: ");
        double rate = input.nextDouble();

        System.out.print("Enter hours worked: ");
        double hours = input.nextDouble();

        double gross = hours * rate;
        double percent;

        if (gross <= 2000) {
            percent = 0.10;
        } else if (gross <= 4000) {
            percent = 0.12;
        } else if (gross <= 10000) {
            percent = 0.15;
        } else {
            percent = 0.20;
        }

        double tax = gross * percent;
        double net = gross - tax;

        System.out.printf("Gross Pay: Php %.2f%n", gross);
        System.out.printf("Withholding Tax (%.0f%%): Php %.2f%n", percent * 100, tax);
        System.out.printf("Net Pay: Php %.2f%n", net);

        input.close();
    }
}