import java.util.Scanner;

public class Exercicio1
{
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            
        int anos, meses, dias, totalDias;
        int diasAnos, diasMeses;
        
            System.out.print("Insira a quantidade de anos: \n");
            anos = sc.nextInt();
            System.out.print("Insira a quantidade de meses de 1 a 12: \n");
            meses = sc.nextInt();
            System.out.print("Insira a quantidade de dias de 1 a 30: \n");
            dias = sc.nextInt();
        
            diasAnos = anos * 365;
            diasMeses = meses * 30;
        
            totalDias = diasAnos + diasMeses + dias;
            System.out.println("Total: " + totalDias + " Dias");
        
            sc.close();
    }
}
