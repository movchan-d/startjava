public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerChernoAlpha = new Jaeger();
        jaegerChernoAlpha.setModelName("Cherno Alpha");
        jaegerChernoAlpha.setMark("Mark-1");
        jaegerChernoAlpha.setHeight(85.34f);
        jaegerChernoAlpha.setWeight(2.412f);
        jaegerChernoAlpha.setStrength(10);
        jaegerChernoAlpha.setSpeed(3);
        jaegerChernoAlpha.setArmor(10);
        System.out.println("Model name: " + (jaegerChernoAlpha.getModelName()));
        System.out.println("Mark: " + (jaegerChernoAlpha.getMark()));
        System.out.println("Height: " + (jaegerChernoAlpha.getHeight()) + " m");
        System.out.println("Weight: " + (jaegerChernoAlpha.getWeight()) + " Tons");
        System.out.println("Strength: " + (jaegerChernoAlpha.getStrength()));
        System.out.println("Speed: " + (jaegerChernoAlpha.getSpeed()));
        System.out.println("Armor: " + (jaegerChernoAlpha.getArmor()));
        System.out.println();

        Jaeger jaegerCoyoteTango = new Jaeger("Coyote Tango", "Mark-1", 76.2f, 2.312f, 7, 5, 4);
        System.out.println("Model name: " + (jaegerCoyoteTango.getModelName()));
        System.out.println("Mark: " + (jaegerCoyoteTango.getMark()));
        System.out.println("Height: " + (jaegerCoyoteTango.getHeight()) + " m");
        System.out.println("Weight: " + (jaegerCoyoteTango.getWeight()) + " Tons");
        System.out.println("Strength: " + (jaegerCoyoteTango.getStrength()));
        System.out.println("Speed: " + (jaegerCoyoteTango.getSpeed()));
        System.out.println("Armor: " + (jaegerCoyoteTango.getArmor()));
    }
}