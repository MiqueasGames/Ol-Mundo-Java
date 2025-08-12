package salario;

import java.util.Scanner;

public class Salario {
	public static void main(String[]args){
		Scanner gu = new Scanner(System.in);
		
		System.out.println("informe seu salário por hora: ");
		double salario = gu.nextDouble();
		
		System.out.println("informe as horas trabalhadas no mês: ");
		double horas = gu.nextDouble();
		
		double salarioMes =  salario * horas;
		
		System.out.println("O seu salário final do mês é: " + salarioMes);
		
		gu.close();
		
	}
}
