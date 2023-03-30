import java.util.zip.CheckedInputStream;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int secretNumber;   // Число, загаданное компьютером

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.secretNumber = (int) (1 + (Math.random() * 100));
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public boolean checkPlayerNumber(Player player) {
        boolean isNotGuessed = true;
        int playerNumber = player.getNumber();
        if (playerNumber > secretNumber) {
            System.out.println("Число " + playerNumber + " больше загаданного числа");
        } else if (playerNumber < secretNumber) {
            System.out.println("Число " + playerNumber + " меньше загаданного числа");
        } else {
            isNotGuessed = false;
            System.out.println("Игрок " + player.getName() + " победил! Загаданное число: "
                    + secretNumber);
        }
        return isNotGuessed;
    }
    
    public void startGame(Scanner scan) {
        Player player = getPlayer1();
        int count = 1;
        boolean isNotGuessed = true;
        while (isNotGuessed) {
            if (count % 2 != 0) {
                player = getPlayer1();
            } else {
                player = getPlayer2();
            }
            System.out.println("Игрок " + player.getName() + ", введите число:");
            player.setNumber(scan.nextInt());
            isNotGuessed = checkPlayerNumber(player);
            count++;
        }
    }
}