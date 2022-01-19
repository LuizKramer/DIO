package one.DIO;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<Integer> listD = new ListaDuplamenteEncadeada<>();
        listD.add(1);
        listD.add(2);
        listD.add(3);
        listD.add(4);
        System.out.println(listD);
        listD.add(4, 0);
        System.out.println(listD);
        listD.remove(4);
        System.out.println(listD);
    }
}
