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
            System.out.println(i + ". " + teachers[i]);
        }
    }

}