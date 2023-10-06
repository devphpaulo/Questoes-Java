import java.util.Scanner;
import java.util.Locale;

public class duracaoJogo
{
	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("US"));
		Scanner sc = new Scanner(System.in);
		
		int h1, h2, duracao;
		
		h1 = sc.nextInt();
		h2 = sc.nextInt();
		
		if (h1 < h2){
		    duracao = h2 - h1;
		} else if (h1 == h2){
		    duracao = 24;
		} else {
		    duracao = 24 - h1 + h2;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORAS");
		
		sc.close();
		
	}
}
