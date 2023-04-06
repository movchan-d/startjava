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
        int playerNumber;
        Player player = player1;
        do {
            System.out.println("Игрок " + player.getName() + ", введите число:");
            playerNumber = scan.nextInt();

            if (playerNumber == secretNumber) {
                System.out.println("Верно! Игрок " + player.getName() + " победил!");
            } else {
                if ( playerNumber > secretNumber) {
                    System.out.println("Число " + playerNumber + " больше загаданного числа");
                } else {
                    System.out.println("Число " + playerNumber  + " меньше загаданного числа");
                }
                // Смена игрока
                player = player == player1 ? player2 : player1;
            }
        } while (secretNumber != playerNumber);
    }
}