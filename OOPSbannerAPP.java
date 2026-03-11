import java.util.HashMap;
import java.util.Map;

public class OPPSbannerAPP {

    // Static Inner Class
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter
        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Pattern storage
    private static Map<Character, CharacterPatternMap> patternLibrary = new HashMap<>();

    // Initialize banner patterns
    private static void initializePatterns() {

        patternLibrary.put('O', new CharacterPatternMap('O', new String[]{
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
        }));

        patternLibrary.put('P', new CharacterPatternMap('P', new String[]{
                "*****  ",
                "*   *  ",
                "*   *  ",
                "*****  ",
                "*      ",
                "*      ",
                "*      "
        }));

        patternLibrary.put('S', new CharacterPatternMap('S', new String[]{
                " ****  ",
                "*      ",
                "*      ",
                " ***   ",
                "    *  ",
                "    *  ",
                "****   "
        }));
    }

    // Display banner
    private static void displayBanner(String text) {

        int height = 7;

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : text.toCharArray()) {

                CharacterPatternMap patternObj = patternLibrary.get(Character.toUpperCase(ch));

                if (patternObj != null) {
                    line.append(patternObj.getPattern()[row]).append(" ");
                }
            }

            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {

        initializePatterns();

        String banner = "OOPS";

        displayBanner(banner);
    }
}