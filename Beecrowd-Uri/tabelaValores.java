import java.util.Scanner;
import java.util.Locale;

public class tabelaValores
{
	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("US"));
		Scanner sc = new Scanner(System.in);
		
		int codigo, qnt;
		
		codigo = sc.nextInt();
		qnt = sc.nextInt();
		sc.close();
		
		double valorfinal;
		if (codigo == 1){
		    valorfinal = qnt * 4f;
		} else if (codigo == 2){
		    valorfinal = qnt *4.5f;
		} else if (codigo == 3){
		    valorfinal = qnt * 5f;
		} else if (codigo == 4){
		    valorfinal = qnt * 2f;
		} else if (codigo == 5){
		    valorfinal = qnt * 1.5f;
		} else {
		    System.out.println("Inválido");
		    return;
		}
		
		System.out.printf("Valor a ser pago: R$ %.2f", valorfinal);
	}
}