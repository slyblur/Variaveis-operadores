package JavaTech;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		float nota1, nota2, nota3, nota4, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("Insira a seguunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("Insira a terceira nota: ");
		nota3 = leia.nextFloat();
		System.out.println("Insira a quarta nota: ");
		nota4 = leia.nextFloat();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.printf("\nSua média final é: %.1f",media);
		
		/* fim do programa */
	}

}
