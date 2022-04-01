public class CLIClassique {

	public static Configuration configuration(String... args) {
		Configuration config = new Configuration();
		boolean finOptions = false;
		int i = 0;
		while (i < args.length && !finOptions) {
			String arg = args[i];
			try {
				switch (arg) {
				case "-K": // Valeur de l'indice à calculer
					config.indice = Integer.parseInt(args[++i]);
					break;
				case "-E": // Valeur de la précision à atteindre
					config.epsilon = Double.parseDouble(args[++i]);
					break;
				case "-A": // Valeur de alpha
					config.alpha = Double.parseDouble(args[++i]);
					break;
				case "-C": // Mode matrice creuse
					config.mode = Mode.CREUSE;
					break;
				case "-P": // Mode matrice pleine
					config.mode = Mode.PLEINE;
					break;
				default:
					finOptions = arg.length() == 0 || arg.charAt(0) != '-';
					if (!finOptions) {
						System.out.println("Option inconnue : " + arg);
					}
				}
			}
			catch (NumberFormatException e) {
				switch (arg) {
				case "-K": // Valeur de l'indice à calculer
					System.out.println("La valeur de l'indice n'est pas au bon format");
					break;
				case "-E": // Valeur de la précision à atteindre
					System.out.println("La valeur de epsilon n'est pas au bon format");
					break;
				case "-A": // Valeur de alpha
					System.out.println("La valeur de alpha n'est pas au bon format");
					break;
				}
			}
			finally {
				i++;
			}
		}
		return config;
	}
}

