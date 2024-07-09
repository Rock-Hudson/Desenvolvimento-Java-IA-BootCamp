package Exercicios;

public class CaixaEletronico {

    public static void main(String[] args) {

        double saldo = 220.0;
        double valorSolicitado = 230.0;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println(saldo);
        }else {
            System.out.println("Salado Insuficiente!!!");
        }


    }

}
