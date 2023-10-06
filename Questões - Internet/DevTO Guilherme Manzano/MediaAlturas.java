/* 

Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. 
Fazer um algoritmo que calcule e escreva:
a. a maior e a menor altura do grupo;
b. média de altura dos homens;
c. o número de mulheres.

*/

import java.util.Scanner;
import java.util.Locale;

public class MediaAlturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.forLanguageTag("en-US"));
        Scanner scan = new Scanner(System.in); 
            int i = 1, mulheres = 0;
            double somaAltura = 0, altura = 0; 
            double mediaAltura, auxAltura = 0, auxMenorAltura = 3.0;
            char sexo;
        
            for (i = 1; i <= 10; i++){
                System.out.println("Digite H/h para Homem ou M/m para mulher: ");
                sexo = scan.next().charAt(0);
                
                if (sexo == 'H' || sexo == 'h'){
                    System.out.println("Digite a altura: ");
                    altura = scan.nextDouble();
                    somaAltura+= altura;
                    
                    if (altura > auxAltura){
                        auxAltura = altura; 
                    } else if (altura < auxAltura){
                        auxMenorAltura = altura;
                    }
                    scan.close();
                } 
                else if (sexo == 'M' || sexo == 'm'){
                    mulheres++;
                } else {
                    System.out.println("Inválido!");
                }
            }
            
            mediaAltura = somaAltura / (10 - mulheres);
            System.out.println("Número de Mulheres: " + mulheres);
            System.out.println("Maior e menor altura: " + auxMenorAltura + " e " + auxAltura);
            System.out.printf("Média de altura dos homens: %.2f",  mediaAltura);
        }
    }