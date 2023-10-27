package application;

import java.util.Scanner;
import entities.Impressoras;
import entities.Monitores;
import entities.Placavideos;


public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int escolha;
		char opcao;
		
		
		do {
			System.out.println("LOJA DE INFÓRMATICA");
			System.out.println("Escolha qual opção do menu você deseja acessar.");
			System.out.println("1 - Compra de Monitores");
			System.out.println("2 - Compra de Impressoras");
			System.out.println("3 - Compra de Placas de Vídeos");
			System.out.println("4 - Sair");
			
			
			escolha = sc.nextInt();
			
		
			switch(escolha) {
			case 1:
				Monitores monitores = new Monitores();
				
				monitores.informacoes();
			
				sc.nextLine();
				System.out.println("Insira se deseja acrescentar, remover ou continuar com as quantidades");
			
				opcao = sc.next().charAt(0);
		
				opcao = Character.toUpperCase(opcao);


				if(opcao == 'A'){
					System.out.println("Insira o valor de quantidade a mais desejada:");
					int quantidade = sc.nextInt();
					
					monitores.adicionarQuantidade(quantidade);
				} else if(opcao == 'R') {
					System.out.println("Insira o valor da quantidade que deseja retirar: ");
					int quantidade = sc.nextInt();
					
					monitores.removeQuantidade(quantidade);
				} else {
				
					System.out.println("Continuaremos apresentando as informções");
				}
				System.out.println("----");
			
				System.out.println(monitores.toString());
		
				monitores.retornarMenu();
				break;
			case 2:
				Impressoras impressoras = new Impressoras();
			
				impressoras.informacoes();
			
				sc.nextLine();
				System.out.println("Insira se deseja acrescentar, remover ou continuar com as quantidades");
				
				opcao = sc.next().charAt(0);
				
				opcao = Character.toUpperCase(opcao);
				
				
				if(opcao == 'A'){
					System.out.println("Insira o valor de quantidade a mais desejada:");
					int quantidade = sc.nextInt();
					
					impressoras.adicionarQuantidade(quantidade);
				} else if(opcao == 'R') {
					System.out.println("Insira o valor da quantidade que deseja retirar: ");
					int quantidade = sc.nextInt();
				
					impressoras.removeQuantidade(quantidade);
				} else {
					
					System.out.println("Continuaremos apresentando as informções");
				}
				System.out.println("----");
				System.out.println(impressoras.toString());
				
				impressoras.retornarMenu();
				
				break;
			case 3: 
				Placavideos placavideos = new Placavideos();
				
				placavideos.informacoes();
				
				sc.nextLine();
				System.out.println("Insira se deseja acrescentar, remover ou continuar com as quantidades");
				
				opcao = sc.next().charAt(0);
				
				opcao = Character.toUpperCase(opcao);
				
				
				if(opcao == 'A'){
					System.out.println("Insira o valor de quantidade a mais desejada:");
					int quantidade = sc.nextInt();
				
					placavideos.adicionarQuantidade(quantidade);
				} else if(opcao == 'R') {
					System.out.println("Insira o valor da quantidade que deseja retirar: ");
					int quantidade = sc.nextInt();
				
					placavideos.removeQuantidade(quantidade);
				} else {
					
					System.out.println("Continuaremos apresentando as informções");
				}
				System.out.println("----");
				System.out.println(placavideos.toString());
			
				placavideos.retornarMenu();
				
				break;
			case 4:
	
				System.out.println("Saindo");
				System.exit(0);
				break;
			default:
				System.out.println("Opção invalida");
				break;
			}
		} while(escolha != 4);

		
		sc.close();
	}

}
