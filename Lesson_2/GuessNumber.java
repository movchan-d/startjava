import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start(Scanner scan) {
        int secretNumber = (int) (1 + (Math.random() * 100));
        int currentNumber;
        Player currentPlayer = player1;

        do {
            System.out.println("Игрок " + currentPlayer.getName() + ", введите число:");
            currentNumber = scan.nextInt();

            if (currentNumber == secretNumber) {
                System.out.println("Верно! Игрок " + currentPlayer.getName() + " победил!");
            } else {
                if ( currentNumber > secretNumber) {
                    System.out.println("Число " + currentNumber + " больше загаданного числа");
                } else {
                    System.out.println("Число " + currentNumber  + " меньше загаданного числа");
                }
                // Смена игрока
                currentPlayer = currentPlayer == player1 ? player2 : player1;
            }
        } while (secretNumber != currentNumber);
    }
}