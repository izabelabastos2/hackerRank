import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insira entrada:");
        String inputLine = scanner.nextLine();

        String data24h = convertTo24hFormat(inputLine);
        System.out.println(data24h);
    }

    public static String convertTo24hFormat(String data12h) {
        try {

            SimpleDateFormat formatoEntrada = new SimpleDateFormat("hh:mm:ssa"); // Exemplo: "01:30:05PM"

            // Define o formato da string de saída
            SimpleDateFormat formatoSaida = new SimpleDateFormat("HH:mm:ss"); // Resultado em 24 horas: "13:30"

            // Converte a string para um objeto de data
            java.util.Date dataObj = formatoEntrada.parse(data12h);

            // Formata o objeto de data para o formato de saída em 24 horas
            String data24h = formatoSaida.format(dataObj);

            return data24h;
        } catch (ParseException e) {
            // Em caso de formato inválido ou erro na conversão
            return null;
        }
    }
}
