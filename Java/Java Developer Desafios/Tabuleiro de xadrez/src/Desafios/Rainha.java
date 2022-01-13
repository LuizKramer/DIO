package Desafios;

import java.util.Scanner;

public class Rainha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=0 ; i<n ; i++) {
            int x = sc.nextInt();
            System.out.println((long)((pow(2, x)/12L)/1000L) + " kg"); //Complete o código aqui.
        }
        sc.close();
    }
    public static double pow(int a, int b){
        double resultado = 1L;
        for (int i =0; i<b; i++){
            resultado *= a;
        }
        return resultado;
    }
}
