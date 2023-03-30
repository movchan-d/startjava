import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("Введите имя 1-го игрока: ");
            Player player1 = new Player(scan.nextLine());
            System.out.println("Введите имя 2-го игрока: ");
            Player player2 = new Player(scan.nextLine());

            GuessNumber guessNumber = new GuessNumber(player1, player2);
            guessNumber.startGame(scan);
            
            System.out.println("Хотите продолжить игру? [yes/no]:");
            scan.nextLine();
            String answer = scan.nextLine();
            switch (answer) {
                case "yes":
                    break;
                case "no":
                    isContinue = false;
                    break;
                default:
                    Boolean isWrongAnswer = true;
                    while (isWrongAnswer) {
                        System.out.println("Некорректный ответ. Хотите продолжить игру? [yes/no]: ");
                        String newAnswer = scan.nextLine();
                        switch (newAnswer) {
                            case "yes" :
                                isWrongAnswer = false;
                                break;
                            case "no" :
                                isWrongAnswer = false;
                                isContinue = false;
                                break;
                        }
                    }
            }
        }
        System.out.println("Game over!");
        scan.close();
    }
}