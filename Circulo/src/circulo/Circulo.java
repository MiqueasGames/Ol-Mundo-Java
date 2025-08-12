package circulo;

import java.util.Scanner;

public class Circulo {
	public static void main(String[]args) {
		Scanner gu = new Scanner(System.in);
		
		System.out.println("Digite o raio do círculo: ");
		double raio = gu.nextDouble();
		
		double area = 3.14 * (raio * raio);
		
		System.out.println("A area do círculo é: " + area);
		
		gu.close();
		
	}
	
}
