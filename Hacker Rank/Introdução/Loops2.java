import java.util.*;
import java.lang.Math;

class Loops2 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in); 
        int t = in.nextInt(); 
        for (int i = 0; i < t; i++) { 
            int a = in.nextInt(); 
            int b = in.nextInt();
            int n = in.nextInt(); 
            int termo = a; 
            for (int j = 0; j < n; j++) { 
                termo += (int) Math.pow(2, j) * b; 
                // Calcula o próximo termo da sequência usando a fórmula dada
                System.out.printf("%d ", termo); 
                // Imprime o próximo termo da sequência
            }

            System.out.println();
        }
        in.close(); 
    }
}