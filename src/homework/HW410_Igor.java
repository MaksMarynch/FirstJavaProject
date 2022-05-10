package homework;

public class HW410_Igor {

    public static void main (String [] args){
        task10 (2);
        task19 (task10 (2),4);
        task19 (task10 (5),25);
        task19 (task10 (0),0);
    }


    // 8 primitive data types: int, byte, double, float, char, boolean, long
    // bsil (Byte, Short, Integer, Long) Float, Double, Boolean, Character


    public static int task10 (int number){
//    Проверьте число на четность. Если число четное, удвойте это число, иначе возведите число в квадрат.
//    Выведите результат работы алгоритма на печать.
//    Найдите в презентации, какой блок схеме соответствует ваш алгоритм.
        if(number % 2 == 0){
            number = number * 2;

            return number;
        } else {

            return number * number;
        }
    }

    public static String task19 (int actual, int expected){
//    Напишите тест, который валидирует (проверит правильность работы) ваш код из задания №10.
//    Тестовые данные - 2, 5, 0.
//     input 2 >> expected = 4, input 5 >> expected = 25, input 0 >> expected = 0

        String result = " ";
        if(actual == expected){
            result = "Passed";
        } else {
            result = "Failed";
        }

        System.out.println(result);
        return result;
        }

    }




