/*
 * Programa��o Orientada a Obejtos
 * Marcos Luiz Lins Filho
 * Callebe Bastos Santos, J�ssica Alves Batista, Shinji Gabriel Miyoshi e Walace Vilas-Boas de Jesus
 * 
 */
package ProjetoSlotMachine;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class SlotMachine {

private int a ,b ,c ,d ,e ,f ,g ,h ,i; //posi�oes dos elementos do jogo de azar
 

double credito;// Variavel credito para jogar
private double dinheiro;

private int choose;//Variavel para escolher sair do metodo jogar ou jogar novamente
public String escolha;// variavel que escolhe as opcoes do menu no jogo
public String escolha1; // Escolher quanto voc� quer depositar no jogo (metodo ComprarCredito)
public int x;
public int y;//Valor depositado nos vetores apos realizar o ramdom com possibilidades diferentes
public int z;//Variavel de manunten��o utilizado somente para espa�amentos
public int X;// Variavel mecanica  de escolha do metodo escolha elemento (facil)
public int Y;//Variavel mecanica  de escolha do metodo escolha elemento (dificil)

public double getCredito() {
	return this.credito;
}

SlotMachine() {
	 this.credito = 0;
	 this.dinheiro = 0;
	 this.z = 0;
	 this.X = 0;
	 this.Y = 0;	
}

Random r = new Random();
Scanner sc = new Scanner(System.in);

protected void espacamento() {
	this.z = 0;
	while (this.z < 10) {
		System.out.println();
		this.z += 1;
	}this.z = 0;
}

protected void Sacar() {
	//Transformar o credito possuido em dinheiro real
	
	if (this.credito > 0) {// Verifica��o para ver se tem credito
		
		this.dinheiro = this.credito*0.5; //Convertendo credito para dinheiro
		
		this.credito = 0;
		
		System.out.println("Voc� conseguiu R$ " + this.dinheiro + " parab�ns!");
		System.out.println("Obrigado por jogar conosco.");
		
	}else{
		System.out.println("ERRO: Voc� n�o possui cr�ditos para sacar.");
	}
}

protected void ComprarCredito() {
	//Cada credito vale R$0,50 de dinheiro real
	
	
	System.out.println("ESCOLHA UMAS DAS OP��ES ABAIXO\n");
	System.out.println("DIGITE 1 PARA DEPOSITAR R$ 10");
	System.out.println("DIGITE 2 PARA DEPOSITAR R$ 50");
	System.out.println("DIGITE 3 PARA DEPOSITAR R$ 100");
	System.out.println("DIGITE 4 PARA DEPOSITAR R$ 1000");
	System.out.print("\nDIGITE  A OP��O DESEJADA: ");
	this.escolha1 = sc.nextLine();
	
	this.dinheiro = 0;
	
	switch (this.escolha1) {
	
	case "1" :
		this.dinheiro = 10;
		break;
	case "2" :
		this.dinheiro = 50;
		break;
	case "3" :
		this.dinheiro = 100;
		break;
	case "4" :
		this.dinheiro = 1000;
		break;
	default :
		System.out.println("OP��O INVALIDA");
		//this.credito = 0;
		break;
	
	}
	
	if(this.dinheiro != 0){
		this.credito = this.credito + this.dinheiro/0.5;
		System.out.println();
		System.out.println("Foi adicionado  " + (this.dinheiro/0.5) + " creditos no seu saldo");
		System.out.println();System.out.println("VALOR ATUAL NA SUA CONTA : " + this.credito);
	}
}

protected void Verificacao() {
	System.out.println(" _____________________________________________________________________________________");
	System.out.println("|                                                                                     |");
	System.out.println("|                                     SLOTMACHINE!                                    |");
	System.out.println("|_____________________________________________________________________________________|\n\n");
	
	
	this.choose = 1;
	
	while (this.choose == 1) {

		
		if (this.credito >= 15 ) {
			
			this.credito -= 15;	//QUANTIDADES DE FICHAS PARA JOGAR UMA RODADA
		System.out.println("Valor do credito atual : " + this.credito);System.out.println();
		System.out.println("[APOSTA 15 CREDITOS]");
		System.out.println();System.out.println();
		
	
	
	   if(this.X < 5){
		this.y = r.nextInt(15);
		if (this.y == 0) {
			this.a = 5;}
		else if (this.y <3) {
			this.a = 4;}
		else if (this.y < 5) {
			this.a = 3;}
		else if (this.y < 7) {
			this.a = 2;}
		else if (this.y <11) {
			this.a = 1;}
		else if (this.y <=14) {
			this.a = 0;}
		
		this.y = r.nextInt(15);
		if (this.y == 0) {
			this.b = 5;}
		else if (this.y <3) {
			this.b = 4;}
		else if (this.y < 5) {
			this.b = 3;}
		else if (this.y < 7) {
			this.b = 2;}
		else if (this.y <11) {
			this.b = 1;}
		else if (this.y <=14) {
			this.b = 0;}
		
		this.y = r.nextInt(15);
		if (this.y == 0) {
			this.c = 5;}
		else if (this.y <3) {
			this.c = 4;}
		else if (this.y < 5) {
			this.c = 3;}
		else if (this.y < 7) {
			this.c = 2;}
		else if (this.y <11) {
			this.c = 1;}
		else if (this.y <=14) {
			this.c = 0;}
		
		this.y = r.nextInt(15);
		if (this.y == 0) {
			this.d = 5;}
		else if (this.y <3) {
			this.d = 4;}
		else if (this.y < 5) {
			this.d = 3;}
		else if (this.y < 7) {
			this.d = 2;}
		else if (this.y <11) {
			this.d = 1;}
		else if (this.y <=14) {
			this.d = 0;}
		
		this.y = r.nextInt(15);
		if (this.y == 0) {
			this.e = 5;}
		else if (this.y <3) {
			this.e = 4;}
		else if (this.y < 5) {
			this.e = 3;}
		else if (this.y < 7) {
			this.e = 2;}
		else if (this.y <11) {
			this.e = 1;}
		else if (this.y <=14) {
			this.e = 0;}
		
		this.y = r.nextInt(15);
		if (this.y == 0) {
			this.f = 5;}
		else if (this.y <3) {
			this.f = 4;}
		else if (this.y < 5) {
			this.f = 3;}
		else if (this.y < 7) {
			this.f = 2;}
		else if (this.y <11) {
			this.f = 1;}
		else if (this.y <=14) {
			this.f = 0;}
		
		this.y = r.nextInt(15);
		if (this.y == 0) {
			this.g = 5;}
		else if (this.y <3) {
			this.g = 4;}
		else if (this.y < 5) {
			this.g = 3;}
		else if (this.y < 7) {
			this.g = 2;}
		else if (this.y <11) {
			this.g = 1;}
		else if (this.y <=14) {
			this.g = 0;}
		
		this.y = r.nextInt(14);
		if (this.y == 0) {
			this.h = 5;}
		else if (this.y <3) {
			this.h = 4;}
		else if (this.y < 5) {
			this.h = 3;}
		else if (this.y < 7) {
			this.h = 2;}
		else if (this.y <11) {
			this.h = 1;}
		else if (this.y <=14) {
			this.h = 0;}
		
		this.y = r.nextInt(15);
		if (this.y == 0) {
			this.i = 5;}
		else if (this.y <3) {
			this.i = 4;}
		else if (this.y < 5) {
			this.i = 3;}
		else if (this.y < 7) {
			this.i = 2;}
		else if (this.y <11) {
			this.i = 1;}
		else if (this.y <=13) {
			this.i = 0;}
		
		this.X += 1;
		this.Y = 0;
		
	   }else {
		   
		
		this.a = r.nextInt(6);
		this.b = r.nextInt(6);
		this.c = r.nextInt(6);
		this.d = r.nextInt(6);
		this.e = r.nextInt(6);
		this.f = r.nextInt(6);
		this.g = r.nextInt(6);
		this.h = r.nextInt(6);
		this.i = r.nextInt(6);
			
			if(this.Y > 12) {//Quantidade de vezes que repete o embaralho dificil {
				this.X = 3;// menos 5 para saber quantas vezes o embaralho facil ta rodando depois do embralho dificil
			}
			
			this.Y += 1;
		}
	
		//A partir daqui � verifica��o dos padr�es
			
if (this.a ==  this.b && this.a ==  this.c && this.a ==  this.d && this.a ==  this.e && this.a ==  this.f && this.a ==  this.g && this.a ==  this.h && this.a ==  this.i) {
			//INICIO PADRAO LENDARIO/IMPOSSIVEL
			System.out.println("_______________________________________________________________________________________");
			System.out.println("    [" + this.a + "]    [" + this.b + "]    [" + this.c + "]");
			System.out.println();System.out.println();
			System.out.println("    [" + this.d + "]    [" + this.e + "]    [" + this.f + "]");
			System.out.println();System.out.println();
			System.out.println("    [" + this.g + "]    [" + this.h + "]    [" + this.i + "]");
			System.out.println("\n_______________________________________________________________________________________");
			
			switch  (this.a) {
			case 0:
				System.out.println();System.out.println("PARABENS ! Ganhou 500.000 creditos");
				this.credito += 500000;break;
			case 1:
				System.out.println();System.out.println("PARABENS ! Ganhou 600.000 creditos");
				this.credito += 600000;break;
			case 2:
				System.out.println();System.out.println("PARABENS ! Ganhou 700.000 creditos");
				this.credito += 700000;break;
			case 3:
				System.out.println();System.out.println("PARABENS ! Ganhou 800.000 creditos");
				this.credito += 800000;break;
			case 4:
				System.out.println();System.out.println("PARABENS ! Ganhou 900.000 creditos");
				this.credito += 900000;break;
			case 5:
				System.out.println();System.out.println("PARABENS ! Ganhou 1.000.000 creditos");
				this.credito += 1000000;break;
				
			}
				System.out.println();System.out.println();
			
		}else// INICIO PADRAO SSS
			if (this.a == this.b && this.b == this.c &&this.c == this.d && this.d == this.e &&this.e == this.f && this.f == this.g &&this.g == this.i) {
				System.out.println("_______________________________________________________________________________________");
				System.out.println("    [" + this.a + "]    [" + this.b + "]    [" + this.c + "]");
				System.out.println();System.out.println();
				System.out.println("    [" + this.d + "]    [" + this.e + "]    [" + this.f + "]");
				System.out.println();System.out.println();
				System.out.println("    [" + this.g + "]    " + this.h + "    [" + this.i + "]");
				System.out.println("\n_______________________________________________________________________________________");
				
				switch  (this.a) {
				case 0:
					System.out.println();System.out.println("PARABENS ! Ganhou 250.000 creditos");
					this.credito += 250000;break;
				case 1:
					System.out.println();System.out.println("PARABENS ! Ganhou 300.000 creditos");
					this.credito += 300000;break;
				case 2:
					System.out.println();System.out.println("PARABENS ! Ganhou 350.000 creditos");
					this.credito += 350000;break;
				case 3:
					System.out.println();System.out.println("PARABENS ! Ganhou 400.000 creditos");
					this.credito += 400000;break;
				case 4:
					System.out.println();System.out.println("PARABENS ! Ganhou 450.000 creditos");
					this.credito += 450000;break;
				case 5:
					System.out.println();System.out.println("PARABENS ! Ganhou 500.000 creditos");
					this.credito += 500000;break;
					
				}
					System.out.println();System.out.println();
				
			}else
				if(this.a == this.c && this.c == this.d && this.d == this.e && this.e == this.f && this.f == this.g && this.g == this.h &&this.h == this.i) {
					System.out.println("_______________________________________________________________________________________");
					System.out.println("    [" + this.a + "]    " + this.b + "    [" + this.c + "]");
					System.out.println();System.out.println();
					System.out.println("    [" + this.d + "]    [" + this.e + "]    [" + this.f + "]");
					System.out.println();System.out.println();
					System.out.println("    [" + this.g + "]    [" + this.h + "]    [" + this.i + "]");
					System.out.println("\n_______________________________________________________________________________________");
					
					switch  (this.a) {
					case 0:
						System.out.println();System.out.println("PARABENS ! Ganhou 250.000 creditos");
						this.credito += 250000;break;
					case 1:
						System.out.println();System.out.println("PARABENS ! Ganhou 300.000 creditos");
						this.credito += 300000;break;
					case 2:
						System.out.println();System.out.println("PARABENS ! Ganhou 350.000 creditos");
						this.credito += 350000;break;
					case 3:
						System.out.println();System.out.println("PARABENS ! Ganhou 400.000 creditos");
						this.credito += 400000;break;
					case 4:
						System.out.println();System.out.println("PARABENS ! Ganhou 450.000 creditos");
						this.credito += 450000;break;
					case 5:
						System.out.println();System.out.println("PARABENS ! Ganhou 500.000 creditos");
						this.credito += 500000;break;
						
					}
						System.out.println();System.out.println();
					
				}else
					if(this.a == this.b && this.b == this.c && this.c == this.e && this.e == this.g && this.g == this.h && this.h == this.i) {
						System.out.println("_______________________________________________________________________________________");
						System.out.println("    [" + this.a + "]    [" + this.b + "]    [" + this.c + "]");
						System.out.println();System.out.println();
						System.out.println("    " + this.d + "    [" + this.e + "]    " + this.f + "");
						System.out.println();System.out.println();
						System.out.println("    [" + this.g + "]    [" + this.h + "]    [" + this.i + "]");
						System.out.println("\n_______________________________________________________________________________________");
						
						switch  (this.a) {
						case 0:
							System.out.println();System.out.println("PARABENS ! Ganhou 250.000 creditos");
							this.credito += 250000;break;
						case 1:
							System.out.println();System.out.println("PARABENS ! Ganhou 300.000 creditos");
							this.credito += 300000;break;
						case 2:
							System.out.println();System.out.println("PARABENS ! Ganhou 350.000 creditos");
							this.credito += 350000;break;
						case 3:
							System.out.println();System.out.println("PARABENS ! Ganhou 400.000 creditos");
							this.credito += 400000;break;
						case 4:
							System.out.println();System.out.println("PARABENS ! Ganhou 450.000 creditos");
							this.credito += 450000;break;
						case 5:
							System.out.println();System.out.println("PARABENS ! Ganhou 500.000 creditos");
							this.credito += 500000;break;
							
						}
							System.out.println();System.out.println();
						
					}else//INICIO PADRAO SS
						if (this.a == this.b && this.b == this.c && this.c == this.d && this.d == this.e && this.e == this.f &&this.f == this.g ) {
							System.out.println("_______________________________________________________________________________________");
							System.out.println("    [" + this.a + "]    [" + this.b + "]    [" + this.c + "]");
							System.out.println();System.out.println();
							System.out.println("    [" + this.d + "]    [" + this.e + "]    [" + this.f + "]");
							System.out.println();System.out.println();
							System.out.println("    [" + this.g + "]    " + this.h + "    " + this.i + "");
							System.out.println("\n_______________________________________________________________________________________");
							
							switch  (this.a) {
							case 0:
								System.out.println();System.out.println("PARABENS ! Ganhou 150.000 creditos");
								this.credito += 150000;break;
							case 1:
								System.out.println();System.out.println("PARABENS ! Ganhou 180.000 creditos");
								this.credito += 180000;break;
							case 2:
								System.out.println();System.out.println("PARABENS ! Ganhou 210.000 creditos");
								this.credito += 210000;break;
							case 3:
								System.out.println();System.out.println("PARABENS ! Ganhou 240.000 creditos");
								this.credito += 240000;break;
							case 4:
								System.out.println();System.out.println("PARABENS ! Ganhou 270.000 creditos");
								this.credito += 270000;break;
							case 5:
								System.out.println();System.out.println("PARABENS ! Ganhou 300.000 creditos");
								this.credito += 300000;break;
								
							}
								System.out.println();System.out.println();
						}else
							if (this.a == this.b && this.b == this.c && this.c == this.d && this.d == this.e && this.e == this.f &&this.f == this.i ) {
								System.out.println("_______________________________________________________________________________________");
								System.out.println("    [" + this.a + "]    [" + this.b + "]    [" + this.c + "]");
								System.out.println();System.out.println();
								System.out.println("    [" + this.d + "]    [" + this.e + "]    [" + this.f + "]");
								System.out.println();System.out.println();
								System.out.println("    " + this.g + "    " + this.h + "    [" + this.i + "]");
								System.out.println("\n_______________________________________________________________________________________");
								
								switch  (this.a) {
								case 0:
									System.out.println();System.out.println("PARABENS ! Ganhou 150.000 creditos");
									this.credito += 150000;break;
								case 1:
									System.out.println();System.out.println("PARABENS ! Ganhou 180.000 creditos");
									this.credito += 180000;break;
								case 2:
									System.out.println();System.out.println("PARABENS ! Ganhou 210.000 creditos");
									this.credito += 210000;break;
								case 3:
									System.out.println();System.out.println("PARABENS ! Ganhou 240.000 creditos");
									this.credito += 240000;break;
								case 4:
									System.out.println();System.out.println("PARABENS ! Ganhou 270.000 creditos");
									this.credito += 270000;break;
								case 5:
									System.out.println();System.out.println("PARABENS ! Ganhou 300.000 creditos");
									this.credito += 300000;break;
									
								}
									System.out.println();System.out.println();
			
							}else
								if (this.c == this.d && this.d == this.e && this.e == this.f && this.f == this.g && this.g == this.h &&this.h == this.i ) {
									System.out.println("_______________________________________________________________________________________");
									System.out.println("    " + this.a + "    " + this.b + "    [" + this.c + "]");
									System.out.println();System.out.println();
									System.out.println("    [" + this.d + "]    [" + this.e + "]    [" + this.f + "]");
									System.out.println();System.out.println();
									System.out.println("    [" + this.g + "]    [" + this.h + "]    [" + this.i + "]");
									System.out.println("\n_______________________________________________________________________________________");
									
									switch  (this.c) {
									case 0:
										System.out.println();System.out.println("PARABENS ! Ganhou 150.000 creditos");
										this.credito += 150000;break;
									case 1:
										System.out.println();System.out.println("PARABENS ! Ganhou 180.000 creditos");
										this.credito += 180000;break;
									case 2:
										System.out.println();System.out.println("PARABENS ! Ganhou 210.000 creditos");
										this.credito += 210000;break;
									case 3:
										System.out.println();System.out.println("PARABENS ! Ganhou 240.000 creditos");
										this.credito += 240000;break;
									case 4:
										System.out.println();System.out.println("PARABENS ! Ganhou 270.000 creditos");
										this.credito += 270000;break;
									case 5:
										System.out.println();System.out.println("PARABENS ! Ganhou 300.000 creditos");
										this.credito += 300000;break;
										
									}
										System.out.println();System.out.println();
				
								}else
									if (this.a == this.d && this.d == this.e && this.e == this.f && this.f == this.g && this.g == this.h &&this.h == this.i ) {
										System.out.println("_______________________________________________________________________________________");
										System.out.println("    [" + this.a + "]    " + this.b + "    " + this.c + "");
										System.out.println();System.out.println();
										System.out.println("    [" + this.d + "]    [" + this.e + "]    [" + this.f + "]");
										System.out.println();System.out.println();
										System.out.println("    [" + this.g + "]    [" + this.h + "]    [" + this.i + "]");
										System.out.println("\n_______________________________________________________________________________________");
										
										switch  (this.a) {
										case 0:
											System.out.println();System.out.println("PARABENS ! Ganhou 150.000 creditos");
											this.credito += 150000;break;
										case 1:
											System.out.println();System.out.println("PARABENS ! Ganhou 180.000 creditos");
											this.credito += 180000;break;
										case 2:
											System.out.println();System.out.println("PARABENS ! Ganhou 210.000 creditos");
											this.credito += 210000;break;
										case 3:
											System.out.println();System.out.println("PARABENS ! Ganhou 240.000 creditos");
											this.credito += 240000;break;
										case 4:
											System.out.println();System.out.println("PARABENS ! Ganhou 270.000 creditos");
											this.credito += 270000;break;
										case 5:
											System.out.println();System.out.println("PARABENS ! Ganhou 300.000 creditos");
											this.credito += 300000;break;
											
										}
											System.out.println();System.out.println();
					
									}else
										if (this.a == this.c && this.c == this.d && this.d == this.e && this.e == this.f && this.f == this.g &&this.g == this.i ) {
											System.out.println("_______________________________________________________________________________________");
											System.out.println("    [" + this.a + "]    " + this.b + "    [" + this.c + "]");
											System.out.println();System.out.println();
											System.out.println("    [" + this.d + "]    [" + this.e + "]    [" + this.f + "]");
											System.out.println();System.out.println();
											System.out.println("    [" + this.g + "]    " + this.h + "    [" + this.i + "]");
											System.out.println("\n_______________________________________________________________________________________");
											
											switch  (this.a) {
											case 0:
												System.out.println();System.out.println("PARABENS ! Ganhou 150.000 creditos");
												this.credito += 150000;break;
											case 1:
												System.out.println();System.out.println("PARABENS ! Ganhou 180.000 creditos");
												this.credito += 180000;break;
											case 2:
												System.out.println();System.out.println("PARABENS ! Ganhou 210.000 creditos");
												this.credito += 210000;break;
											case 3:
												System.out.println();System.out.println("PARABENS ! Ganhou 240.000 creditos");
												this.credito += 240000;break;
											case 4:
												System.out.println();System.out.println("PARABENS ! Ganhou 270.000 creditos");
												this.credito += 270000;break;
											case 5:
												System.out.println();System.out.println("PARABENS ! Ganhou 300.000 creditos");
												this.credito += 300000;break;
												
											}
												System.out.println();System.out.println();
						
										}else//AQUI COME�A OS PADROES RAROS
											if (this.a == this.b && this.b == this.c && this.c == this.e && this.e == this.g) {
												System.out.println("_______________________________________________________________________________________");
												System.out.println("    [" + this.a + "]    [" + this.b + "]    [" + this.c + "]");
												System.out.println();System.out.println();
												System.out.println("    " + this.d + "    [" + this.e + "]    " + this.f + "");
												System.out.println();System.out.println();
												System.out.println("    [" + this.g + "]    " + this.h + "    " + this.i + "");
												System.out.println("\n_______________________________________________________________________________________");
												
												switch  (this.a) {
												case 0:
													System.out.println();System.out.println("PARABENS ! Ganhou 500 creditos");
													this.credito += 500;break;
												case 1:
													System.out.println();System.out.println("PARABENS ! Ganhou 600 creditos");
													this.credito += 600;break;
												case 2:
													System.out.println();System.out.println("PARABENS ! Ganhou 700 creditos");
													this.credito += 700;break;
												case 3:
													System.out.println();System.out.println("PARABENS ! Ganhou 800 creditos");
													this.credito += 800;break;
												case 4:
													System.out.println();System.out.println("PARABENS ! Ganhou 900 creditos");
													this.credito += 900;break;
												case 5:
													System.out.println();System.out.println("PARABENS ! Ganhou 1.000 creditos");
													this.credito += 1000;break;
													
												}
													System.out.println();System.out.println();
							
											}else
												if (this.c == this.d && this.d == this.e && this.e == this.f && this.f == this.g) {
													System.out.println("_______________________________________________________________________________________");													System.out.println("    " + this.a + "    " + this.b + "    [" + this.c + "]");
													System.out.println();System.out.println();
													System.out.println("    [" + this.d + "]    [" + this.e + "]    [" + this.f + "]");
													System.out.println();System.out.println();
													System.out.println("    [" + this.g + "]    " + this.h + "    " + this.i + "");
													System.out.println("\n_______________________________________________________________________________________");
													
													switch  (this.c) {
													case 0:
														System.out.println();System.out.println("PARABENS ! Ganhou 500 creditos");
														this.credito += 500;break;
													case 1:
														System.out.println();System.out.println("PARABENS ! Ganhou 600 creditos");
														this.credito += 600;break;
													case 2:
														System.out.println();System.out.println("PARABENS ! Ganhou 700 creditos");
														this.credito += 700;break;
													case 3:
														System.out.println();System.out.println("PARABENS ! Ganhou 800 creditos");
														this.credito += 800;break;
													case 4:
														System.out.println();System.out.println("PARABENS ! Ganhou 900 creditos");
														this.credito += 900;break;
													case 5:
														System.out.println();System.out.println("PARABENS ! Ganhou 1.000 creditos");
														this.credito += 1000;break;
														
													}
														System.out.println();System.out.println();
								
												}else
													if (this.c == this.e && this.e == this.g && this.g == this.h && this.h == this.i) {
														System.out.println("_______________________________________________________________________________________");
														System.out.println("    " + this.a + "    " + this.b + "    [" + this.c + "]");
														System.out.println();System.out.println();
														System.out.println("    " + this.d + "    [" + this.e + "]    " + this.f + "");
														System.out.println();System.out.println();
														System.out.println("    [" + this.g + "]    [" + this.h + "]    [" + this.i + "]");
														System.out.println("_______________________________________________________________________________________");
														
														switch  (this.c) {
														case 0:
															System.out.println();System.out.println("PARABENS ! Ganhou 500 creditos");
															this.credito += 500;break;
														case 1:
															System.out.println();System.out.println("PARABENS ! Ganhou 600 creditos");
															this.credito += 600;break;
														case 2:
															System.out.println();System.out.println("PARABENS ! Ganhou 700 creditos");
															this.credito += 700;break;
														case 3:
															System.out.println();System.out.println("PARABENS ! Ganhou 800 creditos");
															this.credito += 800;break;
														case 4:
															System.out.println();System.out.println("PARABENS ! Ganhou 900 creditos");
															this.credito += 900;break;
														case 5:
															System.out.println();System.out.println("PARABENS ! Ganhou 1.000 creditos");
															this.credito += 1000;break;
															
														}
															System.out.println();System.out.println();
									
													}else
														if (this.a == this.b && this.b == this.c && this.c == this.e && this.e == this.i) {
															System.out.println("_______________________________________________________________________________________");
															System.out.println("    [" + this.a + "]    [" + this.b + "]    [" + this.c + "]");
															System.out.println();System.out.println();
															System.out.println("    " + this.d + "    [" + this.e + "]    " + this.f + "");
															System.out.println();System.out.println();
															System.out.println("    " + this.g + "    " + this.h + "    [" + this.i + "]");
															System.out.println("\n_______________________________________________________________________________________");
															
															switch  (this.a) {
															case 0:
																System.out.println();System.out.println("PARABENS ! Ganhou 500 creditos");
																this.credito += 500;break;
															case 1:
																System.out.println();System.out.println("PARABENS ! Ganhou 600 creditos");
																this.credito += 600;break;
															case 2:
																System.out.println();System.out.println("PARABENS ! Ganhou 700 creditos");
																this.credito += 700;break;
															case 3:
																System.out.println();System.out.println("PARABENS ! Ganhou 800 creditos");
																this.credito += 800;break;
															case 4:
																System.out.println();System.out.println("PARABENS ! Ganhou 900 creditos");
																this.credito += 900;break;
															case 5:
																System.out.println();System.out.println("PARABENS ! Ganhou 1.000 creditos");
																this.credito += 1000;break;
																
															}
																System.out.println();System.out.println();
										
														}else
															if (this.a == this.d && this.d == this.e && this.e == this.f && this.f == this.i) {
																System.out.println("_______________________________________________________________________________________");
																System.out.println("    [" + this.a + "]    " + this.b + "    " + this.c + "");
																System.out.println();System.out.println();
																System.out.println("    [" + this.d + "]    [" + this.e + "]    [" + this.f + "]");
																System.out.println();System.out.println();
																System.out.println("    " + this.g + "    " + this.h + "    [" + this.i + "]");
																System.out.println("\n_______________________________________________________________________________________");
																
																switch  (this.a) {
																case 0:
																	System.out.println();System.out.println("PARABENS ! Ganhou 500 creditos");
																	this.credito += 500;break;
																case 1:
																	System.out.println();System.out.println("PARABENS ! Ganhou 600 creditos");
																	this.credito += 600;break;
																case 2:
																	System.out.println();System.out.println("PARABENS ! Ganhou 700 creditos");
																	this.credito += 700;break;
																case 3:
																	System.out.println();System.out.println("PARABENS ! Ganhou 800 creditos");
																	this.credito += 800;break;
																case 4:
																	System.out.println();System.out.println("PARABENS ! Ganhou 900 creditos");
																	this.credito += 900;break;
																case 5:
																	System.out.println();System.out.println("PARABENS ! Ganhou 1.000 creditos");
																	this.credito += 1000;break;
																	
																}
																	System.out.println();System.out.println();
											
															}else
																if (this.a == this.e && this.e == this.g && this.g == this.h && this.h == this.i) {
																	System.out.println("_______________________________________________________________________________________");
																	System.out.println("    [" + this.a + "]    " + this.b + "    " + this.c + "");
																	System.out.println();System.out.println();
																	System.out.println("    " + this.d + "    [" + this.e + "]    " + this.f + "");
																	System.out.println();System.out.println();
																	System.out.println("    [" + this.g + "]    [" + this.h + "]    [" + this.i + "]");
																	System.out.println("\n_______________________________________________________________________________________");
																	
																	switch  (this.a) {
																	case 0:
																		System.out.println();System.out.println("PARABENS ! Ganhou 500 creditos");
																		this.credito += 500;break;
																	case 1:
																		System.out.println();System.out.println("PARABENS ! Ganhou 600 creditos");
																		this.credito += 600;break;
																	case 2:
																		System.out.println();System.out.println("PARABENS ! Ganhou 700 creditos");
																		this.credito += 700;break;
																	case 3:
																		System.out.println();System.out.println("PARABENS ! Ganhou 800 creditos");
																		this.credito += 800;break;
																	case 4:
																		System.out.println();System.out.println("PARABENS ! Ganhou 900 creditos");
																		this.credito += 900;break;
																	case 5:
																		System.out.println();System.out.println("PARABENS ! Ganhou 1.000 creditos");
																		this.credito += 1000;break;
																		
																	}
																		System.out.println();System.out.println();
												
																}else
																	if (this.a == this.b && this.b == this.c && this.c == this.d && this.d == this.e && this.e == this.f ) {
																		System.out.println("_______________________________________________________________________________________");
																		System.out.println("    [" + this.a + "]    [" + this.b + "]    [" + this.c + "]");
																		System.out.println();System.out.println();
																		System.out.println("    [" + this.d + "]    [" + this.e + "]    [" + this.f + "]");
																		System.out.println();System.out.println();
																		System.out.println("    " + this.g + "    " + this.h + "    " + this.i + "");
																		System.out.println("\n_______________________________________________________________________________________");
																		
																		switch  (this.a) {
																		case 0:
																			System.out.println();System.out.println("PARABENS ! Ganhou 500 creditos");
																			this.credito += 500;break;
																		case 1:
																			System.out.println();System.out.println("PARABENS ! Ganhou 600 creditos");
																			this.credito += 600;break;
																		case 2:
																			System.out.println();System.out.println("PARABENS ! Ganhou 700 creditos");
																			this.credito += 700;break;
																		case 3:
																			System.out.println();System.out.println("PARABENS ! Ganhou 800 creditos");
																			this.credito += 800;break;
																		case 4:
																			System.out.println();System.out.println("PARABENS ! Ganhou 900 creditos");
																			this.credito += 900;break;
																		case 5:
																			System.out.println();System.out.println("PARABENS ! Ganhou 1.000 creditos");
																			this.credito += 1000;break;
																			
																		}
																			System.out.println();System.out.println();
													
																	}else
																		if (this.d == this.e && this.e == this.f && this.f == this.g && this.g == this.h && this.h == this.i ) {
																			System.out.println("_______________________________________________________________________________________");
																		System.out.println("    " + this.a + "    " + this.b + "    " + this.c + "");
																		System.out.println();System.out.println();
																		System.out.println("    [" + this.d + "]    [" + this.e + "]    [" + this.f + "]");
																		System.out.println();System.out.println();
																		System.out.println("    [" + this.g + "]    [" + this.h + "]    [" + this.i + "]");
																		System.out.println();
																		System.out.println("\n_______________________________________________________________________________________");
																		
																		switch  (this.d) {
																		case 0:
																			System.out.println();System.out.println("PARABENS ! Ganhou 500 creditos");
																			this.credito += 500;break;
																		case 1:
																			System.out.println();System.out.println("PARABENS ! Ganhou 600 creditos");
																			this.credito += 600;break;
																		case 2:
																			System.out.println();System.out.println("PARABENS ! Ganhou 700 creditos");
																			this.credito += 700;break;
																		case 3:
																			System.out.println();System.out.println("PARABENS ! Ganhou 800 creditos");
																			this.credito += 800;break;
																		case 4:
																			System.out.println();System.out.println("PARABENS ! Ganhou 900 creditos");
																			this.credito += 900;break;
																		case 5:
																			System.out.println();System.out.println("PARABENS ! Ganhou 1.000 creditos");
																			this.credito += 1000;break;
																			
																		}
																			System.out.println();System.out.println();
													
																	}else 
																		if (this.a == this.b && this.b == this.c && this.c == this.g && this.g == this.h && this.h == this.i ) {
																			System.out.println("_______________________________________________________________________________________");
																		System.out.println("    [" + this.a + "]    [" + this.b + "]    [" + this.c + "]");
																		System.out.println();System.out.println();
																		System.out.println("    " + this.d + "    " + this.e + "    " + this.f + "");
																		System.out.println();System.out.println();
																		System.out.println("    [" + this.g + "]    [" + this.h + "]    [" + this.i + "]");
																		System.out.println("\n_______________________________________________________________________________________");
																		
																		switch  (this.a) {
																		case 0:
																			System.out.println();System.out.println("PARABENS ! Ganhou 500 creditos");
																			this.credito += 500;break;
																		case 1:
																			System.out.println();System.out.println("PARABENS ! Ganhou 600 creditos");
																			this.credito += 600;break;
																		case 2:
																			System.out.println();System.out.println("PARABENS ! Ganhou 700 creditos");
																			this.credito += 700;break;
																		case 3:
																			System.out.println();System.out.println("PARABENS ! Ganhou 800 creditos");
																			this.credito += 800;break;
																		case 4:
																			System.out.println();System.out.println("PARABENS ! Ganhou 900 creditos");
																			this.credito += 900;break;
																		case 5:
																			System.out.println();System.out.println("PARABENS ! Ganhou 1.000 creditos");
																			this.credito += 1000;break;
																			
																		}
																			System.out.println();System.out.println();
													
																	}else
																		if (this.a == this.c && this.c == this.e && this.e == this.g && this.g == this.i) {
																			System.out.println("_______________________________________________________________________________________");
																		System.out.println("    [" + this.a + "]    " + this.b + "    [" + this.c + "]");
																		System.out.println();System.out.println();
																		System.out.println("    " + this.d + "    [" + this.e + "]    " + this.f + "");
																		System.out.println();System.out.println();
																		System.out.println("    [" + this.g + "]    " + this.h + "    [" + this.i + "]");
																		System.out.println("\n_______________________________________________________________________________________");
																		
																		switch  (this.a) {
																		case 0:
																			System.out.println();System.out.println("PARABENS ! Ganhou 500 creditos");
																			this.credito += 500;break;
																		case 1:
																			System.out.println();System.out.println("PARABENS ! Ganhou 600 creditos");
																			this.credito += 600;break;
																		case 2:
																			System.out.println();System.out.println("PARABENS ! Ganhou 700 creditos");
																			this.credito += 700;break;
																		case 3:
																			System.out.println();System.out.println("PARABENS ! Ganhou 800 creditos");
																			this.credito += 800;break;
																		case 4:
																			System.out.println();System.out.println("PARABENS ! Ganhou 900 creditos");
																			this.credito += 900;break;
																		case 5:
																			System.out.println();System.out.println("PARABENS ! Ganhou 1.000 creditos");
																			this.credito += 1000;break;
																			
																		}
																			System.out.println();System.out.println();
													
		}else
			if (this.a == this.b && this.b == this.c) {
		
				System.out.println("_______________________________________________________________________________________");
		System.out.println("    [" + this.a + "]    [" + this.b + "]    [" + this.c + "]");
		System.out.println();System.out.println();
		System.out.println("    " + this.d + "    " + this.e + "    " + this.f);
		System.out.println();System.out.println();
		System.out.println("    " + this.g + "    " + this.h + "    " + this.i);
		System.out.println("\n_______________________________________________________________________________________");
		
		switch  (this.a) {
		case 0:
			System.out.println();System.out.println("PARABENS ! Ganhou 50 creditos");
			this.credito += 50;break;
		case 1:
			System.out.println();System.out.println("PARABENS ! Ganhou 60 creditos");
			this.credito += 60;break;
		case 2:
			System.out.println();System.out.println("PARABENS ! Ganhou 70 creditos");
			this.credito += 70;break;
		case 3:
			System.out.println();System.out.println("PARABENS ! Ganhou 80 creditos");
			this.credito += 80;break;
		case 4:
			System.out.println();System.out.println("PARABENS ! Ganhou 90 creditos");
			this.credito += 90;break;
		case 5:
			System.out.println();System.out.println("PARABENS ! Ganhou 100 creditos");
			this.credito += 100;break;
			
		}
			System.out.println();System.out.println();
		
	}else
		if (this.d == this.e && this.e == this.f) {
		
		
			System.out.println("_______________________________________________________________________________________");
		System.out.println("    " + this.a + "    " + this.b + "    " + this.c);
		System.out.println();System.out.println();
		System.out.println("    [" + this.d + "]    [" + this.e + "]    [" + this.f + "]");
		System.out.println();System.out.println();
		System.out.println("    " + this.g + "    " + this.h + "    " + this.i);
		System.out.println("\n_______________________________________________________________________________________");
		
		switch  (this.d) {
		case 0:
			System.out.println();System.out.println("PARABENS ! Ganhou 50 creditos");
			this.credito += 50;break;
		case 1:
			System.out.println();System.out.println("PARABENS ! Ganhou 60 creditos");
			this.credito += 60;break;
		case 2:
			System.out.println();System.out.println("PARABENS ! Ganhou 70 creditos");
			this.credito += 70;break;
		case 3:
			System.out.println();System.out.println("PARABENS ! Ganhou 80 creditos");
			this.credito += 80;break;
		case 4:
			System.out.println();System.out.println("PARABENS ! Ganhou 90 creditos");
			this.credito += 90;break;
		case 5:
			System.out.println();System.out.println("PARABENS ! Ganhou 100 creditos");
			this.credito += 100;break;
			
		}
			System.out.println();System.out.println();
		
	}else
		if (this.g == this.h && this.h == this.i) {
		
		
		System.out.println("_______________________________________________________________________________________");
		System.out.println("    " + this.a + "    " + this.b + "    " + this.c);
		System.out.println();System.out.println();
		System.out.println("    " + this.d + "    " + this.e + "    " + this.f);
		System.out.println();System.out.println();
		System.out.println("    [" + this.g + "]    [" + this.h + "]    [" + this.i + "]");
		System.out.println("\n_______________________________________________________________________________________");
		
		switch  (this.g) {
		case 0:
			System.out.println();System.out.println("PARABENS ! Ganhou 50 creditos");
			this.credito += 50;break;
		case 1:
			System.out.println();System.out.println("PARABENS ! Ganhou 60 creditos");
			this.credito += 60;break;
		case 2:
			System.out.println();System.out.println("PARABENS ! Ganhou 70 creditos");
			this.credito += 70;break;
		case 3:
			System.out.println();System.out.println("PARABENS ! Ganhou 80 creditos");
			this.credito += 80;break;
		case 4:
			System.out.println();System.out.println("PARABENS ! Ganhou 90 creditos");
			this.credito += 90;break;
		case 5:
			System.out.println();System.out.println("PARABENS ! Ganhou 100 creditos");
			this.credito += 100;break;
			
		}
			System.out.println();System.out.println();
		
	}else
		if (this.c == this.e && this.e == this.g) {
		
		System.out.println("_______________________________________________________________________________________");
		System.out.println("    " + this.a + "    " + this.b + "    [" + this.c + "]");
		System.out.println();System.out.println();
		System.out.println("    " + this.d + "    [" + this.e + "]    " + this.f);
		System.out.println();System.out.println();
		System.out.println("    [" + this.g + "]    " + this.h + "    " + this.i);
		System.out.println("\n_______________________________________________________________________________________");
		
		switch  (this.c) {
		case 0:
			System.out.println();System.out.println("PARABENS ! Ganhou 50 creditos");
			this.credito += 50;break;
		case 1:
			System.out.println();System.out.println("PARABENS ! Ganhou 60 creditos");
			this.credito += 60;break;
		case 2:
			System.out.println();System.out.println("PARABENS ! Ganhou 70 creditos");
			this.credito += 70;break;
		case 3:
			System.out.println();System.out.println("PARABENS ! Ganhou 80 creditos");
			this.credito += 80;break;
		case 4:
			System.out.println();System.out.println("PARABENS ! Ganhou 90 creditos");
			this.credito += 90;break;
		case 5:
			System.out.println();System.out.println("PARABENS ! Ganhou 100 creditos");
			this.credito += 100;break;
		}
			System.out.println();System.out.println();
		
	}else
		if (this.a == this.e && this.e == this.i) {
	
			System.out.println("_______________________________________________________________________________________");
			System.out.println("    [" + this.a + "]    " + this.b + "    " + this.c + "");
			System.out.println();System.out.println();
			System.out.println("    " + this.d + "    [" + this.e + "]    " + this.f);
			System.out.println();System.out.println();
			System.out.println("    " + this.g + "    " + this.h + "    [" + this.i + "]");
			System.out.println("\n_______________________________________________________________________________________");
			
			switch  (this.a) {
			case 0:
				System.out.println();System.out.println("PARABENS ! Ganhou 50 creditos");
				this.credito += 50;break;
			case 1:
				System.out.println();System.out.println("PARABENS ! Ganhou 60 creditos");
				this.credito += 60;break;
			case 2:
				System.out.println();System.out.println("PARABENS ! Ganhou 70 creditos");
				this.credito += 70;break;
			case 3:
				System.out.println();System.out.println("PARABENS ! Ganhou 80 creditos");
				this.credito += 80;break;
			case 4:
				System.out.println();System.out.println("PARABENS ! Ganhou 90 creditos");
				this.credito += 90;break;
			case 5:
				System.out.println();System.out.println("PARABENS ! Ganhou 100 creditos");
				this.credito += 100;break;
				
			}
				System.out.println();System.out.println();
	
}else {
	System.out.println("_______________________________________________________________________________________");
	System.out.println("    " + this.a + "    " + this.b + "    " + this.c + "");
	System.out.println();System.out.println();
	System.out.println("    " + this.d + "    " + this.e + "    " + this.f);
	System.out.println();System.out.println();
	System.out.println("    " + this.g + "    " + this.h + "    " + this.i + "");
	System.out.println("\n_______________________________________________________________________________________\n");
	System.out.println("QUE PENA NAO FOI DESSA VEZ :-(");
}

	


	try {
	System.out.println();System.out.println("[JOGAR NOVAMENTE DIGITE 1 OU 0 PARA SAIR]");
		this.choose = sc.nextInt();
		this.espacamento();
		
	}catch(InputMismatchException e) {
		sc.nextLine();
		System.out.println("VALOR DE ENTRADA INVALIDA INVALIDO");
		this.choose = 0;
	}
	
	}else {
		System.out.println("ERROR! Nao tem creditos para jogar");
		this.choose = 0;
	}
	}
}

protected void VerificacaoMedia() {
	System.out.println(" _____________________________________________________________________________________");
	System.out.println("|                                                                                     |");
	System.out.println("|                                     SLOTMACHINE!                                    |");
	System.out.println("|_____________________________________________________________________________________|\n\n");
		
		
		this.choose = 1;
		
		while (this.choose == 1) {

			
			if (this.credito >=7 ) {
				
				this.credito -= 7;	//QUANTIDADES DE FICHAS PARA JOGAR UMA RODADA
				System.out.println("Valor do credito atual : " + this.credito);System.out.println();
				System.out.println("[APOSTA 7 CREDITOS]");
				System.out.println();System.out.println();
			
				this.y = r.nextInt(15);
				if (this.y == 0) {
					this.a = 5;}
				else if (this.y <3) {
					this.a = 4;}
				else if (this.y < 5) {
					this.a = 3;}
				else if (this.y < 7) {
					this.a = 2;}
				else if (this.y <11) {
					this.a = 1;}
				else if (this.y <=14) {
					this.a = 0;}
				
				this.y = r.nextInt(15);
				if (this.y == 0) {
					this.b = 5;}
				else if (this.y <3) {
					this.b = 4;}
				else if (this.y < 5) {
					this.b = 3;}
				else if (this.y < 7) {
					this.b = 2;}
				else if (this.y <11) {
					this.b = 1;}
				else if (this.y <=14) {
					this.b = 0;}
				
				this.y = r.nextInt(15);
				if (this.y == 0) {
					this.c = 5;}
				else if (this.y <3) {
					this.c = 4;}
				else if (this.y < 5) {
					this.c = 3;}
				else if (this.y < 7) {
					this.c = 2;}
				else if (this.y <11) {
					this.c = 1;}
				else if (this.y <=14) {
					this.c = 0;}
				
				this.y = r.nextInt(15);
				if (this.y == 0) {
					this.d = 5;}
				else if (this.y <3) {
					this.d = 4;}
				else if (this.y < 5) {
					this.d = 3;}
				else if (this.y < 7) {
					this.d = 2;}
				else if (this.y <11) {
					this.d = 1;}
				else if (this.y <=14) {
					this.d = 0;}
				
				this.y = r.nextInt(15);
				if (this.y == 0) {
					this.e = 5;}
				else if (this.y <3) {
					this.e = 4;}
				else if (this.y < 5) {
					this.e = 3;}
				else if (this.y < 7) {
					this.e = 2;}
				else if (this.y <11) {
					this.e = 1;}
				else if (this.y <=14) {
					this.e = 0;}
				
				this.y = r.nextInt(15);
				if (this.y == 0) {
					this.f = 5;}
				else if (this.y <3) {
					this.f = 4;}
				else if (this.y < 5) {
					this.f = 3;}
				else if (this.y < 7) {
					this.f = 2;}
				else if (this.y <11) {
					this.f = 1;}
				else if (this.y <=14) {
					this.f = 0;}
				
				this.y = r.nextInt(15);
				if (this.y == 0) {
					this.g = 5;}
				else if (this.y <3) {
					this.g = 4;}
				else if (this.y < 5) {
					this.g = 3;}
				else if (this.y < 7) {
					this.g = 2;}
				else if (this.y <11) {
					this.g = 1;}
				else if (this.y <=14) {
					this.g = 0;}
				
				this.y = r.nextInt(15);
				if (this.y == 0) {
					this.h = 5;}
				else if (this.y <3) {
					this.h = 4;}
				else if (this.y < 5) {
					this.h = 3;}
				else if (this.y < 7) {
					this.h = 2;}
				else if (this.y <11) {
					this.h = 1;}
				else if (this.y <=14) {
					this.h = 0;}
				
				this.y = r.nextInt(15);
				if (this.y == 0) {
					this.i = 5;}
				else if (this.y <3) {
					this.i = 4;}
				else if (this.y < 5) {
					this.i = 3;}
				else if (this.y < 7) {
					this.i = 2;}
				else if (this.y <11) {
					this.i = 1;}
				else if (this.y <=14) {
					this.i = 0;}
				
				
				
				if (this.a == this.b && this.b == this.c && this.c == this.d && this.d == this.e && this.e == this.f ) {
					System.out.println("_______________________________________________________________________________________");
					System.out.println(" LINHA DE PAGAMENTO ---------------->   [" + this.a + "]    [" + this.b + "]    [" + this.c + "]");
					System.out.println();System.out.println();
					System.out.println(" LINHA DE PAGAMENTO ---------------->   [" + this.d + "]    [" + this.e + "]    [" + this.f + "]");
					System.out.println();System.out.println();
					System.out.println(" LINHA DE PAGAMENTO ---------------->    " + this.g + "      " + this.h + "      " + this.i + "");
					System.out.println("\n_______________________________________________________________________________________");
					
					switch  (this.a) {
					case 0:
						System.out.println();System.out.println("PARABENS ! Ganhou 500 creditos");
						this.credito += 500;break;
					case 1:
						System.out.println();System.out.println("PARABENS ! Ganhou 600 creditos");
						this.credito += 600;break;
					case 2:
						System.out.println();System.out.println("PARABENS ! Ganhou 700 creditos");
						this.credito += 700;break;
					case 3:
						System.out.println();System.out.println("PARABENS ! Ganhou 800 creditos");
						this.credito += 800;break;
					case 4:
						System.out.println();System.out.println("PARABENS ! Ganhou 900 creditos");
						this.credito += 900;break;
					case 5:
						System.out.println();System.out.println("PARABENS ! Ganhou 1.000 creditos");
						this.credito += 1000;break;
						
					}
						System.out.println();System.out.println();

				}else
					if (this.d == this.e && this.e == this.f && this.f == this.g && this.g == this.h && this.h == this.i ) {
						System.out.println("_______________________________________________________________________________________");
						System.out.println(" LINHA DE PAGAMENTO ---------------->    " + this.a + "      " + this.b + "      " + this.c + "");
						System.out.println();System.out.println();
						System.out.println(" LINHA DE PAGAMENTO ---------------->   [" + this.d + "]    [" + this.e + "]    [" + this.f + "]");
						System.out.println();System.out.println();
						System.out.println(" LINHA DE PAGAMENTO ---------------->   [" + this.g + "]    [" + this.h + "]    [" + this.i + "]");
						System.out.println("\n_______________________________________________________________________________________");
					
					switch  (this.d) {
					case 0:
						System.out.println();System.out.println("PARABENS ! Ganhou 500 creditos");
						this.credito += 500;break;
					case 1:
						System.out.println();System.out.println("PARABENS ! Ganhou 600 creditos");
						this.credito += 600;break;
					case 2:
						System.out.println();System.out.println("PARABENS ! Ganhou 700 creditos");
						this.credito += 700;break;
					case 3:
						System.out.println();System.out.println("PARABENS ! Ganhou 800 creditos");
						this.credito += 800;break;
					case 4:
						System.out.println();System.out.println("PARABENS ! Ganhou 900 creditos");
						this.credito += 900;break;
					case 5:
						System.out.println();System.out.println("PARABENS ! Ganhou 1.000 creditos");
						this.credito += 1000;break;
						
					}
						System.out.println();System.out.println();

				}else 
					if (this.a == this.b && this.b == this.c && this.c == this.g && this.g == this.h && this.h == this.i ) {
						System.out.println("_______________________________________________________________________________________");
						System.out.println(" LINHA DE PAGAMENTO ---------------->   [" + this.a + "]    [" + this.b + "]    [" + this.c + "]");
						System.out.println();System.out.println();
						System.out.println(" LINHA DE PAGAMENTO ---------------->    " + this.d + "      " + this.e + "      " + this.f + "");
						System.out.println();System.out.println();
						System.out.println(" LINHA DE PAGAMENTO ---------------->   [" + this.g + "]    [" + this.h + "]    [" + this.i + "]");
						System.out.println("\n_______________________________________________________________________________________");
					
					switch  (this.a) {
					case 0:
						System.out.println();System.out.println("PARABENS ! Ganhou 500 creditos");
						this.credito += 500;break;
					case 1:
						System.out.println();System.out.println("PARABENS ! Ganhou 600 creditos");
						this.credito += 600;break;
					case 2:
						System.out.println();System.out.println("PARABENS ! Ganhou 700 creditos");
						this.credito += 700;break;
					case 3:
						System.out.println();System.out.println("PARABENS ! Ganhou 800 creditos");
						this.credito += 800;break;
					case 4:
						System.out.println();System.out.println("PARABENS ! Ganhou 900 creditos");
						this.credito += 900;break;
					case 5:
						System.out.println();System.out.println("PARABENS ! Ganhou 1.000 creditos");
						this.credito += 1000;break;
						
					}
						System.out.println();System.out.println();

				}else
					if (this.a == this.b && this.b == this.c) {
						
						System.out.println("_______________________________________________________________________________________");
						System.out.println(" LINHA DE PAGAMENTO ---------------->   [" + this.a + "]    [" + this.b + "]    [" + this.c + "]");
						System.out.println();System.out.println();
						System.out.println(" LINHA DE PAGAMENTO ---------------->    " + this.d + "      " + this.e + "      " + this.f + "");
						System.out.println();System.out.println();
						System.out.println(" LINHA DE PAGAMENTO ---------------->    " + this.g + "      " + this.h + "      " + this.i + "");
						System.out.println("\n_______________________________________________________________________________________");
						
						switch  (this.a) {
						case 0:
							System.out.println();System.out.println("PARABENS ! Ganhou 50 creditos");
							this.credito += 50;break;
						case 1:
							System.out.println();System.out.println("PARABENS ! Ganhou 60 creditos");
							this.credito += 60;break;
						case 2:
							System.out.println();System.out.println("PARABENS ! Ganhou 70 creditos");
							this.credito += 70;break;
						case 3:
							System.out.println();System.out.println("PARABENS ! Ganhou 80 creditos");
							this.credito += 80;break;
						case 4:
							System.out.println();System.out.println("PARABENS ! Ganhou 90 creditos");
							this.credito += 90;break;
						case 5:
							System.out.println();System.out.println("PARABENS ! Ganhou 100 creditos");
							this.credito += 100;break;
							
						}
							System.out.println();System.out.println();
						
					}else
						if (this.d == this.e && this.e == this.f) {
						
						
							System.out.println("_______________________________________________________________________________________");
							System.out.println(" LINHA DE PAGAMENTO ---------------->    " + this.a + "      " + this.b + "      " + this.c + "");
							System.out.println();System.out.println();
							System.out.println(" LINHA DE PAGAMENTO ---------------->   [" + this.d + "]    [" + this.e + "]    [" + this.f + "]");
							System.out.println();System.out.println();
							System.out.println(" LINHA DE PAGAMENTO ---------------->    " + this.g + "      " + this.h + "      " + this.i + "");
							System.out.println("\n_______________________________________________________________________________________");
						
						switch  (this.d) {
						case 0:
							System.out.println();System.out.println("PARABENS ! Ganhou 50 creditos");
							this.credito += 50;break;
						case 1:
							System.out.println();System.out.println("PARABENS ! Ganhou 60 creditos");
							this.credito += 60;break;
						case 2:
							System.out.println();System.out.println("PARABENS ! Ganhou 70 creditos");
							this.credito += 70;break;
						case 3:
							System.out.println();System.out.println("PARABENS ! Ganhou 80 creditos");
							this.credito += 80;break;
						case 4:
							System.out.println();System.out.println("PARABENS ! Ganhou 90 creditos");
							this.credito += 90;break;
						case 5:
							System.out.println();System.out.println("PARABENS ! Ganhou 100 creditos");
							this.credito += 100;break;
							
						}
							System.out.println();System.out.println();
						
					}else
						if (this.g == this.h && this.h == this.i) {
						
						
							System.out.println("_______________________________________________________________________________________");
							System.out.println(" LINHA DE PAGAMENTO ---------------->     " + this.a + "     " + this.b + "     " + this.c + "");
							System.out.println();System.out.println();
							System.out.println(" LINHA DE PAGAMENTO ---------------->     " + this.d + "     " + this.e + "     " + this.f + "");
							System.out.println();System.out.println();
							System.out.println(" LINHA DE PAGAMENTO ---------------->   [" + this.g + "]    [" + this.h + "]    [" + this.i + "]");
							System.out.println("\n_______________________________________________________________________________________");
						
						switch  (this.g) {
						case 0:
							System.out.println();System.out.println("PARABENS ! Ganhou 50 creditos");
							this.credito += 50;break;
						case 1:
							System.out.println();System.out.println("PARABENS ! Ganhou 60 creditos");
							this.credito += 60;break;
						case 2:
							System.out.println();System.out.println("PARABENS ! Ganhou 70 creditos");
							this.credito += 70;break;
						case 3:
							System.out.println();System.out.println("PARABENS ! Ganhou 80 creditos");
							this.credito += 80;break;
						case 4:
							System.out.println();System.out.println("PARABENS ! Ganhou 90 creditos");
							this.credito += 90;break;
						case 5:
							System.out.println();System.out.println("PARABENS ! Ganhou 100 creditos");
							this.credito += 100;break;
							
						}
							System.out.println();System.out.println();
						
					}else {
						System.out.println("_______________________________________________________________________________________");
						System.out.println(" LINHA DE PAGAMENTO ---------------->   " + this.a + "    " + this.b + "    " + this.c + "");
						System.out.println();System.out.println();
						System.out.println(" LINHA DE PAGAMENTO ---------------->   " + this.d + "    " + this.e + "    " + this.f + "");
						System.out.println();System.out.println();
						System.out.println(" LINHA DE PAGAMENTO ---------------->   " + this.g + "    " + this.h + "    " + this.i + "");
						System.out.println("\n_______________________________________________________________________________________\n");
						System.out.println("QUE PENA NAO FOI DESSA VEZ :(");
						}
				
				try {
				System.out.println();System.out.println("[JOGAR NOVAMENTE DIGITE 1 OU 0 PARA SAIR]");
				this.choose = sc.nextInt();
				this.espacamento();		
				
				}catch(InputMismatchException e) {
					sc.nextLine();
					System.out.println("VALOR DE ENTRADA INVALIDA INVALIDO");
					this.choose = 0;
				}
			
			}else {
				System.out.println("ERROR! Nao tem creditos para jogar");
				this.choose = 0;
			}
							
							
								
							
							}
							
						}

protected void MostrarTudo() {
	System.out.println(" _____________________________________________________________________________________");
	System.out.println("|                                 TABELA DE PONTOS                                    |");
	System.out.println("|     PONTUA��O ELEMENTOS                       MULTIPLICADOR PADR�ES                 |");
	System.out.println("|                                                                                     |");
	System.out.println("|  ELEMENTO [0] = 50 CREDITOS                   COMUM [1 PADRAO] = X1                 |");
	System.out.println("|  ELEMENTO [1] = 60 CREDITOS                  RARO [2 PADR�ES] = X10                 |");
	System.out.println("|  ELEMENTO [2] = 70 CREDITOS              CLASSE SS [3 PADR�ES] = X3.000             |");
	System.out.println("|  ELEMENTO [3] = 80 CREDITOS              CLASSE SSS [4 PADR�ES] = X5.000            |");
	System.out.println("|  ELEMENTO [4] = 90 CREDITOS        LENDARIO/IMPOSSIVEL [PADRAO PERFEITO] = X10.000  |");
	System.out.println("|  ELEMENTO [5] = 100 CREDITOS                                                        |");
	System.out.println("|                                                                                     |");
	System.out.println("|                                 VALOR APOSTADO                                      |");
	System.out.println("|                                                                _________________    |");
	System.out.println("|                                                               |     |     |     |   |");
	System.out.println("| 4 CREDITOS  = VALE SOMENTE UM PADRAO HORIZONTAL               |  A  |  B  |  C  |   |");
	System.out.println("|                                                               |_____|_____|_____|   |");
	System.out.println("| 7 CREDITOS  = VALE TODOS OS PADROES HORIZONTAIS               |     |     |     |   |");
	System.out.println("|                                                               |  D  |  E  |  F  |   |");
	System.out.println("| 15 CREDITOS = VALE TODOS OS PADROES HORIZONTAIS E DIAGONAIS   |_____|_____|_____|   |");
	System.out.println("|                                                               |     |     |     |   |");
	System.out.println("|                                                               |  G  |  H  |  I  |   |");
	System.out.println("|                                                               |_____|_____|_____|   |");
	System.out.println("|                                                                                     |");
	System.out.println("|                                                                                     |");
	System.out.println("|_____________________________________________________________________________________|");
	                                               
}

 protected void VerificacaoBarato() {

	 	System.out.println(" _____________________________________________________________________________________");
		System.out.println("|                                                                                     |");
		System.out.println("|                                     SLOTMACHINE!                                    |");
		System.out.println("|_____________________________________________________________________________________|\n\n");
		
		
		this.choose = 1;
		
		while (this.choose == 1) {

			
			if (this.credito >= 4 ) {
				
				this.credito -= 4;	//QUANTIDADES DE FICHAS PARA JOGAR UMA RODADA
				System.out.println("Valor do credito atual : " + this.credito);System.out.println();
				System.out.println("[APOSTA 4 CREDITOS]");
				System.out.println();System.out.println();
			
				this.y = r.nextInt(15);
				if (this.y == 0) {
					this.a = 5;}
				else if (this.y <3) {
					this.a = 4;}
				else if (this.y < 5) {
					this.a = 3;}
				else if (this.y < 7) {
					this.a = 2;}
				else if (this.y <11) {
					this.a = 1;}
				else if (this.y <=14) {
					this.a = 0;}
				
				this.y = r.nextInt(15);
				if (this.y == 0) {
					this.b = 5;}
				else if (this.y <3) {
					this.b = 4;}
				else if (this.y < 5) {
					this.b = 3;}
				else if (this.y < 7) {
					this.b = 2;}
				else if (this.y <11) {
					this.b = 1;}
				else if (this.y <=14) {
					this.b = 0;}
				
				this.y = r.nextInt(15);
				if (this.y == 0) {
					this.c = 5;}
				else if (this.y <3) {
					this.c = 4;}
				else if (this.y < 5) {
					this.c = 3;}
				else if (this.y < 7) {
					this.c = 2;}
				else if (this.y <11) {
					this.c = 1;}
				else if (this.y <=14) {
					this.c = 0;}
				
				this.y = r.nextInt(15);
				if (this.y == 0) {
					this.d = 5;}
				else if (this.y <3) {
					this.d = 4;}
				else if (this.y < 5) {
					this.d = 3;}
				else if (this.y < 7) {
					this.d = 2;}
				else if (this.y <11) {
					this.d = 1;}
				else if (this.y <=14) {
					this.d = 0;}
				
				this.y = r.nextInt(15);
				if (this.y == 0) {
					this.e = 5;}
				else if (this.y <3) {
					this.e = 4;}
				else if (this.y < 5) {
					this.e = 3;}
				else if (this.y < 7) {
					this.e = 2;}
				else if (this.y <11) {
					this.e = 1;}
				else if (this.y <=14) {
					this.e = 0;}
				
				this.y = r.nextInt(15);
				if (this.y == 0) {
					this.f = 5;}
				else if (this.y <3) {
					this.f = 4;}
				else if (this.y < 5) {
					this.f = 3;}
				else if (this.y < 7) {
					this.f = 2;}
				else if (this.y <11) {
					this.f = 1;}
				else if (this.y <=14) {
					this.f = 0;}
				
				this.y = r.nextInt(15);
				if (this.y == 0) {
					this.g = 5;}
				else if (this.y <3) {
					this.g = 4;}
				else if (this.y < 5) {
					this.g = 3;}
				else if (this.y < 7) {
					this.g = 2;}
				else if (this.y <11) {
					this.g = 1;}
				else if (this.y <=14) {
					this.g = 0;}
				
				this.y = r.nextInt(15);
				if (this.y == 0) {
					this.h = 5;}
				else if (this.y <3) {
					this.h = 4;}
				else if (this.y < 5) {
					this.h = 3;}
				else if (this.y < 7) {
					this.h = 2;}
				else if (this.y <11) {
					this.h = 1;}
				else if (this.y <=14) {
					this.h = 0;}
				
				this.y = r.nextInt(15);
				if (this.y == 0) {
					this.i = 5;}
				else if (this.y <3) {
					this.i = 4;}
				else if (this.y < 5) {
					this.i = 3;}
				else if (this.y < 7) {
					this.i = 2;}
				else if (this.y <11) {
					this.i = 1;}
				else if (this.y <=14) {
					this.i = 0;}
				
				
				
				if (this.d == this.e && this.e == this.f) {
					
					
					System.out.println("_______________________________________________________________________________________");
					System.out.println("                              " + this.a + "      " + this.b + "      " + this.c);
					System.out.println();System.out.println();
					System.out.println(" LINHA DE PAGAMENTO------>   [" + this.d + "]    [" + this.e + "]    [" + this.f + "]");
					System.out.println();System.out.println();
					System.out.println("                              " + this.g + "      " + this.h + "      " + this.i);
					System.out.println("\n______________________________________________________________________________________");
					
					switch  (this.d) {
					case 0:
						System.out.println();System.out.println("PARABENS ! Ganhou 50 creditos");
						this.credito += 50;break;
					case 1:
						System.out.println();System.out.println("PARABENS ! Ganhou 60 creditos");
						this.credito += 60;break;
					case 2:
						System.out.println();System.out.println("PARABENS ! Ganhou 70 creditos");
						this.credito += 70;break;
					case 3:
						System.out.println();System.out.println("PARABENS ! Ganhou 80 creditos");
						this.credito += 80;break;
					case 4:
						System.out.println();System.out.println("PARABENS ! Ganhou 90 creditos");
						this.credito += 90;break;
					case 5:
						System.out.println();System.out.println("PARABENS ! Ganhou 100 creditos");
						this.credito += 100;break;
						
					}
						
						
						
				}else {
					System.out.println("_______________________________________________________________________________________");
					System.out.println("                             " + this.a + "    " + this.b + "    " + this.c);
					System.out.println();System.out.println();
					System.out.println(" LINHA DE PAGAMENTO------>   " + this.d + "    " + this.e + "    " + this.f + "");
					System.out.println();System.out.println();
					System.out.println("                             " + this.g + "    " + this.h + "    " + this.i);
					System.out.println("\n_______________________________________________________________________________________");
					System.out.println("QUE PENA NAO FOI DESSA VEZ :(\n\n");
				}
				
				System.out.println();System.out.println();
				
				try {
				System.out.println();System.out.println("[JOGAR NOVAMENTE DIGITE 1 OU 0 PARA SAIR]");
				this.choose = sc.nextInt();
				this.espacamento();
					
				}catch(InputMismatchException e) {
					sc.nextLine();
					System.out.println("VALOR DE ENTRADA INVALIDA INVALIDO");
					this.choose = 0;
				}
				
				}else {
						System.out.println("ERROR! Nao tem creditos para jogar");
						this.choose = 0;
					}
						
		}
					
	
}
}