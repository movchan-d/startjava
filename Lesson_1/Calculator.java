public class Calculator{
    public static void main(String[] args){
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
            int i = 0;
            result = 1;
            while (i < b) {
                result *= a;
                i++;
            }
        }
        System.out.println( a + " " + sign + " " + b + " = " + result );
    }
}