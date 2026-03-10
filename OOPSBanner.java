import java.util.*;

public class OOPSBanner {

    // Static Inner Class to store character and its pattern
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

    public static void main(String[] args) {

        // Create patterns for characters
        CharacterPatternMap O = new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPatternMap P = new CharacterPatternMap('P', new String[]{
                "*****  ",
                "*    * ",
                "*****  ",
                "*      ",
                "*      "
        });

        CharacterPatternMap S = new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });

        // Store patterns in map
        Map<Character, CharacterPatternMap> patternMap = new HashMap<>();
        patternMap.put('O', O);
        patternMap.put('P', P);
        patternMap.put('S', S);

        String banner = "OOPS";
        int rows = 5;

        // Print banner row by row
        for (int i = 0; i < rows; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : banner.toCharArray()) {
                CharacterPatternMap cp = patternMap.get(ch);
                line.append(cp.getPattern()[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}