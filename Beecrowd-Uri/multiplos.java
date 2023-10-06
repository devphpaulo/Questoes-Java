import java.util.Scanner;
import java.util.Locale;

public class multiplos
{
	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("US"));
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if (num1 > num2){
		    
		    if (num1 % num2 == 0){
		        System.out.println("Múltiplos");
		    } else {
		        System.out.println("Não Múltiplos");
		    }
		    
		} else if (num1 == num2){
		    
		    System.out.println("Inválido");
		    
		} else {
		    
		    if (num2 % num1 == 0){
		        System.out.println("Múltiplos");
		    } else {
		        System.out.println("Não Múltiplos");
		    }
		    
		}
		
		sc.close();
		
	}
}
