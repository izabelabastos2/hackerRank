import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * uma lista de strings de entrada
         * retorno: array de inteiros que representa a frequencia de ocorrencia da
         * string que consta na lista de referencia
         * 
         */

        List<String> stringList = new ArrayList<>();

        // Criando um objeto Scanner para ler os dados de entrada do usuário
        Scanner scannerEntrada = new Scanner(System.in);

        System.out.println("Digite as strings de entrada (digite 'fim' para parar):");

        // Lendo as strings até que o usuário digite "fim"
        while (true) {
            String input = scannerEntrada.nextLine();
            if (input.equalsIgnoreCase("fim")) {
                break;
            }
            stringList.add(input);
        }

        // Fechando o Scanner após o uso
        scannerEntrada.close();

        List<String> stringRef = new ArrayList<>();
        Scanner scannerReferencia = new Scanner(System.in);

        System.out.println("Digite as strings da referencia  (digite 'fim' para parar):");
        while (true) {
            String inputReferencia = scannerReferencia.nextLine();
            if (inputReferencia.equalsIgnoreCase("fim")) {
                break;
            }
            stringRef.add(inputReferencia);
        }

        // Fechando o Scanner após o uso
        scannerReferencia.close();

        // Exibindo a lista de strings inseridas
        System.out.println("Lista de strings inseridas:");
        for (String str1 : stringList) {
            System.out.println(str1);
        }

        // Exibindo a lista de strings inseridas
        System.out.println("Lista de strings inseridas:");
        for (String str2 : stringRef) {
            System.out.println(str2);
        }

    }
}
