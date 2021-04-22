package uebungen.uebung2;

import uebungen.uebung2.TicTacToe.State;

public class Testklasse {

	public static void main(String[] args) 
	{
		TicTacToe game = new TicTacToe();
		game.makeMove(1, 1, State.RED);
		game.makeMove(2, 2, State.RED);
		game.makeMove(0, 1, State.BLACK);
		game.makeMove(0, 2, State.BLACK);
		
		game.print();
		game.makeMove(0, 0, State.RED);
		
		game.print();
		
		System.out.println("Das Spiel wurde gewonnen: " + game.gewonnen());
		System.out.println("Das Spiel ging unentschieden aus: " + game.unentschieden());
		

	}

}
