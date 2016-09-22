import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class Qus_frame extends JFrame implements Runnable{
JTextArea t=new JTextArea(50,30);
JLabel ti=new JLabel("",JLabel.CENTER);
public Qus_frame(String s)
{
	t.setFont(new Font("Liberation Serif", Font.BOLD, 50));
	ti.setFont(new Font("Liberation Serif", Font.BOLD, 100));
	setLayout(new GridLayout(2,0,10,10));
	t.setWrapStyleWord(true);
	t.setText(s);
	add(t);
	add(ti);
	setSize(getMaximumSize());
	setVisible(true);
	
}
public void timer()
{
	int i=60;
	while(i>=0)
	{
		if(i>40&&i<60)
			ti.setForeground(Color.GREEN);
		else if(i>20&&i<40)
			ti.setForeground(Color.BLUE);
		else if(i>0&&i<20)
			ti.setForeground(Color.RED);
		ti.setText(String.valueOf(i));
		i--;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	this.dispose();
}
@Override
public void run() {
	// TODO Auto-generated method stub
	timer();
}
}
