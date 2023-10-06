/*

Faça um algoritmo para ler 50 números e armazenar em 
um vetor VET, verificar e escrever se existem números 
repetidos no vetor VET e em que posições se encontram.

 */

import java.util.*;

public class VetsIguais {

    public static void main(String[] args){
        Locale.setDefault(Locale.forLanguageTag("en-US"));
        Scanner sc = new Scanner(System.in);

        int[] vet = new int[51];

        // Lendo 50 inteiros do usuário e armazenando-os no array 'vet'
        for (int i = 1; i < vet.length; i++){
            vet[i] = sc.nextInt();
        }

        // Comparando cada elemento do array com todos os outros elementos para encontrar valores duplicados
        for (int i = 1; i < vet.length; i++){
            // Pega o valor da primeira verificação do array e verifica com cada posição do array a partir da posição seguinte
            for ( int j = i + 1; j < vet.length; j++){
                if (vet[i] == vet[j]){
                    // Imprimindo o valor duplicado e suas posições no array
                    System.out.println("Valor " + vet[i] + " repetido nas posições " + i + " e " + j);
                }
            }
        }
        sc.close();
    }
}