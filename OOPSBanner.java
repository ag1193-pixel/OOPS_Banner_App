import java.util.HashMap;
import java.util.Map;

public class OOPSBanner {

    // Function to render banner
    public static void renderBanner(String word, Map<Character, String[]> patternMap) {

        int rows = 5;

        for (int i = 0; i < rows; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        // HashMap to store character patterns
        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                "*****  ",
                "*    * ",
                "*****  ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });

        // Word to print
        String bannerWord = "OOPS";

        // Call function
        renderBanner(bannerWord, patternMap);
    }
}