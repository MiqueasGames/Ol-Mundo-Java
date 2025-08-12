package mostrarnumero;

import java.util.Scanner;

public class Mostrarnumero{
	public static void main(String[]args){
		
	Scanner en = new Scanner(System.in);
	
	System.out.print("informe um numero inteiro:");
		int num1 = en.nextInt ();
		System.out.println("número informado: " + num1);
		
		en.close();
		
	}
}
