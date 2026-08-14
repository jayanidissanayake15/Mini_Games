import java.util.Random;
import java.util.Scanner;

public class guessTheNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("🎮✨ WELCOME TO THE NUMBER GUESSING GAME! ✨🎮");

        while (true) {

            int randomNumber = random.nextInt(1000);
            int userNumber = -1;
            int attempts = 0;

            System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println("🚀 NEW GAME STARTED!");
            System.out.println("🤫 I picked a number below 1000");
            System.out.println("🧠 Can you guess it?");
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

            while (userNumber != randomNumber) {

                System.out.print("\n🎯 Enter your guess: ");
                userNumber = scanner.nextInt();

                attempts++;

                if (userNumber == randomNumber) {

                    System.out.println("\n🎉 CORRECT! YOU WIN! 🏆");
                    System.out.println("🎯 Correct Number: " + randomNumber);
                    System.out.println("🔥 Attempts: " + attempts);

                } else if (userNumber > randomNumber) {

                    System.out.println("📈 Too High!");
                    System.out.println("👇 Try a smaller number!");

                } else {

                    System.out.println("📉 Too Low!");
                    System.out.println("👆 Try a bigger number!");
                }
            }

            System.out.println("\n🔄 New Game Starting...");
        }
    }
}

