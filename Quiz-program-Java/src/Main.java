import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Main extends JFrame{
	JTextArea tax=new JTextArea();
	numpad num=new numpad(tax);
	public Main()
	{
		setForeground(Color.WHITE);
		tax.setFont(new Font("Liberation Serif", Font.BOLD, 20));
		tax.setForeground(Color.BLUE);
		setLayout(new BorderLayout(5,5));
		add(new Heading_Pan(tax),BorderLayout.NORTH);
		add(num,BorderLayout.CENTER);
		setSize(700,700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args){
		new Main();
	}
}
