package Exercicios_Lista2;
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		int opcao, numParcelas;
		double TotalGasto=0;
		
		System.out.println("Insira o total gasto");
		TotalGasto = ler.nextDouble();
		
		while(TotalGasto != -1) {
			
			
			System.out.println("Selecione uma das opções de pagamento: ");
			System.out.println("1- À Vista: com 10% de desconto");
			System.out.println("2- Parcelado 2x");
			System.out.println("3- Parcelado de 3x até 6x com 3% de juros ao mês (somente para compras acima de R$ 500,00");
			
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
										
					if(TotalGasto>=500) 
					{
						System.out.println("Insira o número de parcelas");
						numParcelas = ler.nextInt();
						
						if(numParcelas>= 3 & numParcelas<=6) 
							{
								System.out.printf("Valor total parcelado: %.2f, em %d parcelas de: R$ %.2f \n" , TotalGasto * 1.03 ,  numParcelas , (TotalGasto * 1.03)/numParcelas);							
							}
						else 
						{
							System.out.println("Número de parcelas inválido");
						}
						
					}
										
					else 
					{
						System.out.println("Escolha nova forma de pagamento");									
					}
						break;
				}
				
			default : System.out.println("Opção inválida");
			
			}
		
			System.out.println("\nInsira o total gasto");
			TotalGasto = ler.nextDouble();
		}
		
	}

}
