package Exercicios_Java_Aula07;

import java.util.Scanner;

public class LacoDecisao01 {
	

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner (System.in);

		int a, b, c, maior;
		
		System.out.println("Digite três valores");
		a = leia.nextInt();
		b = leia.nextInt();
		c = leia.nextInt();
		
		if (a > b) {
			if (a > c)
				maior = a;
			
			else 
				maior = c;
			System.out.println("O maior valor é: " + maior);
		}
		
		else {
			if (b > c)
				maior = b;
			else
				maior = c;
			System.out.println("O maior valor é: " + maior);
		}
	}
}
