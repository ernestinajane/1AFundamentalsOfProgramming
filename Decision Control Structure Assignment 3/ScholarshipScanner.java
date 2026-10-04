import java.util.Scanner;
public class ScholarshipScanner {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter NSAT Score:");
        double nsat = input.nextDouble();
        System.out.print("Enter parents' monthly salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter entrance exam score: ");
        double exam =input.nextDouble();

        double average = (nsat + exam) / 2;
        String result;

        if (salary > 10000) {
            result = "Rejected";
        } else if (nsat < 90) {
            result = "Rejected";
        } else if (exam < 85) {
            result = "Rejected";
        } else if (salary <= 3500 && average >= 91) {
            result = "Accepted";
        } else {
            result = "For further study";
        }

        System.out.println("Result: " + result);
    }
}

