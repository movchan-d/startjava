public class WolfTest {
    public static void main(String[] args) {
        Wolf myWolf = new Wolf();
        myWolf.setGender("Мужской");
        myWolf.setName("Акела");
        myWolf.setColor("Серый");
        myWolf.setWeight(30);
        myWolf.setAge(9);
        System.out.println("Пол: " + myWolf.getGender());
        System.out.println("Кличка: " + myWolf.getName());
        System.out.println("Окрас: " + myWolf.getColor());
        System.out.println("Вес: " + myWolf.getWeight() + " кг");
        if (myWolf.getAge() != 0) {
            System.out.println("Возраст: " + myWolf.getAge() + " лет");
        }

        myWolf.go();
        myWolf.sit();
        myWolf.run();
        myWolf.howl();
        myWolf.hunt();
    }
}