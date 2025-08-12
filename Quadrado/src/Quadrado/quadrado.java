package Quadrado;

import java.util.Scanner;

public class quadrado {
	public static void main(String[]args){
		Scanner gu = new Scanner(System.in);
		
		System.out.println("Informe a base do quadrado: ");
		float base = gu.nextFloat();
		
		float area = (base * base);
		
		System.out.println("A área do quadrado é: " + area);
		
		gu.close();
		
	}

}
