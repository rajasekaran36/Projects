import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Heading_Pan extends JPanel{
	JLabel head1=new JLabel("KGISL INSTITUTE OF TECHNOLOGY",JLabel.CENTER);
	JLabel head2=new JLabel("Dept of Civil Engineering",JLabel.CENTER);
	JLabel head3=new JLabel("QUIZ PROGRAM",JLabel.CENTER);
	JLabel Ins=new JLabel("CHOOSE ANY NUMBER",JLabel.CENTER);
public Heading_Pan(JTextArea t)
{
	setLayout(new GridLayout(7,0,3,3));
	Ins.setFont(new Font("Liberation Serif", Font.BOLD, 40));
	head1.setFont(new Font("Liberation Serif", Font.BOLD, 30));
	head2.setFont(new Font("Liberation Serif", Font.BOLD, 30));
	head3.setFont(new Font("Liberation Serif", Font.BOLD, 30));
	head1.setForeground(Color.BLUE);
	head2.setForeground(Color.MAGENTA);
	head3.setForeground(Color.ORANGE);
	Ins.setForeground(Color.RED);
	t.setEditable(false);
	t.setLineWrap(true);
	t.setOpaque(true);
	add(head1);
	add(head2);
	add(head3);
	add(new JLabel(""));
	add(Ins);
}
}
