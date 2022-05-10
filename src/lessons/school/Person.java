package lessons.school;

public class Person {

    public static void main(String[] args) {

        int yearOfBirth = 1995;
        int yearNow = 2020;
        int age = yearNow - yearOfBirth;

        System.out.println("Если человек родился в " + (yearOfBirth)
                + " году, то его возраст - разница между " + (yearNow) + " и " + (yearOfBirth));

    }
}
