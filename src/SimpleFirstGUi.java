import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SimpleFirstGUi extends JFrame {
		
	public	JFrame frame = new JFrame("Special messenger for Japanese groups");
		JButton toBlock = new JButton("Block screen");

		SimpleFirstGUi(){
		frame.setSize(800, 555);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		frame.add(toBlock);
		toBlock.addActionListener(new toBlockEventListener());
		frame.setLocation(300, 100);
		}
		
		public class toBlockEventListener implements ActionListener {

			private boolean flag = true;
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (!flag) {
					frame.setDefaultCloseOperation(EXIT_ON_CLOSE);;
					flag  = true;
					System.out.println("exit_on: " + flag);
				} else {
//					frame.setUndecorated(true); //забирає рамки
					frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);// робить хрестик не функціональним
					flag = false;
					System.out.println("exit_on: " + flag);
					toBlock.setName("Unblock");
				}
			}

		}
}


