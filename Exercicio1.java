package Exercicios_Lista2;
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		int opcao, numParcelas;
		double TotalGasto;
		
		System.out.println("Insira o total gasto");
		TotalGasto = ler.nextDouble();
		
		do {
			System.out.println("Selecione uma das op��es de pagamento: (Digite -1 para sair)");
			System.out.println("1- � Vista: com 10% de desconto");
			System.out.println("2- Parcelado 2x");
			System.out.println("3- Parcelado de 3x at� 6x com 3% de juros ao m�s (somente para compras acima de R$ 500,00");
			
			opcao = ler.nextInt();
			
			switch(opcao) {
			
			case 1:
				System.out.println("Valor total a vista: R$" + TotalGasto * 0.9);
				break;
			
			
			case 2:
				System.out.println("Valor total parcelado: R$ " + TotalGasto + ", em duas parcelas de: R$ " + TotalGasto/2);
				break;
				
			case 3:
				{
					System.out.println("Insira o n�mero de parcelas");
					numParcelas = ler.nextInt();
					if(numParcelas>= 3 & numParcelas<=6) {
						if(TotalGasto>=500) {
							System.out.printf("Valor total parcelado: R$ " + TotalGasto * 1.03 + ", em " + numParcelas + " parcelas de: R$ " + (TotalGasto * 1.03)/numParcelas + "\n");							
						}
						else {
							System.out.println("Escolha nova forma de pagamento");									
						}
					}
					else {
						System.out.println("N�mero de parcelas inv�lido");
					}
						break;
				}
			
			}
		
		}
		while(opcao!=-1);
	}

}
