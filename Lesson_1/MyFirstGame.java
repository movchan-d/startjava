public class MyFirstGame {
    public static void main(String[] args) {
        int numComp = 56;
        int numUser = 80;
        while (numUser != numComp) {
            if (numUser > numComp) {
                System.out.printf("число %d больше %d\n", numUser , numComp);
                numUser--;
            } else {
                System.out.printf("число %d больше %d\n", numUser , numComp);
                numUser++;
            }
        } 
        System.out.println("Вы победили!");
    }
}