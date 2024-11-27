import java.util.Arrays;
import java.util.List;

public class SyntaxHighlighter {
    private static final List<String> KEYWORDS = Arrays.asList("public", "class", "void", "String");

    public void highlight(String input) {
        String highlighted = input;
        for (String keyword : KEYWORDS) {
            highlighted = highlighted.replace(keyword, "[" + keyword + "]");
        }
        System.out.println("Highlighted Text:\n" + highlighted);
    }
}
