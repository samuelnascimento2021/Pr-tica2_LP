package Exercicios_Lista2;
import java.util.Arrays;
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		for(int i=0; i<numeros.length; i++) {
				System.out.println("Insira os valores: ");
				numeros[i] = ler.nextInt();
		}
		
		Arrays.sort(numeros);

        System.out.println("Números ordenados:");
        for(int numero : numeros)
            System.out.println(numero);
        				
	}

}
