import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleFirstGUi extends JFrame {
		
		JFrame frame = new JFrame("Спец-проєкт)");
		JButton toBlock = new JButton("Заблокувати екран");
		Color color = toBlock.getBackground();
		JPasswordField passwordField = new JPasswordField(10);
		JButton passwordButton = new JButton("Я ввів парольку");
		JButton snakeButton = new JButton("Хочу грати в червячка!");
		
		JLabel specialFunctionsLabel = new JLabel("Спеціальні\r\n можливості");
		
		JPanel westPanel  = new JPanel();
		JPanel eastPanel  = new JPanel();
		JPanel southPanel = new JPanel();
		JPanel northPanel = new JPanel(); 
		
		SimpleFirstGUi(){
			
		frame.setSize(800, 555);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(new BorderLayout());
		toBlock.setCursor(new Cursor(Cursor.MOVE_CURSOR));
		frame.setLocation(300, 100);
		
		frame.add(westPanel, BorderLayout.WEST);
		frame.add(eastPanel, BorderLayout.EAST);
		frame.add(northPanel, BorderLayout.NORTH);
		frame.add(southPanel, BorderLayout.SOUTH);
		
		westPanel.add(specialFunctionsLabel);
		westPanel.add(toBlock);
		toBlock.setVisible(false);
		
		westPanel.add(passwordField);
		westPanel.add(passwordButton);
		eastPanel.add(snakeButton);
		
	//	passwordField.setText("Введіть парольку, будь ласка");
	//  passwordButton.addActionListener(new passwordButtonEventListener());
	//	snakeButton.addActionListener(new snakeButtonEventListener());
	//	toBlock.addActionListener(new toBlockEventListener());	
		
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
	/*	
		public class snakeButtonEventListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent arg0) {
						
			//	snakeButton.setVisible(false);
				
			//	GameSnake snake = new GameSnake();
			//	snake.go();
			}
		}
	*/
}


