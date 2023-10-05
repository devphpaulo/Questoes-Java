import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
            
        int N = sc.nextInt(); 
        if (N % 2 == 0) { 

            if (N >= 2 && N <= 5) { 
            // Verifica se 'N' está no intervalo [2, 5]

                System.out.println("Not Weird"); 
            } else if (N >=6 && N <=20) { 
            // Verifica se 'N' está no intervalo [6, 20]

                System.out.println("Weird"); 

            } else { 
                System.out.println("Not Weird");
            }    
        } else { // Caso 'N' seja ímpar
            System.out.println("Weird");
        }
        sc.close(); 
    }
}