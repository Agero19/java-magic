import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Oh, you're a magician, friend! Welcome to Hogwarts!");

        String dumbledore = "Dumbledore";
        String mcgonagall = "McGonagall";
        String snape = "Snape";
        String hugrid = "Hugrid";
        String lupine = "Lupine";
        String[] teachers = {
                dumbledore,
                mcgonagall,
                snape,
                hugrid,
                lupine
        };
        String intro = "School teachers:";
        System.out.println(intro);
        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1 + ". " + teachers[i]);
        }

        int grade = new Random().nextInt(1,10);
        int grade2 = new Random().nextInt(1,10);

        boolean result = grade >= 5 && grade2 >= 5;
        System.out.println("Grade: " + grade + ", Grade2: " + grade2);
        System.out.println(result ? "Test passed" : "Test failed");
        float avg =  (float) (grade + grade2) / 2;
        System.out.println("Average grade: " + avg);

        float n = 4199.F;
        float[] remainders = {n / 13, n / 14,n / 15, n / 16, n / 17, n / 18, n / 19};
        float sum = 0;
        for (float remainder : remainders) {
            sum += remainder;
        }
        System.out.println("Sum of remainders: " +  sum);
    }

}