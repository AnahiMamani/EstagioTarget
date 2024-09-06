package targetSistemas;

import java.util.Scanner;

public class Tecnica2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int anterior = 0, atual = 1, proximo = 0, n;

		System.out.print("Informe um valor inteiro: ");
		n = input.nextInt();

		// loop para calcular o valor da sequência Fibonacci
		while (proximo < n) {
			proximo = anterior + atual;
			anterior = atual;
			atual = proximo;
		}

		// Valido se o valor inserido pertence ou nao a sequência.
		if (n == proximo) {
			System.out.println("O valor inserido está presente dentro da sequência de Fibonacci.");
		} else {
			System.out.println("O valor inserido não está presente dentro da sequência de Fibonacci.");
		}
		input.close();
	}

}
