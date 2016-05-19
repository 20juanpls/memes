import javax.swing.*;
import java.util.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Image;

public class Boption extends JPanel implements ActionListener
{
	private int brID;
	private boolean check;
	private int last;
	private JPanel m;
	
	public Boption(int b, JPanel mid)
	{
		check=false;
		brID=b;
		last=0;
		m=mid;
	}
	
	public void actionPerformed(ActionEvent e)
    {
   		last=brID;
   		System.out.println("hello");
    }
    
	public void paintComponent(Graphics g)
    {
    	super.paintComponent(g);
    	setBackground(Color.WHITE);
    	ImageIcon replace = new ImageIcon("../bread/background.png");
    
    	if(brID==3)
    	{
    		g.drawImage(replace.getImage(),50,30,this);
    		ImageIcon icon = new ImageIcon("../bread/white.png");
    		Image img = icon.getImage();
    		g.drawImage(img,50,30,this);	
    	}
    		System.out.println("hello2");
    		
    }

	
}
