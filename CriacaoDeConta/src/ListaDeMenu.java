import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeMenu {

	public static void main(String[] args) {
		
		
		int opcao;
		do{
			
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("[1] - Cadastro de cliente");
		System.out.println("[2] - Sair"); 
		System.out.println("Escolha a op�ao: *");
		opcao = teclado.nextInt();
		
		
		
		switch(opcao) {
		case 1 :
			System.out.println("======CADASTRO DE CLIENTE======");
			System.out.print("Digite o Agencia: ");
			String agencia = teclado.next();
			System.out.println("Digite a Conta: ");
			String conta = teclado.next();
			System.out.println("Digite o seu nome: ");
			String nome = teclado.next();
			System.out.println("Digite o seu email: ");
			String email = teclado.next();
			System.out.println("Digite o seu telefone: ");
			String telefone = teclado.next();
			System.out.println("Digite seu saldo: ");
			String saldo = teclado.next();
			
			Cliente c = new Cliente();
			c.setAgencia(agencia);
			c.setConta(conta);
			c.setNome(nome);
			c.setEmail(email);
			c.setTelefone(telefone);
			c.setSaldo(saldo);
			
			clientes.add(c);
			
			break;
		case 2 :
			System.out.println("Sair");
			
			break;
			
			default:
				System.out.println("Op��o invalida");	
		}
		
		
		} while(opcao<2 ||opcao==0||opcao>2);
		
	}	
}