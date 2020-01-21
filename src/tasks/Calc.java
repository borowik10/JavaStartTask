package tasks;

import java.util.Random;

public class Calc {
    public static void main(String[] args) {
        Random ran = new Random();

        int x = ran.nextInt(100);
        int y = ran.nextInt(100);
        boolean a = y < (x + 3);
        boolean b = y > (x - 2);
        boolean c = a && b;
        int d = x * y;
        int even = d % 2;
        boolean ifEven = even == 0;
        System.out.println("x=" + x + ", y=" + y);

        System.out.println("1. Czy x jest większe od y? " + x + " > " + y);
        System.out.println("Result: " + (x > y));
        System.out.println("2. Czy x pomnożone przez 2 jest większe od y? " + x + " * 2 > " + y);
        System.out.println("Result: " + (x*2 > y));
        System.out.println("3. Czy y jest mniejsze od sumy x+3 i jednocześnie większe od x pomniejszonego o 2? " + y +" < " +
                (x + 3) + " && "+ y + " > " + (x - 2));
//        System.out.println("Result: " + (y < (x + 3)) + " && " + (y > (x - 2)));
        System.out.println("Result: " + (a && b));
        System.out.println("4. Czy iloczyn liczb x i y jest parzysty? (Wykorzystaj do sprawdzenia operację modulo) " +
                d +" = " + even);
        System.out.println("Result: " + ifEven);

    }
//    Napisz program, w którym zadeklarujesz dwie zmienne typu int o nazwach x oraz y. Przypisz do nich dowolne liczby,
//    a następnie za pomocą operatorów logicznych i matematycznych wyświetl wynik następujących zdań logicznych:
//
//    Czy x jest większe od y?
//    Czy x pomnożone przez 2 jest większe od y?
//    Czy y jest mniejsze od sumy x+3 i jednocześnie większe od x pomniejszonego o 2?
//    Czy iloczyn liczb x i y jest parzysty? (Wykorzystaj do sprawdzenia operację modulo)
//
//    Wynik każdego zdania logicznego przypisuj przed wypisaniem do zmiennej typu boolean o nazwie result.
//
//    W zadaniu możesz wykorzystać losowanie liczb. W podpowiedzi znajdziesz sposób jak to zrobić, ale zachęcam
//    Cię najpierw do skorzystania z Google. Umiejętność sprawnego korzystania z wyszukiwarki internetowej to też ważna umiejętność każdego programisty.
}
