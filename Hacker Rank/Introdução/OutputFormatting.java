import java.util.Scanner;

public class OutputFormatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("================================");
        for (int i = 0; i < 3; i++) { 
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-14s %03d%n", s1, x); 
            // Imprime a string 's1' com 14 caracteres alinhados à esquerda 
            // E o inteiro 'x' com 3 dígitos preenchidos com zeros à esquerda
        }
        System.out.println("================================"); 
        sc.close(); 
    }
}