package homework;

import java.util.SplittableRandom;

public class HW4 {

    public static void printTask(double taskNumber) {
        String line = " ==========================";
        String task = " Task ";
        System.out.println();
        System.out.println(line + task + taskNumber + line);
        System.out.println();
    }

    public static void resultOfDivisions (int a, int b, String letter1, String letter2) {
        System.out.println("Результат деления " + letter1 + " на " + letter2+ " = " + a / b +
                ", а остаток от деления  = " + a % b);

    }

    public static String decApples(int appleCount) {
        int appleLastNumber = appleCount % 10; // Находим на какое число заканчивается наше число
        String apples = ""; //Пустая строка для записи
        boolean appleExclusion = (appleCount % 100 >= 11) && (appleCount % 100 <= 14); // Переменна для исключений между 11 и 14
        if (appleLastNumber == 1) { // Если окончание 1: одно яблоко
            apples = "яблоко";
        } else if (appleLastNumber == 0 || appleLastNumber >= 5) {// Если окончание 0 или больше или равно 5: ноль яблок, пять яблок
            apples = "яблок";
        } else if (appleLastNumber >= 2) { // Если окончание от 2 до 5 ти: два яблока, три яблока
            apples = "яблока";
        }
        if (appleExclusion) { // Если исключение: 11 яблок, 12 яблок, 13 яблок, 14 яблок.
            apples = "яблок";
        }
        return apples;
    }

    public static String decStudents(int studentCount) {
        int studentLastNumber = studentCount % 10;
        boolean studentExclusion = (studentCount % 100 >= 11) && (studentCount % 100 <= 14);
        String students = "";
        if (studentLastNumber == 1) {
            students = "ученика";
        } else if (studentLastNumber == 0 || studentLastNumber >= 5) {
            students = "учеников";
        } else if (studentLastNumber >= 2) {
            students = "ученика";
        }
        if (studentExclusion) {
            students = "учеников";
        }
        return students;
    }

    public static void countApples(int numOfApples, int numOfStudents) {
        System.out.println("Если " + numOfApples + " " + decApples(numOfApples) + " поделить на " + numOfStudents + " "
                + decStudents(numOfStudents) + ", то каждый ученик получит " + (numOfApples / numOfStudents) + " "
                + decApples(numOfApples / numOfStudents) + ", и " + (numOfApples % numOfStudents) + " "
                + decApples(numOfApples % numOfStudents) + " останется учителю.");
    }

    public static void divisionsApple(int a, int b){

        System.out.println("Если "+ a + "поделить на " + b + " учеников, " +
                "то каждый ученик получит по " + a / b + " яблок(a), и " + a % b + " яблок(а) останется учителю");
    }

    public static void calculatorForingeit (int temperatureCelciy) {

        int temperatureForingeyt = (temperatureCelciy * 9 / 5) + 32;
        System.out.println(temperatureCelciy + "градусов по Цельсию равно " + temperatureForingeyt + " по Фарингейту");
    }

    public static int tableI (int i){
        i = i * i;

        return i;
    }




    public static void main(String[] args) {

        /**
         * Записать в виде кода следующие логические выражения:
         * 	1) (2 = 2) И (7 = 7);
         * 2) Не(15 < 3);
         * 3) ("Сосна" = "Дуб") ИЛИ ("Вишня" = "Клён");
         * 4) Не("Сосна" = "Дуб");
         * 5) (Не(15 < 3)) И (10 > 20);
         * 6) ("Глаза даны, чтобы видеть") И ("Под третьим этажом находится второй этаж");
         * 7) (6/2 = 3) ИЛИ (7*5 = 20).
         */

        printTask(3);

        // 1) (2 = 2) И (7 = 7);

        if (2 == 2 && 7 == 7) {
            System.out.println("(2 = 2) И (7 = 7) is True");
        } else {
            System.out.println("(2 = 2) И (7 = 7) is False");
        }

        // 2 Не(15 < 3);

        if (!(15 < 3)) {
            System.out.println("Не (15 < 3) is True");
        } else {
            System.out.println("Не(15 < 3); is False");
        }

        //3 ("Сосна" = "Дуб") ИЛИ ("Вишня" = "Клён");

        if (("Сосна" == "Дуб") || ("Вишня" == "Клён")) {
            System.out.println("Сосна = Дуб ИЛИ Вишня = Клён is True");
        } else {
            System.out.println("Сосна = Дуб ИЛИ Вишня = Клён is False");
        }

        //4 Не("Сосна" = "Дуб");

        if (!("Сосна" == "Дуб")) {
            System.out.println("Не(Сосна = Дуб) is True");
        } else {
            System.out.println("Не(Сосна = Дуб) is False");
        }

        //5 (Не(15 < 3)) И (10 > 20);

        if (!(15 < 3) && (10 > 20)) {
            System.out.println("Не(15 < 3)) И (10 > 20) is True");
        } else {
            System.out.println("Не(15 < 3)) И (10 > 20) is False");
        }

        //6 ("Глаза даны, чтобы видеть") И ("Под третьим этажом находится второй этаж");

        boolean eyes = true;
        boolean floor = true;

        if (eyes && floor) {
            System.out.println("Глаза даны, чтобы видеть И Под третьим этажом находится второй этаж is True");
        } else {
            System.out.println("Глаза даны, чтобы видеть И Под третьим этажом находится второй этаж is False");
        }

        //7 (6/2 = 3) ИЛИ (7*5 = 20)

        if ((6 / 2 == 3) || (7 * 5 == 20)) {
            System.out.println("(6/2 = 3) ИЛИ (7*5 = 20) is True");
        } else {
            System.out.println("(6/2 = 3) ИЛИ (7*5 = 20) is False");
        }

        /**
         *  4. Записать в виде кода:
         * 1) ("В минуте 70 секунд") ИЛИ ("Работающие часы показывают время");
         * 2) !(28 > 7) И !(300/5 = 60);
         * 3) ("Телевизор - электрический прибор") И ("Стекло - дерево");
         * 4) Не((300 < 100))  → ("Жажду можно утолить водой");
         * 5) (75 < 81) → (88 = 88).
         */

        printTask(4);

        // 1) ("В минуте 70 секунд") ИЛИ ("Работающие часы показывают время");

        int inMinute = 70;
        String correctTime = "Работающие";

        if (inMinute == 60 || correctTime == "Работающие") {
            System.out.println("В минуте " + inMinute + " секунд ИЛИ " + correctTime + " часы показывают время is True");
        } else {
            System.out.println("В минуте " + inMinute + " секунд ИЛИ " + correctTime + " часы показывают время is False");
        }

        // 2) !(28 > 7) И !(300/5 = 60);

        if (!(28 > 7) && 300 / 5 != 60) {
            System.out.println("!(28 > 7) И !(300/5 = 60) is True");
        } else {
            System.out.println("!(28 > 7) И !(300/5 = 60) is False");
        }

        // 3) ("Телевизор - электрический прибор") И ("Стекло - дерево");

        String electric = "электрический";

        if (electric == "электрический" && "Стекло" == "дерево") {
            System.out.println("Телевизор - электрический прибор И Стекло - дерево is True");
        } else {
            System.out.println("Телевизор - электрический прибор И Стекло - дерево is False");
        }

        // 4)  Не((300 < 100))  → ("Жажду можно утолить водой");

        if (!((300 < 100))) {
            System.out.println("Жажду можно утолить водой is True");
        } else {
            System.out.println("Жажду можно утолить водой is False");
        }

        // 5) (75 < 81) → (88 = 88).
        if ((75 < 81)) {
            System.out.println("88 = 88 is True");
        } else {
            System.out.println("88 = 88 is False");
        }

        /**
         *  5 Записать в виде кода следующие выражения:
         * 	а) Андрей старше Светы. Наташа старше Светы.
         *  б) На полке стоят учебники, а на столе лежат справочники.
         *  в) БОльшая часть детей — девочки. Остальные - мальчики.
         */

        printTask(5);

        // а) Андрей старше Светы. Наташа старше Светы.
        int andrew = 15;
        int sveta = 10;
        int natasha = 13;
        if (andrew > sveta && natasha > sveta) {
            System.out.println("Андрей старше Светы. Наташа старше Светы is True");
        } else {
            System.out.println("Андрей старше Светы. Наташа старше Светы is False");
        }

        // б) На полке стоят учебники, а на столе лежат справочники.
        String polka = "полке";
        String stol = "столе";
        if (polka == "полке") {
            System.out.println("На " + polka + " стоят учебники is True");
        } else{
            System.out.println("На " + polka + " стоят учебники is False");
        }
        if (stol == "столе"){
            System.out.println("На " + stol + " лежат справочники is True");
        }else{
            System.out.println("На " + stol + " лежат справочники is False");
        }

        // в) БОльшая часть детей — девочки. Остальные - мальчики.

        int children = 100;
        int gendor = 30;

        if (gendor > children / 2) {
            int girls = gendor;
            int boys = children - gendor;
            System.out.println("если девочек " + girls + " значит мальчиков " + boys);
        } else {
            int girls = children - gendor;
            int boys = gendor;
            System.out.println("если девочек " + girls + " значит мальчиков " + boys);
        }

        /**
         *  6. “Водительские права можно получить, только когда исполнится 16 лет.”
         */

        printTask(6);

        int legalAge = 14;
        if (legalAge >= 16) {
            System.out.println("Водительские права можно получить");
        } else {
            System.out.println("Водительские права можно получить, только когда исполнится 16 лет.");
        }


        /**
         *  7. ”Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно”
         */
        printTask(7);

        String petyaRun = "не едет";
        String petyaread = "читает";
        String petyaLook = "не смотрит";

        if (petyaRun == "не едет" && (petyaread == "читает" || petyaLook == "не смотрит")) {
            System.out.println("Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно is True");
        } else {
            System.out.println("Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно is False");
        }

        /**
         *  8. “Если с другом ты, это хорошо, а когда наоборот - плохо”
         */
        printTask(8);

        String friend = "с другом";
        if (friend == "с другом") {
            System.out.println("Если с другом ты, это хорошо");
        } else {
            System.out.println("Если ты не с другом - плохо");
        }

        /**
         *  9. Записать выражения в виде условий if-else:
         *  - Если тебе больше 18 лет, то ты взрослый. Иначе, ты - ребенок.
         *  - Если земля сухая, значит, нет дождя. Если земля мокрая, то идет дождь.
         *  - Если земля сухая, значит, нет дождя. Если земля мокрая, то идет дождь. Иначе идет снег.
         *  - Если на небе тучи, идет дождь, иначе идет “слепой” дождь.
         *  - Если сегодня суббота, значит, завтра воскресенье. Если сегодня пятница, значит, вчера был четверг.
         *    Иначе вчера был не четверг, а завтра - не воскресенье
         *  - Если на горе свистнул рак, значит, прошла вечность, иначе ждите дальше.
         *  - Если тебе 18 или ты закончил школу, то ты можешь не жить с родителями, иначе живи с родителями.
         */

        printTask(9.1);

        int age = 20;
        if (age > 18) {
            System.out.println("ты взрослый");
        } else {
            System.out.println("ты - ребенок");
        }
        System.out.println();

        printTask(9.2);

        String weather = "сухая";
        if (weather == "сухая") {
            System.out.println("Если земля сухая, значит, нет дождя");
        } else {
            System.out.println("Если земля мокрая, то идет дождь");
        }
        System.out.println();

        printTask(9.3);

        String weather1 = "мокрая";
        if (weather1 == "сухая") {
            System.out.println("Если земля сухая, значит, нет дождя");
        } else {
            if (weather1 == "мокрая") {
                System.out.println("Если земля мокрая, то идет дождь");
            } else {
                System.out.println("идет снег.");
            }
        }
        System.out.println();

        printTask(9.4);

        String sky = "тучи";
        if(sky == "тучи"){
            System.out.println("идет дождь");
        } else {
            System.out.println("идет “слепой” дождь");
        }
        System.out.println();

        printTask(9.5);

        //Если сегодня суббота, значит, завтра воскресенье. Если сегодня пятница, значит, вчера был четверг.
        //         *    Иначе вчера был не четверг, а завтра - не воскресенье
        String saturday = "суббота";
        String sunday = "воскресенье";
        String friday = "пятница";
        String thursday = "четверг";
        String today;

        today = sunday;

        if(today == saturday) {
            System.out.println("значит, завтра воскресенье");
        } else if(today == friday){
            System.out.println("значит, вчера был четверг");
        }else{
            System.out.println("вчера был не четверг, а завтра - не воскресенье");
        }
        System.out.println();

        printTask(9.6);

        //Если на горе свистнул рак, значит, прошла вечность, иначе ждите дальше.

        String gora = "на горе свистнул рак";
        if (gora == "на горе свистнул рак"){
            System.out.println("прошла вечность");
        } else {
            System.out.println("ждите дальше");
        }

        System.out.println();

        printTask(9.7);

        // Если тебе 18 или ты закончил школу, то ты можешь не жить с родителями, иначе живи с родителями.

        int age1 = 18;
        String endSchool = "закончил школу";

        if (age1 >= 18 || endSchool == "закончил школу") {
            System.out.println("ты можешь не жить с родителями");
        } else {
            System.out.println("живи с родителями");
        }

        /**
         *  10. Проверьте число на четность. Если число четное, удвойте это число, иначе возведите число в квадрат.
         *      Выведите результат работы алгоритма на печать.
         *      Найдите в презентации, какой блок схеме соответствует ваш алгоритм.
         */

        printTask(10);
        int parity = 5;

        if (parity % 2 == 0){
            parity = parity * 2;
        } else {
            parity = parity * parity;
        }
        System.out.println(parity);


        /**
         * 11. Напишите алгоритм проверки возраста на соответствие условиям (if-else):
         *     Голосовать можно с 18 лет
         *     Машину можно водить с 16 лет
         *     В школу можно идти с 5 лет
         *     Выведите результат работы алгоритма на печать.
         */

        printTask(11);
        int age2 = 17;

        if (age2 >= 100) {
            System.out.println("False");
        } else {
            if (age2 >= 18){
                System.out.println("Голосовать можно");
            }
            if (age2 >= 16){
                System.out.println("Машину можно водить");
            }
            if (age2 >= 5){
                System.out.println("В школу можно идти");
            }
        }

        /**
         * 12. Напишите алгоритм программы, которая проверяет оценку ученика и выполняет следующие действия:
         *         5 - выдать похвальную грамоту и перевести в следующий класс
         *         4 - перевести в следующий класс
         *         3 - дать задание на лето и перевести в следующий класс
         *         2 - вызвать родителей и оставить в текущем классе на второй год
         *         Выведите результат работы алгоритма на печать.
         */


        printTask(12);
        int mark = 6;
        if(mark <= 5 && mark >= 2){

            if (mark == 5){
                System.out.println("выдать похвальную грамоту и перевести в следующий класс");
            }
            if (mark == 4){
                System.out.println("перевести в следующий класс");
            }
            if(mark == 3){
                System.out.println("дать задание на лето и перевести в следующий класс");
            }
            if (mark == 2){
                System.out.println("вызвать родителей и оставить в текущем классе на второй год");
            }
        }else {
            System.out.println("Введите корректную оценку");
        }

        /**
         *  13. Напишите алгоритм программы, которая проверяет 2 числа.
         *  Программа складывает числа, которые делятся на 3 без остатка, и вычитает числа,
         *  которые делятся на 5 без остатка. Программа умножает числа, которые делятся на 2 без остатка,
         *  но если хотя бы одно число отрицательное, программа умножает результат предыдущего действия на (-1).
         * Если числа не прошли ни одну проверку, программа выводит на печать ошибку
         * о невозможности произвести действия.
         */

        printTask(13);
        int num1 = 9;
        int num2 = 3;
        int count;

        if(num1 % 3 == 0 && num2 % 3 ==0) {
            count = num1 + num2;
            System.out.println(count);
        }
        if (num1 % 5 == 0 && num2 % 5 ==0){
            count = num1 - num2;
            System.out.println(count);
        }
        if (num1 % 2 == 0 && num2 % 2 ==0){
            count = num1 * num2;
            if (count < 0){
                count = (-1) * count;
            }
            System.out.println(count);
        } else {
            System.out.println("Error");
        }

        /**
         *  14. Распечатать следующие выражения, используя метод и параметры:
         * Результат деления k на l = …, а остаток от деления  = …
         * Результат деления k на m = …, а остаток от деления  = …
         * Результат деления l на m = …, а остаток от деления  = …
         * Результат деления m на k = …, а остаток от деления  = …
         * И так далее все возможные варианты.
         * Сравнить код из HW2 с кодом из HW4. Что для вас легче?
         */

        printTask(14);

        int k = 5;
        int l = 2;
        int m = 10;

        resultOfDivisions(k,l,"k", "l");
        resultOfDivisions(k,m,"k","m");
        resultOfDivisions(l,m,"l","m");
        resultOfDivisions(m,k,"m","k");

        /**
         * 15. Выполнить задание 18 из HW2 с помощью метода и параметров:
         *
         * а) Создать переменные apple и  student и присвоить им значения 40 и 6 соответственно. Распечатать выражение:
         * Если … яблок(а) поделить на … учеников, то каждый ученик получит по … яблок(a), и … яблок(а) останется учителю.
         * Распечатать это же выражение со значениями 100 и 21.
         */

        printTask(15);

        int apple = 100;
        int student = 21;

        divisionsApple(apple,student);

        /**
         * 16. Выполнить задание 18 из HW2 с помощью метода и параметров:
         * Написать метод так, чтобы правильные склонения слов (н-р, яблок или яблока) печатались автоматически
         * в зависимости от значений параметров.
         * Распечатать выражение с параметрами:
         * apple = 42, 55, 1
         * student = 42, 5, 2
         */

        printTask(16);
        countApples(42,42);
        countApples(55,5);
        countApples(1,2);

        /**
         * 17. Напишите метод, который примет на вход параметр температуры в Цельсиях,
         * и распечатает результат температуры в Цельсиях и в Фаренгейтах.
         */

        printTask(17);
        calculatorForingeit(5);

        /**
         * 18. а) Создать метод, который примет на вход параметр i и распечатает таблицу:
         * i ^ 2
         * значение i ^ 2
         * b) поменять значение i и распечатать таблицу с новым значением i
         */

        printTask(18);

        int i = 6;
        System.out.println("_____________________");
        System.out.println("| i ^ 2 \t | \t" + tableI(i) + " \t| ");
        System.out.println("_____________________");


        /**
         * 19. Напишите тест, который валидирует (проверит правильность работы)
         * ваш код из задания №10. Тестовые данные - 2, 5, 0.
         */

        printTask(19);

        int y = 0;
        int expectedResult = 0;

        if (y % 2 == 0){
            y = y * 2;
        } else {
            y = y * y;
        }

        System.out.println("y = " + y);

        if(expectedResult == y){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }

        /**
         *  20. Напишите тест, который валидирует ваш код из задания №11.
         *  Придумайте тестовые данные. Выведите результат проверки на печать.
         */
        printTask(20);




        int age20 = 21;
        String expectedResult20 = "В школу можно идти Машину можно водить Голосовать можно ";

        String result1 = "";
        if (age20 >= 100 && age20 <= 0) {
            result1 = "False";
        } else {
            if (age20 >= 5){
                result1 = "В школу можно идти ";
            }
            if (age20 >= 16){
                result1 += "Машину можно водить ";
            }
            if (age20 >= 18){
                result1 += "Голосовать можно ";
            }

        }
        System.out.println("age = " + age20);
        System.out.println(result1);





        if (expectedResult20.equals(result1)){
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }

        /**
         *  21. Напишите алгоритм программы, которая проверяет число типа short на количество разрядов,
         *  и выводит результат проверки.
         * ( Например, “It’s a two-digit number.”, “It’s a five-digit number.”, etc)
         * Выведите результат проверки на печать.
         */

        printTask(21);

        short digitNumber = -5341;

        if (digitNumber >= Short.MIN_VALUE && digitNumber <= Short.MAX_VALUE ) {
            if (digitNumber < 10 && digitNumber > -10) {
                System.out.println("It’s a one-digit number");
            } else if (digitNumber >= 10 && digitNumber < 100 || digitNumber <= -10 && digitNumber > -100) {
                System.out.println("It’s a two-digit number");
            } else if (digitNumber >= 100 && digitNumber < 1000 || digitNumber <= -100 && digitNumber > -1000) {
                System.out.println("It’s a three-digit number");
            } else if (digitNumber >= 1000 && digitNumber < 10000 || digitNumber <= -1000 && digitNumber > -10000) {
                System.out.println("It’s a four-digit number");
            } else if (digitNumber >= 10000 && digitNumber < 100000 || digitNumber <= -10000 && digitNumber > -100000) {
                System.out.println("It’s a five-digit number");
            } else {
                System.out.println("Error");
            }
        }




















    }
}
