package media;

import java.util.Scanner;

public class Media {
	public static void main(String[]args){
		Scanner en = new Scanner(System.in);
		
		System.out.println("informe a primeira nota: ");
		int nota1 = en.nextInt();
		en.nextLine();
		
		System.out.println("informe a segunda nota: ");
		int nota2 = en.nextInt();
		en.nextLine();
		
		System.out.println("informe a terceira nota: ");
		int nota3 = en.nextInt();
		en.nextLine();
		
		System.out.println("informe a quarta nota: ");
		int nota4 = en.nextInt();
		en.nextLine();
		
		int soma = nota1 + nota2 + nota3 + nota4;
		int media = soma / 4;
		
		System.out.println("a media é: " + media );
		
		en.close();
		
	}
}
