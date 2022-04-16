package exo_4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AlphaListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String text = InterfaceCLI.resultat.getText();
		InterfaceCLI.resultat.setText(text + " -A " + InterfaceCLI.alphaValue.getText());
	}

}
