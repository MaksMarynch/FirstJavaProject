package lessons.lessons1to7;

public class Lesson6 {

    public static void main (String [] args){

        //Печатаем "Java for beginners" для всех чисел от 1 до 5 включительно
//        for(int i = 1; i < 6; i++){
//            System.out.println("Java for beginners");
//        }

        // Печатаем числа от 1 до 5 включително
//        for(int i = 0; i < 6; i++){
//            System.out.println(i);
//        }

        // Печатаем только нечетные числа от 1 до 10 включительно
        for(int i = 1; i < 11; i++){
            if(i % 2 != 0)
                System.out.println(i);
        }

        for(int i = 1; i < 11; i += 2){
                System.out.println(i);
        }

        // Печатаем все числа от 1 до 100 включительно с шагом 10
        for(int i = 1; i < 101; i += 10){
            System.out.println(i);
        }

        //Печатаем все числа в промежутке от 0 до 100 включительно,
        //которые делятся на 10
        for(int i = 0; i < 101; i+= 10){
                System.out.println(i);
        }

        //Печатаем все числа в промежутке от -100 до 100 включительно,
        // кратные 10
        for(int i = -100; i < 101; i += 10){
            System.out.println(i);
        }

//        Стараемся придумывать решения только с одним циклом for
//        for(;;){
//            for(;;){
//            }
//        }

        // печатаем все числа от 5 до 1 включительно
        for(int i = 5; i > 0; i--){
            System.out.println(i);
        }





        //               "99 bottles of beer on the wall, 99 bottles of beer.\n" +
        //               "Take one down and pass it around, 98 bottles of beer on the wall.\n" +
        //               "\n" +
        //               "98 bottles of beer on the wall, 98 bottles of beer.\n" +
        //               "Take one down and pass it around, 97 bottles of beer on the wall.\n" +
        //               "\n" +
        //               "97 bottles of beer on the wall, 97 bottles of beer.\n" +
        //               "Take one down and pass it around, 96 bottles of beer on the wall.\n" +
        //               "\n" +


        //                "3 bottles of beer on the wall, 3 bottles of beer.\n" +
        //               "Take one down and pass it around, 2 bottles of beer on the wall.\n" +
        //               "\n" +
        //               "2 bottles of beer on the wall, 2 bottles of beer.\n" +
        //               "Take one down and pass it around, 1 bottle of beer on the wall.\n" +
        //               "\n" +
        //               "1 bottle of beer on the wall, 1 bottle of beer.\n" +
        //               "Take one down and pass it around, no more bottles of beer on the wall.\n" +
        //               "\n" +
        //               "No more bottles of beer on the wall, no more bottles of beer.\n" +
        //               "Go to the store and buy some more, 99 bottles of beer on the wall."

        String bottles = " bottles of beer";
        String bottle = " bottle of beer";
        String wall = " on the wall";
        String take = "Take one down and pass it around";
        String commaSpace = ", ";
        String dot = ".";
        String go = "Go to the store and buy some more";
        String noMoreC = "No more";
        String noMoreL = "no more ";
        String ln = "\n";

        for(int i = 99; i > -1; i--) {
            if(i == 2) {
                System.out.println(i + bottles + wall + commaSpace + i + bottles + dot);
                System.out.println(take + commaSpace + (i - 1) + bottle + wall + dot +ln);
            } else if(i == 1){
                System.out.println(i + bottle + wall + commaSpace + i + bottles + dot);
                System.out.println(take + commaSpace + noMoreL + bottles + wall + dot + ln);
            } else if(i == 0){
                System.out.println(noMoreC + bottles + wall + commaSpace + noMoreL + bottles + dot);
                System.out.println(go + commaSpace + (i + 99) + bottles + wall + dot + ln);
            } else {
                System.out.println(i + bottles + wall + commaSpace + i + bottles + dot);
                System.out.println(take + commaSpace + (i - 1) + bottles + wall + dot);
                System.out.println();
            }
        }


    }
}
