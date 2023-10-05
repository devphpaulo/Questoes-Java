import java.util.Scanner;

public class EndOfFile {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int lineNumber = 1; 
        
        while(sc.hasNext()){ 
            String line = sc.nextLine(); 
            // Lê uma linha da entrada do usuário e armazena na variável 'line'

            System.out.println(lineNumber + " " + line); 
            // Imprime o número da linha e o conteúdo da linha
            
            lineNumber++; 
        }
        sc.close(); 
    }
}