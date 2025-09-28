package conta_bancaria;

import java.util.InputMismatchException;
import java.util.Scanner;

import conta_bancaria.controller.ContaController;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.util.Cores;

public class Menu {
	
	private static final Scanner leia = new Scanner(System.in);
	private static final ContaController contaController = new ContaController();
	

	public static void main(String[] args) {

		

		int opcao;

		criarContasTeste();
		
		
		// Instanciar Objetos da Classe Conta

		/*  Conta c1 = new Conta(1, 123, 1, "Cintia Dourado", 500000.00f);

		Conta c2 = new Conta(2, 123, 2, "Priscila Lins", 500000.00f);

		System.out.println("O Saldo da conta é: " + c1.getSaldo());

		c1.setSaldo(600000.00f);

		System.out.println("O Saldo da conta é: " + c1.getSaldo());

		c1.visualizar();

		c2.visualizar();

		System.out.println(c1.sacar(1000));
		System.out.println("O Saldo da conta é: " + c1.getSaldo());

		System.out.println(c2.sacar(1000000));
		System.out.println("O Saldo da conta é: " + c2.getSaldo());

		c1.depositar(5000);
		System.out.println("O Saldo da conta é: " + c1.getSaldo());

		// Instanciar Objetos da Classe ContaCorrente
		ContaCorrente cc1 = new ContaCorrente(3, 456, 1, "Carla Santos", 10000000.00f, 100000.00f);

		cc1.visualizar();

		
		//sacar conta corrente
		System.out.println(cc1.sacar(2000000.00f));
		cc1.visualizar();

		
		System.out.println(cc1.sacar(2000.00f));
		cc1.visualizar();

		//sacar conta corrente
		cc1.depositar(5000.00f);
		cc1.visualizar();
		*/ 
		
		while (true) {

			System.out.println(Cores.TEXT_BLACK + Cores.ANSI_WHITE_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                 BANCO METRÓPOLES                    ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("\n\n" + Cores.TEXT_RESET);

			
			try {
			opcao = leia.nextInt();
			leia.nextLine();
			} catch (InputMismatchException e){
				opcao = -1;
				System.out.println("\nDigite um número inteiro entre 0 e 8:");
				leia.nextLine();
			}
			
						
			if (opcao == 0) {
				System.out.println(Cores.TEXT_PURPLE_BOLD + "\nBanco Metrópoles!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_PURPLE + "Criar Conta\n\n");
				keyPress();
				break;

			case 2:
				System.out.println(Cores.TEXT_PURPLE + "Listar todas as Contas\n\n");
				keyPress();
				break;

			case 3:
				System.out.println(Cores.TEXT_PURPLE + "Consultar dados da Conta - por número\n\n");
				keyPress();
				break;

			case 4:
				System.out.println(Cores.TEXT_PURPLE + "Atualizar dados da Conta\n\n");
				keyPress();
				break;

			case 5:
				System.out.println(Cores.TEXT_PURPLE + "Apagar a Conta\n\n");
				keyPress();
				break;

			case 6:
				System.out.println(Cores.TEXT_PURPLE + "Saque\n\n");
				keyPress();
				break;

			case 7:
				System.out.println(Cores.TEXT_PURPLE + "Depósito\n\n");
				keyPress();
				break;

			case 8:
				System.out.println(Cores.TEXT_PURPLE + "Transferência entre Contas\n\n");
				keyPress();
				break;

			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
				keyPress();
				break;
			}
		}

	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Letícia Campos");
		System.out.println("E-mail - leticiacamposwork@gmail.com");
		System.out.println("github.com/lefcc");
		System.out.println("*********************************************************");
	}
	
	public static void keyPress() {
		System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para continuar...");
		leia.nextLine();
		
	}
	
	public static void criarContasTeste() {
		contaController.cadastrar(new ContaCorrente(1, 456, 1, "Carla Santos", 10000000.00f, 100000.00f));
		contaController.cadastrar(new ContaPoupanca(2, 789, 2, "Leticia Campos", 10000000.00f, 10));
		leia.nextLine();
		
	}

}
