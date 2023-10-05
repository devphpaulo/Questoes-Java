import java.util.*;

public class IntToString {
    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(System.in); 
            int n = in.nextInt(); 
            in.close(); 

            // Converte o número inteiro em uma string e armazena na variável 's'
            String s = Integer.toString(n); 
            
            // Verifica se o número inteiro original é igual à string convertida
            if (n == Integer.parseInt(s)) { 
                System.out.println("Good job"); 
            } else {
                System.out.println("Wrong answer."); 
            }
            
        } catch (Exception e) { // Se ocorrer uma exceção ao ler o número da entrada do usuário
            System.out.println("Unsuccessful Termination!!");
        }

    }
}