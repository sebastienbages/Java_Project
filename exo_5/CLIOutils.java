package exo_5;

import java.lang.reflect.*;

import cli_framework.CLI;
import cli_framework.CLIOption;
import exo_3.Mode;
import exo_3.ParseDoubleCommand;
import exo_3.ParseIntCommand;

public class CLIOutils {
	public static CLI fromClass(Configuration configuration) {
		Class<? extends Configuration> classConf = configuration.getClass();
		Field[] fields = classConf.getFields();
		
		CLI cli = new CLI();
		
		for (Field field : fields) {
			Type type = field.getGenericType();
			String name = field.getName();
			String acces = Character.toString(name.charAt(0)).toUpperCase();
			
			if (type.getTypeName() == "int") {
				CLIOption<Integer> option = new CLIOption<Integer>(name, "Valeur de " + name, true);
				cli.addOption(acces, new ParseIntCommand(option));
			}
			
			if (type.getTypeName() == "double") {
				CLIOption<Double> option = new CLIOption<Double>(name, "Valeur de " + name, true);
				cli.addOption(acces, new ParseDoubleCommand(option));
			}
			
			if (type.getTypeName() == "exo_3.Mode") {
				CLIOption<Mode> option = new CLIOption<Mode>(name, "Valeur de " + name, false);
				SetModeCommand cmd = new SetModeCommand(option);
				cli.addOption(acces, cmd);
				cli.addOption(acces.toLowerCase(), cmd);
			}
		}
		
		return cli;
	}
}
