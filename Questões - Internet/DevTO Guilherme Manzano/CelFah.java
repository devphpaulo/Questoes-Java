/* 

Escreva um programa que, com base em uma temperatura em graus 
celsius, a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) 
e Fahrenheit (F), seguindo as fórmulas: 

F = C * 1.8 + 32 
K = C + 273.15
Re = C * 0.8
Ra = C * 1.8 + 32 + 459.67

*/

import java.util.*;

public class CelFah {
    public static void main(String[] args) {
        Locale.setDefault(Locale.forLanguageTag("en-US"));
        Scanner sc = new Scanner(System.in);
        double c, f, k, re, ra;
        
        c = sc.nextDouble();
        
        f = c * 1.8 + 32;
        k = c + 273.15;
        re = c * 0.8;
        ra = c * 1.8 + 32 + 459.67;
        
        System.out.printf("Celsius: %.2f\n", c);
        System.out.printf("Fahrenheit: %.2f\n", f);
        System.out.printf("Kelvin: %.2f\n", k);
        System.out.printf("Reaumur: %.2f\n", re);
        System.out.printf("Rankine: %.2f\n", ra);
        
        sc.close();
        
    }
}