package dev.hapoom.easym;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EasyMath implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("easymath")){
			if(!(sender instanceof Player)) {
				System.out.println("This command have to be operated by humans.");
				return false;
			}
			Player player = (Player)sender;
			if(args.length > 0) {
				if(args[0].equalsIgnoreCase("help")) {
					player.sendMessage(ChatColor.YELLOW + "-------- rEasyMath HELP --------\n - /math [div/min/plus/mul] [Number1] [Number2] : 4-Math\n - /fibonacci [Number] : Fibonacci\n - /factorial [Number] : Factorial\n - /mathroot [Number] : Root\n - /easymath [help] : Show this message or show why i make this plugin");
				} else {
					player.sendMessage(ChatColor.AQUA + "Hello, "+sender.getName()+"?");
					player.sendMessage(ChatColor.YELLOW + "I made this plugin because I want math in Minecraft easier (No calculator).\nThis plugin is simple. SO SIMPLE but, I want to see someone using this plugin when play Minecraft.\nI will come back with more, more and more better plugins.");
				}
			}
		}
		return true;
	}
}
