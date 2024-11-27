public class PluginApp {
    public static void main(String[] args) {
        Editor editor = new Editor();

        // Input text
        String text = "public class Editor { public void recieve adress teh highlights }";

        // Run plugins directly in the editor
        editor.runPlugins(text);
    }
}
