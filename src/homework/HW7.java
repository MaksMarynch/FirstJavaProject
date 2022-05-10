package homework;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HW7 {

    public static void taskNumber(int number) {
        String line = "________________ ";
        System.out.println(line + "Task " + number + " " + line);
        System.out.println();
    }


    public static double getAverageOfMassive(int[] massive) {

        double sumArrayInt = 0;
        for (int i = 0; i < massive.length; i++) {
            sumArrayInt += massive[i];
        }
        int arrayIntLenght = massive.length;
        double average = sumArrayInt / arrayIntLenght;

        return average;
    }

    public static int [] getMinMaxAndAverageMassives(int[] massive) {

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] < min) {
                min = massive[i];
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] > max) {
                max = massive[i];
            }
        }

        int sum = 0;
        for (int i = 0; i < massive.length; i++) {
            sum += massive[i];
        }

        int arrayIntLenght = massive.length;
        int average = sum / arrayIntLenght;

        int[] result = new int[3];
        result[0] = min;
        result[1] = max;
        result[2] = average;

        return result;
    }

    public static int[] getMinMaxAverageMassive (int [] array){
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        int average;
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] < minimum){
                minimum = array[i];
            }
            if(array[i] > maximum){
                maximum = array[i];
            }
            sum += array[i];
        }
        average = sum / array.length;
        int[] arr = {minimum, maximum, average};

        return arr;
    }



    public static void veryfyEquals (String expectedResult, String actualResult){
        if(expectedResult.equals(actualResult)){
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        }else{
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

    public static void veryfyEquals (Double expectedResult, Double actualResult){
        if(expectedResult.equals(actualResult)){
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        }else{
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }



    public static void main (String [] args){
        //1. Создать массив catsNames, заполнить его любыми значениями (см картинку котов из презентации).
        taskNumber(1);

        String catsNames [] = {"Серый барсик","Черныш","Серая киска","Барсик","Рыжик","Серыш","Абрикос","Батонос"};


        //2. В массиве catsNames изменить значение элемента с индексом 4 на “Рыжик”,
        //а значение элемента с индексом 1 на “Черныш”.
        taskNumber(2);

        catsNames[1] = "Черныш";
        catsNames[4] = "Рыжик";

        System.out.println(catsNames[3]);

        //3. Создать массив catsColors и заполнить его значениями.
        taskNumber(3);
        String[] catsColors = {"Gray","Black","Gray","Brown","Red","Gray","Red","Gray"};
        for(int i = 0; i < catsColors.length; i++){
            System.out.print(catsColors[i] + ", ");
        }
        System.out.println();

        //4. Создать массив catsAges и заполнить его любыми значениями.
        taskNumber(4);
        int [] catsAges = {3, 2, 1, 4, 5, 6, 5, 1};
        System.out.println(Arrays.toString(catsAges));

        //5. Создать массив isCatRed и заполнить его соответствующими значениями
        taskNumber(5);

        //boolean[]isCatRed = {false, false, false, false, true,
        // false, true, false,};


        int a = 0;
        for(int i = 0; i < catsColors.length; i++){
            a += 1;
            System.out.println(a);
        }
        boolean [] isCatRed1 = new boolean[a];
        for(int i = 0; i < a; i++){
            if(catsColors[i].equals("Red")){
                System.out.println(isCatRed1[i] = true);
            }else{
                System.out.println(isCatRed1[i] = false);
            }
        }
        System.out.println(Arrays.toString(isCatRed1));



        // 6. Распечатать для массивов catsNames и catsColors:
        //имя кота в коробке с номером 6
        //имена котов из коробок с четными индексами
        //имена котов из коробок, чьи индексы кратны 4
        //цвет котов из коробок с нечетными индексами
        //цвет котов из коробок, чьи индексы кратны 3
        taskNumber(6);
        System.out.println(catsNames[6]);
        System.out.println("____________________");

        for(int i = 0; i < catsNames.length;i++){
            if(i % 2 == 0){
                System.out.println(catsNames[i]);
            }
        }
        System.out.println("____________________");

        for(int i = 0; i < catsNames.length;i++){
            if(i % 4 == 0){
                System.out.println(catsNames[i]);
            }
        }
        System.out.println("____________________");

        for(int i = 0; i < catsColors.length; i++){
            if(i % 2 != 0){
                System.out.println(catsColors[i]);
            }
        }
        System.out.println("____________________");

        for(int i = 0; i < catsColors.length; i++){
            if(i % 3 == 0){
                System.out.println(catsColors[i]);
            }
        }

        // 7. Распечатать “Накорми кота!” для всех серых котов
        taskNumber(7);
        for(int i = 0; i < catsColors.length; i++){
            if(catsColors[i].equals("Gray")){
                System.out.println("Накорми кота!");
            }
        }

        //8. Распечатать “Отнеси кота на прививку!”, если возраст кота меньше 2 лет
        taskNumber(8);
        for(int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] < 0 || catsAges[i] > 50) {
                System.out.println("Error");
            } else if(catsAges[i] < 2){
                System.out.println("Отнеси кота из коробки " + (i) + " на прививку!");
            } else {
                System.out.println("Кот из коробки "+ (i) + " остается дома");
            }
        }


        // 9. Для кота в последней коробке распечатать имя, цвет, возраст
        taskNumber(9);
        if ((catsNames.length == catsColors.length) && (catsNames.length == catsAges.length)) {
// проверка на одиноковую длина массивов

            int lastCatName = catsAges.length - 1;
            System.out.println(catsNames[lastCatName]);

            int lastCatColor = catsColors.length - 1;
            System.out.println(catsColors[lastCatColor]);

            int lastCatAge = catsAges.length - 1;
            System.out.println(catsAges[lastCatAge]);
        }


        // 10. Распечатать имена всех котов, чей возраст больше 2 лет
        taskNumber(10);
        for(int i = 0; i < catsAges.length; i++){
            if(catsAges[i] > 2){
                System.out.println(catsNames[i]);
            }
        }

        // 11. Распечатать “Накорми кота!” если имя кота “Рыжик” и значение isCatRed == true
        taskNumber(11);
        if(catsNames.length == isCatRed1.length && catsNames.length != 0){
            for(int i = 0; i < catsNames.length; i++){
                if(catsNames[i] == "Рыжик" && isCatRed1[i] == true){
                System.out.println("Накорми кота из коробки " + (i));
                }
            }
        }

        /**
         * 12. Распечатать средний возраст котов из массива catsAges
         */
        taskNumber(12);
        double count = 0;
        for(int i = 0; i < catsAges.length; i++){
            count += catsAges[i];
        }
        count = count / catsAges.length;
        System.out.printf("%.1f%n",count);

        /**
         * 13. Распечатать возраст самого молодого кота
         */
        taskNumber(13);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < catsAges.length; i++){
            if(catsAges[i] < min){
                min = catsAges[i];
            }
        }
        System.out.println(min);

        /**
         *  14. Распечатать возраст самого старого кота
         */
        taskNumber(14);
        int max = Integer.MIN_VALUE;
        for(int i =0; i < catsAges.length; i ++){
            if(catsAges[i] > max){
                max = catsAges[i];
            }
        }
        System.out.println(max);

        /**
         * 15. Распечатать количество серых котов
         */
        taskNumber(15);
        int grayCat = 0;
        for(int i = 0; i < catsColors.length; i++){
            if(catsColors[i].equals("Gray")){
                grayCat++;
            }
        }
        System.out.println(grayCat);

        /**
         *  16. Распечатать имя кота, если кот находится в коробке с четным индексом и его возраст не больше 3 лет
         */
        taskNumber(16);
        for(int i = 0; i < catsNames.length; i++){
            if(i % 2 == 0 && catsAges[i] > 3){
                System.out.println(catsNames[i]);
            }
        }

        /**
         * 17. Создать массив четных положительных чисел, значения которых не больше 10.
         * (заполняем значения с помощью цикла for)
         */
        taskNumber(17);
        int countLength = 0;
        for(int i = 0; i <= 10; i += 2){
                countLength ++;
            }

        int [] array = new int [countLength];
        int num = 0;

        for(int i = 0; i < array.length; i++){
                array [i] = num;
            num += 2;
        }
        System.out.println(Arrays.toString(array));

        /**
         * 18. Написать метод, который принимает на вход массив int,
         * и возвращает среднее значение. Проверить работу метода тестом,
         * если параметр - массив catsAges
         */
        // Возраст лучше делать в интеджерах!!!

        taskNumber(18);
        int [] arrayInt = {4, 2, 2, 4};
        double sumArrayInt = 0;
        for(int i = 0; i < arrayInt.length; i++){
            sumArrayInt += arrayInt[i];
        }
        int arrayIntLenght = arrayInt.length;
        double average = sumArrayInt / arrayIntLenght;
        System.out.println(average);

        System.out.println("______________");
        System.out.println(getAverageOfMassive(catsAges));
        veryfyEquals(3.0,getAverageOfMassive(arrayInt));
        HW5.verifyEquals(3.375,getAverageOfMassive(catsAges));

        /**
         * 19. Создать массив нечетных отрицательных чисел в промежутке от -1000 до -900
         */
       taskNumber(19);

        int countLength18 = 0;
        for(int i = -1000; i < -900; i += 2){
            countLength18 ++;
        }

        int [] array18 = new int [countLength18];
        int num18 = -999;

        for(int i = 0; i < array18.length; i++){
            array18 [i] = num18;
            num18 += 2;
        }
        System.out.println(Arrays.toString(array18));

        /**
         * 20. Создать массив из 10 случайных положительных целых чисел
         */
        taskNumber(20);
        int[] array20 = new int [10];
        for(int i = 0; i < array20.length; i++){
                array20[i] = (int)(Math.random() * 10);
        }
        System.out.println(Arrays.toString(array20));

        /**
         *  21. Создать метод, который принимает на вход массив int,
         *  и возвращает минимальное значение, максимальное значение и среднее значение всех чисел массива.
         *  Проверить работу метода на массиве из задания 20.
         */
        taskNumber(21);
        int[] test21 = getMinMaxAndAverageMassives(array20);
        for(int i = 0; i < test21.length; i++){
            System.out.print(test21[i] + " ");
        }
        // one more way
        System.out.println(Arrays.toString(getMinMaxAverageMassive(array20)));

        /**
         * 22. Создать массив четных чисел и массив нечетных чисел из элементов массива из задания 20.
         */
        taskNumber(22);
        int[] even = new int[10];
        int[] odd = new int[10];
        int num22 = 0;
        for(int i = 0; i < array20.length; i++){
            if(array20[i] % 2 == 0){
                num22 = array20[i];
                even [i] = num22;
            }else{
                num22 = array20[i];
                odd [i] = num22;
            }
        }

        System.out.println(Arrays.toString(even));
        System.out.println(Arrays.toString(odd));

        /**
         * 23. Создать двумерный массив, который состоит из имен, возрастов, цветов котов:
         */
        taskNumber(23);

        String[][] twoDimArray = new String[3][8];
        for (int i = 0; i < twoDimArray.length; i++){
            for (int j = 0; j < twoDimArray[0].length; j++){
                if(i == 0){
                    twoDimArray[i][j] = catsNames[j];
                } else if (i == 1){
                    twoDimArray[i][j] = String.valueOf(catsAges[j]);
                } else {
                    twoDimArray[i][j] = catsColors[j];
                }
            }
        }
        System.out.println(Arrays.deepToString(twoDimArray));

        // another solution
        String [][] array23 = new String [3][8];
        if (catsNames.length == array23[0].length
            && catsAges.length == array23[0].length
            && catsColors.length == array23[0].length){
            for(int i = 0; i < array23[0].length; i++){
                array23[0][i] = catsNames[i];
                array23[1][i] = String.valueOf(catsAges[i]);
                array23[2][i] = catsColors[i];
            }
        }

        /**
         * 24. Создать двумерный массив целых случайных чисел от 1 до 10 размерности 4*8.
         */
        taskNumber(24);
        int [][] array24 = new int [4][8];
        for(int i = 0; i < array24.length; i++){
            for(int j = 0; j < array24[i].length; j++){
                array24[i][j] = (int)(Math.random() * 10) + 1;
            }
        }
        System.out.println(Arrays.deepToString(array24));

        /**
         *  25. Вывести сумму всех четных чисел массива из задания 24.
         */
        taskNumber(25);
        int sum25 = 0;
        for(int i = 0; i < array24.length; i++){
            for(int j = 0; j < array24[0].length; j++){
                if (array24 [i][j] % 2 == 0){
                    sum25 = sum25 + array24 [i][j];
                }
            }
        }
        System.out.println(sum25);

    }
}
