public class PageRankClassique {

	public static void main(String... args) {
		Configuration configuration = CLIClassique.configuration("-K", "15.5", "-P");
		System.out.println(configuration);
		// Le reste du programme... Omis.
	}
}
