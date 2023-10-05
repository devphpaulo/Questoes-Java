import java.util.*;

class Datatypes{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in); 
        int t=sc.nextInt(); 
        for(int i=0;i<t;i++) 
        {
            try
            {
                long x=sc.nextLong(); 
                System.out.println(x+" can be fitted in:"); 
                if(x>=-128 && x<=127)System.out.println("* byte"); 
                // Verifica se o número pode ser armazenado em um byte e imprime uma mensagem

                 if (x>=-32768 && x<=32767)System.out.println("* short"); 
                 // Verifica se o número pode ser armazenado em um short e imprime uma mensagem

                 if (x>=-2147483648 && x<=2147483647)System.out.println("* int"); 
                 // Verifica se o número pode ser armazenado em um int e imprime uma mensagem

                 if (x>=-9223372036854775808L && x<=9223372036854775807L)System.out.println("* long"); 
                 // Verifica se o número pode ser armazenado em um long e imprime uma mensagem
            }
            catch(Exception e) 
            // Se ocorrer uma exceção ao ler o número da entrada do usuário
            {
                System.out.println(sc.next()+" can't be fitted anywhere."); 
            }
            sc.close(); 
        }
    }
}