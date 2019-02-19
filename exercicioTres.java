package listaUm;

import java.util.Scanner;

public class ExercicioTres {
	
	public static void main (String args[]) {
		calculadora calc = new calculadora();
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite o primeiro numero");
		calc.num1 = entrada.nextInt();
				
		System.out.println("Digite o segundo numero");
		calc.num2 = entrada.nextInt();
		
		int total = calc.somar();
		
		System.out.println(total);
		
	}

}
