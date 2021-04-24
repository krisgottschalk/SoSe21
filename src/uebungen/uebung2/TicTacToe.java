package uebungen.uebung2;

public class TicTacToe 
{
	//enum State {EMPTY, RED, BLACK};
	State[][] field;

	public TicTacToe()
	{
		field = new State[3][3];
		for(int i=0; i<field.length; i++)
		{
			for(int j=0; j<field[i].length; j++)
			{
				field[i][j]=State.EMPTY;
			}
		}
	}

	public void makeMove(int i, int j, State player)
	{
		if(field[i][j]==State.EMPTY && player!=State.EMPTY)
		{
			field[i][j]=player;
		}	
	}
	
	public void print()
	{
		for(int i=0; i<field.length; i++)
		{
			for(int j=0; j<field[i].length; j++)
			{
				switch(field[i][j])
				{
				case EMPTY: System.out.print("- "); break;
				case BLACK: System.out.print("o "); break;
				case RED: System.out.print("x "); break;
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public boolean gewonnen()
	{
		for(int z=0; z<field.length; z++)
		{
			if(field[z][0] != State.EMPTY && 
					field[z][0] == field[z][1] &&
					field[z][0] == field[z][2])
			{
				System.out.print("Gewonnen hat: " + field[z][0]);
				return true;
			}
		}
		for(int s=0; s<field[0].length; s++)
		{
			if(field[0][s] != State.EMPTY &&
					field[0][s] == field[1][s] &&
					field[0][s] == field[2][s])
			{
				System.out.print("Gewonnen hat: " + field[0][s]);
				return true;
			}
		}
	
		if(field[0][0] != State.EMPTY &&
		   field[0][0] == field[1][1] &&
		   field[0][0] == field[2][2])
		{
			System.out.println("Gewonnen hat: " + field[1][1]);
			return true;
		}
		if(field[0][2] != State.EMPTY &&
		   field[0][2] == field[1][1] &&
		   field[0][2] == field[2][0])
		{
			System.out.println("Gewonnen hat: " + field[1][1]);
			return true;
		}
		return false;
	}
	
	public boolean unentschieden()
	{
		for(int i=0; i<this.field.length; i++)
		{
			for(int j=0; j<this.field[i].length; j++)
			{
				if(this.field[i][j] == State.EMPTY)
				{
					return false;
				}
			}
		}
		if(!this.gewonnen())
		{
			return true;
		}
		return false;
	}
}
