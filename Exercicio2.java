package Exercicios_Lista2;
import java.util.Scanner;
import java.util.Random;
public class Exercicio2 {

static final int LIN = 50;
static final int COL = 50;
	
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int mat[][] = new int[LIN][COL];
		int dp = 0;
		
		//leitura
		for(int i=0; i<LIN; i++) {
			for(int j=0; j<COL; j++) {
				Random generator = new Random();
				mat[i][j] = generator.nextInt(100);
			}
		}
		
		//apresentacao
		for(int i=0; i<LIN; i++) {
			for(int j=0; j<COL; j++) {
				System.out.print("["+mat[i][j]+"]");
			}
			System.out.println("\n");
		}
		
		//diagonal principal
				for(int i=0; i<LIN; i++) {
					for(int j=0; j<COL; j++) {
						if(i==j) {
							dp = dp + mat[i][j];
						}
					}
					
				}
		
		System.out.println("O resultado da diagonal principal �: " + dp);
	}

}
