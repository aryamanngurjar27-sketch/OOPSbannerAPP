import java.util.HashMap;
import java.util.Map;

public class OOPSbannerAPP {

    public static void main(String[] args) {

        String message = "UC4";

        String[][] U = {
                {"U", " ", " ", " ", "U"},
                {"U", " ", " ", " ", "U"},
                {"U", " ", " ", " ", "U"},
                {"U", " ", " ", " ", "U"},
                {" ", "U", "U", "U", " "}
        };

        String[][] C = {
                {" ", "C", "C", "C", " "},
                {"C", " ", " ", " ", "C"},
                {"C", " ", " ", " ", " "},
                {"C", " ", " ", " ", "C"},
                {" ", "C", "C", "C", " "}
        };

        String[][] FOUR = {
                {" ", " ", "4", " ", " "},
                {" ", "4", "4", " ", " "},
                {"4", " ", "4", " ", " "},
                {"4", "4", "4", "4", "4"},
                {" ", " ", "4", " ", " "}
        };

        Map<Character, String[][]> bannerMap = new HashMap<>();
        bannerMap.put('U', U);
        bannerMap.put('C', C);
        bannerMap.put('4', FOUR);

        for (int row = 0; row < 5; row++) {
            for (char ch : message.toCharArray()) {
                if (bannerMap.containsKey(ch)) {
                    System.out.print(String.join("", bannerMap.get(ch)[row]) + "  ");
                }
            }
            System.out.println();
        }
    }
}