package Desafios;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int value;
        for (int i = 0; i < N; i++) {
            value = leitor.nextInt();
            if(value == 0)
                System.out.println("NULL");
            else if(value % 2 == 0) {
                if(value > 0)
                    System.out.println("EVEN POSITIVE");
                else
                    System.out.println("EVEN NEGATIVE");
            }
            else {
                if (value > 0)
                    System.out.println("ODD POSITIVE");
                else
                    System.out.println("ODD NEGATIVE");
            }
        }
    }
}
