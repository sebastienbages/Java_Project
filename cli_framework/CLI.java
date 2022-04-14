package cli_framework;

import java.util.HashMap;
import java.util.Map;

public abstract class CLI {
	protected Map<String, Command<?>> options;
	
	public CLI() {
		this.options = new HashMap<String, Command<?>>();
	}
	
	public void addOption(String acces, Command<?> cmd) {
		cmd.getOption().setAcces(acces);
		this.options.put(acces, cmd);
	}
	
	public abstract void execute(String ...args);
}
