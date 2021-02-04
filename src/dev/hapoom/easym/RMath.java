package dev.hapoom.easym;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RMath implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player)) {
			System.out.println("This command have to be operated by humans.");
			return false;
		}
		Player player = (Player)sender;
		if(cmd.getName().equalsIgnoreCase("math")){
			if(args.length > 2) {
				if(args[0].equalsIgnoreCase("mul")) {
					int a = Integer.parseInt(args[1]);
					int b = Integer.parseInt(args[2]);
					int result = a*b;
					player.sendMessage(ChatColor.GREEN + "Result : "+result);
				} else if(args[0].equalsIgnoreCase("min")) {
					int a = Integer.parseInt(args[1]);
					int b = Integer.parseInt(args[2]);
					int result = a-b;
					player.sendMessage(ChatColor.GREEN + "Result : "+result);
				} else if(args[0].equalsIgnoreCase("plus")) {
					int a = Integer.parseInt(args[1]);
					int b = Integer.parseInt(args[2]);
					int result = a+b;
					player.sendMessage(ChatColor.GREEN + "Result : "+result);
				} else if(args[0].equalsIgnoreCase("div")) {
					int a = Integer.parseInt(args[1]);
					int b = Integer.parseInt(args[2]);
					int result = a/b;
					player.sendMessage(ChatColor.GREEN + "Result : "+result);
				} else if(args[0].equalsIgnoreCase("rem")) {
					int a = Integer.parseInt(args[1]);
					int b = Integer.parseInt(args[2]);
					int result = a%b;
					player.sendMessage(ChatColor.GREEN + "Result : "+result);
				}
			} else {
				player.sendMessage(ChatColor.RED + "Usage : /math [mul/min/plus/div] [Number1] [Number2]");
				return false;
			}
		}
		return true;
	}
}
