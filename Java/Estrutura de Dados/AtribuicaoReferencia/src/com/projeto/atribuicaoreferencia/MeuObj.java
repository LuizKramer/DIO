package com.projeto.atribuicaoreferencia;

public class MeuObj {
    int n;
    public void setN(int n){
        this.n = n;
    }

    public MeuObj(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "MeuObj{" +
                "n=" + n +
                '}';
    }
}
