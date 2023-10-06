/*

Informar um saldo e imprimir o saldo com reajuste de 1%.

 */

import java.util.*;

public class Exercicio3 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o seu salário para verificar o reajuste: ");
        double Salario = scan.nextDouble();

        double valorComReajuste = Salario + (Salario * 0.01);

        System.out.println("O seu salário com o reajuste será de: R$" + valorComReajuste);

        scan.close();
    }
    
}
