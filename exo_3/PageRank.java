package exo_3;

import exo_5.SetModeCommand;

public class PageRank {
	public static void main(String... args) {
		PageRankCLI pageRankCli = new PageRankCLI();
		Indice indice = new Indice("indice", "Valeur de l'indice à calculer", true);
		Epsilon epsilon = new Epsilon("epsilon", "Valeur de la précision à atteindre", true);
		Alpha alpha = new Alpha("alpha", "Valeur de alpha", true);
		Matrice matrice = new Matrice("mode", "Mode matrice", false);
		SetModeCommand modeCmd = new SetModeCommand(matrice);
		pageRankCli.addOption("-K", new ParseIntCommand(indice));
		pageRankCli.addOption("-E", new ParseDoubleCommand(epsilon));
		pageRankCli.addOption("-A", new ParseDoubleCommand(alpha));
		pageRankCli.addOption("-P", modeCmd);
		pageRankCli.addOption("-C", modeCmd);

		System.out.println("1ère éxécution\n");
		pageRankCli.execute("-K", "15.5", "-P");
		System.out.println(pageRankCli);
		
		System.out.println("2ème éxécution\n");
		pageRankCli.execute("-C", "-K", "21", "-E", ".001", "-K", "100");
		System.out.println(pageRankCli);
		
		System.out.println("3ème éxécution\n");
		pageRankCli.execute("-C", "-P", "58", "-E", ".151", "-K", "148", "-A", "28");
		System.out.println(pageRankCli);
	}
}