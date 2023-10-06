/* 

Escrever um programa que armazene um horário 
(hora, minuto e segundo) em variáveis, depois, 
determine e exiba a quantidade de segundos que 
se passaram desde as 0h00min0s e a quantidade 
de segundos que faltam para a meia-noite.

*/

import java.util.*;

public class SegundosPassaram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.forLanguageTag("en-US"));
        Scanner sc = new Scanner(System.in);
        
        int segundos, minutos, horas;
        System.out.println("Insira a quantidade de horas, minutos e segundos: ");
        horas = sc.nextInt();
        minutos = sc.nextInt();
        segundos = sc.nextInt();
        
        int calcularSegundos = segundos + (minutos * 60) + (horas * 3600);
        int faltamMeiaNoite = 86400 - calcularSegundos;
        
        System.out.println("Segundos totais: " + calcularSegundos);
        System.out.println("Faltam " + faltamMeiaNoite + " segundos para a meia noite");
        
        sc.close();
        
    }
    
}