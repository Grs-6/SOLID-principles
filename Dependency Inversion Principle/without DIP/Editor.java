public class Editor {
    private SyntaxHighlighter syntaxHighlighter;
    private SpellChecker spellChecker;

    public Editor() {
        this.syntaxHighlighter = new SyntaxHighlighter();
        this.spellChecker = new SpellChecker();
    }

    public void runPlugins(String input) {
        syntaxHighlighter.highlight(input);
        spellChecker.checkSpelling(input);
    }
}
