package metro;

import java.util.Scanner;

public class ConverMetro {
	public static void main(String[]args){
		Scanner gu = new Scanner (System.in);
		
		System.out.println("Digite a quantidade de metros: ");
		double met = gu.nextDouble();
		
		double conversao = met * 100;
		
		System.out.println("A conversão em cm é: " + conversao);
		
		gu.close();
		
	}

}
