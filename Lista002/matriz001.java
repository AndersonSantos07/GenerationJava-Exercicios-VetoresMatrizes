package Lista002;

public class matriz001 {

	public static void main(String[] args) {
		int[][] numeros = {{2,3,4},{2,5,8},{3,8,9}};
		int somaDiagonalP=0,somaDiagonalS=0;
		
		
		System.out.println("\nElementos da Diagonal Principal: ");
		for(int linha = 0;linha<3;linha++) {
			for(int coluna = 0;coluna<3;coluna++) {
				if(linha == coluna) {
					System.out.print(numeros[linha][coluna] + " ");
					somaDiagonalP += numeros[linha][coluna];
				}
				
			}
		}
		
		System.out.printf("\nSoma dos Elementos da Diagonal Principal: \n%d",somaDiagonalP); 


		
		System.out.println("\nElementos da Diagonal Secundária: ");
		for(int linha = 0;linha<3;linha++) {
			for(int coluna = 0;coluna<3;coluna++) {
				if(linha + coluna - 1 == 1 ) {
					System.out.print(numeros[linha][coluna] + " ");
					somaDiagonalS += numeros[linha][coluna];
			}
		}

	}
		
		System.out.printf("\nSoma dos Elementos da Diagonal Secundária: \n%d",somaDiagonalS);
	
	
	

	}
	}
