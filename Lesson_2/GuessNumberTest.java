import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "yes";

        do {
            System.out.println("Введите имя 1-го игрока: ");
            Player player1 = new Player(scan.nextLine());
            System.out.println("Введите имя 2-го игрока: ");
            Player player2 = new Player(scan.nextLine());

            GuessNumber game = new GuessNumber(player1, player2);
            game.start(scan);

            System.out.println("Хотите продолжить игру? [yes/no]:");
            scan.nextLine();
            answer = scan.nextLine();

            while (!answer.equals("yes") && !answer.equals("no") ) {
                System.out.println("Некорректный ответ. Хотите продолжить игру? [yes/no]: ");
                answer = scan.nextLine();
            }
        } while (answer.equals("yes"));

        System.out.println("Game over!");
        scan.close();
    }
}