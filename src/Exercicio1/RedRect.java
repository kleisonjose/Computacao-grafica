package Exercicio1;
//RedRect.java: O maior retaÌ‚ngulo possiÌ�vel em vermelho. 
import java.awt.*; 
import java.awt.event.*;

public class RedRect extends Frame 
{ public static void main(String[] args){new RedRect();}

	RedRect() 
	{ 	super("RedRect");
		addWindowListener(new WindowAdapter() 
			{public void windowClosing(WindowEvent e){System.exit(0);}});
		setSize (200, 100); 
		add("Center", new CvRedRect());
		show();
	}
}
