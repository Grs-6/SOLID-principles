import java.util.ArrayList;
import java.util.List;

public class Editor {
    private List<IPlugin> plugins;

    public Editor() {
        this.plugins = new ArrayList<>();
    }

    // Add a plugin to the editor
    public void addPlugin(IPlugin plugin) {
        plugins.add(plugin);
    }

    // Execute all plugins on the given input
    public void runPlugins(String input) {
        for (IPlugin plugin : plugins) {
            plugin.execute(input);
        }
    }
}
