package fun.minestarsv.afly;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Afly extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginCommand("fly").setExecutor(new cmd());
        getServer().getPluginManager().registerEvents(new start(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "afly activated V_1.0");

    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "afly It was deactivated :");
    }
}
