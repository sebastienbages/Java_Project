package exo_4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class InterfaceCLI implements ActionListener {
	static JTextField resultat;
	static JTextField indiceValue;
	static JTextField alphaValue;
	static JTextField epsilonValue;
	
	public InterfaceCLI() {		
		JFrame fenetre = new JFrame("IHM pour cli");
		
		Container contenu = fenetre.getContentPane();
		contenu.setLayout(new BorderLayout());
		
		JButton creuse = new JButton("Creuse (C)");
		creuse.addActionListener(new ModeListener());
		JButton pleine = new JButton("Pleine (P)");
		pleine.addActionListener(new ModeListener());
		JPanel mode = new JPanel();
		mode.add(creuse);
		mode.add(pleine);
		contenu.add(mode, BorderLayout.NORTH);
		
		JPanel argumentPanel = new JPanel(new BorderLayout());
		
		JPanel indicePanel = new JPanel(new GridLayout(1, 3));
		JLabel indiceLabel = new JLabel("Valeur de l'indice (K)");
		JButton indiceButton = new JButton("+");
		indiceButton.addActionListener(new IndiceListener());
		InterfaceCLI.indiceValue = new JTextField();
		indicePanel.add(indiceLabel);
		indicePanel.add(InterfaceCLI.indiceValue);
		indicePanel.add(indiceButton);
		
		argumentPanel.add(indicePanel, BorderLayout.NORTH);
		
		JPanel alphaPanel = new JPanel(new GridLayout(1, 3));
		JLabel alphaLabel = new JLabel("Valeur de alpha (A)");
		InterfaceCLI.alphaValue = new JTextField();
		JButton alphaButton = new JButton("+");
		alphaButton.addActionListener(new AlphaListener());
		alphaPanel.add(alphaLabel);
		alphaPanel.add(InterfaceCLI.alphaValue);
		alphaPanel.add(alphaButton);
		
		argumentPanel.add(alphaPanel, BorderLayout.CENTER);
		
		JPanel epsilonPanel = new JPanel(new GridLayout(1, 3));
		JLabel epsilonLabel = new JLabel("Valeur de epsilon (E)");
		InterfaceCLI.epsilonValue = new JTextField();
		JButton epsilonButton = new JButton("+");
		epsilonButton.addActionListener(new EpsilonListener());
		epsilonPanel.add(epsilonLabel);
		epsilonPanel.add(InterfaceCLI.epsilonValue);
		epsilonPanel.add(epsilonButton);
		
		argumentPanel.add(epsilonPanel, BorderLayout.SOUTH);		
		
		contenu.add(argumentPanel, BorderLayout.CENTER);
		
		InterfaceCLI.resultat = new JTextField("");
		InterfaceCLI.resultat.setCaretColor(Color.WHITE);
		
		contenu.add(InterfaceCLI.resultat, BorderLayout.SOUTH);
		
		fenetre.pack();
		fenetre.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	}
}
