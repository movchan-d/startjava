public class MyFirstGame {
    public static void main(String[] args) {
        int secretNum = 56;
        int playerNum = 80;
        while (playerNum != secretNum) {
            if (playerNum > secretNum) {
                System.out.printf("число %d больше %d\n", playerNum , secretNum);
                playerNum--;
            } else {
                System.out.printf("число %d больше %d\n", playerNum , secretNum);
                playerNum++;
            }
        }
        System.out.println("Вы победили!");
    }
}