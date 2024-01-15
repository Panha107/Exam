import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask the user to enter a short date
        System.out.print("Enter a short date (YYYY-MM-DD): ");
        String shortDate = scanner.nextLine();

        // Step 2: Extract year, month, and day from the short date
        String[] dateParts = shortDate.split("-");
        int year = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int day = Integer.parseInt(dateParts[2]);

        // Step 3: Convert month number to month name
        String monthName = getMonthName(month);

        // Step 4: Display the full date representation
        System.out.println("Full Date Representation: " + monthName + " " + day + ", " + year);

        scanner.close();
    }

    // Helper method to convert month number to month name
    private static String getMonthName(int month) {
        String[] monthNames = {"", "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        return monthNames[month];
    }
}
