/* 

Elabore um programa para armazenar uma medida de 
raio em metros, determinar e exibir o perímetro 
e a área de um círculo com esse raio, através 
das fórmulas: 

perímetro = 2 x 3.14159 x raio
área = 3.14159 x raio²

*/

import java.util.*;

public class PerimetroArea {
    public static void main(String[] args) {
        Locale.setDefault(Locale.forLanguageTag("en-US"));
        Scanner sc = new Scanner(System.in);
        
        double metrosRaio;
        System.out.println("Insira o raio em metros: ");
        metrosRaio = sc.nextDouble();
        
        double perimetro = 2 * 3.14159 * metrosRaio;
        double area = 3.14159 * (metrosRaio * metrosRaio);
        
        System.out.printf("Perímetro: %.2f\n", perimetro);
        System.out.printf("Área: %.2f\n", area);
        
        sc.close();
        
    }
    
}