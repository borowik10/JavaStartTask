package tasks;

public class Text {
    public static void main(String[] args) {
//        -Cześć Jan, słyszałem, że masz 25 lat i uczysz się programowania. Czy to prawda?
//                -true
//                        -Czy Twoje inicjały to J K?
//                -Tak, true
        int age = 25;
        boolean yes = true;
        char inicjaly1 = 'J';
        char inicjaly2 = 'K';
        System.out.println("-Cześć Jan, słyszałem, że masz " + age + " lat i uczysz się programowania. Czy to prawda?");
        System.out.println("-" + yes + ".");
        System.out.println("-Czy Twoje inicjały to " + inicjaly1 + " " + inicjaly2 + "?");
        System.out.println("-Tak, " + yes + ".");
    }
}
