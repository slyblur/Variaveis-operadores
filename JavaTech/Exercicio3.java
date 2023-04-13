package JavaTech;

import java.util.Scanner; 

public class Exercicio3 {

	public static void main(String[] args) {
		
		float Salariobruto, AD, HorasExtras, Descontos, SL; 
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira valor do Salário Bruto: ");
		Salariobruto = leia.nextFloat();
		System.out.println("Insira valor do Adicional Noturno: ");
		AD = leia.nextFloat();
		System.out.println("Insira total de Horas Extras: ");
		HorasExtras = leia.nextFloat();
		System.out.println("Insira o valor dos Descontos: ");
		Descontos = leia.nextFloat();
		
		SL = (Salariobruto+AD+(HorasExtras * 5)-Descontos);
		
		System.out.println("\nSalário Líquido = "+SL);
		
		/* Fim do programa. */
	}

}
