package Lista01;

import java.util.Scanner;

public class vetor002 {

	public static void main(String[] args) {
		int[] numeros = new int[10];
		int soma=0;
		float media;
		
		Scanner leia = new Scanner(System.in);
		
		for(int i=0;i<numeros.length;i++) {
			int numero;
			
			System.out.printf("\nDigite o número da posição %d: ",i);
			numero = leia.nextInt();
			
			numeros[i] = numero;
		}
		
		System.out.println("\nElementos nos índices ímpares: \n");
		
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i] % 2 != 0) {
				System.out.print(numeros[i] + " ");
			}
		}
		
		System.out.println("\nElementos nos índices pares: \n");
		
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i] % 2 == 0) {
				System.out.print(numeros[i] + " ");
			}
		}
		
		
		for(int i=0;i<numeros.length;i++) {
			soma += numeros[i];
		}
		
		System.out.printf("\nSoma: %d",soma);
		
		media = soma/10;
		
		System.out.printf("\nMédia: %.2f",media);
		
	}
}
