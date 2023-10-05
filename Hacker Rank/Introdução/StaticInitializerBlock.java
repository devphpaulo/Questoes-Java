import java.util.Scanner;

public class StaticInitializerBlock {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in); 

        int b, h; 
        b = scan.nextInt(); 
        h = scan.nextInt(); 
        if(b > 0 && h > 0){ 
            System.out.println(b*h); 
        } else { 
            System.out.println("java.lang.Exception: Breadth and height must be positive"); 
        }
        scan.close(); 
    }
}