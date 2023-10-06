/*

Escrever um algoritmo que lê:
- a porcentagem do IPI a ser acrescido no valor das peças
- valor unitário da peça 1, quantidade de peças 1
- valor unitário da peça 2, quantidade de peças 2
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)

*/

import java.util.*;

public class Exercicio4 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        
        int IPI, qntPecas1, qntPecas2;
        double valorPeca1, ValorPeca2, total;

        System.out.println("Insira o valor do IPI: ");
        IPI = scan.nextInt();

        System.out.println("Insira a quantidade de peças 1: ");
        qntPecas1 = scan.nextInt();

        System.out.println("Insira o valor da peça 1: ");
        valorPeca1 = scan.nextDouble();

        System.out.println("Insira a quantidade de peças 2: ");
        qntPecas2 = scan.nextInt();

        System.out.println("Insira o valor da peça 2: ");
        ValorPeca2 = scan.nextDouble();

        total = (valorPeca1*qntPecas1 + ValorPeca2*qntPecas2)*(IPI/100 + 1);

        System.out.println("O valor total a ser pago é: " + total);

        scan.close();
    }
}