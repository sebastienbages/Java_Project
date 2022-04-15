package exo_5;

import cli_framework.CLIOption;
import cli_framework.Command;
import exo_3.Mode;

public class SetModeCommand implements Command<Mode> {

	private CLIOption<Mode> option;
	
	public SetModeCommand(CLIOption<Mode> option) {
		this.option = option;
	}
	
	@Override
	public void execute(String arg) {
		String vrai = this.option.getAcces().toLowerCase();
		String faux = this.option.getAcces().toUpperCase();
		
		if (arg.equals(vrai)) {
			option.setValeur(Mode.CREUSE);
		}
		
		if (arg.equals(faux)) {
			option.setValeur(Mode.PLEINE);
		}
	}

	@Override
	public String getArg() {
		return option.getAcces();
	}

	@Override
	public CLIOption<Mode> getOption() {
		return this.option;
	}

}