package JavaTech;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		float n1, n2, n3, n4, calculo;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o primeiro valor: ");
		n1 = leia.nextFloat();
		System.out.println("Insira o segundo valor: ");
		n2 = leia.nextFloat();
		System.out.println("Insira o terceiro valor: ");
		n3 = leia.nextFloat();
		System.out.println("Insira o quarto valor: ");
		n4 = leia.nextFloat();
		
		calculo = (n1*n2)-(n3*n4);
		
		System.out.println ("\nDiferença é igual a: "+calculo);
		
		/*fim do programa */

	}

}
