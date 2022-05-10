package homework;

public class HW_2 {

    public static void main(String[] args) {

        String line = ("______________________");

        int k = 5;
        int l = 10;
        int m = 15;

/*      System.out.print(k);
        System.out.print(l);
        System.out.print(m);*/

//        System.out.println( (k) + ", " + (l) + ", " + (m) );

        /**
         *  Вывести значения этих переменных так, чтобы было понятно, какое значение к какой переменной относится.
         *  Например, должно быть распечатано:
         *  int a = 5;
         *  или
         *  a = 5
         */


        System.out.println("int k = " + k);
        System.out.println("int l = " + l);
        System.out.println("int m = " + m);

        /**
         * 16.Распечатать следующие выражения, где вместо … будет выведен результат арифметической операции:
         * Sum of k and l = …
         * k * m = …
         * Разность переменных l и m = …
         */


        System.out.println();
        System.out.println("Sum of k and l = " + (k + l));
        System.out.println("k * m = " + (k * m));
        System.out.println("Разность переменных l и m = " + (l - m));

        // 17.Распечатать следующие выражения:
        //Результат деления k на l = …, а остаток от деления  = …
        //Результат деления k на m = …, а остаток от деления  = …
        //Результат деления l на m = …, а остаток от деления  = …
        //Результат деления m на k = …, а остаток от деления  = …

        System.out.println();
        System.out.println("Результат деления k на l = " + (k / l) + " а остаток от деления = " + (k % l));
        System.out.println("Результат деления k на m = " + (k / m) + " а остаток от деления = " + (k % m));
        System.out.println("Результат деления l на m = " + (l / m) + " а остаток от деления = " + (l % m));
        System.out.println("Результат деления m на k = " + (m / k) + " а остаток от деления = " + (m % k));
        System.out.println(line);


        // 18. Создать переменные apple и  student и присвоить им значения 40 и 6 соотетственно. Распечатать выражение:
        //Если … яблок поделить на … учеников, то каждый ученик получит по … яблок(a), и … яблок(а) останется учителю.
        //
        //Распечатать это же выражение со значениями 100 и 21.

        int apple = 100;
        int student = 21;

        System.out.println("Если " + (apple) + " яблок поделить на " + (student) + " учеников, то " +
                "каждый ученик получит по " + (apple / student) + " яблок(a), и " + (apple % student) + " яблок(а) " +
                "останется учителю.");

        System.out.println(line);


        // 19. Распечатать вычисления и итоговый результат:
        //Сумма чисел k, l, m++ и sumKLM-- = …, а разность m++ и  sumLKM = …

        m++;
        int sumKLM = k + l + m;
        int c1 = sumKLM--;

        System.out.println("Сумма чисел k, l, m++ и sumKLM-- = " + (sumKLM + c1) + ", " +
                "а разность m++ и  sumLKM = " + (m - sumKLM));

        System.out.println(line);


        // 20. Показать, что число 48 кратно 8, и что оба этих числа - четные. А числа 47 и 49 - нечетные.

        System.out.println(48 % 8);
        System.out.println("Если 0 значение 48 четное, кратно 8");
        System.out.println(line);
        System.out.println(48 % 2);
        System.out.println("Если 0 значение 48 четное, если 1 значит нечетное");
        System.out.println(line);
        System.out.println(8 % 2);
        System.out.println("Если 0 значение 8 четное, если 1 значит нечетное");
        System.out.println(line);

        System.out.println(47 % 2);
        System.out.println("Если 0 значение 47 четное, если 1 значит нечетное");
        System.out.println(line);
        System.out.println(49 % 2);
        System.out.println("Если 0 значение 49 четное, если 1 значит нечетное");
        System.out.println(line);


        // Part 3

        double x = 2;
        double y = 3;
        double a = k;
        double b = l;
        double c = m;
        double d = y - x;

        double result21 = (x + 3) * (x + 3);

        double result22 = ((3 + 4 * x) / 5) - ((10 * (y - 5) * (a + b + c)) / x) + 9 * ((4 / x) + (9 / x) / y);

        double result23 = (5 * x + 7 * y) / (8 * x + 10 * y) / ((3 * x - y) / (x + y) / ((a + b + (c / d) + ((a + b) / (c + d)) + a * b)));

        System.out.println("Task\tresult");
        System.out.println("21\t\t" + (result21));
        System.out.println("22\t\t" + (result22));
        System.out.println("23\t\t" + (result23));


    }
}
