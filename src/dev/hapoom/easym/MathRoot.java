package dev.hapoom.easym;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MathRoot implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("mathroot")){
			if(!(sender instanceof Player)) {
				System.out.println("This command must be operated by humans.");
				return false;
			}
			Player player = (Player)sender;
			if(args.length > 0) {
				int content = Integer.parseInt(args[0]);
				double result = Math.sqrt(content);
				player.sendMessage(ChatColor.AQUA + "Result : "+result);
				return true;
			} else {
				player.sendMessage(ChatColor.RED + "Usage : /mathroot [Number]");
				return false;
			}
		}
		return true;
	}
}
