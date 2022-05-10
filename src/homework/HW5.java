package homework;

import javax.crypto.spec.PSource;
import javax.swing.*;
import java.sql.SQLOutput;

public class HW5 {

    public static int task (int a) {

        String ln = "***************";
        System.out.println(ln + " Task " + a + " " + ln);
        System.out.println();

        return a;
    }

    public static void verifyEquals (String expectedResult, String actualResult){
        if(expectedResult.equals(actualResult)){
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        }else{
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

    public static void verifyEquals (int expectedResult, int actualResult){
        if(expectedResult == actualResult){
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        }else{
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

    public static void verifyEquals (Double expectedResult, Double actualResult){
        if(expectedResult.equals(actualResult)){
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        }else{
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

    public static String dayNumber (int dayNumber){
        String day = "";
        if(dayNumber < 1 || dayNumber > 7){
            day = "Input correct dayNumber";
        } else if (dayNumber == 1){
            day = "Monday";
        } else if (dayNumber == 2){
            day = "Thursday";
        } else if (dayNumber == 3){
            day = "Wensday";
        } else if (dayNumber == 4){
            day = "Thursday";
        } else if (dayNumber == 5){
            day = "Friday";
        } else if (dayNumber == 6){
            day = "Saturday";
        } else if (dayNumber == 7){
            day = "Sunday";
        }

        return day;
    }

    public static int largest (int x, int y, int z){
        int max;
        if(x > y){
            max = x;
        }else{
            max = y;
        }if(z > max){
            max = z;
        }

        return max;
    }

    public static int largestWithMath (int x, int y, int z){
        int max2 = Math.max(Math.max(x, y),z);

        return max2;
    }

    public static int smallest (int a, int b, int c){
        int min;
        if(a < b){
            min = a;
        }else{
            min = b;
        }if(c < min){
            min = c;
        }

        return min;
    }

    public static String averageTemperatureCat (double a, double b, double c, double d, double e){
        String result = " ";
        double average;
        average = (a + b + c + d + e) / 5;
        if(38.0 > a || a > 40.0) {
            result = "Input correct value";
        }else if(38.0 > b || b > 40.0) {
            result = "Input correct value";
        }else if(38.0 > c || c > 40.0) {
            result = "Input correct value";
        }else if(38.0 > d || d > 40.0) {
            result = "Input correct value";
        }else if(38.0 > e || e > 40.0) {
            result = "Input correct value";
        }else {
            result = ("Average Temperature of cat = " + average);
        }

        return result;
    }

    public static String rubKop (double price){
        String result = "";
        int rub = (int) price;
        double kop1 = price * 100 - rub * 100;
        int kop = (int) kop1;
        result = (rub + " руб " + kop + " копеек");

        return result;
    }

    public static String kilogramGram (double weight){
        String result = "";
        int kg = (int) weight;
        double gr1 = weight * 1000 - kg * 1000;
        int gr = (int) gr1;
        result = (kg + " килограмм " + gr + " грамм");

        return result;
    }

    public static Double totalPrice (double price, double amount){
        double total = price * amount;

        return total;
    }

    public static String check (String product, double price, double weight){

        String check1 = product + "\n";
        String check2 = "Цена за 1 кг \t\t" + rubKop(price) + "\n";
        String check3 = "Количество товара\t" + kilogramGram(weight)+ "\n";
        String ln = "__________________________________________"+ "\n";
        String check4 = "Сумма к оплате \t\t" + rubKop(totalPrice(price,weight))+ "\n";
        String result = check1 +check2 + check3 + ln + check4;

        return result;
    }

    public static int monthSalary (int hours, int priceHours){
        int salary = hours * priceHours * 22;

        return salary;
    }

    public static String vedomost (String name, double salary){
        String vedomost = name + "\t\t\t" + rubKop(salary);

        return vedomost;
    }

    public static String positiveOrNegative (int x){

        String a = "";
        if (x < 0){
            a = "x is negative";
        }else if (x > 0){
            a = "x is positive";
        }else{
            a = "x = 0";
        }

        return a;
    }

    public static String luckyNumber (int year){
        int first = year / 1000;
        int second = year / 100 % 10;
        int third = year % 100 / 10;
        int fourth = year % 10;

        int count = first + second + third + fourth;
        if(count < 10){

            return "Lucky number = " + count;
        }else{
            first = count / 10;
            second = count % 10;
            count = first + second;
            if(count < 10){

                return "Lucky number = " + count;
            }else{
                first = count / 10;
                second = count % 10;
                count = first + second;

                return "Lucky number = " + count;
            }
        }
    }

    public static String average1 (int a, int b, int c) {

        String result = "";
        int sum = (a + b + c);
        int average = sum / 3;
        int median = sum - largest(a, b, c) - smallest(a, b, c);
        int dif = average - median;
        if (dif < 0) {
            dif = (-1) * dif;
        }

        if (dif > 2) {
            result = "Среднее значение " + average + "отличается от медианы " + median + "на " + dif;
        } else {
            result = "Среднее значение = " + sum + " , медиана = " + median;
        }

        return result;
    }

    public static String average2 (int a, int b, int c){
        int average = (a + b + c) / 3;
        int max = Math.max(Math.max(a,b),c);
        int min = Math.min(Math.min(a,b),c);
        int median = a + b + c -(min + max);
        String result = "";

        int dif = average - median;
        Math.abs(dif);

        if(dif > 2){
            result = "Среднее значение " + average + "отличается от медианы " + median + "на " + dif;
        }else{
            result = "Среднее значение = " + average + " , медиана = " + median;
        }

        return result;
    }

    public static String customer (double a){
        int b = (int)Math.floor(a);
        String sum = b + " rub " + (b / 100) + "0" + " kop";

        return sum;
    }

    public static Double task16 (int a, int b, int c){

        double result = Math.ceil(Math.sqrt((a * b + c) * Math.pow(a,b)) / Math.PI);

        return result;
    }

    public static void task_17_1 (int y){

        if(y > 0) {
            int x = 1;
        }else{
            System.out.println("y smaller than 0");
        }
    }

    public static double task_17_2 (double score){
        if(score >= 80 && score <= 90){
            score = score + 5;
        }

        return score;
    }

    public static boolean task_17_3 (int i, int v){
        boolean item = i > 10 && v <= 50;

        return item;
    }

    public static boolean task_17_4 (int x){
        boolean ans = (x > 0) && (x % 2 == 0);

        return ans;
    }

    public static boolean task_17_5 (int x, int y){
        boolean ans = (x > 0) && (y > 0);

        return ans;
    }

    public static boolean task_17_6 (int x, int y){
        boolean ans = (x > 0 && y > 0) || (x < 0 && y < 0);

        return ans;
    }

    public static double getPow (int pow){
        if(pow >= 0 && pow <= 10){
            return Math.pow(Math.random(), pow);

        }else{
            System.out.println("Error");
            return Double.MIN_VALUE;
        }
    }

    public static double getRandom (){
        int num = (int)(Math.random() * 99) + 1;
        System.out.println(num);

        return num;
    }

    public static String leapYear (int year){
       boolean isLeapYear;
        if(year % 4 == 0){
            if(year % 100 == 0){
                if (year % 400 == 0){
                    isLeapYear = true;
                }else{
                    isLeapYear = false;
                }
            }else {
                isLeapYear = true;
            }

        }else{
            isLeapYear = false;
        }

        return "Year " + year + " is a Leap year = " + isLeapYear;
    }





    public static void main (String [] args){

        task(1);
        //результаты должны быть протестированы, для этого необходимо создать метод
        // с названием verifyEquals(expectedResult, actualResult)

        task(2);
        //Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели.
        System.out.println(dayNumber(1));
        verifyEquals(dayNumber(2),"Thursday");


        task(3);
        // variable largest x, y, z
        System.out.println("Largest = " + largest(5,7,3));
        verifyEquals(7, 7);
        largestWithMath(5,2,7);

        task(4);
        // variables smallest a, b, c
        System.out.println("Smaller = " + smallest(1,2,0));
        verifyEquals(0,0);

        task(5);
        // Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота.

        System.out.println(averageTemperatureCat(39.5, 39.5,39.5,39.5,39.5));

        verifyEquals(averageTemperatureCat(39.5, 39.5,39.5,39.5,39.5),
                "Average Temperature of cat = 39.5");
        verifyEquals(averageTemperatureCat(39.5, 39.5,9.5,39.5,39.5),
                "Input correct value");


        task(6);
        //Написать метод, который принимает на вход десятичное число
        //(например, 10.75), и возвращает строку “10 руб 75 коп”.
        System.out.println(rubKop(7.5));
        verifyEquals(rubKop(11.25), "11 руб 25 копеек");
        verifyEquals(rubKop(7.5), "7 руб 50 копеек");

        task(7);
        //Написать метод, который принимает на вход десятичное число
        // и возвращает строку “10 кг 75 гр”.
        System.out.println(kilogramGram(10.75));
        verifyEquals(kilogramGram(15.075), "15 килограмм 75 грамм");
        verifyEquals(kilogramGram(10.75), "10 килограмм 750 грамм");

        task(8);
        //Написать метод, который принимает на вход 2 параметра -  цену и количество товара
        //(может быть вес товара, или количество в штуках).
        // Алгоритм возвращает сумму покупки в виде десятичного числа.
        System.out.println(rubKop(totalPrice(7.50,5)));
        verifyEquals(rubKop(totalPrice(7.50,4)),"30 руб 0 копеек");
        verifyEquals(rubKop(totalPrice(7.50,5)),"37 руб 50 копеек");

        task(9);
        //Написать метод, который принимает на вход необходимые параметры, и печатает чек.
        System.out.println(check("Яблоки", 10,3));
        verifyEquals(check("Яблоки", 7.5,1.5),"Яблоки\n" +
                "Цена за 1 кг \t\t7 руб 50 копеек\n" +
                "Количество товара\t1 килограмм 500 грамм\n" +
                "__________________________________________\n" +
                "Сумма к оплате \t\t11 руб 25 копеек\n");
        verifyEquals(check("Яблоки", 10,3),"Яблоки\n" +
                "Цена за 1 кг \t\t10 руб 0 копеек\n" +
                "Количество товара\t3 килограмм 0 грамм\n" +
                "__________________________________________\n" +
                "Сумма к оплате \t\t30 руб 0 копеек\n");
        
        task(10);
        //Написать метод, который принимает на вход количество часов работы в день
        //и стоимость одного часа работы, и возвращает заработную плату в месяц.
        int hours = 10;
        int priceHours = 10;
        System.out.println("If you work " + hours + "hours a day, for price " + priceHours
                + " dollar of hour, then your month salary = " + monthSalary(hours,priceHours ) + " dollars");

        verifyEquals(monthSalary(8,10),1760);
        verifyEquals(monthSalary(10,10),2200);

        task(11);
        //Написать метод, который принимает на вход необходимые параметры
        // и печатает строку ведомости выдачи зарплаты сотрудникам.

        System.out.println("Март 2022");
        System.out.println();
        System.out.println(vedomost("Смирнова Мария Ивановна", 70000.00));
        System.out.println(vedomost("Серебряков Иван Петрович ", 128059.00));

        verifyEquals(vedomost("Смирнова Мария Ивановна", 70000.00),
                "Смирнова Мария Ивановна\t\t\t70000 руб 0 копеек");

        task(12);
        //Записать в виде метода:
        System.out.println(positiveOrNegative(-1));
        verifyEquals(positiveOrNegative(1), "x is positive");
        verifyEquals(positiveOrNegative(-1), "x is negative");

        task(13);
        // Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число.
        // Счастливое число рассчитывается по формуле: сумма всех чисел, если результат больше 9, снова
        // считается сумма всех чисел.

        System.out.println(luckyNumber(2005));
        verifyEquals(luckyNumber(2005),"Lucky number = 7");

        task(14);
        //а) Дано 3 числа. Необходимо рассчитать разницу между средним значением и медианой (median) значением.
        //Если разница больше 2, необходимо показать сообщение: “Среднее значение … отличается от медианы … на … “.
        //Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.
        //
        //b) Посчитать все то же самое с помощью методов класса Math, где возможно их использовать

        System.out.println(average1(1,2,3));
        System.out.println(average2(3,7,9));

        task(15);
        //Написать метод, который использует методы класса Math,
        //принимает на вход сумму к оплате (например, 10.75) и округляет сумму в пользу покупателя.
        //Метод возвращает новую сумму к оплате в виде строки, например “10 руб 00 коп”.
        System.out.println(customer(10.99));

        task(16);
        //Посчитать с помощью методов класса Math
        System.out.println(task16(3,4,20));

        task(171);
        task_17_1(-5);

        task(172);
        System.out.println(task_17_2(82));

        task(173);
        System.out.println(task_17_3(2,51));

        task(174);
        System.out.println(task_17_4(4));

        task(175);
        System.out.println(task_17_5(-2,-3));

        task(176);
        System.out.println(task_17_6(-2,-1));

        task(18);
        //Написать метод, который с помощью методов класса Math высчитывает
        // любую степень сгенерированного случайного числа.
        // Метод возвращает математически округленное целое значение и выводит на экран:
        //“Число … в степени … = …”
        //Число может быть в пределах от 0 до 1 исключительно.
        //Степень числа может быть от 0 до 10 включительно

        System.out.println(getPow(11));

        task(19);
        //Написать метод, который возвращает случайное число в пределах от 1 до 99 включительно.
        getRandom();

        task(20);
        System.out.println(leapYear(2000));




    }
}
