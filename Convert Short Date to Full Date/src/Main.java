import java.util.Scanner;

class ShortDateConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a short date (YYYY-MM-DD): ");
        String inputDate = scanner.nextLine();
        String[] dateParts = inputDate.split("-");
        int year = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int day = Integer.parseInt(dateParts[2]);
        String monthName = getMonthName(month);
        System.out.println("Full date representation: " + monthName + " " + day + ", " + year);
    }
    private static String getMonthName(int month) {
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};

        if (month >= 1 && month <= 12) {
            return monthNames[month - 1];
        } else {
            return "Invalid month of the year!!";
        }
    }
}