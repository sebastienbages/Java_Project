package cli_framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CLI {
	private Map<String, Command<?>> options;
	
	public CLI() {
		this.options = new HashMap<String, Command<?>>();
	}
	
	public void addOption(String acces, Command<?> cmd) {
		cmd.getOption().setAcces(acces);
		this.options.put(acces, cmd);
	}
	
	public void execute(String ...args) {
		for (int i = 0; i < args.length; i++) {
			if (this.options.containsKey(args[i])) {
				Command<?> cmd = this.options.get(args[i]);
				CLIOption<?> opt = cmd.getOption();
				
				if (opt.possedeUneValeur()) {
					cmd.execute(args[++i]);
				}
				else {
					cmd.execute(args[i]);
				}
			}
		}
	}
	
	public ArrayList<CLIOption<?>> getOptions() {
		Collection<Command<?>> cmds = this.options.values();
		ArrayList<CLIOption<?>> options = new ArrayList<CLIOption<?>>();
		cmds.forEach((cmd) -> options.add(cmd.getOption()));
		return options;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("DONNEES DU CLI : \n");
		options.forEach((key, value) -> {
			CLIOption<?> opt = value.getOption();
			str.append(opt.toString() + "\n");
		});
		return str.toString();
	}
}
