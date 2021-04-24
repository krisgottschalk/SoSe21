package aufgaben.aufgabe1;

import javax.swing.JOptionPane;

public class DiceGame 
{	
	public static int pointsToWin;
	private Player[] playerArr;
	private int nrOfPlayers =0;
	
	public int getNrOfPlayers() 
	{
		return nrOfPlayers;
	}
	
	public int getPointsToWin() 
	{
		return pointsToWin;
	}

	public void nrOfPlayers()
	{
		boolean inputOk = false;
		while(!inputOk)
		{
			try {
				String input = JOptionPane.showInputDialog("How many players are playing?");
				this.nrOfPlayers = Integer.parseInt(input);
				inputOk = true;
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, "Input has to be a number. ");
				inputOk = false;
			}
		}
		playerArr = new Player[nrOfPlayers];
	}
	
	public void pointsToWin()
	{
		boolean inputOk = false;
		while(!inputOk)
		{
			try {
				String input = JOptionPane.showInputDialog("Points to win:");
				pointsToWin = Integer.parseInt(input);
				inputOk = true;
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, "Input has to be a number ");
				inputOk = false;
			}
		}
	}
	
	public void namesOfPlayers()
	{
		String name = "";
		for(int i=0; i<this.playerArr.length; i++)
		{
			name = JOptionPane.showInputDialog("Name of player: ");
			playerArr[i] = new Player(name);
		}
	}
	
	public DiceGame()
	{
		this.nrOfPlayers();
		this.pointsToWin();
		this.namesOfPlayers();
	}
	
	public void play()
	{
		boolean won = false;
		int i = 0;
		while(!won)
		{
			won = playerArr[i].wuerfeln();
			if(i<this.getNrOfPlayers()-1)
			{
				i++;
			}
			else
			{
				i = 0;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		DiceGame game = new DiceGame();
		game.play();
		
	}
	
	

}
