package dev.hapoom.easym;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.event.Listener;

public class Main extends JavaPlugin implements Listener{

	// on Enabled
	public void onEnable() {
		initCommand();
		PluginDescriptionFile info = this.getDescription();
		System.out.println("[" + info.getName() + "] Plugin Enabled.");
	}
	
	// on Disabled
	@Override
	public void onDisable() {
		PluginDescriptionFile info = this.getDescription();
		System.out.println("[" + info.getName() + "] Plugin Disabled.");
	}
	
	public void initCommand() {
		getCommand("mathroot").setExecutor(new MathRoot());
		getCommand("math").setExecutor(new RMath());
		getCommand("factorial").setExecutor(new Factorial());
		getCommand("fibonacci").setExecutor(new Fibonacci());
		getCommand("easymath").setExecutor(new EasyMath());
	}
}
