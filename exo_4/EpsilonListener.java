package exo_4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EpsilonListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String text = InterfaceCLI.resultat.getText();
		InterfaceCLI.resultat.setText(text + " -E " + InterfaceCLI.epsilonValue.getText());
	}

}
