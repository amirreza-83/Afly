package fun.minestarsv.afly;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import sun.management.Sensor;

public class cmd implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command arg0, String arg1, String[] arg2) {
        Player player = (Player) sender;

        Boolean is_fly = player.isFlying();

        if (sender instanceof Player){

            if (is_fly){
                player.setAllowFlight(false);
                player.setFlying(false);
                player.sendMessage(ChatColor.GREEN + "Flight disabled : ");
            }
            else {
                player.setAllowFlight(true);
                player.setFlying(true);
                player.sendMessage(ChatColor.GREEN + "Flight activated : ");
            }
        }

        return false;
    }
}
