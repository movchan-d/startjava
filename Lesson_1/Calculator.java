public class Calculator {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        char sign = '^';
        int result = 0;

        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            result = a / b;
        } else if (sign == '%') {
            result = a % b;
        } else if (sign == '^') {
            int degree = 0;
            result = 1;
            while (degree < b) {
                result *= a;
                degree++;
            }
        }
        System.out.println( a + " " + sign + " " + b + " = " + result );
    }
}