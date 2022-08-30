package rok.maingear;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginLogger;
import org.bukkit.plugin.java.JavaPlugin;
import rok.maingear.config.YamlConfig;
import rok.maingear.messages.MsgManagerData;
import rok.maingear.registry.Commands;
import rok.maingear.registry.Events;

import java.util.logging.Level;

public final class Main extends JavaPlugin {

	public static PluginLogger LOGGER;
	private Main instance;

	private MsgManagerData msgConfig;

	@Override
	public void onEnable() {
		
		Bukkit.getScheduler().runTaskLater(this, () -> {
			LOGGER.log(Level.INFO, "Initializing messages");
			msgConfig = new MsgManagerData(new YamlConfig("messages.yml", this));

		}, 20*5);

		Commands commands = new Commands(this);
		commands.init();

		Events events = new Events(this);
		events.init();
	}

	@Override
	public void onDisable() {
		// Plugin shutdown logic
	}

	public Main getInstance() {
		return instance;
	}
}
