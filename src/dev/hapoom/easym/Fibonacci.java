package dev.hapoom.easym;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fibonacci implements CommandExecutor{
	public static int fibonacci(int n) {
		if (n <= 1)
			return n;
		else 
            return fibonacci(n-2) + fibonacci(n-1);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("fibonacci")){
			if(!(sender instanceof Player)) {
				System.out.println("This command have to be operated by humans.");
				return false;
			}
			Player player = (Player)sender;
			if(args.length > 0) {
				int content = Integer.parseInt(args[0]);
				String result = Integer.toString(fibonacci(content));
				player.sendMessage(ChatColor.GREEN + "Result : "+result);
				return true;
			} else {
				player.sendMessage(ChatColor.RED + "Usage : /fiobonacci [Number]");
				return false;
			}
		}
		return true;
	}
}
