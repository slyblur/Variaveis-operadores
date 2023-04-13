package JavaTech;

import java.util.Scanner;

public class OlaMundo {
	public static void main(String[] args) {
		
		String nome = "Fallen Angel";
		int idade = 666, x=10;
		double altura = 1.85;
		float derrota1, derrota2, derrota3, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Nome do participante: "+nome);
		System.out.println("Idade participante: "+idade);
		System.out.println("Altura participante: "+altura);
		
		System.out.println("\nEntre com a nota da primeira derrota: ");
		derrota1 = leia.nextFloat();
		System.out.println("Entre com a nota da segunda derrota: ");
		derrota2 = leia.nextFloat();
		System.out.println("Entre com a nota da terceira derrota: ");
		derrota3 = leia.nextFloat();
		
		media = (derrota1+derrota2+derrota3)/3;
		
		System.out.printf("\nMédia Aritmética: %.2f",media);
		
		derrota1 = (float) Math.sqrt(derrota2);
		derrota2 = (float) Math.pow(derrota3, 3);
		x = x % 2;
		
		
		/*
		  x = 10
		  x == 10 */
		
		
	}
}
