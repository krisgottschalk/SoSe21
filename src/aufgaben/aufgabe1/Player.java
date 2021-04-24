package aufgaben.aufgabe1;

import java.util.Random;
import javax.swing.JOptionPane;

public class Player 
{
	private String name;
	private int score;
	
	public Player(String name)
	{
		this.name = name;
		this.score = 0;
	}
	
	public boolean wuerfeln()
	{
		System.out.printf("%n It is player %s's turn to play. Current score: %d", this.name, this.score);
		JOptionPane.showMessageDialog(null, "It is player " + this.name + "'s turn to play. Current score: " + this.score);
		Random r = new Random();
		int scoreThrown = 0;
		
		boolean theEnd = false;
		while(!theEnd)
		{
			int dice = r.nextInt(6)+1;
			if(dice==6)
			{
				System.out.printf("%n You rolled a %d. You lost. 0 Points in this round. Your score is: %d", dice, this.score);
				JOptionPane.showMessageDialog(null, "Sorry, you lost this round. It is the next player's turn. ");
				theEnd = true;
			}
			else if((scoreThrown + dice + this.score) >= DiceGame.pointsToWin)
			{
				scoreThrown = scoreThrown + dice;
				System.out.printf("%n You rolled a %d. You have won. Your score is: %d", dice, this.score+scoreThrown);
				JOptionPane.showMessageDialog(null, "Congratulations, you have won!");
				return true;
			}
			else
			{
				scoreThrown = scoreThrown + dice;
				System.out.printf("%n You rolled a %d. Your current score is: %d", dice, (scoreThrown + this.score));
				int result = JOptionPane.showConfirmDialog(null, this.name + ", do you want to continue playing", 
						"Continue to play? ", JOptionPane.YES_NO_OPTION);
				theEnd = (result==JOptionPane.NO_OPTION);
				if(theEnd)
				{
					this.score = this.score+ scoreThrown;
				}
			}
		}
		return false;

	}

}
