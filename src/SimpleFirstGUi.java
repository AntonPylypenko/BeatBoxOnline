import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleFirstGUi extends JFrame {
		
		JFrame frame = new JFrame("Special messenger for Japanese groups");
		JButton toBlock = new JButton("Block screen");
		Color color = toBlock.getBackground();
		JPasswordField passwordField = new JPasswordField(10);
		JButton passwordButton = new JButton("Я ввів парольку");
	//	JButton snakeButton = new JButton("Хочу грати в червячка!");
		
		SimpleFirstGUi(){
			
		frame.setSize(800, 555);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(new GridBagLayout());
		toBlock.setCursor(new Cursor(Cursor.MOVE_CURSOR));
		
		frame.add(toBlock);
		toBlock.addActionListener(new toBlockEventListener());
		passwordButton.addActionListener(new passwordButtonEventListener());
	//	snakeButton.addActionListener(new snakeButtonEventListener());
		
		frame.setLocation(300, 100);
		
		passwordField.setText("Введіть парольку, будь ласка");
		frame.add(passwordField);
		frame.add(passwordButton);
	//	frame.add(snakeButton);
		
		
		
		}
		
		public class toBlockEventListener implements ActionListener {

			private boolean flag = true;
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				toBlock.setVisible(false);
				
				if (!flag) {
					frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
					toBlock.setText("Block screen");
					flag  = true;
					toBlock.setBackground(color);
				} else {
//					frame.setUndecorated(true); //забирає рамки
					frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);// робить хрестик не функціональним
					flag = false;
					toBlock.setText("Unblock screen");
					toBlock.setBackground(Color.RED);
				}
			}

		}
		
		
		public class passwordButtonEventListener implements ActionListener {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {

				char[] enteredPassword = passwordField.getPassword();
				char[] password = {'a', 'n', 't', 'o', 'n'};
				int good = 0;
				
				for (int i = 0; i < password.length; i++) {
					if (password[i] == enteredPassword[i]) {
						good++;
					}
				}
				
				if (good == 5) {
					passwordButton.setText("ПАРОЛЬКУ ПРИНЯТО!");
					toBlock.setVisible(true);
				} else {
					passwordButton.setText("ВВЕДІТЬ ЩЕ РАЗ!");
				}
			}

		}
		
/*		public class snakeButtonEventListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent arg0) {
						
			//	snakeButton.setVisible(false);
				
			//	GameSnake snake = new GameSnake();
			//	snake.go();
			}
		}
*/
}


