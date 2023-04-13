package JavaTech;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		float salario, abono, novosalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário: ");
		salario = leia.nextFloat();		
		System.out.println("Digite o valor do abono: ");
		abono = leia.nextFloat();
		
		novosalario = (salario+abono);
		
		System.out.println("\nSeu novo salário é: "+novosalario+".");
		
		/*fim do programa */
	}

}
