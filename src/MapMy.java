import java.util.HashMap;
import java.util.Map;

/**
 * @author Andrej Reutow
 * created on 27.11.2023
 */
public class MapMy {

    public static void main(String[] args) {
        String word = "ApplicationAAA";
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> ma2p = new HashMap<>();

        for (char letter : word.toCharArray()) {
            map.merge(letter, 10, (a, b) -> a + 1);
        }

        int initValue = 10;
        for (char letter : word.toCharArray()) {
            if (ma2p.containsKey(letter)) {
                Integer integer = ma2p.get(letter);
                ma2p.put(letter, integer + initValue);
            } else {
                ma2p.put(letter, initValue);
            }
        }

        System.out.println();
    }
}
