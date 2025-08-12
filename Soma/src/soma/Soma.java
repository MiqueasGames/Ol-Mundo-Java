package soma;

import java.util.Scanner;

public class Soma {
	public static void main(String[]args){
		Scanner en = new Scanner(System.in);
		
		System.out.println("informe o primeiro número");
		int num1 = en.nextInt();
		
		System.out.println("informe o segundo número");
		int num2 = en.nextInt();
		
		int soma = num1 + num2;
		
		System.out.println("soma: " + soma );
		
		en.close();
		
	}
}