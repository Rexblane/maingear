package rok.maingear.messages;

import lombok.Getter;
import rok.maingear.config.YamlConfig;

import java.util.HashMap;
import java.util.Map;

/*
 * @author Rok, Pedro Lucas N M Machado created on 30/08/2022
 */
public class MsgManagerData {
	private final Map<String, String> messages = new HashMap<>();
	@Getter
	private final YamlConfig config;
	public MsgManagerData(YamlConfig config) {
		this.config = config;
	}
	public void init() {
		importMain();
	}
	private void importMain() {
		for (String msg : config.getSection("main").getKeys(false)) {
			messages.put("main."+msg, addMessage("main."+msg));
		}
	}
	private String addMessage(String path) {
		String string = config.getString(path);
		return config.toChatMessage(string);
	}

}
