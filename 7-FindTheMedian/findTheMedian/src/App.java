import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Integer> argList = new ArrayList();
        argList.add(5);
        argList.add(3);
        argList.add(1);
        argList.add(2);
        argList.add(4);
        argList.add(6);
        argList.add(9);

        argList.sort(null);
        int media = argList.size();
        int result = 0;
        if (media % 2 == 0) {
            result = argList.get((media - 1) / 2);
        } else {
            result = argList.get(media / 2);
        }
        System.out.println("Lista ordenada: " + argList.toString());
        System.out.println("Media: " + result);
    }
}
