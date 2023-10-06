import java.util.Scanner;
import java.util.Locale;

public class intervalos
{
	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("US"));
		Scanner sc = new Scanner(System.in);
		
		double num = sc.nextDouble();
		sc.close();
		if (num >= 0 && num <= 25){
		    System.out.println("Dentro do Intervalo (0,25)");
		} else if (num > 25 && num <= 50){
		    System.out.println("Dentro do Intervalo (25,50)");
		} else if (num > 50 && num <= 75){
		    System.out.println("Dentro do Intervalo (50,75)");
		} else if (num > 75 && num <= 100){
		    System.out.println("Dentro do Intervalo (75,100)");
		} else {
		    System.out.println("Fora dos Intervalos!");
		    return;
		}	
	}
}