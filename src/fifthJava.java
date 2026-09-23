import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class fifthJava {
    public static void main (String[] args){

    BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
    try {
        // Read an integer
        System.out.print("Enter your age: ");
        String ageInput = dataIn.readLine(); // Read as string
        int age = Integer.parseInt(ageInput); // Convert to int
        // Read a double
        System.out.print("Enter your exact height in meters: ");
        String heightInput = dataIn.readLine(); //Read as line
        double height = Double.parseDouble(heightInput); // Convert to double
        System.out.println("You are " + age + " years old and " + height +  "m tall.");
    }catch (IOException e) {
        System.err.println("Error reading input sytem");
    }catch (NumberFormatException e){
        //This happens if the user types "twenty" instead od "20".
        System.err.println("Invalid number format! Please enter digits only.");
      }
    }
}
