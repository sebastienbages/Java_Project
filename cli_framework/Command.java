package cli_framework;

public interface Command<T> {
	void execute(String arg);
	String getArg();
	CLIOption<T> getOption();
}