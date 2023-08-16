import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> argsInput = new ArrayList();
        argsInput.add(1);
        argsInput.add(2);
        argsInput.add(3);
        argsInput.add(4);
        argsInput.add(3);
        argsInput.add(2);
        argsInput.add(1);

        int result = lonelyInteger(argsInput);

        System.out.println(result);

    }

    private static int lonelyInteger(List<Integer> args) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : args) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (Integer num : args) {
            if (countMap.get(num) == 1) {
                return num;
            }
        }

        throw new IllegalArgumentException("Não há elementos não repetidos na lista.");

    }
}
