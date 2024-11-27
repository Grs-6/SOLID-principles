public class PluginApp {
    public static void main(String[] args) {
        Editor editor = new Editor();

        // Add plugins dynamically
        editor.addPlugin(new SyntaxHighlighter());
        editor.addPlugin(new SpellChecker());

        // Input text
        String text = "public class Editor { public void recieve adress teh highlights }";

        // Run plugins on the input text
        editor.runPlugins(text);
    }
}
