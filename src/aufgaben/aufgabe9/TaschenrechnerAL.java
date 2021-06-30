package aufgaben.aufgabe9;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TaschenrechnerAL extends JFrame implements ActionListener
{
	public int nr1, nr2, result;
	public String str1, op;
	boolean click = false;
	JTextField display;
	
	public TaschenrechnerAL()
	{
		super();
		JPanel content = this.initContent();
		this.getContentPane().add(content);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(200,200);
		this.setSize(280,400);
		this.setTitle("Taschenrechner");
		this.setVisible(true);
	}
	
	public JPanel initContent()
	{
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		
		JPanel oben = new JPanel();
		oben.setLayout(new FlowLayout(FlowLayout.CENTER,15,15));
	
		display = new JTextField(20);
		display.setHorizontalAlignment(JTextField.RIGHT);
		display.setPreferredSize(new Dimension(200,40));
		display.setBackground(new Color(207, 254, 255));
		display.setBorder(BorderFactory.createLineBorder(new Color(204,204,204), 2));
		oben.add(display);
		
		JPanel unten = new JPanel();
		unten.setLayout(new GridLayout(6,3,10,10));
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton b10 = new JButton("(");
		JButton b11 = new JButton("0");
		JButton b12 = new JButton(")");
		JButton b13 = new JButton("*");
		JButton b14 = new JButton("/");
		JButton b15 = new JButton("+");
		JButton b16 = new JButton("-");
		JButton b17 = new JButton("C");
		JButton b18 = new JButton("=");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
		b18.addActionListener(this);
		
		unten.add(b1);
		unten.add(b2);
		unten.add(b3);
		unten.add(b4);
		unten.add(b5);
		unten.add(b6);
		unten.add(b7);
		unten.add(b8);
		unten.add(b9);
		unten.add(b10);
		unten.add(b11);
		unten.add(b12);
		unten.add(b13);
		unten.add(b14);
		unten.add(b15);
		unten.add(b16);
		unten.add(b17);
		unten.add(b18);
		
		mainPanel.add(oben, BorderLayout.NORTH);
		mainPanel.add(unten, BorderLayout.CENTER);
		
		return mainPanel;
	}
	
	public static void main(String[] args) 
	{
		new TaschenrechnerAL();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getActionCommand().toString().equals("+") || e.getActionCommand().toString().equals("-") || e.getActionCommand().toString().equals("*") || e.getActionCommand().toString().equals("/")) 
		{
			click = true;
			op = e.getActionCommand().toString();
		} 
		else 
		{
			if (e.getActionCommand().toString().equals("C")) 
			{
				str1 = "";
				display.setText(str1);
			}
			else 
			{
				if (click) 
				{
					click = false;
					str1 = display.getText();
					nr1 = Integer.parseInt(str1);
					str1 = "";
					display.setText(str1 + e.getActionCommand().toString());
				} 
				else {
					str1 = display.getText();
					display.setText(str1 + e.getActionCommand().toString());
					}
			}

			if (e.getActionCommand().toString().equals("=")) {
				nr2 = Integer.parseInt(str1);
				if (op.equals("+")) {
					result = nr1 + nr2;
				}

				if (op.equals("-")) {
					result = nr1 - nr2;
				}

				if (op.equals("*")) {
					result = nr1 * nr2;
				}

				if (op.equals("/")) {
					result = nr1 / nr2;
				}
				display.setText(String.valueOf(result));
			}
		}
	}
	}

