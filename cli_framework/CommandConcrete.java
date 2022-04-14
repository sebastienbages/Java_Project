package cli_framework;

public abstract class CommandConcrete<T> implements Command<T> {
	protected CLIOption<T> option;
	
	public CommandConcrete(CLIOption<T> option) {
		this.option = option;
	}
}
