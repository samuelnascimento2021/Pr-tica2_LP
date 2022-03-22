package Exercicios_Lista2;
import java.util.Scanner;
public class Exercicio2 {

public static void main(String[] args) {
	// TODO Auto-generated method stub
				
	int mat[][] = new int[50][50];
	int x = 1;				
	for(int lin=0; lin<50; lin++) {
		for(int col=0; col<50; col++) {
			mat[lin][col] = x;
			if (lin == col)
			System.out.printf("%d\t",mat[lin][col]);
			else{
				System.out.printf("\t");
				x+=2; }
			}
				
		System.out.printf("\n");
	}
}
