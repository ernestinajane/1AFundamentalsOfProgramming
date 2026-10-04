import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ScholarshipBufferedReader {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter NSAT score: ");
            double nsat = Double.parseDouble(br.readLine());
            System.out.print("Enter parents' monthly salary: ");
            double salary = Double.parseDouble(br.readLine());
            System.out.print("Enter entrance exam score: ");
            double exam = Double.parseDouble(br.readLine());

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
        } catch (IOException e) {
            System.out.println("Input error: " + e.getMessage());
        }
    }
}
