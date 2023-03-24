public class WolfTest {
    public static void main(String[] args) {
        Wolf myWolf = new Wolf();
        myWolf.gender = "Мужской";
        myWolf.name = "Акела";
        myWolf.color = "Серый";
        myWolf.weight = 30;
        myWolf.age = 2;
        System.out.println("Пол: " + myWolf.gender);
        System.out.println("Кличка: " + myWolf.name);
        System.out.println("Вес: " + myWolf.weight + " кг");
        System.out.println("Возраст: " + myWolf.age + " лет");
        System.out.println("Окрас: " + myWolf.color);
        myWolf.go();
        myWolf.sit();
        myWolf.run();
        myWolf.howl();
        myWolf.hunt();
    }
}