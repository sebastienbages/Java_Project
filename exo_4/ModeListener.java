package exo_4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModeListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent event) {
		String text = InterfaceCLI.resultat.getText();
		
		if (event.getActionCommand().equals("Pleine (P)")) {
			InterfaceCLI.resultat.setText(text + " -P");
		}
		
		if (event.getActionCommand().equals("Creuse (C)")) {
			InterfaceCLI.resultat.setText(text + " -C");
		}

	}

}
