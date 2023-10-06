/* 

Número primo é aquele que só é divisível por 
ele mesmo e pela unidade. Fazer um algoritmo 
que determine e escreva os números primos 
compreendidos entre um intervalo fornecido pelo usuário.

*/

import java.util.*;

public class NumsPrimos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.forLanguageTag("en-US"));
        Scanner sc = new Scanner(System.in);
        
        int inicio, fim, primo = 0;
        
        System.out.println("Insira um intervalo de números: ");
        inicio = sc.nextInt();
        fim = sc.nextInt();
        
        for (int i= inicio; i <= fim; i++){
            
            for (int j = 1; j <= i; j++){
                if (i % j == 0){
                    primo++;
                } 
            }
            
            if (primo == 2){
                System.out.println("O número " + i + " é primo");
            } else {
                primo = 0;
            }
        }
        
        sc.close();
        
    }
}