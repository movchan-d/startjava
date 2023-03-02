public class IfElseStatementTheme{
    public static void main(String[] args) {

/* TODO #1
перепишите псевдокод, приведенный ниже, с помощью Java
используйте переменные, условные операторы, логическое НЕ
придумайте сообщения для отображения их в консоли
*/

        System.out.println("\n 1. Перевод псевдокода на язык Java");

        int age = 17;
        if (age > 20) {
            System.out.println("Возраст " + age + " больше 20");
        }
        else {
            System.out.println("Возраст " + age + " меньше 20");
        }

        boolean isMale = false;
        if (!isMale) {
            System.out.println("Женский");
        }
        else {
            System.out.println("Мужской");
        }

        float heigh = 1.75f;
        if (heigh < 1.80) {
            System.out.println("Рост " + heigh + " меньше 1м 80см");
        }
        else {
            System.out.println("Рост " + heigh + " больше 1м 80см");
        }

        char firstLetter = "Max".charAt(0);
        if (firstLetter == 'M') {
            System.out.println("Первая буква имени: " + firstLetter);
        }
        else if (firstLetter == 'I') {
            System.out.println("Первая буква имени: " + firstLetter);
        }
        else {
            System.out.println("Первая буква имени " + firstLetter + " (не M и не I)");
        }

/* TODO #2
создайте две переменные, присвоив им любые числа
найдите максимальное и минимальное число
для себя проверьте, правильно ли работает программа, если значения переменных поменять местами,
а также при их равенстве
выведите:
-числа на консоль, указав какое из них max и min
-информацию об их равенстве, если они равны
*/

        System.out.println("\n 2. Поиск max и min числа");
        float a = 9.81f;
        int b = 10;

        if (a > b) {
            System.out.println("max = " + a);
            System.out.println("min = " + b);
        }
        else if (a < b) {
            System.out.println("max = " + b);
            System.out.println("min = " + a);
        }
        else {
            System.out.println("a = b = " + a);
        }

/* TODO #3
создайте переменную с любым числом
определите, являться ли оно:
-нулем
-четным (нечетным)
-отрицательным (положительным)
если число равно 0, то остальные проверки не должны выполняться.
Используйте вложенные if (return использовать — нельзя)
если число не равно 0, то не нужно выводить эту информацию
проверки и выводимый текст не должны дублироваться
отобразите полученные результаты, включая исходное число
*/

        System.out.println("\n 3. Проверка числа");
        int number = 33;

        System.out.println("Исходное число:" + number);

        if (number != 0) {
            // четное/нечетное
            int rem = number % 2;

            // знак числа
            char sign;
            if (number > 0) {
                sign = '+';
            }
            else {
                sign = '-';
            }

            // вывод проверки
            if (rem == 0) {
                if (sign == '+') {
                    System.out.println("Проверка: \nЧетное положительное");
                }
                else {
                    System.out.println("Проверка: \nЧетное отрицательное");
                }
            }
            else {
                if (sign == '+') {
                    System.out.println("Проверка: \nНечетное положительное");
                }
                else {
                    System.out.println("Проверка: \nНечетное отрицательное");
                }
            }
        }
        else {
            System.out.println("Проверка: \nНоль");
        }

/* TODO #4
-создайте две переменные, присвоив им два трехзначных целых числа
-найдите в них все одинаковые цифры, стоящие в одном и том же разряде
-отобразите на консоль:
    исходные числа
    одинаковые в них цифры
    номера разрядов
-если равных цифр нет, то отобразите соответствующее сообщение
-если все цифры в разрядах разные, то остальные проверки выполняться не должны
-протестируйте дополнительно (для себя) правильность работы программы для чисел 123 и
 223 без отправки в репозиторий
*/
        System.out.println("\n4. Поиск одинаковых цифр в числах\n");
        int num1 = 123;
        int num2 = 312;

        int num1_1 = (num1 % 100) % 10;
        int num1_2 = (num1 % 100) / 10;
        int num1_3 = (num1 / 100);
        int num2_1 = (num2 % 100) % 10;
        int num2_2 = (num2 % 100) / 10;
        int num2_3 = (num2 / 100);

        System.out.println("Исходные числа:");
        System.out.println(num1 + "\n" + num2);

        if ( (num1_1 != num2_1) & (num1_2 != num2_2) & (num1_3 != num2_3) ) {
            System.out.println("Все цифры в разрядах разные");
        }
        else {
            if (num1_1 == num2_1) {
                System.out.println("Одинаковая цифра: " + num1_1 + "\nРазряд: 1\n");
            }
            if (num1_2 == num2_2) {
                System.out.println("Одинаковая цифра: " + num1_2 + "\nРазряд: 2\n");
            }
            if (num1_3 == num2_3) {
                System.out.println("Одинаковая цифра: " + num1_3 + "\nРазряд: 3\n");
            }
        }

/* TODO #5
- создайте переменную типа char
- присвойте ей значение '\u0057'
- определите программно — это код буквы, числа или другого символа
- в if используйте символы, а не их коды
- использовать методы классов Java запрещено
- выведите в консоль сам символ и информацию о нем:
маленькая буква
большая буква
число
не буква и не число*/
        System.out.println("\n5. Определение символа по его коду\n");
        char code = '\u0057';
        
        if ( code >= '0' && code <= '9') {
            System.out.println( code + " - число" );
        }
        else if ( code >= 'A' && code <= 'Z' ) {
            System.out.println( code + " - заглавная буква");
        }
        else if ( code >= 'a' && code <= 'z' ) {
            System.out.println( code + " - маленькая буква");
        }
        else {
            System.out.println( code + " - не буква и не число" );
        }

/* TODO #6
сумма вклада равна 300_000 руб.
если она:
меньше 100_000, то банк начисляет 5% годовых
от 100_000 до 300_000, то — 7%
больше 300_000, то — 10%
отобразите в консоли:
сумму вклада
начисленный % (не путайте с процентной ставкой)
итоговую сумму с %
*/
        System.out.println("\n6.Подсчет суммы вклада и начисленных банком %\n");
        float deposite = 300_000f;
        float rate1 = 5f;
        float rate2 = 7f;
        float rate3 = 10f;

        float percent;

        if (deposite < 100_000) {
            percent = deposite * rate1 / 100;
        }
        else if (deposite >= 100000 && deposite <= 300_000) {
            percent = deposite * rate2 / 100;
        }
        else {
            percent = deposite * rate3 / 100;
        }

        System.out.println("Сумма вклада: " + deposite );
        System.out.println("Начисленный %: " +  percent );
        System.out.println("Итоговая сумма с %: " + ( deposite + percent ) );

/* TODO #7
студент получил итоговые % по предметам:
история 59%
программирование 91%
определите оценки по каждому предмету:
<= 60% — 2
> 60% — 3
> 73% — 4
> 91% — 5
выведите в консоль:
оценку и напротив предмет
средний балл оценок по предметам
средний % по предметам
*/
        System.out.println("\n7. Определение оценки по предметам\n");

        float rateHist = 59f;
        float rateProg = 91f;
        float averageRate = 0f;
        float averageGrade = 0f;
        int grade;

        if (rateHist <= 60) {
            grade = 2;
        }
        else if (rateHist <= 73 ) {
            grade = 3;
        }
        else if (rateHist <= 91) {
            grade = 4;
        }
        else {
            grade = 5;
        }
        System.out.println(grade + " - история");

        averageGrade = grade;
        averageRate  = rateHist;


        if (rateProg <= 60) {
            grade = 2;
        }
        else if (rateProg <= 73 ) {
            grade = 3;
        }
        else if (rateProg <= 91) {
            grade = 4;
        }
        else {
            grade = 5;
        }
        System.out.println(grade + " - программирование");

        averageGrade = ( averageGrade + grade ) / 2;
        averageRate  = ( averageRate  + rateProg ) / 2;

        System.out.println(averageGrade + " - средний балл");
        System.out.println(averageRate + " - средний % по предметам");

/* TODO #8
продавец снимает помещение за 5 000 руб. в месяц
в среднем в месяц он продает товара на 13 000 руб.
при этом его себестоимость равна 9 000 руб.
подсчитайте годовую прибыль
отобразите ее в консоли в следующем формате, например:
прибыль за год: -1000 руб.
прибыль за год: +3000 руб.
если прибыль положительная, то рядом с числом необходимо отображать +
*/
        System.out.println("\n8. Расчет прибыли за год\n");

        float rentPrice = 5_000f;
        float costPrice = 9_000f;
        float monthIncome = 13_000f;

        float yearProfit = ( monthIncome - costPrice - rentPrice ) * 12;

        if (yearProfit > 0) {
            System.out.println("прибыль за год: +" + yearProfit + " руб.");
        }
        else {
            System.out.println("прибыль за год: " + yearProfit + " руб.");
        }

/* TODO #9
из банкомата вам необходимо снять 567 USD
подсчитайте, с помощью какого количества банкнот номиналом 1, 10, 100 банкомат может выдать
необходимую сумму
при этом в банкомате осталось:
10 банкнот номиналом 100
5 банкнот номиналом 10
50 банкнот номиналом 1
если каких-то банкнот не хватает, то их нужно заменить банкнотами меньшего номинала
если банкнот не хватает для выдачи нужной суммы, то выводите соответствующее сообщение.
При этом никакие другие проверки уже выполняться не должны
выведите в консоль:
номиналы банкнот
требуемое их количество
выдаваемую сумму
*/
        System.out.println("\n9. Подсчет количества банкнот\n");

        int numBank100 = 10;
        int numBank10 = 5;
        int numBank1 = 50;

        int sum = 567;
        int rest;

        int numOut100;
        int numOut10;
        int numOut1;
        int sumOut;

        numOut100 = sum / 100;

        if (numOut100 > numBank100) {
            numOut100 = numBank100;
        }

        rest = sum - ( 100 * numOut100 );

        numOut10 = rest / 10;
        if ( numOut10 > numBank10 ) {
            numOut10 = numBank10;
        }

        rest = rest - ( 10 * numOut10 );
        numOut1 = rest;
        if ( numOut1 > numBank1 ) {
            numOut1 = numBank1 ;
        }

        sumOut = 100 * numOut100 + 10 * numOut10 + 1 * numOut1;

        System.out.println("Запрашиваемая сумма: " + sum);
        System.out.println("Номиналы в наличие: 100, 10, 1");
        System.out.println("Выдача: ");
        System.out.println( numOut100 + " купюр номиналом 100");
        System.out.println( numOut10  + " купюр номиналом 10");
        System.out.println( numOut1   + " купюр номиналом 1");
        System.out.println("Выдаваемая сумма:" + sumOut);


    }
}