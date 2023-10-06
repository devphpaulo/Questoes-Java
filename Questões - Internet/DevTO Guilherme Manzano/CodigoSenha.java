/* 

Faça um algoritmo para ler um número que é um código 
de usuário. Caso este código seja diferente de um 
código armazenado internamente no algoritmo (igual a 1234) 
deve ser apresentada a mensagem ‘Usuário inválido!’. 

Caso o Código seja correto, deve ser lido outro valor que 
é a senha. Se esta senha estiver incorreta (a certa é 9999) 
deve ser mostrada a mensagem ‘senha incorreta’. 
Caso a senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’

*/

import java.util.*;

public class CodigoSenha {
    public static void main(String[] args) {
        Locale.setDefault(Locale.forLanguageTag("en-US"));
        Scanner sc = new Scanner(System.in);
        
        int senha = 9999;
        int codigo = 1234;
        int testeCodigo;
        
        System.out.println("Insira o código: ");
        testeCodigo = sc.nextInt();
        
        if (testeCodigo != codigo){
            System.out.println("Usuário Inválido");
        } else {
            
            System.out.println("Insira a senha de acesso: ");
            int testeSenha = sc.nextInt();
            
            if (testeSenha != senha){
                System.out.println("Senha Incorreta");
            } else {
                System.out.println("Acesso permitido!");
            }
        }
        
        sc.close();
        
    }
}