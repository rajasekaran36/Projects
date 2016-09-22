import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class numpad extends JPanel implements ActionListener{

String q[]=new String[52];
String ans[]=new String[52];
JTextArea lbl=new JTextArea();
JButton b1=new JButton("1");
JButton b2=new JButton("2");
JButton b3=new JButton("3");
JButton b4=new JButton("4");
JButton b5=new JButton("5");
JButton b6=new JButton("6");
JButton b7=new JButton("7");
JButton b8=new JButton("8");
JButton b9=new JButton("9");
JButton b10=new JButton("10");
JButton b11=new JButton("11");
JButton b12=new JButton("12");
JButton b13=new JButton("13");
JButton b14=new JButton("14");
JButton b15=new JButton("15");
JButton b16=new JButton("16");
JButton b17=new JButton("17");
JButton b18=new JButton("18");
JButton b19=new JButton("19");
JButton b20=new JButton("20");
JButton b21=new JButton("21");
JButton b22=new JButton("22");
JButton b23=new JButton("23");
JButton b24=new JButton("24");
JButton b25=new JButton("25");
JButton b26=new JButton("26");
JButton b27=new JButton("27");
JButton b28=new JButton("28");
JButton b29=new JButton("29");
JButton b30=new JButton("30");
JButton b31=new JButton("31");
JButton b32=new JButton("32");
JButton b33=new JButton("33");
JButton b34=new JButton("34");
JButton b35=new JButton("35");
JButton b36=new JButton("36");
JButton b37=new JButton("37");
JButton b38=new JButton("38");
JButton b39=new JButton("39");
JButton b40=new JButton("40");
JButton b41=new JButton("41");
JButton b42=new JButton("42");
JButton b43=new JButton("43");
JButton b44=new JButton("44");
JButton b45=new JButton("45");
JButton b46=new JButton("46");
JButton b47=new JButton("47");
JButton b48=new JButton("48");
JButton b49=new JButton("49");
JButton b50=new JButton("50");
public numpad(JTextArea lab){
setLayout(new GridLayout(0,10,5,5));
lbl=lab;
addButtons();
iniii();
Activate_Action_Listioners();
qus_setting();
}

public void addButtons()
{
	add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);add(b10);
	add(b11);add(b12);add(b13);add(b14);add(b15);add(b16);add(b17);add(b18);add(b19);add(b20);
	add(b21);add(b22);add(b23);add(b24);add(b25);add(b26);add(b27);add(b28);add(b29);add(b30);
	add(b31);add(b32);add(b33);add(b34);add(b35);add(b36);add(b37);add(b38);add(b39);add(b40);
	add(b41);add(b42);add(b43);add(b44);add(b45);add(b46);add(b47);add(b48);add(b49);add(b50);
}
public void change_qus(JButton b,String s)
{
	lbl.setText(s.toString());
	b.setEnabled(false);
	b.setBackground(Color.ORANGE);
	new Thread(new Qus_frame(s)).start();;
}
public void iniii()
{
	for(int i=1;i<=50;i++)
	{
		q[i]=new String("Qustion Number - "+String.valueOf(i));
	}
}
public void Activate_Action_Listioners(){
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
	b19.addActionListener(this);
	b20.addActionListener(this);
	b21.addActionListener(this);
	b22.addActionListener(this);
	b23.addActionListener(this);
	b24.addActionListener(this);
	b25.addActionListener(this);
	b26.addActionListener(this);
	b27.addActionListener(this);
	b28.addActionListener(this);
	b29.addActionListener(this);
	b30.addActionListener(this);
	b31.addActionListener(this);
	b32.addActionListener(this);
	b33.addActionListener(this);
	b34.addActionListener(this);
	b35.addActionListener(this);
	b36.addActionListener(this);
	b37.addActionListener(this);
	b38.addActionListener(this);
	b39.addActionListener(this);
	b40.addActionListener(this);
	b41.addActionListener(this);
	b42.addActionListener(this);
	b43.addActionListener(this);
	b44.addActionListener(this);
	b45.addActionListener(this);
	b46.addActionListener(this);
	b47.addActionListener(this);
	b48.addActionListener(this);
	b49.addActionListener(this);
	b50.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource().equals(b1))
		change_qus(b1, q[1]);
	else if(e.getSource().equals(b2))
		change_qus(b2, q[2]);
	else if(e.getSource().equals(b3))
		change_qus(b3, q[3]);
	else if(e.getSource().equals(b4))
		change_qus(b4, q[4]);
	else if(e.getSource().equals(b5))
		change_qus(b5, q[5]);
	else if(e.getSource().equals(b6))
		change_qus(b6, q[6]);
	else if(e.getSource().equals(b7))
		change_qus(b7, q[7]);
	else if(e.getSource().equals(b8))
		change_qus(b8, q[8]);
	else if(e.getSource().equals(b9))
		change_qus(b9, q[9]);
	else if(e.getSource().equals(b10))
		change_qus(b10, q[10]);
	else if(e.getSource().equals(b11))
		change_qus(b11, q[11]);
	else if(e.getSource().equals(b12))
		change_qus(b12, q[12]);
	else if(e.getSource().equals(b13))
		change_qus(b13, q[13]);
	else if(e.getSource().equals(b14))
		change_qus(b14, q[14]);
	else if(e.getSource().equals(b15))
		change_qus(b15, q[15]);
	else if(e.getSource().equals(b16))
		change_qus(b16, q[16]);
	else if(e.getSource().equals(b17))
		change_qus(b17, q[17]);
	else if(e.getSource().equals(b18))
		change_qus(b18, q[18]);
	else if(e.getSource().equals(b19))
		change_qus(b19, q[19]);
	else if(e.getSource().equals(b20))
		change_qus(b20, q[20]);
	else if(e.getSource().equals(b21))
		change_qus(b21, q[21]);
	else if(e.getSource().equals(b22))
		change_qus(b22, q[22]);
	else if(e.getSource().equals(b23))
		change_qus(b23, q[23]);
	else if(e.getSource().equals(b24))
		change_qus(b24, q[24]);
	else if(e.getSource().equals(b25))
		change_qus(b25, q[25]);
	else if(e.getSource().equals(b26))
		change_qus(b26, q[26]);
	else if(e.getSource().equals(b27))
		change_qus(b27, q[27]);
	else if(e.getSource().equals(b28))
		change_qus(b28, q[28]);
	else if(e.getSource().equals(b29))
		change_qus(b29, q[29]);
	else if(e.getSource().equals(b30))
		change_qus(b30, q[30]);
	else if(e.getSource().equals(b31))
		change_qus(b31, q[31]);
	else if(e.getSource().equals(b32))
		change_qus(b32, q[32]);
	else if(e.getSource().equals(b33))
		change_qus(b33, q[33]);
	else if(e.getSource().equals(b34))
		change_qus(b34, q[34]);
	else if(e.getSource().equals(b35))
		change_qus(b35, q[35]);
	else if(e.getSource().equals(b36))
		change_qus(b36, q[36]);
	else if(e.getSource().equals(b37))
		change_qus(b37, q[37]);
	else if(e.getSource().equals(b38))
		change_qus(b38, q[38]);
	else if(e.getSource().equals(b39))
		change_qus(b39, q[39]);
	else if(e.getSource().equals(b40))
		change_qus(b40, q[40]);
	else if(e.getSource().equals(b41))
		change_qus(b41, q[41]);
	else if(e.getSource().equals(b42))
		change_qus(b42, q[42]);
	else if(e.getSource().equals(b43))
		change_qus(b43, q[43]);
	else if(e.getSource().equals(b44))
		change_qus(b44, q[44]);
	else if(e.getSource().equals(b45))
		change_qus(b45, q[45]);
	else if(e.getSource().equals(b46))
		change_qus(b46, q[46]);
	else if(e.getSource().equals(b47))
		change_qus(b47, q[47]);
	else if(e.getSource().equals(b48))
		change_qus(b48, q[48]);
	else if(e.getSource().equals(b49))
		change_qus(b49, q[49]);
	else if(e.getSource().equals(b50))
		change_qus(b50, q[50]);
}
public void qus_setting()
{
	q[1]="The sensitiveness of a level tube decreases if";
	ans[1]="Both viscosity and surface tension are increased";
	q[2]="For true difference in elevations between two points \nA and B,the level must be set up";
	ans[2]="At the exact mid point of A and B";
	q[3]="ABCD is a regular parallelogram plot of land \nwhose angle BAD is 60°.If the bearing of the line \nAB is 30°,the bearing of CD is ?";
	ans[3]="210 Degree";
	q[4]="Keeping the instrument height as 1.5 m, \nlength of staff 4 m, the slope of the ground as 1 in 10, \nthe sight on the down-slope, must be less than";
	ans[4]="25 m";
	q[5]="Types of measurement of angle?";
	ans[5]="Method of repetition and reiteration.";
	q[6]="Types in preliminary survey?";
	ans[6]="Field work, harvesting, level along the centre line, cross sectioning.";
	q[7]="Errors in compass survey?";
	ans[7]="Instrumental, personal errors, other errors.";
	q[8]="Method of finding elevation?";
	ans[8]="Direct method, basometric levelling, hypsometry";
	q[9]="Types of levelling staff?";
	ans[9]="Solid staff, telescopic staff, folding, target, aluminium staff.";
	q[10]="Method in levelling?";
	ans[10]="Fly levelling or Differential leveling, check, profile, \ncross sectional, reciprocal leveling";
	q[11]="How to derive contour interval?";
	ans[11]="Nature of terrain, objective and extend of survey, \nscale of map, time and expense";
	q[12]="How to know the area of cross sections?";
	ans[12]="Formation width, depth, half breadth, sides slope, \ntransverse slope, side heights";
	q[13]="Types of curvature corrections?";
	ans[13]="Single level section, two level sectioning, side hill two level \nsection, side hill three level section";
	q[14]="What should be the difference between the fore bearing \nand back bearing of a station?";
	ans[14]="180 Degree";
	q[15]="What are the instruments used for \ndirection of survey lines?";
	ans[15]="surveyor compass, prismatic compass";
	q[16]="What is meant by true bearing?";
	ans[16]="horizontal angle of true meridian meets at same line";
	q[17]="What is WCB & QB";
	ans[17]="whole circle bearing & quadrantal bearing";
	q[18]="Method of contouring";
	ans[18]="direct method & indirect method";
	q[19]="Contour interval ?";
	ans[19]="vertical distance between any two contour lines.";
	q[20]="Classification of theodolite";
	ans[20]="transit & non transit";
	q[21]="Axis of telescope";
	ans[21]="imaginary line passing through eyepiece and object glass";
	q[22]="Tribach is used for";
	ans[22]="Triangular plate carrying three foot screws.";
	q[23]="Number of links in a 30m metric chain";
	ans[23]="150";
	q[24]="An invar tape is made of an alloy of ";
	ans[24]="nickel & steel";
	q[25]="Bench mark is established by ";
	ans[25]="leveling";
	q[26]="The number of horizontal cross wires \nin a stadia diaphragm is";
	ans[26]="Three";
	q[27]="An ideal vertical curve to join two gradients is";
	ans[27]="parabolic";
	q[28]="Closed contours of decreasing values \ntowards their centre represent ";
	ans[28]="a depression";
	q[29]="Diopter is the power of lens having focal length of";
	ans[29]="100 cm";
	q[30]="A bearing of a line is also known as";
	ans[30]="True bearing";
	q[31]="Difference between fore bearing and back bearing";
	ans[31]="+180,-180";
	q[32]="What is the type of method that can be used to \neliminate local attraction?";
	ans[32]="bearing, included angle method";
	q[33]="What are the methods of stadia system";
	ans[33]="fixed hair method, moveable hair method";
	q[34]="In quadrantal bearing system \nbearing of a line varies from";
	ans[34]="0 degree – 90 degree";
	q[35]="The type of surveying in which curvature of the \nearth is taken into account";
	ans[35]="geodetic surveying";
	q[36]="The lines of the earth’s magnetic field can run from";
	ans[36]="north to south";
	q[37]="In route surveys the most suitable method of contouring is";
	ans[37]="Tacheometer";
	q[38]="When several contours coincides it indicates";
	ans[38]="a vertical cliff";
	q[39]="Geodetic surveying is different from \nplane surveying because";
	ans[39]="the curvature of the earth is considered";
	q[40]="The angel of intersection of the two plane mirror of an \noptical square is";
	ans[40]="45 degree";
	q[41]="The position of a point can be fixed more accurately by";
	ans[41]="perpendicular offsets";
	q[42]="The instrument used for accurate centering \nin plane table surveying is";
	ans[42]="plumbing fork";
	q[43]="The two point problem and \nthree point problem are methods of ";
	ans[43]="resection and orientation";
	q[44]="The number of links per meter length of chain";
	ans[44]="Five";
	q[45]="The smallest length that can be drawn on a map is";
	ans[45]="0.2 mm";
	q[46]="Hydrographic surveys deal with the mapping of ";
	ans[46]="large water bodies ";
	q[47]="An ideal vertical curve to join two gradients, is";
	ans[47]="parabolic";
	q[48]="The intercept of a staff";
	ans[48]="is minimum if the staff is held \ntruly normal to the line of sight";
	q[49]="In chain surveying tie lines are primarily provided";
	ans[49]="To avoid long offsets from chain lines";
	q[50]="Closed contours of decreasing values towards their centre, represent";
	ans[50]="a depression";
}
}