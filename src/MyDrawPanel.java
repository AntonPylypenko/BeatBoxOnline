import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

public class MyDrawPanel extends JPanel{
	
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect(20, 50, 100, 100);
		
	}

}
