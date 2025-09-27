import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Predefined exchange rates (example values, not real-time)
        double usdToInr = 83.20;
        double eurToInr = 89.50;
        double gbpToInr = 104.25;

        System.out.println("====== Currency Converter ======");
        System.out.println("Choose the currency you want to convert to INR:");
        System.out.println("1. USD to INR");
        System.out.println("2. EUR to INR");
        System.out.println("3. GBP to INR");
        System.out.print("Enter choice (1-3): ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        double result = 0;

        switch (choice) {
            case 1:
                result = amount * usdToInr;
                System.out.println(amount + " USD = " + result + " INR");
                break;
            case 2:
                result = amount * eurToInr;
                System.out.println(amount + " EUR = " + result + " INR");
                break;
            case 3:
                result = amount * gbpToInr;
                System.out.println(amount + " GBP = " + result + " INR");
                break;
            default:
                System.out.println("Invalid choice! Please restart the program.");
        }

        sc.close();
    }
}

