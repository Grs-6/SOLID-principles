import java.util.HashMap;
import java.util.Map;

public class SpellChecker implements IPlugin {
    private static final Map<String, String> DICTIONARY = new HashMap<>();

    static {
        DICTIONARY.put("teh", "the");
        DICTIONARY.put("recieve", "receive");
        DICTIONARY.put("adress", "address");
    }

    @Override
    public void execute(String input) {
        String[] words = input.split("\\s+");
        StringBuilder correctedText = new StringBuilder();

        for (String word : words) {
            String corrected = DICTIONARY.getOrDefault(word, word);
            correctedText.append(corrected).append(" ");
        }

        System.out.println("Spell Checked Text:\n" + correctedText.toString().trim());
    }
}
