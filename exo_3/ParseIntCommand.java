package exo_3;

import cli_framework.CLIOption;
import cli_framework.Command;

public class ParseIntCommand implements Command<Integer> {

	private CLIOption<Integer> option;
	
	public ParseIntCommand(CLIOption<Integer> option) {
		this.option = option;
	}
	
	@Override
	public void execute(String arg) {
		try {
			this.option.setValeur(Integer.parseInt(arg));
		}
		catch (NumberFormatException e) {
			System.out.println("La valeur de " + option.getAcces() + " n'est pas au bon format\n");
		}
	}

	@Override
	public String getArg() {
		return this.option.getAcces();
	}

	@Override
	public CLIOption<Integer> getOption() {
		return this.option;
	}

	
}
