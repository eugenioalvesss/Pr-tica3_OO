package Exe1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int menu;
		double val = 222;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Selecione uma das opções abaixo:");
		System.out.println("(1) Ingresso Normal");
		System.out.println("(2) VIP");
		System.out.println("(3) Camarote");
		menu = ler.nextInt();
		
		switch (menu) {
		case 1:
			Normal normal = new Normal(val);
			normal.ingressoNormal();
			break;
		
		case 2:
			Vip vip = new Vip(val,200);
			vip.imprimeVip();
			break;
			
		case 3:
			Camarote camarote = new Camarote(111,300,"Arquibancada");
			camarote.imprimeCamarote();
			break;		
			
		default:
			System.out.println("Opção inválida :(");
			
		
		}
	}
}


