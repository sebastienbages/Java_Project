package exo_3;

import cli_framework.CLIOption;
import cli_framework.CommandConcrete;

public class ParseDoubleCommand extends CommandConcrete<Double> {
	
	public ParseDoubleCommand(CLIOption<Double> option) {
		super(option);
	}
	
	@Override
	public void execute(String arg) {
		try {
			this.option.setValeur(Double.parseDouble(arg));
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
	public CLIOption<Double> getOption() {
		return this.option;
	}

	
}
