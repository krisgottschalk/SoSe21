package uebungen.uebung3;

import javax.swing.JOptionPane;

public class SekundenUmwandlung 
{

	public static void main(String[] args) 
	{
		String input = JOptionPane.showInputDialog(null, "Gib eine Anzahl von Sekunden ein: ");
		int inputSek = Integer.parseInt(input);
		System.out.println("Gib eine Anzahl von Sekunden ein: " + inputSek);
		

	}

}
