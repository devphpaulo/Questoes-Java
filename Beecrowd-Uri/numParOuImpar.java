import java.util.Scanner;
import java.util.Locale;

public class numParOuImpar
{
	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("US"));
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		num = sc.nextInt();
		
		if (num % 2 == 0){
		    System.out.println("PAR");
		} else {
		    System.out.println("ÍMPAR");
		}
		
		sc.close();
		
	}
}
