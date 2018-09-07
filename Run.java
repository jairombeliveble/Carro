package carro;

import java.util.Scanner;

public class Run {
	public static void main (String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		Car normalCar = new Car();
		System.out.println("\t VRUUNNN!!!! - Carro ligado.");
		System.out.println("Digite uma instrução (help = cmd list.).");
		while (normalCar.power) {
			System.out.print("User$:\t");
			String cmd = keyboard.nextLine();
		
			if (cmd.equals("help")) {
				System.out.println("||\t ------------------------Help-------------------------------\n"
						+ "||\t in  = Entrar 1 pessoa.\n"
						+ "||\t out  = Sai 1 pessoa.\n"
						+ "||\t run + Quantidade(x) = Andar x quilometros.\n"
						+ "||\t supply + Quantidade(x) = Abastece x litros.\n"
						+ "||\t status = Mostra Quantidades de pessoa, gasolina e Kilômetos.\n"
						+ "||\t turnOff = Encerra");
			}else if(cmd.equals("status")){
				System.out.println("\t" + "Pessoas: " + normalCar.people + " gasolina: " + normalCar.gas + " kilômetros: " + normalCar.kilometer 
						+ " Carro ligado: " + normalCar.power);
			} else {
				
				String info[] = cmd.split(" ");//[cmd,qtd]
			
				switch (info[0]){
					case ("in"):
						normalCar.in();
						break;
					case ("out"):
						normalCar.out();
						break;
					case ("run"):
						normalCar.run(info[1]);
						break;
					case ("supply"):
						normalCar.supply(info[1]);
						break;
					case ("turnOff"):
						normalCar.turnOff();
						break;
					default:{
						System.out.println("\tComando não entcontrado.");}
						break;
				}
			}
		}	
	}

}
