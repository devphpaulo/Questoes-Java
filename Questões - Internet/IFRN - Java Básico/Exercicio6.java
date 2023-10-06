/*

Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
antecessor e seu sucessor.

 */

import java.util.*;

public class Exercicio6 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int numero, antecessor, sucessor;

        System.out.println("Insira um número: ");
        numero = scan.nextInt();
        antecessor = numero - 1;
        sucessor = numero + 1;
        System.out.println("Sucessor: " + sucessor + ". Antecessor: " + antecessor);
        scan.close();
    }
}