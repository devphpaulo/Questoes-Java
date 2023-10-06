/*

Criar um programa que calcule a média de salários de 
uma empresa, pedindo ao usuário a grade de funcionários 
e os salários, e devolvendo a média salarial.

 */

import java.util.*;

public class MediaSalarial {
    public static void main(String[] args) {
        Locale.setDefault(Locale.forLanguageTag("en-US"));
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o número de trabalhadores: ");
        int num = sc.nextInt();
        double salario, salarioTotal = 0;
        
        for (int i = 1; i <= num; i++){
            System.out.println("Insira o salário do " + i + " trabalhador:");
            salario = sc.nextDouble();
            salarioTotal += salario;
        }
        double mediaSalario = salarioTotal / num;
        
        System.out.println("A média salarial entre os " + num + " trabalhadores é de: R$ " + mediaSalario);
        
        sc.close();
        
    }
}