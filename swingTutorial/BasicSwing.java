package swingTutorial;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class BasicSwing extends JFrame {
	
	JPanel p =new JPanel();
	JButton b =new JButton("Hello");
	JTextField t = new JTextField("Hey",20);  //columns=20
	JTextArea ta = new JTextArea("How\n are\n you\n ?",20,10); //rows,columns
	JLabel label=new JLabel("What's up");  // text which you cannot edit 
	
	String choices[]={"delhi","mumbai","alaska"};
	JComboBox cb = new JComboBox(choices);  // a drop down box with list
	
	public static void main(String args[]){
		new BasicSwing();   //creating an object
	}
	
	public BasicSwing(){
		super( "basic swing app !!"); //calling constructor of jframe/parent class
		                              //, with title as argument
		setSize(400,300);   // size of window
		setResizable(true);
		
		p.add(b); // adding button to panel
		p.add(t);
		p.add(ta);
		p.add(label);
		p.add(cb);
		add(p);   // add panel to jframe
		setVisible(true);  // should be in the last
	}
	
	

}
