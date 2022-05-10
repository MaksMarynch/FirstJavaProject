package homework;

public class HW3 {

    public static void main(String[] args) {

        String line = "____________________";
        int n = 1;
        String taskNumber = "Task ";

        /**
         2. Создать переменные a и b типа byte, присвоить им значения из допустимого диапазона.
         */

        n = 2;
        System.out.println(line + taskNumber + (n) + line);

        byte a = 12;
        byte b = 2;


        System.out.println("Диапазон для Байт от " + Byte.MIN_VALUE + " до " + Byte.MAX_VALUE);
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        /**
         * 3. Создать переменные s и t типа short, присвоить им негативное и позитивное значения с разницей 60000.
         */

        n = 3;
        System.out.println(line + taskNumber + (n) + line);

        short s = 30000;
        short t = (short) (s - 60_000);

        System.out.println("s = " + s);
        System.out.println("t = " + t);

        /** 4. Создать переменную i типа int и присвоить ей минимально возможное значение этого типа.
         * Затем присвоить максимально возможное значение этого типа. Распечатать оба значения в виде таблицы:
         */
        n = 4;
        System.out.println(line + taskNumber + (n) + line);

        int i = Integer.MIN_VALUE;


        System.out.println(line + line);
        System.out.println("| int min\t \t" + "|\t" + (i) + "\t\t\t" + "|");
        System.out.println(line + line);
        
        i = Integer.MAX_VALUE;

        System.out.println("| int max\t \t" + "|\t" + (i) + "\t\t\t" + "|");
        System.out.println(line + line);

        /**
         * 5.Создать переменную phoneNumber и присвоить ей значение номера телефона
         * с кодом страны и города (можно ненастоящий номер телефона, например, 18009998877)
         */

        n = 5;
        System.out.println(line + taskNumber + (n) + line);

        long phoneNumber = +380509748861L;

        System.out.println("\n Phone Number is " + phoneNumber);

        /**
         * 6. Создать переменную f типа float и присвоить ей значение 100.101101. Создать переменную d типа double
         * и присвоить ей значение 100.101101.
         * Распечатать результат в виде таблицы:
         */

        n = 6;
        System.out.println(line + taskNumber + (n) + line);

        float f = 100.101101F;
        double d = 100.101101;

        System.out.println(line + line);
        System.out.println("| float f = 100.101101\t" + "|\t" + (f) + "\t" + "|");
        System.out.println(line + line);
        System.out.println("| double d = 100.101101\t" + "|\t" + (d) + "\t" + "|");
        System.out.println(line + line);

        /** 7.
         * a) Создать переменную типа Double с именем dd  и инициализировать
         * её результатом суммы чисел 10.09999 и 20.099999
         *
         * b) Создать переменную типа Float с именем ff  и инициализировать
         * её результатом суммы чисел 10.09999 и 20.099999.
         *
         * Распечатать результаты задания №7, как продолжение таблицы из задания № 6.
         */

        n = 7;
        System.out.println(line + taskNumber + (n) + line);

        Double dd = 10.09999 + 20.099999;
        Float ff = 10.09999F + 20.099999F;

        System.out.println(line + line);
        System.out.println("| float f = 100.101101\t" + "|\t" + (f) + "\t" + "|");
        System.out.println(line + line);
        System.out.println("| double d = 100.101101\t" + "|\t" + (d) + "\t" + "|");
        System.out.println(line + line);
        System.out.println("| Double dd = \t" + "|\t" + (dd) + "\t" + "|");
        System.out.println(line + line);
        System.out.println("| Float ff = \t" + "|\t" + (ff) + "\t\t\t" + "|");
        System.out.println(line + line);

        /**
         *  8. Создать переменную result и присвоить ей значение выражения 10 / 3 (с максимальной точностью)
         */

        n = 8;
        System.out.println(line + taskNumber + (n) + line);
        System.out.println();

        double result1 = 10;
        double result2 = 3;

        double result = result1 / result2;

        System.out.println("result выражения 10 / 3 (с максимальной точностью) = " + result);

        /**
         *  9. Создать переменные sum, product, quotient и remainder, и
         * присвоить им значения вычислений переменных f и d
         */
        n = 9;
        System.out.println(line + taskNumber + (n) + line);
        System.out.println();

        double sum = f + d;
        System.out.println("sum f + d = " + sum);

        double product = f * d;
        System.out.println("product f * d = " + product);

        double quotient = f / d;
        System.out.println("quotient f / d = " + quotient);

        double remainder = f % d;
        System.out.println("remainder f % d = " + remainder);

        /**
         * Распечатать слово HELLO точками
         */

        n = 10;
        System.out.println(line + taskNumber + (n) + line);
        System.out.println();

        System.out.println("" +
                ".\t.\t……..\t.\t\t.\t\t…………\n" +
                ".\t.\t.\t\t.\t\t.\t\t.\t.\n" +
                "…..….\t…….\t\t.\t\t.\t\t.\t.\n" +
                ".\t.\t.\t\t.\t\t.\t\t.\t.\n" +
                ".\t.\t…….\t\t………\t\t………\t\t…………");

        /**
         * PART 2
         */
        /**
         *  11.Создать переменные подходящего ссылочного типа данных(выбирать минимально достаточный диапазон значений):
         * t1 = 0;
         * t2 = 150;
         * t3 = -120;
         * t4 = - 505.505;
         * t5 = 100100;
         * t6 = 100010001000;
         * t7 = 2.66666666666666;
         * t8 = - 1000000.001;
         * t9 = 1010;
         *
         * Распечатать значения всех переменных.
          */

        n = 11;
        System.out.println(line + taskNumber + (n) + line);
        System.out.println();

        Byte t1 = 0;
        Short t2 = 150;
        Byte t3 = -120;
        Float t4 = 505.505F;
        Integer t5 = 100100;
        Long t6 = 100010001000L;
        Double t7 = 2.66666666666666;
        Double t8 = - 1000000.001;
        Short t9 = 1010;

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        System.out.println(t6);
        System.out.println(t7);
        System.out.println(t8);
        System.out.println(t9);

        /**
         *    12.С помощью полей классов ссылочного типа распечатать таблицу
         */

        n = 12;
        System.out.println(line + taskNumber + (n) + line);
        System.out.println();

        System.out.println(line + line + line);
        System.out.println("| Type\t | "  + "Size in bits\t | " + "min\t\t\t | " +  "max\t\t\t |");
        System.out.println(line + line + line);
        System.out.println("| byte\t | "  + (Byte.SIZE) + "\t\t\t | " + (Byte.MIN_VALUE) + "\t\t\t | " + (Byte.MAX_VALUE) + "\t\t\t |");
        System.out.println(line + line + line);
        System.out.println("| short\t | "  + (Short.SIZE) + "\t\t\t | " + (Short.MIN_VALUE) + "\t\t | " + (Short.MAX_VALUE) + "\t\t |");
        System.out.println(line + line + line);
        System.out.println("| int\t | "  + (Integer.SIZE) + "\t\t\t | " + (Integer.MIN_VALUE) + "\t | " + (Integer.MAX_VALUE) + "\t |");
        System.out.println(line + line + line);
        System.out.println("| long\t | "  + (Long.SIZE) + "\t\t\t | " + (Long.MIN_VALUE) + "\t | " + (Long.MAX_VALUE) + "\t |");
        System.out.println(line + line + line);
        System.out.println("| float\t | "  + (Float.SIZE) + "\t\t\t | " + (Float.MIN_VALUE) + "\t\t | " + (Float.MAX_VALUE) + "\t |");
        System.out.println(line + line + line);
        System.out.println("| double\t | "  + (Double.SIZE) + "\t\t | " + (Double.MIN_VALUE) + "\t\t | " + (Double.MAX_VALUE) + "\t |");
        System.out.println(line + line + line);

        /**
         *  13. Создать 2 переменные референсного типа Integer - num1 и num2,
         *  присвоить им одинаковые значения,
         *  сравнить 2 переменные друг с другом с помощью метода .equal.
         *  Вывести результат сравнения на печать в виде выражения:
         * “Если num1 = num2, то результат сравнения методом .equal = …”
         *
         * Присвоить переменным разные значения, сравнить,  и вывести результат на печать:
         * “Если num1 не равно num2, то результат сравнения методом .equal = …”
         */
        n = 13;
        System.out.println(line + taskNumber + (n) + line);
        System.out.println();

        Integer num1 = 5;
        Integer num2 = 5;

            System.out.println("Если num1 = num2, то результат сравнения методом .equal = " + num1.equals(num2));

        num1 = 5;
        num2 = 6;
            System.out.println("Если num1 не равно num2, то результат сравнения методом .equal = " + num1.equals(num2));

        /**
         *  14.Создать 2 переменные примитивного типа int - number1 and number2. Инициализаровать их
         * а) одинаковыми значениями
         * b) number1 < number2
         * c) number1 > number2
         * сравнить их подходящим методом класса Integer (посмотрите, какой метод подойдет),
         * и вывести результаты сравнения на печать в виде выражений:
         * “Если number1 = number2, то результат сравнения методом … = …”
         * “Если number1 < number2, то результат сравнения методом … = …”
         * “Если number1 > number2, то результат сравнения методом … = …”
         */

        n = 14;
        System.out.println(line + taskNumber + (n) + line);
        System.out.println();

        int number1 = 5;
        int number2 = 5;
        int compare = Integer.compare(number1,number2);
        System.out.println("“Если number1 = number2, то результат сравнения методом compare = " + compare);

        number1 = 4;
        int compare1 = Integer.compare(number1,number2);
        System.out.println("“Если number1 < number2, то результат сравнения методом compare = " + compare1);

        number1 = 6;
        int compare2 = Integer.compare(number1,number2);
        System.out.println("“Если number1 > number2, то результат сравнения методом compare = " + compare2);

        /**
         *  15. Создать переменную типа Float, присвоить ей значение 234.9999 и распечатать значение в int
         */
        n = 15;
        System.out.println(line + taskNumber + (n) + line);
        System.out.println();

        Float fl = 234.9999F;
        System.out.println(fl.intValue());

        /**
         *  16. С помощью метода sum() класса Double посчитать сумму двух переменных типа double.
         */
        n = 16;
        System.out.println(line + taskNumber + (n) + line);
        System.out.println();

        double num16 = 2.345;
        double num17 = 2.123;

        System.out.println(Double.sum(num16,num17));

        /**
         *  17. С помощью метода sum() класса Integer посчитать сумму двух переменных типа Float.
         */
        n = 17;
        System.out.println(line + taskNumber + (n) + line);
        System.out.println();

        Float ff1 = 1.123F;
        Float ff2 = 2.35678F;

        System.out.println(Integer.sum(ff1.intValue(),ff2.intValue()));

        /**
         * 18. Создать 2 переменные типа Short:
         * short1 = 12000
         * short2 = 12300
         * a) Распечатать фразу:
         * “12000 - 12300 = -300”
         * где значение -300 выведено с помощью метода класса Short, а не операцией вычисления
         * b) Присвоить переменной short1 значение 12500, вывести фразу:
         * “12500 - 12300 = 200”
         * где значение 200 выведено с помощью метода класса Short, а не операцией вычисления
         */

        n = 18;
        System.out.println(line + taskNumber + (n) + line);
        System.out.println();

        Short short1 = 12000;
        Short short2 = 12300;

        System.out.println("12000 - 12300 = " + Short.compare(short1,short2));

        short1 = 12500;
        System.out.println("12500 - 12300 = " + Short.compare(short1,short2));

        /**
         *  19. Создать переменные:
         * String str1 = "123.56";
         * String str2 = "123.55";
         * Double doub1 = 123.56;
         * Double doub2 = 123.55;
         *
         * Распечатать результат doub1 - doub2
         *
         * Используя методы ссылочного типа данных, посчитать и распечатать результат str1 - str2
         */

        n = 19;
        System.out.println(line + taskNumber + (n) + line);
        System.out.println();

        String str1 = "123.56";
        String str2 = "123.55";
        Double doub1 = 123.56;
        Double doub2 = 123.55;

        System.out.println(Double.sum(doub1,-doub2));

        Double doubstr1 = Double.valueOf(str1);
        Double doubstr2 = Double.valueOf(str2);

        System.out.println(doubstr1-doubstr2);



        /**
         *  20. Создать переменную подходящего типа данных для хранения результатов
         *  измерения температуры тела кота (значения температуры в Цельсиях).
         *  Присвоить этой переменной сначала максимальное значение, затем минимальное значение.
         *  Посчитать и распечатать среднее значение, округленное с помощью метода класса Math.
         *  Распечатать результат среднего значения температуры тела кота.
         */

        n = 20;
        System.out.println(line + taskNumber + (n) + line);
        System.out.println();

        double tempMax = 40.5;
        double tempMin = 35.2;

        double average = (tempMax + tempMin) / 2;

        System.out.println(Math.round(average));

        /**
         *  21. Создать переменную n типа Number, присвоить ей максимально возможное значение.
         * Присвоить n значение 10,
         * затем присвоить n значение 10.999999999.
         * Распечатать результаты в виде выражения:
         * “Переменная n может принимать значения:
         *  n =  …
         *  n =  …
         *  n =  …
         *  Это возможно, потому что …”
         */

        n = 21;
        System.out.println(line + taskNumber + (n) + line);
        System.out.println();

        System.out.println("Переменная n может принимать значения: ");

        Number nnn = Long.MAX_VALUE;

        System.out.println("n = " + nnn);

        nnn = 10;

        System.out.println("n = " + nnn);

        nnn = Double.valueOf(10.999999999);

        System.out.println("n = " + nnn);


        /**
         * 22. Создать переменную Integer numberInteger = 100.
         * Доказать, что numberInteger имеет тип Integer,
         * а numberInteger.toString() имеет тип String.
         */

        n = 22;
        System.out.println(line + taskNumber + (n) + line);
        System.out.println();

        Integer numberInteger = 100;
        System.out.println("Запись numberInteger + 1 будет иметь вывод: " + (numberInteger + 1));

        System.out.println("Запись numberInteger.toString() + 1 будет иметь вывод: " + (numberInteger.toString() + 1));





        /**
         * 23. Вывести на экран следующие выражения, используя для печати только переменные:
         * “36.6 градусов по Цельсию  = … градусов по Фаренгейту”, где значение по Фаренгейту
         * должно быть вычислено по формуле
         * “50 kilogram = … lbs,  50 lb = … kg”, где значения должны быть вычислены по формулам
         */
        n = 23;
        System.out.println(line + taskNumber + (n) + line);
        System.out.println();

        double gradC = 36.6;
        double gradF = gradC * 1.8 + 32;
        double kg = 50;
        double lbs = kg + 2.205;
        double lbs1 = 50;
        double kg1 = lbs1 + 0.45359293;

        System.out.println("36.6 градусов по Цельсию  = " + gradF
                + " градусов по Фаренгейту"
                + "\n50 kilogram = " + lbs + "lbs"
                + "\n50 lb = " + kg1 + "kg”");

















































    }
}
