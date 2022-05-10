package homework.hw8;

import homework.Utilites;

import java.util.Arrays;

import static homework.Utilites.*;

public class HW8 {


    public static void main(String[] args) {

        //Создать объекты типа Integer, Double, String и присвоить им такие же значения, как и переменным класса HW8_1
        taskNumber(5);
        Integer numberInt = HW8_1.numberInt;
        Double numberDouble = HW8_1.numberDouble;
        String text = HW8_1.text;

        boolean isNumberInt = numberInt.equals(HW8_1.numberInt);
        System.out.println(isNumberInt);

        boolean isNumberDouble = numberDouble.equals(HW8_1.numberDouble);
        System.out.println(isNumberDouble);

        boolean isText = text.equals(HW8_1.text);
        System.out.println(isText);


        taskNumber(6);
        //Сравнить переменные соответствующих типов из классов HW8_1 и HW8 и
        // распечатать результат сравнения в виде таблички:

        System.out.println("__________________________________________________");
        System.out.println("HW8" + "          |" + "HW8_1" + "            |" + "  areEquals?");
        System.out.println("__________________________________________________");
        System.out.println("Int i = " + numberInt + "     | " + "Int i_1 = " + HW8_1.numberInt + "      |     "
                + HW8_1.numberInt.equals(numberInt));
        System.out.println("__________________________________________________");
        System.out.println("Int i = " + numberDouble + "   | " + "Int i_1 = " + HW8_1.numberDouble
                + "     |    " + HW8_1.numberDouble.equals(numberDouble));
        System.out.println("__________________________________________________");
        System.out.println("Int i = " + text + " | " + "Int i_1 = " + HW8_1.text
                + "  |     " + HW8_1.text.equals(text));
        System.out.println("__________________________________________________");

        System.out.println();

        taskNumber(7);
        //Написать метод, который принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел
        System.out.println(Arrays.toString(Utilites.arrayFiveNumbers(1,2,3,4,5)));

        taskNumber(8);
        //Написать метод, который принимает на вход 5 чисел типа double,  и возвращает массив из этих же чисел
        System.out.println(Arrays.toString(Utilites.arrayFiveDoubleNumbers(1,2,3,4,5)));

        taskNumber(9);
        //Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов
        System.out.println(Arrays.toString(Utilites.arrayFiveDoubleNumbers("One","Two","Three","Four","Five")));

        taskNumber(10);
        //Написать метод, который принимает на вход массив целых чисел,
        // и возвращает массив тех же чисел, умноженных на 2.5
        System.out.println(Arrays.toString((task10(arrayFiveNumbers(1, 2, 3, 4,5)))));

        // alternative method:
//
//        private static double[] createArrayByMultiple (int [] array, double a){
//            double[] newArray = new double[array.length];
//            for (int i = 0; i < array.length; i++){
//                newArray[i] = array[i] * a;
//            }
//            return newArray;
//        }
//

        taskNumber(11);
        //Написать метод, который принимает на вход массив целых положительных чисел,
        //и возвращает количество четных чисел в этом массиве









    }
}

