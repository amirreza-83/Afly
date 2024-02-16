package fun.minestarsv.afly;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class start implements Listener {
    public void event(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        String pl_name = player.getName();

        if (player.hasPermission("afly.use")){
            player.sendMessage(ChatColor.GREEN + "afly enabled v_1.0");
        }
    }
}
