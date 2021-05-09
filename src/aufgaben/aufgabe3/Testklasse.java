package aufgaben.aufgabe3;

public class Testklasse {

	public static void main(String[] args) 
	{
		Solitaire game = new Solitaire();
		System.out.printf("%n%n--------- START ----------%n%n");
		game.print();
		
		System.out.printf("%n%n--------- Test possibleFrom  ----------%n%n");
		System.out.println(game.possibleFrom(4,3));
		System.out.println(game.possibleFrom(1,3));
		System.out.println(game.possibleFrom(3,5));
		
		System.out.printf("%n%n--------- Test possibleMoves()  ----------%n%n");
		game.possibleMoves();
		
		System.out.printf("%n%n--------- START ----------%n%n");
	
		int zug =1;
		while(game.moveFirstPossible())
		{
			System.err.println("After "+ zug+". move:");
			System.out.println();
			zug++;
			game.print();	
		}
		System.out.println();
		System.out.println("GAME OVER. No further move is possible");
		game.print();
		

		
		
	}

}
