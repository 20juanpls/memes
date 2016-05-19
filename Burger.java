/**
 * @(#)Burger.java
 *
 * Burger application
 *
 * @author 
 * @period 
 * @lab
 * @version 1.00 2016/5/16
 */
import javax.swing.*;
import java.awt.*;

public class Burger
{
	public static void main(String[] args)
	{
		
		JFrame frame = new JFrame("Burger Inc. Restarurant");
		frame.setLayout(new BorderLayout());
		//pics
		myPanel mid = new myPanel();
		frame.add(mid, BorderLayout.CENTER);
	
		//breads
		JButton Flatbread = new JButton("Flatbread");
		JButton Sourdough = new JButton("Sourdough");
		
		JButton White = new JButton("WhiteBread");
		Boption white2 = new Boption(3, mid);
		White.addActionListener(white2);
		
		JButton WholeG = new JButton("WholeGrain Bread");
		
		JPanel breads = new JPanel();
		breads.setLayout(new GridLayout(2,2));
		
		breads.add(Flatbread);
		breads.add(Sourdough);
		breads.add(White);
		breads.add(WholeG);
		
		frame.add(breads, BorderLayout.WEST);
		
		//veggies
		JPanel vegs = new JPanel();
		vegs.setLayout(new GridLayout(2,2));
		
		JButton let = new JButton("Lettuce");
		JButton tom = new JButton("Tomatoes");
		JButton on = new JButton("Onions");
		JButton pic = new JButton("Pickles");
		
		vegs.add(let);
		vegs.add(tom);
		vegs.add(on);
		vegs.add(pic);
		
		frame.add(vegs, BorderLayout.EAST);
		
		//condiments
		JPanel con = new JPanel();
		con.setLayout(new GridLayout(1,2));
		breads.setMaximumSize(new Dimension(300, 300));
		
		JButton ket = new JButton("Ketchup");
		JButton mustard = new JButton("Mustard");
		JButton mayo = new JButton("Mayo");
		con.add(ket);
		con.add(mustard);
		con.add(mayo);
		
		//meat
		JPanel meat = new JPanel();
		meat.setLayout(new GridLayout(1,2));
		
		JButton angus = new JButton("Angus Beef");
		JButton beef = new JButton("100% Beef");
		JButton ham = new JButton("98% Ham");
		JButton veg = new JButton("Veggie Pattie");
		
		meat.add(angus);
		meat.add(beef);
		meat.add(ham);
		meat.add(veg);
		
		//combined
		JPanel comb = new JPanel();
		comb.setLayout(new BoxLayout(comb, BoxLayout.Y_AXIS));
		comb.add(meat);
		comb.add(con);
		
		frame.add(comb, BorderLayout.SOUTH);
		
		//price
		JPanel comb2 = new JPanel();
		comb2.setLayout(new BoxLayout(comb2, BoxLayout.Y_AXIS));
		JLabel sub = new JLabel("SubTotal: ");
		JLabel tax = new JLabel("Tax: ");
		JLabel total = new JLabel("Total: ");
		
		comb2.add(sub);
		comb2.add(tax);
		comb2.add(total);
		frame.add(comb2, BorderLayout.NORTH);
		
		
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 800);
		frame.setVisible(true);
	}
}