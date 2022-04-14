package exo_3;

import cli_framework.CLIOption;
import cli_framework.Command;

public class SetModeCommand implements Command<Mode> {

	private CLIOption<Mode> option;
	
	public SetModeCommand(CLIOption<Mode> option) {
		this.option = option;
	}
	
	@Override
	public void execute(String arg) {
		switch (arg) {
		case "-C":
			option.setValeur(Mode.CREUSE);
			break;
		case "-P":
			option.setValeur(Mode.PLEINE);
			break;
		default:
			break;
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