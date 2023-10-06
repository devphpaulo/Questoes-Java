/*

Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
(1SM=R$788,00)

 */

import java.util.*;

public class Exercicio5 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        
        double valorSalarioMinimo = 788.00, valorSalarioUsuario, qntSalarios;

        System.out.println("Digite o valor do salário do usuário: ");
        valorSalarioUsuario = scan.nextDouble();

        qntSalarios = valorSalarioUsuario / valorSalarioMinimo;

        System.out.println("Valor do salário mínimo: R$ " + valorSalarioMinimo);
        System.out.printf("O usuário ganha %.2f salários mínimos.", qntSalarios);

        scan.close();
    }
}