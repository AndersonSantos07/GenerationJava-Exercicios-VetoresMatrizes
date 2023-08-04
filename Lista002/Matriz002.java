package Lista002;

import java.util.Scanner;

public class Matriz002 {
	public static void main(String[] args) {
		int linhas=10, colunas=4;
		float notaAluno = 0;
		String sequencia = "";
		
		float[][] notas = new float[linhas][colunas];
		float[] medias = new float[linhas];
		float somaMedia = 0, media=0;
		
		Scanner ler = new Scanner(System.in);
		
		for(int i = 0;i<linhas;i++) {
			for(int j=0;j<colunas;j++) {
				if(j == 0) {
					sequencia = "Primeira";
				}else if(j == 1) {
					sequencia = "Segunda";
				}else if(j == 2) {
					sequencia = "Terceira";
				}else if(j == 3) {
					sequencia = "Quarta";
				}
				
				System.out.printf("\nDigite a %s nota do aluno %d:\n",sequencia,(i+1));
				notaAluno = ler.nextFloat();
				notas[i][j] = notaAluno;
				
			}
			
		}
		
		for(int i = 0;i<linhas;i++) {
			for(int j = 0;j<colunas;j++) {
				somaMedia += notas[i][j];
				media = somaMedia / 4;
				medias[i] = media;
				
			}
			
			somaMedia = 0;
		
			
		}
		
		
		System.out.println("\nMédia dos alunos: ");
		for(int i=0;i<medias.length;i++) {
			System.out.print(medias[i] + " ");
			
		}
		
	}
}
