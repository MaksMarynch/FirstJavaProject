package lessons;

public class AdditionalLessonsHW1to5 {

    public static double countTotalPrice(double price, double amount){

        double totalPrice = 0;
        totalPrice = price * amount;

        return totalPrice;
    }

    public static String countTotalPrice1(double price, double amount){

        String totalPrice = price * amount + " рублей";

        return totalPrice;
    }





    public static void main (String [] args){
        System.out.println(countTotalPrice(3,5));
        System.out.println(countTotalPrice1(3,5));


    }
}
