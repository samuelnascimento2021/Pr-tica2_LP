package Exercicios_Lista2;
import java.util.Scanner;
import java.util.Random;
public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Random random = new Random();

		int opcao, cpf;
		String nome, dtaVoo, horario;
		
				
		do{
			System.out.println("1- Cadastrar passageiro \n2- Check in \n3- Cancelar Voo \n4- Sair");
		  	opcao = ler.nextInt();
      
      		switch(opcao) 
      		{
				case 1:
					System.out.println("Insira seu nome");
					nome = ler.next();
					System.out.println("Insira seu CPF");
					cpf = ler.nextInt();
					
					ler = new Scanner(System.in);
					
					System.out.println("Insira a data do voo");
					dtaVoo = ler.next();
					System.out.println("Insira o horario");
					horario = ler.next();
					
					System.out.println("Cadastro Efetuado com Sucesso!");
					
					int numVoo = random.nextInt(999);
					
					System.out.println("O número do seu voo é: " + numVoo);
					break;
					
				case 2:
					System.out.println("Insira seu CPF");
					cpf = ler.nextInt();
					System.out.println("Insira o número do voo");
					numVoo = ler.nextInt();
					
					System.out.println("Check in realizado com sucesso!");
					break;
					
				case 3:
					System.out.println("Insira seu CPF");
					cpf = ler.nextInt();
					System.out.println("Insira o número do voo");
					numVoo = ler.nextInt();
					
					System.out.println("Voo cancelado com sucesso!");
					break;
				
				case 4:
					break;
					
			}
		}
		
		while(opcao!=4);
	}

}
