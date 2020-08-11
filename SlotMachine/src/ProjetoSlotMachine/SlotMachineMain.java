/*
 * Programa��o Orientada a Obejtos
 * Marcos Luiz Lins Filho
 * Callebe Bastos Santos, Jéssica Alves Batista, Shinji Gabriel Miyoshi e Walace Vilas-Boas de Jesus
 * 
 */
package ProjetoSlotMachine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SlotMachineMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SlotMachine a  = new SlotMachine();
		System.out.println(" _____________________________________________________________________________________");
		System.out.println("|                                                                                     |");
		System.out.println("|                              WELCOME TO SLOTMACHINE GAME!                           |");
		System.out.println("|_____________________________________________________________________________________|");
		a.x = 0;
		
		while (a.x == 0) {//REPETI��O PARA RETORNAR PARA O MENU OU SAIR
		
			System.out.println(" _____________________________________________________________________________________");
			System.out.println("|                                                                                     |");
			System.out.println("|                                        MENU                                         |");
			System.out.println("|_____________________________________________________________________________________|");
			System.out.println("                          O valor atual de creditos �: " + a.getCredito());
			System.out.println(" _____________________________________________________________________________________");
			System.out.println("|                                                                                     |");
			System.out.println("|                     DIGITE 1 PARA COLOCAR CREDITO                                   |");
			System.out.println("|_____________________________________________________________________________________|");
			System.out.println("|                                                                                     |");
			System.out.println("|                     DIGITE 2 PARA APOSTAR 4 CREDITOS                                |");
			System.out.println("|                     DIGITE 3 PARA APOSTAR 7 CREDITOS                                |");
			System.out.println("|                     DIGITE 4 PARA APOSTAR 15 CREDITOS                               |");
			System.out.println("|_____________________________________________________________________________________|");
			System.out.println("|                                                                                     |");
			System.out.println("|                     DIGITE 5 PARA SACAR SEUS CR�DITOS                               |");
			System.out.println("|                     DIGITE 6 PARA MOSTRAR A TABELA DE PONTUA��ES                    |");
			System.out.println("|_____________________________________________________________________________________|");
			System.out.println("|                                                                                     |");
			System.out.println("|                     DIGITE 7 PARA SAIR                                              |");
			System.out.println("|_____________________________________________________________________________________|");
			System.out.print("                      DIGITE  A OP��O DESEJADA: ");
			
			a.escolha = sc.nextLine();
			
			a.x = 0;
			
		
			switch (a.escolha) {
			
				case "1":
					//a.espacamento();
					a.ComprarCredito();
					a.espacamento();
					break;
				case "4":
					a.espacamento();
					a.Verificacao();
					a.espacamento();
					break;
				case "2":
					a.espacamento();
					a.VerificacaoBarato();
					a.espacamento();
					break;
				case "3":
					a.espacamento();
					a.VerificacaoMedia();
					a.espacamento();
					break;
				case "5":
					a.espacamento();
					a.Sacar();
					//a.espacamento();
					break;
				case "6":
					a.espacamento();
					a.MostrarTudo();
					//a.espacamento();
					break;
				case "7":
					if(a.credito != 0){
						System.out.println("Voc� possui cr�ditos para sacar, fa�a isso antes de finalizar o jogo.");
					}else{
						System.out.println("Obrigada por jogar conosco.");
						a.x = 1;
					}
					break;
				default:
					System.out.println();System.out.println("OPCAO INVALIDA");
					//a.espacamento();
					break;
			}
		}
	}
	}