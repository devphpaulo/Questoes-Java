/*

Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
números 4, 5 e 6. A soma das duas médias. A média das médias.

 */

import java.util.Scanner;

public class Exercicio2
{
	public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
        
        int a, b, c, d, e, f;
        
        a = 7;
        b = 8;
        c = 9;
        int media1 = (a + b + c) / 3;
        System.out.println(media1);
        
        d = 4;
        e = 5;
        f = 6;
        int media2 = (d + e + f) / 3;
        System.out.println(media2);
        
        int soma = media1 + media2;
        System.out.println(soma);
        int media = soma / 2;
        System.out.println(media);
    
    sc.close();
    }
}
