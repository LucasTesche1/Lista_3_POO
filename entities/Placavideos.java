package entities;

import java.util.Scanner;

import application.Programa;

public class Placavideos {

	private String nomeProduto;
	private int quantidade;
	private double preco;
	
	Scanner sc = new Scanner(System.in);
	
	public void informacoes() {
		System.out.println("Inicio da compra de PLACA DE VIDEO.\nSerá apresentada as opções de placas de videos, ápos as opções selecione qual placa de video deseja realizar a compra");
		System.out.println("OPÇÕES:\n1. Placa de video 1\n2.Placa de video 2\n3.Placa de video 3");
		int opcao = sc.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("Foi escolhido para a compra a primeira opção, o modelo: Placa de videos 1.");
			nomeProduto = "Placa de video 1";
			System.out.println("Informe a quantidade desejada para a sua compra");
			quantidade = sc.nextInt();
			System.out.println("Insira o preço do produto desejado: ");
			preco = sc.nextDouble();
			break;
		case 2:
			System.out.println("Foi escolhido para a compra a segunda opção, o modelo: Placa de videos 2.");
			nomeProduto = "Placa de videos 2";
			System.out.println("Informe a quantidade desejada para a sua compra");
			quantidade = sc.nextInt();
			System.out.println("Insira o preço do produto desejado: ");
			preco = sc.nextDouble();
			break;
		case 3:
			System.out.println("Foi escolhido para a compra a terceira opção, o modelo: Placa de videos 3.");
			nomeProduto = "Placa de videos 3";
			System.out.println("Informe a quantidade desejada para a sua compra");
			quantidade = sc.nextInt();
			System.out.println("Insira o preço do produto desejado: ");
			preco = sc.nextDouble();
			break;
		default:
			System.out.println("Opção inválida.");
			break;
		}
	}
	

	public void adicionarQuantidade(int quantidade){
		this.quantidade += quantidade;
	}
	

	public void removeQuantidade(int quantidade) {
		if (quantidade > this.quantidade) {
			System.out.println("Nao e possivel retirar");
		} else {
			this.quantidade -= quantidade;
		}
	}
	
	
	public double valorTotal() {
		return preco * quantidade;
	}
	
	
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public void setQuantidade (int quantidade) {
		this.quantidade = quantidade;
	}
	public void setPreco (double preco) {
		this.preco = preco;
	}
	
	
	public String getNomeProduto () {
		return nomeProduto;
	}
	public int getQuantidade () {
		return quantidade;
	}
	public double getPreco() {
		return preco;
	}
	
	
	public String toString() {
		return "Nome: " + 
				nomeProduto + 
				"\nQuantidade: " + 
				quantidade + 
				"\nPreço do produto por unidade: " +
				preco + 
				"\nPreco total do pedido: " +
				valorTotal();
	}
	
	
	public void retornarMenu() {
		System.out.println("Deseja realizar o cadastro de mais um produto? (s/n)");
		
		char opcao2 = sc.next().charAt(0);
		
		opcao2 = Character.toUpperCase(opcao2);
		if(opcao2 == 'S') {
		
			Programa.main(null);
		} else {
			
			System.out.println("Saindo...");
			System.exit(0);
		}
			 
	}
}
