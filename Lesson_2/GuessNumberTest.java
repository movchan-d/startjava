import java.util.Scanner;
public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя 1-го игрока: ");
        Player player1 = new Player(scan.nextLine());
        System.out.println("Введите имя 2-го игрока: ");
        Player player2 = new Player(scan.nextLine());
        GuessNumber guessNumber = new GuessNumber(player1, player2);

        Player player = guessNumber.getPlayer1();
        int count = 1;
        boolean isNotGuessed = true;
        while (isNotGuessed) {
            if (count % 2 != 0) {
                player = guessNumber.getPlayer1();
            } else {
                player = guessNumber.getPlayer2();
            }
            System.out.println("Игрок " + player.getName() + ", введите число:");
            player.setNumber(scan.nextInt());
            isNotGuessed = guessNumber.checkPlayerNumber(player);
            count++;
        }
        scan.close();
    }
}