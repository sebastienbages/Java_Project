package exo_5;

import cli_framework.CLI;

public class CLIAuto {
	public static void main(String... args) {
		Configuration configuration = new Configuration();
		CLIOutils cliOutils = new CLIOutils();
		CLI cli = cliOutils.fromClass(configuration);
		
		System.out.println("1ère éxécution\n");
		cli.execute("I", "15.5", "M", "E", ".0251", "A", "12.5");
		System.out.println(cli);
		
		System.out.println("2ème éxécution\n");
		cli.execute("m", "I", "21", "E", ".001", "I", "100");
		System.out.println(cli);
		
		System.out.println("3ème éxécution\n");
		cli.execute("m", "M", "58", "E", ".151", "I", "148", "A", "28");
		System.out.println(cli);
	}
}
