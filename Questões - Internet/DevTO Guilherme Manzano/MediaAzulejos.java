/*

Uma parede em formato retangular, cuja altura é 
hp (altura da parede) e a largura lp (largura da parede) 
precisa ser coberta por azulejos também retangulares. 
O azulejo retangular tem dimensões ha (altura do azulejo) 
e la (largura do azulejo). Escreva um programa que leia 
as quatro medidas hp, lp, ha e la, calcule e imprima 
quanto azulejos com as medidas dadas são necessários 
para cobrir a parede dada.


 */

import java.util.*;

public class MediaAzulejos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.forLanguageTag("en-US"));
        Scanner sc = new Scanner(System.in);
        
        double larguraParede, alturaParede;
        double larguraAzulejo, alturaAzulejo;
        
        System.out.println("Largura da parede:  ");
        larguraParede = sc.nextDouble();
        System.out.println("Altura da parede:  ");
        alturaParede = sc.nextDouble();
        System.out.println("Largura do azulejo:  ");
        larguraAzulejo = sc.nextDouble();
        System.out.println("Altura do azulejo:  ");
        alturaAzulejo = sc.nextDouble();
        
        double areaParede = larguraParede * alturaParede;
        double areaAzulejo = larguraAzulejo * alturaAzulejo;
        double qntAzulejos = areaParede / areaAzulejo;
        
        System.out.println("Área da parede " + areaParede);
        System.out.println("Área do azulejo " + areaAzulejo);
        System.out.println("São necessários " + qntAzulejos + " azulejos para cobrir a parede");
        
        sc.close();
        
    }
}