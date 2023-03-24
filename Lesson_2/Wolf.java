public class Wolf {
    private String gender;
    private String name;
    private String color;
    private float weight;
    private int age;
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 8) {
            System.out.println(age + " лет - некорректный возраст");
        } else {
            this.age = age;
        }
    }
    public void go() {
        System.out.println("Волк идет");
    }
    public void sit() {
        System.out.println("Волк сидит");
    }
    public void run() {
        System.out.println("Волк бежит");
    }
    public void howl() {
        System.out.println("Волк воет");
    }
    public void hunt() {
        System.out.println("Волк охотится");
    }
}