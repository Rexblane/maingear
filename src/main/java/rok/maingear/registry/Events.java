package rok.maingear.registry;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import rok.maingear.Main;

import java.util.logging.Level;

/*
 * @author Rok, Pedro Lucas N M Machado created on 30/08/2022
 */
public class Events {

	final PluginManager manager;

	public Events(Main plugin) {
		manager = plugin.getServer().getPluginManager();
	}

	public void init() {
		// TODO: register all events here
		Main.LOGGER.log(Level.INFO, "Registering Events.");
		//manager.registerEvents();
	}

}
