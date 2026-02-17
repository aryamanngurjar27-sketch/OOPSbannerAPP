import java.util.HashMap;
import java.util.Map;

class BannerLetter {

    private final String[] pattern;

    public BannerLetter(String[] pattern) {
        this.pattern = pattern;
    }

    public String[] getPattern() {
        return pattern;
    }
}

public class OopsBannerApp {

    private static final Map<Character, BannerLetter> bannerMap = new HashMap<>();

    static {
        bannerMap.put('O', new BannerLetter(new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        }));

        bannerMap.put('P', new BannerLetter(new String[]{
                " *** ",
                "*   *",
                "*   *",
                " *** ",
                "*    ",
                "*    ",
                "*    "
        }));

        bannerMap.put('S', new BannerLetter(new String[]{
                " *** ",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                " *** "
        }));
    }

    public static void printBanner(String text) {

        if (text == null || text.isEmpty()) {
            System.out.println("Invalid input");
            return;
        }

        text = text.toUpperCase();
        int height = 7;

        for (int row = 0; row < height; row++) {

            String[] rowParts = new String[text.length()];

            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                BannerLetter letter = bannerMap.get(ch);

                if (letter != null) {
                    rowParts[i] = letter.getPattern()[row];
                } else {
                    rowParts[i] = "     ";
                }
            }

            // Optimized row rendering using String.join()
            System.out.println(String.join("  ", rowParts));
        }
    }

    public static void main(String[] args) {
        printBanner("OOPS");
    }
}
