package aufgaben.aufgabe3;

import java.util.ArrayList;
import java.util.List;

public class Solitaire 
{
    private Moves game;
    private State[][] field;

    public Solitaire()
    {
        this.game = new Moves();
        this.field = new State[7][7];
        for(int row = 0; row < this.field.length; row++)
        {
            for(int col = 0; col < this.field[row].length; col++)
            {
                if((row < 2 || row > 4) && (col < 2 || col > 4))
                {
                    this.field[row][col] = State.NOT;
                }
                else
                {
                    this.field[row][col] = State.USED;
                }
            }
        }
        this.field[3][3] = State.FREE;
    }

    /*
     * Geben Sie das Spielfeld aus! Am Anfang sollte auf der
     * Konsole so ein Bild erscheinen:
     *     o o o     
     *     o o o     
     * o o o o o o o 
     * o o o   o o o 
     * o o o o o o o 
     *     o o o     
     *     o o o 
     * 
     */
    public void print()
    {
    	for(int row=0; row<this.field.length; row++)
    	{
    		for(int col=0; col<this.field[row].length; col++)
    		{
    			if(this.field[row][col] == State.NOT)
    			{
    				System.out.print("  ");
    			}
    			if(this.field[row][col] == State.USED)
    			{
    				System.out.print("o ");
    			}
    			if(this.field[row][col] == State.FREE)
    			{
    				System.out.print("  ");
    			}
    		}
    		System.out.println();
    	}
    }

    private boolean positionOccupied(int row, int col)
    {
    	if(this.field[row][col] == State.USED)
    	{
    		return true;
    	}
    	return false;
    }
    
    private boolean positionFree(int row, int col)
    {
    	if(this.field[row][col]==State.FREE)
    	{
    		return true;
    	}
    	return false;
    }
    
    /*
     * diese Methode gibt ein true zurueck, wenn von der
     * uebergebenen Position (row,col) ein Zug moeglich ist
     * d.h. 
     * 1. auf der angegebenen Position muss ein Stein sein
     * 2. zwei Steine weiter (oben, unten, rechts oder links)
     *      darf kein Stein sein
     * 3. dazwischen muss ein Stein sein
     */
    public boolean possibleFrom(int row, int col)
    {
    	if(row>=0 && row<=6 && col>=0 && col<=6 && this.positionOccupied(row, col))
    	{
    		if(row<=4 && this.field[row+2][col]==State.FREE && this.field[row+1][col]==State.USED || 
    		   row>=2 && this.field[row-2][col]==State.FREE && this.field[row-1][col]==State.USED || 
    		   col<=4 && this.field[row][col+2]==State.FREE && this.field[row][col+1]==State.USED || 
    		   col>=2 && this.field[row][col-2]==State.FREE && this.field[row][col-1]==State.USED)
    		    	{
    		    		return true;
    		    	}
    	}
        return false;
    }

    /*
     * diese Methode gibt alle Positionen (Point) zurueck,
     * AUF die von (fromRow,fromCol) aus gesprungen werden
     * kann
     */
    public Point[] possibleTo(int fromRow, int fromCol)
    {
        if(!possibleFrom(fromRow, fromCol)) return new Point[0];
        
        List<Point> l1 = new ArrayList<>();
        if(fromRow<=4 && this.positionFree(fromRow+2, fromCol) && this.positionOccupied(fromRow+1, fromCol))
        {
        	l1.add(new Point(fromRow+2, fromCol));
        }
        if(fromRow>=2 && this.positionFree(fromRow-2, fromCol) && this.positionOccupied(fromRow-1, fromCol))
        {
        	l1.add(new Point(fromRow-2, fromCol));
        }
        if(fromCol<=4 && this.positionFree(fromRow, fromCol+2) && this.positionOccupied(fromRow, fromCol+1))
        {
        	l1.add(new Point(fromRow, fromCol+2));
        }
        if(fromCol>=2 && this.positionFree(fromRow, fromCol-2) && this.positionOccupied(fromRow, fromCol-1))
        {
        	l1.add(new Point(fromRow, fromCol-2));
        }
        
        Point[] pointArr = new Point[l1.size()];
        l1.toArray(pointArr);
        return pointArr;
    }

    /* 
     * diese Methode erzeugt ein Moves-Objekt
     * in dieses Moves-Objekt werden mithilfe der
     * Objektmethode addMove() (aus Moves) alle
     * moeglichen Zuege hinzugefuegt
     * (moeglich im aktuellen Zustand von field[][])
     */
    public Moves possibleMoves()
    {
        Moves possibleMoves = new Moves();
        for(int row=0; row< this.field.length; row++)
        {
        	for(int col=0; col<this.field[row].length; col++)
        	{
        		if(this.possibleFrom(row, col))
        		{
        			Point fromPoint = new Point(row,col);
        			Point[] possibleTos = this.possibleTo(row, col);
        			for(int i=0; i<possibleTos.length; i++)
        			{
        				Move move = new Move(fromPoint, possibleTos[i]);
        				possibleMoves.addMove(move);
        			}
        		}
        	}
        }
        possibleMoves.printMoves();
        return possibleMoves;
    }

    /*
     * gibt ein true zurueck, wenn im aktuellen Zustand 
     * von field[][] ueberhaupt noch ein Zug moeglich ist
     * sonst false
     */
    public boolean movePossible()
    {
    	for(int row=0; row<this.field.length; row++)
    	{
    		for(int col=0; col< this.field[row].length; col++)
    		{
    			if(this.possibleFrom(row, col))
    	    	{
    	    		return true;
    	    	}
    		}
    	}
        return false;
    }

    /*
     * ruft die Methode move(Move move) auf,
     * wenn ein Zug moeglich ist (dann true zurueck)
     * sonst false
     */
    public boolean moveFirstPossible()
    {
        if(!movePossible()) return false;
        else
        { 
        	this.possibleMoves();
        	Move move = this.possibleMoves().getMoveAtIndex(0);
        	this.move(move);
        	return true;
        }
       
    }

    /*
     * hier wird der Zug Move move ausgefuehrt
     * nach dem Zug ist 
     * 1. die from-Position leer
     * 2. die to-Position mit einem Stein besetzt
     * 3. dazwischen leer (Stein wird "entfernt")
     * falls Zug nicht moeglich, wird eine 
     * IllegalArgumentException geworfen 
     */
    public void move(Move move) throws IllegalArgumentException
    {
    	int btwnRows = (move.getFrom().getRow() + move.getTo().getRow())/2;
    	int btwnCols = (move.getFrom().getCol() + move.getTo().getCol())/2;
    	
    	try {
    		this.field[move.getFrom().getRow()][move.getFrom().getCol()] = State.FREE;
    		this.field[btwnRows][btwnCols] = State.FREE;
    		this.field[move.getTo().getRow()][move.getTo().getCol()] = State.USED;
    		this.game.addMove(move);
    	}
    	catch(ArrayIndexOutOfBoundsException e)
    	{
    		throw new IllegalArgumentException("Move is not possible (" + move.getFrom().getRow() + ", " + move.getFrom().getCol() + ") --> ("
    				+ move.getTo().getRow() + ", " + move.getTo().getCol() + ")");
    	}

    }

}
