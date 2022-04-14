package exo_3;

import cli_framework.CLI;
import cli_framework.CLIOption;
import cli_framework.Command;

public class PageRankCLI extends CLI {
	
	public PageRankCLI() {
		super();
	}
	
	public void addOption(String acces, Command<?> cmd) {
		cmd.getOption().setAcces(acces);
		this.options.put(acces, cmd);
	}
	
	@Override
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
