public class VariablesTheme {
    public static void main(String[] args) {

        System.out.println("\nЗанятие1. Урок 6");
        System.out.println("Переменные: примитивные типы данных");

/* TODO #1
объявите переменные всех существующих в Java примитивных типов данных, присвоив им значения
в качестве значений используйте характеристики компьютера: количество ядер, частота процессора итд
выведите на консоль:
- значение переменных
- описание к ним
*/
        System.out.println("\n1. Вывод значений переменных на консоль\n");

        byte    varByte   = 64;
        short   varShort  = 50;
        int     varInt    = 1000000;
        long    varLong   = 1234567890;
        float   varFloat  = 3.14f;
        double  varDouble = 3.1456789075443d;
        char    varChar   = 'J';
        boolean varBool   = true;

        System.out.println("Byte:   " + varByte);
        System.out.println("Short:  " + varShort);
        System.out.println("Int:    " + varInt);
        System.out.println("Long:   " + varLong);
        System.out.println("Float:  " + varFloat);
        System.out.println("Double: " + varDouble);
        System.out.println("Char:   " + varChar);
        System.out.println("Boolean:" + varBool);
//------------------------------------------------------------------//

/* TODO #2
ручка стоит 100 руб, а книга — 200 руб.
вместе на них действует скидка 11%
выведите на консоль:
- общую стоимость товаров без скидки
- сумму скидки
- общую стоимость товаров со скидкой 
*/
        System.out.println("\n2. Расчет стоимости товара со скидкой\n");

        float pricePen  = 100;
        float priceBook = 200;
        float discountPercent = 11;

        float totalCost    = pricePen + priceBook;
        float discount     = totalCost * discountPercent / 100;
        float totalCostNet = totalCost - discount;

        System.out.println("Стоимость: " + totalCost);
        System.out.println("Сумма скидки:   " + discount);
        System.out.println("Стоимость со скидкой:" + totalCostNet);
//------------------------------------------------------------------//

/* TODO #3
Вывод слова JAVA */
        System.out.println("\n3. Вывод слова JAVA\n");
        System.out.println("   J    a  v     v  a      ");
        System.out.println("   J   a a  v   v  a a     ");
        System.out.println("J  J  aaaaa  V V  aaaaa    ");
        System.out.println(" JJ  a     a  V  a     a   \n");
//------------------------------------------------------------------//


/* TODO #4
создайте переменные всех целых числовых типов
присвойте им самые большие числа, которые они могут хранить
инкрементируйте, а затем декрементируйте все значения на единицу
выводите данные на консоль для каждой переменной (не смешивайте вывод разных типов) 
в следующей последовательности:
первоначальное значение
значение после инкремента
значение после декремента
*/
        System.out.println("\n4. Вывод min и max значений целых числовых типов\n");
        varByte   = 127;
        varShort  = 32767;
        varInt    = 2147483647;
        varLong   = 9223372036854775807L;

        System.out.println(varByte);
        varByte++;
        System.out.println(varByte);
        varByte--;
        System.out.println(varByte + "\n");

        System.out.println(varShort);
        varShort++;
        System.out.println(varShort);
        varShort--;
        System.out.println(varShort + "\n");

        System.out.println(varInt);
        varInt++;
        System.out.println(varInt);
        varInt--;
        System.out.println(varInt + "\n");

        System.out.println(varLong);
        varLong++;
        System.out.println(varLong);
        varLong--;
        System.out.println(varLong + "\n");
//------------------------------------------------------------------//

/* TODO #5
создайте две переменные типа int, присвоив им 2 и 5
поменяйте значения переменных местами разными способами:
    с помощью третьей переменной
    с помощью арифметических операций
    с помощью побитовой операции ^
перед началом очередных перестановок присваивать переменным исходные значения не нужно
решение должно быть универсальным, а не привязано к конкретным значениям
выведите на консоль:
    название способа перестановки значений
    исходные значения переменных
    новые значения переменных 
*/
        System.out.println("\n5. Перестановка значений переменных\n");
        int a = 2;
        int b = 5;
        int c;

        // с помощью третьей переменной
        System.out.println("5.1 C помощью третьей переменной");
        System.out.println("исходные значения переменных:\n" + "a = " + a + "\n"+ "b = " + b);

        System.out.println("новые значения переменных:");
        c = b;
        System.out.println("a = " + c);
        c = a;
        System.out.println("b = " + c + "\n");

        // с помощью арифметических операций
        System.out.println("5.2 С помощью арифметических операций");
        System.out.println("исходные значения переменных:\n" + "a = " + a + "\n"+ "b = " + b);

        c = a + b;
        System.out.println("новые значения переменных:");
        System.out.println("a = " + ( c - a ));
        System.out.println("b = " + ( c - b ) + "\n");

        // с помощью побитовой операции ^
        System.out.println("5.3 С помощью побитовой операции ^");
        System.out.println("исходные значения переменных:\n" + "a = " + a + "\n"+ "b = " + b);

        c = a ^ b;
        System.out.println("новые значения переменных:");
        System.out.println("a = " + ( c ^ a ));
        System.out.println("b = " + ( c ^ b ) + "\n");

/* TODO #6
// проинициализируйте переменные типа char символами (не их кодами!), 
// которым соответствуют коды: 35, 38, 64, 94, 95
// выведите на консоль в столбец попарно, используя переменные для обоих значений:
// код символа 
// соответствующий коду символ из ASCII-таблицы
*/
        System.out.println("\n6. Вывод символов и их кодов\n");
        char symb_35 = 35;      //'#';
        char symb_38 = 38;      //'&';
        char symb_64 = 64;      //'@';
        char symb_94 = 94;      //'^';
        char symb_95 = 95;      //'_';

        int code_35 = (char)symb_35;
        int code_38 = (char)symb_38;
        int code_64 = (char)symb_64;
        int code_94 = (char)symb_94;
        int code_95 = (char)symb_95;

        System.out.println("Код    Символ");
        System.out.println( code_35 + "     " + symb_35);
        System.out.println( code_38 + "     " + symb_38);
        System.out.println( code_64 + "     " + symb_64);
        System.out.println( code_94 + "     " + symb_94);
        System.out.println( code_95 + "     " + symb_95);

/*TODO #7
выведите в консоль Java-талисман:
    /\    
   /  \   
  /_( )\  
 /      \ 
/____/\__\
каждый уникальный символ (а не его код) храните в отдельной переменной (кроме пробелов)
выведите результат в консоль, используя значения переменных
*/
        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка\n");
        char fs = 47;       // slash /
        char bs = 92;       // обратный slash \
        char lp = 40;       // левая скобка (
        char rp = 41;       // правая скобка )
        char uLine = 95;    // подчеркивание

        System.out.println("    " + fs + bs );
        System.out.println("   " + fs + "  " + bs );
        System.out.println("  " + fs + uLine + lp + " " + rp + bs );
        System.out.println(" " + fs + "      " + bs );
        System.out.println(""  + fs + uLine + uLine + uLine + uLine + fs + bs + uLine + uLine + bs);

/* TODO #8
из числа 123 выделите сотни, десятки и единицы
выделяйте каждую цифру числа программно, а не написав их самим
используйте для этого только операции / и %
не используйте цикл
найдите произведение и сумму цифр
выведите результат в формате:
Число N содержит:
X сотен
Y десятков
Z единиц
Сумма его цифр = столько-то
Произведение = столько-то
*/
        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа\n");
        int number = 123;
        int digit1 = number / 100;
        int digit2 = ( number % 100 ) / 10;
        int digit3 = ( number % 100 ) % 10;

        int sum     = digit1 + digit2 + digit3;
        int product = digit1 * digit2 * digit3;

        System.out.println("Число " + number + " содержит:");
        System.out.println(digit1 + " сотен");
        System.out.println(digit2 + " десятков");
        System.out.println(digit3   + " единиц");
        System.out.println("Сумма его цифр = " + sum );
        System.out.println("Произведение = " + product);

/* TODO #9
имеется 86399 секунд
переведите число в часы, минуты и секунды
используйте для этого только операции / и %
выведите в консоль значения в формате ЧЧ:ММ:СС
*/
        System.out.println("\n9. Вывод времени\n");
        int time = 86399;
        int hours = time / 3600;
        int minutes = ( time % 3600 ) / 60;
        int seconds = ( time % 3600 ) % 60;

        System.out.println(hours + ":" + minutes + ":" + seconds + "\n");

    };
}