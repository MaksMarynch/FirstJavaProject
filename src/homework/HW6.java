package homework;


public class HW6 {

    public static void task(int number) {
        System.out.println("---------------- Task " + number + " ----------------");
    }


    public static void decimalNumber(double start, double end, double step) {
        for (start = start; start < end; start += step) {
            if (start % 10 == 0) {
//                System.out.format("%.2f",start);
                System.out.println(start);
            }
        }
    }

//    public static void printSqequenceOfNumber(int start, int end, int step) {
//        if (step > 0) {
//            if (start < end){
//            for (int i = start; i < end; i += step) {
//                System.out.println(i);
//            }
//        } else {
//            System.out.println("Десятичных чисел соответствующих данному условию не найдено.");
//        }
//        }else if (step == 0) {
//            System.out.println("Цикл будет выполняться бесконечно и печатать " + "значение start = " + start);
//        }else{
//            if(start > end){
//                for (int i = start; i < end; i += step) {
//                    System.out.println(i);
//                }
//            } else {
//                System.out.println("Десятичных чисел соответствующих данному условию не найдено.");
//            }
//    }
//}
    public static void seq10 (double start, double end, double step){
        // increasing start < end, step > 0
        // decreasing start > end, step < 0
        if(start < end && step > 0) {
            for (start = start; start < end; start += step) {
                System.out.println(start);
            }
        }else if (start > end && step < 0) {
            for (start = start; start > end; start += step) {
                System.out.println(start);
            }
        } else {
                System.out.println("Invalid date");
            }
        }



    public static void getEven (int l){
        for(int i = 0; i < l; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    public static void getPowerTwo (int n){
        //Напишите метод, который принимает целое число n,
        //и выводит все степени числа 2 от 1 до n включительно
        int a = 2;


        for(int i = 1 ; i <= n; i++){
            int count = (int)Math.pow(a,i);
            System.out.println(count);
        }
    }

    public static void getOdd (int n, int m, int l){
        for(int i = n; i < l; i = i + m){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    public static void getDoubling (int n, int l){
        for(int i = n; i < l; i = 2 * n){
            System.out.println(i);
        }
    }


    public static void main (String [] args){

        task(1);
        //Распечатать последовательность чисел от 0 до 9 включительно.
        int [] arrive = {0,1,2,3,4,5,6,7,8,9};
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }

        task(2);
        //Распечатать последовательность чисел от 10 исключительно до 0 включительно.
        for(int i = 9; i >= 0; i--){
            System.out.println(i);
        }

        task(3);
        //Распечатать последовательность чисел от 50 до 55 включительно с шагом 2.
        for(int i = 50; i < 56; i+=2){
            System.out.println(i);
        }

        task(4);
        // Распечатать последовательность чисел, кратных 7, в промежутке (327, 300)
        for(int i = 301; i < 328; i++){
            if (i % 7 == 0){
                System.out.println(i);
            }
        }

        task(5);
        //Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1
        for(double i = 12; i < 13; i += 0.1){
            System.out.println(i);
        }
//        for(int i = 120; i < 130; i ++){
//            System.out.print(((double) i / 10) + " ");
//               }
//        System.out.println();


        task(6);
        //Распечатать последовательность четных чисел от 215 до 237 включительно
        for(int i = 215; i < 238; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

        task(7);
        //Распечатать последовательность чисел, кратных 7, в промежутке от 7 исключительно до 14 исключительно.
        for(int i = 8; i < 14; i ++){
            if(i % 7 == 0) {
                System.out.println(i);
            }
        }

        task(8);
        //Распечатать последовательность которая начинается с минимального значения типа данных short
        // и заканчивается максимальным значением short. Числа в последовательности должны быть кратны 15001.
        for(short i = Short.MIN_VALUE; i < Short.MAX_VALUE;i++){
            if(i % 15001 == 0){
                System.out.println(i);
            }
        }

        task(9);
        //Распечатать последовательность чисел в промежутке от -10 до 34 включительно.
        // Числа, кратные 11, должны быть распечатаны синим цветом.
        // Числа, кратные 12, должны быть распечатаны красным цветом.
        // А ноль необходимо распечатать словом ZERO.

        /**
         * public static final String ANSI_RESET = "\u001B[0m";
         * public static final String ANSI_BLACK = "\u001B[30m";
         * public static final String ANSI_RED = "\u001B[31m";
         * public static final String ANSI_GREEN = "\u001B[32m";
         * public static final String ANSI_YELLOW = "\u001B[33m";
         * public static final String ANSI_BLUE = "\u001B[34m";
         * public static final String ANSI_PURPLE = "\u001B[35m";
         * public static final String ANSI_CYAN = "\u001B[36m";
         * public static final String ANSI_WHITE = "\u001B[37m";
         */

        for(int i = - 10; i < 35; i++){
            if (i == 0){
                System.out.println("ZERO");
            }else if(i % 11 == 0){;
                System.out.println("\u001B[34m" + i + "\u001B[0m");
            }else if (i % 12 == 0){
                System.out.println("\u001B[31m" + i + "\u001B[0m");
            }
        }

        task(10);
        //Написать метод, который принимает на вход параметры start,  end, step,
        // и печатает последовательность десятичных  чисел, начиная с числа start, с шагом step.
        // Точка выхода из цикла - число end.
        double start = 10;
        double end = 70;
        double step = 20;
        //decimalNumber(start,end,step);

        // happy path
        seq10(10.5, 20.75, 1.29);
        // happy path
        System.out.println("_________________");
        seq10(15.9, 0, -1.45);
        // negative
        System.out.println("_________________");
        seq10(15.9, 0, 0);
        // negative
        System.out.println("_________________");
        seq10(15.9, 0, 1);
        // negative
        System.out.println("_________________");
        seq10(-15.9, 0, -1);
        // negative
        System.out.println("_________________");
        seq10(0, 0, -1);
        // negative
        System.out.println("_________________");
        seq10(0, 0, 1);


        task(11);
        //Написать метод, который принимает параметр l и печатает
        //последовательность четных чисел от нуля. Длина последовательности = l.
        getEven(8);

        task(12);
        //Напишите метод, который принимает целое число n,
        //и выводит все степени числа 2 от 1 до n включительно
        getPowerTwo(5);

        task(13);
        //Вывести последовательность 012345678900112233445566778899000…  до числа 9999 включительно.
        int arr [] = {0,1,2,3,4,5,6,7,8,9};
        for(int i = 0; i < arr.length; i++){

            System.out.print(arr[i]);
        }
        System.out.println();

//        for(int i = 1; i < 5; i++){
//            for(int j = 0; j < 10; j++){
//                for(int k = 1; k <= i; k++){
//                    System.out.print(j);
//                    System.out.println();
//                }
//            }
//        }


        task(14);
        //Распечатайте последовательность чисел:
        //0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5

//        int arr1 [] = {0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5};
//        for(int i = 0; i < arr1.length; i++){
//            System.out.print(arr1[i]);
//        }
        System.out.print(0);
        for(int y = 1; y < 6; y++){
            System.out.print(" ," + y + " ," + (y * -1));
        }
        System.out.println();



        task(15);
        //Распечатать последовательность чисел:
        //0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25

//        int arr2 [] =  {0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25};
//        for(int i = 0; i < arr2.length; i++){
//            System.out.println(i);
//        }
        for(int i = 0; i <= 25; i++){
            if(i % 3 == 0 || i % 5 == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.println();



        task(16);
        //Написать метод, который принимает параметры n, m, l,
        //и печатает последовательность нечетных чисел начиная с числа n, с шагом m,  длина последовательности l.
        getOdd(2,30,50);



        task(17);
        //Сгенерируйте и распечатайте последовательность по формуле:
        //n + 1 = n + 2
        int n = 5;
        for(int i = 0; i < 10; i ++){
            System.out.println(i + 2);
        }
        System.out.println("__________");

        int l = n + 5;
        for(;n < l; n++){
            System.out.println("[" + (n + 1) + "]" + " = " + (n + 2));
        }


        task(18);
        //Написать метод, который принимает параметры l, n, и печатает последовательность чисел,
        // начиная с числа n, по формуле для n + 1 члена последовательности:
        //n + 1 = 2n. Длина последовательности l.
        //getDoubling(10,5);

        int n1 = 1;
        int l1 = n1 + 5;
        for( ;n1 < l1; n1++){
            System.out.println("[" + (n1 + 1) + "]" + " = " + (n1 * 2));
        }




        task(19);
        //Сгенерируйте последовательность целых положительных двузначных чисел,
        //в которых разница между первой цифрой (десятки) и второй цифрой (единицы) не превышает 3.
        for(int i = 0; i < 100; i++ ){
                if((i / 10) - (i % 10) <= 3 ){
                    System.out.print(i + ", ");
                }
        }


        task(20);
        double x = 0;
        if(x > 1.5){
            System.out.println(2.5 * Math.pow(x,3) + 6 * Math.pow(x,2) - 30);
        }else if(x <= 1.5 && x >=0){
            System.out.println(x + 1);
        }else{
            System.out.println(x);
        }






    }

}
