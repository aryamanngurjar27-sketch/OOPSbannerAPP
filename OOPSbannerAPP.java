import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Centralized pattern library
    private static final Map<Character, String[]> PATTERN_LIBRARY = new HashMap<>();

    // Initialize banner patterns
    private static void initializePatternLibrary() {

        PATTERN_LIBRARY.put('O', new String[]{
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
        });

        PATTERN_LIBRARY.put('P', new String[]{
                "*****  ",
                "*   *  ",
                "*   *  ",
                "*****  ",
                "*      ",
                "*      ",
                "*      "
        });

        PATTERN_LIBRARY.put('S', new String[]{
                " ****  ",
                "*      ",
                "*      ",
                " ***   ",
                "    *  ",
                "    *  ",
                "****   "
        });
    }

    // Build banner using pattern lookup
    private static void displayBanner(String word) {

        int bannerHeight = 7;

        for (int row = 0; row < bannerHeight; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char letter : word.toCharArray()) {

                String[] pattern = PATTERN_LIBRARY.get(Character.toUpperCase(letter));

                if (pattern != null) {
                    lineBuilder.append(pattern[row]).append("  ");
                } else {
                    lineBuilder.append("       ");
                }
            }

            System.out.println(lineBuilder);
        }
    }

    public static void main(String[] args) {

        initializePatternLibrary();

        String bannerWord = "OOPS";

        displayBanner(bannerWord);
    }
}