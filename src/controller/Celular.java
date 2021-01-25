package controller;

public class Celular implements Precedable<Celular>{
    String titular;
    int numero;
    public Celular(String titular, int dni){
        this.titular=titular;
        this.numero=numero;
    }
    public String getTitular(){
        return this.titular;
    }
    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int numero){
        this.numero=numero;
    }
    public void setTitular(String titular){
        this.titular=titular;
    }

    @Override
    public int precedeA(Celular t) {
        int difference=this.numero-t.numero;
        if (difference == 0) {
            return 0;
        }
        else if (difference < 0) {
            return -1;
        }
        else {
            return 1;
        }
    }
}
