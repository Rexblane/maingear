package rok.maingear.registry;

import me.saiintbrisson.bukkit.command.BukkitFrame;
import rok.maingear.Main;

import java.util.logging.Level;

/*
 * @author Rok, Pedro Lucas N M Machado created on 30/08/2022
 */
public class Commands {
	final BukkitFrame frame;
	public Commands(Main plugin) {
		Main.LOGGER.log(Level.INFO, "Starting Command-Framework.");
		frame = new BukkitFrame(plugin);
	}

	public void init() {
		// TODO: register all commands here
		Main.LOGGER.log(Level.INFO, "Registering commands.");
		frame.registerCommands();
	}

}
