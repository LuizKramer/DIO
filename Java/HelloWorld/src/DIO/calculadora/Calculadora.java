package DIO.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.println("valor 1:");
        a = scan.nextInt();
        System.out.println("valor 2:");
        b = scan.nextInt();

        System.out.println("Soma:" + somar(a,b));
        System.out.println(subtrair(a,b));
        System.out.println(multiplicar(a,b));
        System.out.println(dividir(a,b));

    }

    public static int somar(int a, int b){
        return a + b;
    }
    public static int subtrair(int a, int b){
        return a - b;
    }
    public static int multiplicar(int a, int b){
        return a * b;
    }
    public static int dividir(int a, int b){
        return a / b;
    }
}
