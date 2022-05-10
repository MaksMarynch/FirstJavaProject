package lessons.lessons1to7;

import org.w3c.dom.ls.LSOutput;

public class Lesson4 {

    public static void print(String text){
        System.out.println(text);
    }

    public static void printLine (String text){
        System.out.println("____________________");
    }

    public static void task (int number){
        System.out.println("Задача" + number);
    }

    




    public static void main (String [] args){

        // Квадрат - это не круг!

        String square = "Квадрат";
        String circle = "круг";

        System.out.println(square != circle);
        
        // Если сегодня суббота, значит завтра воскресенье
        
        String today = "суббота";
        String tomorrow = "воскресенье";

        if(today == "суббота"){
            System.out.println(tomorrow);
        }


        // 
        int a = 9;
        int b = 12;
        int c = 22;

        if(a > b && b < c){
            a = 7;
            int sum = b + c;
            System.out.println(a + " " + sum);
        } else {
            a = 10;
            System.out.println(a);
        }

        /**
         *  Task. 100
         *  Test
         */

        //AAA
        task(100);


        int n = 21;
        int expectedResult = 7;

        if (n % 2 != 0){
            if(n % 3 == 0){
                n = n / 3;
            }else{
                n = n * 3;
            }
        }else{
            n = n * (n / 2);
        }
        System.out.println("n = " + n);


        //Test

        if (expectedResult == n){
            System.out.println("\u001B[32m" + "Pass");
        }else{
            System.out.println("\u001B[31m" + "Fail");
        }

    }
}
