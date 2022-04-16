package exo_6;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.jdom2.*;
import org.jdom2.output.*;

import cli_framework.CLI;
import cli_framework.CLIOption;

public class XMLFactory {	
	public static void buildFile(CLI cli) {
		Element racine = new Element("cli");
		ArrayList<CLIOption<?>> options = cli.getOptions();
		
		options.forEach((opt) -> {
			Element argument = new Element("argument");
			argument.setAttribute("acces", opt.getAcces());
			argument.setText(opt.getDescription());
			if (opt.possedeUneValeur()) {
				argument.setAttribute("nb", opt.getValeur().toString());
			}
			racine.addContent(argument);
		});
		
		System.out.println(racine.toString());
		
		// CREER UN FICHIER XML
		
		/*Document document = new Document();
		document.setContent(racine);
		
		try {
			FileWriter fileWriter = new FileWriter("cli-auto.xml");
			XMLOutputter outputter = new XMLOutputter();
			outputter.setFormat(Format.getPrettyFormat());
			outputter.output(document, fileWriter);
			outputter.output(document, System.out);
		} catch (IOException e) {
			e.printStackTrace();
		}*/
	}
}
