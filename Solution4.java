package task5;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class Solution4 {
        public static void main(String[] args) {
            // Create a Scanner object to read input
            Scanner scan = new Scanner(System.in);

            // Prompt the user to enter their birthdate
            System.out.print("Enter your birthdate (yyyy-mm-dd): ");
            String birthDateInput = scan.nextLine();

            // Parse the input into a LocalDate object
            LocalDate birthDate = LocalDate.parse(birthDateInput);

            // Get the current date
            LocalDate currentDate = LocalDate.now();

            // Calculate age
            Period age = Period.between(birthDate, currentDate);

            // Print Result
            System.out.println("Your age is: " + age.getYears() + " years, "
                    + age.getMonths() + " months, and "
                    + age.getDays() + " days.");
            scan.close();
        }
    }