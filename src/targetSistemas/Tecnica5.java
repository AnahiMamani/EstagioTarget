package targetSistemas;
import java.util.Scanner;

public class Tecnica5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicita ao usuário que insira uma string
        System.out.print("Digite uma string para inverter: ");
        String str = input.nextLine();

        // Inverter a string usando uma função personalizada
        String strInvertida = inverterString(str);

        // Exibir o resultado
        System.out.println("String invertida: " + strInvertida);

        input.close();
    }

    // Função para inverter uma string
    public static String inverterString(String str) {
        // Converte a string para um array de caracteres
        char[] caracteres = str.toCharArray();
        int esquerda = 0;
        int direita = caracteres.length - 1;

        // Troca os caracteres de posição
        while (esquerda < direita) {
            // Troca os caracteres nas posições esquerda e direita
            char temp = caracteres[esquerda];
            caracteres[esquerda] = caracteres[direita];
            caracteres[direita] = temp;

            // Move os índices
            esquerda++;
            direita--;
        }

        // Converte o array de volta para uma string
        return new String(caracteres);
    }
}
