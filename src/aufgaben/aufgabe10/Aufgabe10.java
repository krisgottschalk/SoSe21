package aufgaben.aufgabe10;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.*;

public class Aufgabe10 extends JFrame
{
	Canvas canvas;
	
	public Aufgabe10()
	{
		super();
		this.canvas = new Canvas();
		this.getContentPane().add(this.canvas);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(300,200);
		this.setSize(500,550);
		this.setTitle("Berechne PI");
		this.setVisible(true);
	}
	
	private class Canvas extends JPanel
	{
		final int PUNKTE = 20000;
		Random r = new Random();
		
		@Override
		protected void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D)g;
			
			final int ABSTAND = this.getWidth()/20;
			
			int quadLength = this.getWidth()-(2*ABSTAND);
			
			g2.setStroke(new BasicStroke(3.0f));
			g2.setColor(Color.WHITE);
			g2.fillRect(ABSTAND, ABSTAND, quadLength, quadLength);
			g2.setColor(Color.BLACK);
			g2.drawRect(ABSTAND, ABSTAND, quadLength, quadLength);
			g2.drawArc(ABSTAND, ABSTAND, 2*quadLength, 2*quadLength, 90, 90);

			// Punkte malen
			int xm = ABSTAND + quadLength;
			int ym = ABSTAND + quadLength;
			
			for(int i=0; i<PUNKTE; i++)
			{
				int xRandom = r.nextInt(quadLength)+ABSTAND;
				int yRandom = r.nextInt(quadLength)+ABSTAND;
				if((xRandom-xm)*(xRandom-xm) + (yRandom-ym)*(yRandom-ym) <= quadLength*quadLength)
				{
					g2.setColor(Color.RED);
				}
				else if((xRandom-xm)*(xRandom-xm) + (yRandom-ym)*(yRandom-ym) > quadLength*quadLength)
				{
					g2.setColor(Color.BLUE);
				}
				g2.drawOval(xRandom, yRandom, 1, 1);
			
			}
		}
	}
	
	public static void main(String[] args) {
		new Aufgabe10();
	}

}
