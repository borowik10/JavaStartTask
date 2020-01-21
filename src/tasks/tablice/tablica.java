package tasks.tablice;

public class tablica {
    public static void main(String[] args) {
        int[] tab1 = {1,2,3};
        int[] tab2 = {10,20,30};

        tablicaSum tablicaSum = new tablicaSum();
        int sum = tablicaSum.sumArrays(tab1, tab2);
        System.out.println("Suma: " + sum);
    }
}
