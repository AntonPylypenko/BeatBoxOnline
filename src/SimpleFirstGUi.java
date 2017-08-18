import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleFirstGUi extends JFrame {
		
		JFrame frame = new JFrame("Спец-проєкт)");
		
		JPasswordField passwordField = new JPasswordField(10);
		JTextField minutesNumberField = new JTextField("Введіть кількість хвилин...");
		
		JButton toBlock = new JButton("Заблокувати екран");
		Color color = toBlock.getBackground();
		
		JButton passwordButton = new JButton("Я ввів парольку");
		JButton snakeButton = new JButton("Хочу грати в червячка!");
		JButton inFifteenMinButton = new JButton("Через 15 хв.");
		JButton selfOpinionButton = new JButton("Відправлю по-своєму!");
		
		JLabel specialFunctionsLabel = new JLabel("Спеціальні можливості");
		JLabel sentMessageLabel = new JLabel("Відправити \n повідомлення через: ");
		JLabel optionLabel = new JLabel("Опціонально: ");
		
		JPanel westPanel  = new JPanel();
		JPanel eastPanel  = new JPanel();
		JPanel southPanel = new JPanel();
		JPanel northPanel = new JPanel(); 
		JPanel westPanelNorth = new JPanel();
		JPanel westPanelSouth = new JPanel();
		GridLayout gridNorth = new GridLayout(4, 0);
		GridLayout gridSouth = new GridLayout(4, 0);
		
		SimpleFirstGUi(){
		
		gridNorth.setVgap(5);	
			
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
		
		westPanel.setLayout(new BoxLayout(westPanel, BoxLayout.Y_AXIS));
		westPanel.add(westPanelNorth, BorderLayout.NORTH);
		westPanelNorth.setLayout(gridNorth);
		
		westPanelNorth.add(specialFunctionsLabel);
		westPanelNorth.add(toBlock);
	//	toBlock.setVisible(false);
		westPanelNorth.add(passwordField);
		westPanelNorth.add(passwordButton);
		
		westPanel.add(westPanelSouth, BorderLayout.CENTER);
		westPanelSouth.setLayout(new GridLayout(15, 0));
		westPanelSouth.add(sentMessageLabel);	
		westPanelSouth.add(inFifteenMinButton);
		westPanelSouth.add(optionLabel);
		westPanelSouth.add(minutesNumberField);
		westPanelSouth.add(selfOpinionButton);
		
		
		eastPanel.add(snakeButton);
		
	//	passwordField.setText("Введіть парольку, будь ласка");
	//  passwordButton.addActionListener(new passwordButtonEventListener());
	//	snakeButton.addActionListener(new snakeButtonEventListener());
	//	toBlock.addActionListener(new toBlockEventListener());	
	//	frame.pack();
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


