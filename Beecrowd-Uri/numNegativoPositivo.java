import java.util.Scanner;
import java.util.Locale;

public class numNegativoPositivo
{
	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("US"));
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		num = sc.nextInt();
		
		if (num < 0){
		    System.out.println("NEGATIVO");
		} else {
		    System.out.println("NÃO NEGATIVO");
		}
		
		sc.close();
		
	}
}
