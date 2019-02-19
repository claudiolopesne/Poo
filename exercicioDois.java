package listaUm;

import java.util.Scanner;

public class ExercicioDois {
	private static Scanner entrada;

	public static void main(String args[]) {
		String v;
		
		entrada = new Scanner(System.in);
		v = entrada.next().toLowerCase();
		
		
		if (v.equals("a") || v.equals("e") || v.equals("i") || v.equals("o") || v.equals("u")) {
			
			System.out.println("vogal");
		}else {
			System.out.println("consoante");
		}
		
	}
	
}
