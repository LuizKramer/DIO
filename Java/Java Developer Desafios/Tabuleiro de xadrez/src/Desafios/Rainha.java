package Desafios;

import java.util.Scanner;

public class Rainha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=0 ; i<n ; i++) {
            int x = sc.nextInt();
            System.out.printf((pow(2, x)/12)/1000 + " kg"); //Complete o código aqui.
        }
        sc.close();
    }
    public static int pow(int a, int b){
        int resultado = 1;
        for (int i =0; i<b; i++){
            resultado *= a;
        }
        return resultado;
    }
}
