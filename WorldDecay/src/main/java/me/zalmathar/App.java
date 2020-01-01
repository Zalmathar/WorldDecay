package me.zalmathar;
import org.bukkit.plugin.java.JavaPlugin;
public class App extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Hello, SPiceBoi!");
    }
    @Override
    public void onDisable() {
        getLogger().info("Goodbye, SPiceBoi!");
    }
}