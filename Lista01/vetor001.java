package Lista01;

import java.util.Scanner;

public class vetor001 {

	public static void main(String[] args) {
	
		int[] numeros = new int[] {2,1,4,6,5,10,9,8,3,7};
		int numero,posicao=0;
		boolean numeroEncontrado = false;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número que você deseja encontrar: ");
		numero = leia.nextInt();
		
		for(int i = 0; i<numeros.length;i++) {
			
			if(numero == numeros[i]) {
				numeroEncontrado = true;
				posicao = i;
			}
			
		}
		
		if(numeroEncontrado == true) {
			System.out.printf("\nO número %d foi encontrado na posição: %d", numero,posicao);
		}else {
			System.out.printf("\nO número %d não foi encontrado!", numero);
		}
		
		

	}

}
