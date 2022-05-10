package homework;

public class Utilites {

    public static void taskNumber(int number) {
        String line = "________________ ";
        System.out.println(line + "Task " + number + " " + line);
        System.out.println();
    }

    public static String verify(int a, int b) {
        if (a == b) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");

            return "Pass";
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");

            return "Fail";
        }
    }

    public static String verify(double a, double b) {
        if (a == b) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");

            return "Pass";
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");

            return "Fail";
        }
    }

    public static String verify(String string1, String string2) {
        if (string1.equals(string2)) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");

            return "Pass";
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");

            return "Fail";
        }
    }

    public static int getRandomInt(int upper, int lower) {

        return (int) (Math.random() * (upper - lower) + lower);
    }

    public static double getRandomDouble(int upper, int lower) {

        return (Math.random() * (upper - lower) + lower);
    }

    public static int[] createArrayRandomInt(int lenght, int upper, int lower) {
        int[] array = new int[lenght];
        for (int i = 1; i < array.length; i++) {
            array[i] = getRandomInt(upper, lower);
        }

        return array;
    }

    public static double[] createArrayRandomDouble(int lenght, int upper, int lower) {
        double[] array = new double[lenght];
        for (int i = 1; i < array.length; i++) {
            array[i] = getRandomDouble(upper, lower);
        }

        return array;
    }


    public static int[] arrayFiveNumbers(int a, int b, int c, int d, int e) {

        int[] result = new int[5];
        result[0] = a;
        result[1] = b;
        result[2] = c;
        result[3] = d;
        result[4] = e;

        return result;
    }

    public static double[] arrayFiveDoubleNumbers(int a, int b, int c, int d, int e) {

        double[] result = new double[5];
        result[0] = a;
        result[1] = b;
        result[2] = c;
        result[3] = d;
        result[4] = e;

        return result;
    }

    public static String[] arrayFiveDoubleNumbers(String a, String b, String c, String d, String e) {

        String[] result = new String[5];
        result[0] = a;
        result[1] = b;
        result[2] = c;
        result[3] = d;
        result[4] = e;

        return result;
    }

    public static double[] task10(int[] a) {

        if (a.length > 0) {

            double[] result = new double[a.length];
            for (int i = 0; i < a.length; i++) {
                result[i] = a[i] * 2.5;
            }

            return result;
        }
        return new double[]{};
    }
}



