import java.util.Scanner;
import java.util.Locale;

public class StdinStdout2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); 
        Scanner scan = new Scanner(System.in); 
        try {
            int i = scan.nextInt(); 
            double d = scan.nextDouble(); 
            scan.nextLine(); 
            String s = scan.nextLine(); 
            System.out.println("String: " + s); 
            System.out.println("Double: " + d); 
            System.out.println("Int: " + i); 
        } finally {
            scan.close(); 
        }
    }
}