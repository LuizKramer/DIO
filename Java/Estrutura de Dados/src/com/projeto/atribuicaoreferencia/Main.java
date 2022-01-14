package com.projeto.atribuicaoreferencia;

// Para tipos primitivos de dados, o java gera uma cópia na atribuição da variável, enquanto
// quando é utilizado o tipo objeto a atribuição é por referência.

public class Main {
    public static void main(String[] args) {
        int intA = 1;
        int intB = intA;
        System.out.println("intA: " + intA + " intB: " + intB);

        MeuObj obj = new MeuObj(5);
        MeuObj objA = obj;
        System.out.println(obj);
        System.out.println(objA);

        obj.setN(3);
        System.out.println(obj);
        System.out.println(objA);
    }
}
