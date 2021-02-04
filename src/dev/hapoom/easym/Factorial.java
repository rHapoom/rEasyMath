package dev.hapoom.easym;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Factorial implements CommandExecutor {
	public static long factorial(long n) {
		if (n <= 1)
			return n;
		else 
			return factorial(n-1) * n;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("factorial")){
			if(!(sender instanceof Player)) {
				System.out.println("This command have to be operated by humans.");
				return false;
			}
		}
		Player player = (Player)sender;
		if(args.length > 0) {
			int content = Integer.parseInt(args[0]);
			long result = factorial(content);
			player.sendMessage(ChatColor.GREEN + "Result : "+result);
			return true;
		} else {
			player.sendMessage(ChatColor.RED + "Usage : /factorial [Number]");
			return false;
		}
	}
}
