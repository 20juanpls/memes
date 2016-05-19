import javax.swing.*;
import java.awt.*;

public class myPanel extends JPanel
{

    public myPanel()
    {
    }
    
    public void paintComponent(Graphics g)
    {
    	super.paintComponent(g);
    	setBackground(Color.WHITE);
    	
    	//ImageIcon icon = new ImageIcon("../bread/white.jpg");
    	//Image img = icon.getImage();
    //	g.drawImage(img,50,30,this);
    	
    }
}