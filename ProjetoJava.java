package uninassau;
import java.util.Scanner;

public class ProjetoJava {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		String apresentacao = "Ol� seja bem vindo ao parque de divers�es XYZ";
		double somaDaConta = 0;
		
		System.out.println(apresentacao);
		
		System.out.println("\nComo gostaria de ser chamado(a)? (Desde seu nome at� um apelido ou algo do g�nero)");
		
		String cliente = entrada.nextLine();
		
		System.out.println("\nOl� " + cliente + " me informe por favor qual brinquedo voc� deseja ir conforme o d�gito do brinquedo:");
		
		System.out.println("\n1 - Casa Fantasma: R$ 15,00");
		System.out.println("2 - Montanha russa: R$ 25,00");
		System.out.println("3 - Carrinho bate-bate: R$ 10,00");
		System.out.println("4 - N�o quero nenhum brinquedo");
		
		String escolhaBrinquedo = entrada.nextLine();
		
		switch (escolhaBrinquedo) {
			
			case "1":				
				somaDaConta += 15;
				break;
			
			case "2": 				
				somaDaConta += 25;
				break;
				
			case "3": 				
				somaDaConta += 10;
				break;
				
			case "4":
				break;
				
			default: 
				System.out.println("O n�mero digitado n�o correponde a nenhuma op��o v�lida.");
		}
		 
		System.out.println("\nAgora " + cliente + " me informe tamb�m qual tipo de comida voc� gostaria de comprar:");
		
		System.out.println("\n1 - Cachorro quente: R$ 8,00");
		System.out.println("2 - Algod�o doce: R$ 5,00");
		System.out.println("3 - Pipoca: R$ 4,00");
		System.out.println("4 - N�o estou com fome");
		
		String escolhaDaComida = entrada.nextLine();
		
		switch (escolhaDaComida) {

		case "1":
			somaDaConta += 8;
			break;
			
		case "2":
			somaDaConta += 5;
			break;
			
		case "3": 
			somaDaConta += 4;
			break;
			
		case "4": 
			break;
			
		default: 
			System.out.println("O n�mero digitado n�o correponde a nenhuma op��o v�lida.");
		
		}
		
		System.out.println("�timo, agora por favor digite sua op��o de bebida");
		
		System.out.println("\n1 - Refrigerante: R$ 5,00");
		System.out.println("2 - Suco: R$ 5,00");
		System.out.println("3 - �gua: R$ 3,00");
		System.out.println("4 - N�o estou com sede");
		
		String escolhaDaBebida = entrada.nextLine();
		
		switch (escolhaDaBebida) {
		
		case "1":
			somaDaConta += 5;
			break;
			
		case "2":
			somaDaConta += 5;
			break;
		
		case "3":
			somaDaConta += 3;
			break;
		
		case "4":
			break;
			
		default: 
			System.out.println("O n�mero digitado n�o correponde a nenhuma op��o v�lida.");
		}
		
		System.out.println("\nPrezado(a) " + cliente + " agradecemos imensamente a sua visita ao parque XYZ, o total da sua conta foi: R$ " + somaDaConta + " volte sempre!");
		
		
		
		
		
		
		
		
	}
	
	
	
}
