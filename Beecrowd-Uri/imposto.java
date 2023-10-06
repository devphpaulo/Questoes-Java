import java.util.Scanner;
import java.util.Locale;

public class imposto
{
	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("US"));
		Scanner sc = new Scanner(System.in);
		
		final double imp1 = 80.00, imp2 = 270.00;
		double salario, imposto;

		sc.close();
		salario = sc.nextDouble();
		
		if (salario < 2000.00){
		    System.out.println("Isento!");
		    return;
		} else if (salario > 2000.00 && salario < 3000.01){
		    imposto = ((salario - 2000) / 100) * 8;
		} else if (salario > 3000.00 && salario < 4500.01){
		    imposto = imp1 + (salario - 3000) / 100 * 18;
		} else {
		    imposto = imp1 + imp2 + ((salario - 4500) / 100 * 28);
		}
		
		System.out.printf("Valor total do Imposto: R$ %.2f%n", imposto);
	}
}