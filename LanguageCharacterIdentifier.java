public class LanguageCharacterIdentifier {

    public static void main(String[] args) {
        // Test driver to demonstrate the core logic
        char[] testChars = {'A', 'ñ', 'Ω', 'Д', 'ش', 'अ', 'あ', '中', '가', 'א'};

        System.out.println("--- Language Character Identifier (Core Logic) ---");
        System.out.println("Testing Unicode hex range parsing...\n");

        for (char c : testChars) {
            System.out.printf("Character: '%c' (U+%04X) -> Script: %s\n",
                    c, (int) c, identifyCharacter(c));
        }
    }

    /**
     * Identifies the linguistic script of a given character using Unicode blocks.
     * @param c The character to analyze.
     * @return A string representing the likely script or alphabet.
     */
    public static String identifyCharacter(char c) {
        // Basic Latin & Latin-1 Supplement (English, Spanish, French, German)
        if ((c >= '\u0020' && c <= '\u007F') || (c >= '\u00A0' && c <= '\u00FF')) {
            return "Latin Alphabet";
        }
        // Greek
        else if (c >= '\u0370' && c <= '\u03FF') {
            return "Greek Alphabet";
        }
        // Cyrillic
        else if (c >= '\u0400' && c <= '\u04FF') {
            return "Cyrillic Script (Russian, Bulgarian, etc.)";
        }
        // Hebrew
        else if (c >= '\u0590' && c <= '\u05FF') {
            return "Hebrew Alphabet";
        }
        // Arabic
        else if (c >= '\u0600' && c <= '\u06FF') {
            return "Arabic Script (Arabic, Persian, Urdu)";
        }
        // Devanagari
        else if (c >= '\u0900' && c <= '\u097F') {
            return "Devanagari (Hindi, Marathi, Nepali)";
        }
        // Hiragana & Katakana (Japanese)
        else if ((c >= '\u3040' && c <= '\u309F') || (c >= '\u30A0' && c <= '\u30FF')) {
            return "Japanese (Hiragana/Katakana)";
        }
        // CJK Unified Ideographs (Chinese, Japanese Kanji)
        else if (c >= '\u4E00' && c <= '\u9FFF') {
            return "CJK Unified Ideographs (Chinese, Kanji)";
        }
        // Hangul (Korean)
        else if (c >= '\uAC00' && c <= '\uD7AF') {
            return "Hangul (Korean)";
        }

        return "Unknown or Unsupported Script";
    }
}