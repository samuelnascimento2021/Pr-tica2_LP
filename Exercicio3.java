package Exercicios_Lista2;
import java.util.Arrays;
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int[] vetor = new int[10];
		int aux;
		
		for(int i=0;i<10;i++) {
			System.out.printf("\nDigite a Posição número %d" , i+1);
			vetor[i] = ler.nextInt();
		}
		
		for(int i=0;i<10;i++) {
			for(int j=0; j<9; j++) {
				if(vetor[j]> vetor[j+1]) {
					aux = vetor[j];
					vetor[j]=vetor[j+1];
					vetor[j+1]=aux;
				}
			}
		}
		
		System.out.println("\nVetor Ordenado");
		for(int i=0;i<10;i++) {
			System.out.printf("%d\t",vetor[i]);
		}
        				
	}

}
