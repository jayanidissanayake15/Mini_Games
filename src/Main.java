import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int password = random.nextInt(9000) + 1000;

        System.out.println("🔐 4-Digit Password Guessing Game");
        System.out.println("🎮 I created a 4-digit password.");
        System.out.println("Try to guess it!");

        while (true) {

            System.out.print("\nEnter your 4-digit guess: ");
            int guess = scanner.nextInt();

            if (guess < 1000 || guess > 9999) {
                System.out.println("❌ Please enter a 4-digit number.");
                continue;
            }

            int password1 = password / 1000;
            int password2 = (password / 100) % 10;
            int password3 = (password / 10) % 10;
            int password4 = password % 10;

            int guess1 = guess / 1000;
            int guess2 = (guess / 100) % 10;
            int guess3 = (guess / 10) % 10;
            int guess4 = guess % 10;

            boolean anyCorrect = false;

            if (guess1 == password1) {
                System.out.println("✅ 1st number is correct!");
                anyCorrect = true;
            }

            if (guess2 == password2) {
                System.out.println("✅ 2nd number is correct!");
                anyCorrect = true;
            }

            if (guess3 == password3) {
                System.out.println("✅ 3rd number is correct!");
                anyCorrect = true;
            }

            if (guess4 == password4) {
                System.out.println("✅ 4th number is correct!");
                anyCorrect = true;
            }

            if (!anyCorrect) {
                System.out.println("❌ No positions are correct. Try again!");
            }

            if (guess == password) {
                System.out.println("\n🎉🎉 YOU WIN! 🎉🎉");
                System.out.println("🔓 You found the password!");
                System.out.println("🔐 Password: " + password);
                break;
            }
        }

        scanner.close();
    }
}