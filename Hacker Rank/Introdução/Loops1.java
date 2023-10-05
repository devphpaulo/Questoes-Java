import java.util.Scanner;

public class Loops1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int num = sc.nextInt(); 
        for (int i = 1; i <= 10; i++){ 
            int multi = num * i; 
            System.out.printf("%d x %d = %d\n", num, i, multi); 
            // Imprime a expressão da tabuada formatada na saída padrão
        }
        sc.close(); 

    }
    
}