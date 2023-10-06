/*

Calcular e apresentar o valor do volume de uma 
lata de óleo, utilizando fórmula: 
V = 3.14159 * R * R * A em que as variáveis: 
V, R e A representam respectivamente: 
o volume, o raio e a altura.

Vamos declarar as variáveis V, R e A como double e 
definir um valor qualquer para as variáveis de altura 
e de raio. Agora vamos escrever a fórmula, conforme 
dita no enunciado e, em seguida, exibir na tela uma 
mensagem contendo o resultado do volume encontrado.

 */

import java.util.*;

public class CalcVolume {
    public static void main(String[] args) {
        Locale.setDefault(Locale.forLanguageTag("en-US"));
        Scanner sc = new Scanner(System.in);
        
        double r, a;
        
        System.out.println("Insira o valor do raio e da área para calcular o volume: ");
        r = sc.nextDouble();
        a = sc.nextDouble();
        double v = 3.14159 * r * r * a;
        
        System.out.printf("(V = Pi * R * R * A) == %.2f", v);
        
        sc.close();
        
    }
}