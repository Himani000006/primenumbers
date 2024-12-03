import java.util.Scanner;

public class PrimeNumbers {
    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If divisible by any number, it's not prime
            }
        }
        return true; // Number is prime
    }

    // Main method to print prime numbers up to a limit
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit to find prime numbers: ");
        int limit = scanner.nextInt();

        System.out.println("Prime numbers up to " + limit + ":");
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " "); // Print the prime number
            }
        }
        scanner.close();
    }
}
