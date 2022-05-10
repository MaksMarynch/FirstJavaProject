package lessons.lessons1to7;

public class Lesson7 {


    public static void main (String [] args){

        //  int[] array1;   // создается место под массив
        // array1 = new int [6]; // хранится ключ от массива

        String catName = "Рыжик";

        String [] catsNames;

        catsNames = new String[8];
        catsNames [4] = "Рыжик";
        catsNames [1] = "Черныш";
        catsNames [6] = "Рыжик";


        int[] catsAges = new int[8];

        System.out.println(catsNames[4]);

        for(int i = 0; i < 8; i++){
            System.out.println(catsNames[i]);
        }

        for(int i = 0;i <= 7;i++){
            if(catsNames[i] == "Рыжик"){
                System.out.println(catsNames[i]);
            }
        }

        for(int i =0; i < 8; i++){
            if(catsNames[i] == "Черныш"){
                System.out.println(i);
            }
        }

    }
}
