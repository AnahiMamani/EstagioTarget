package targetSistemas;

import java.util.Scanner;

//2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma 
//dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na 
//linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne 
//uma mensagem avisando se o número informado pertence ou não a sequência. 
//
//IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode
//ser previamente definido no código; 
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
