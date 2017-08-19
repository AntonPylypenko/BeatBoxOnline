import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleFirstGUi extends JFrame {
		
		JFrame frame = new JFrame("Спец-проєкт)");
		
		JPasswordField passwordField = new JPasswordField();
		JTextField minutesNumberField = new JTextField("Введіть кількість хвилин...");
		JLabel defisLabel = new JLabel("-------------------------------------");
		
		JButton toBlockButton = new JButton("Заблокувати екран");
		Color color = toBlockButton.getBackground();
		
		JButton passwordButton = new JButton("Я ввів парольку");
		JButton snakeButton = new JButton("Хочу грати в червячка!");
		JButton inFifteenMinButton = new JButton("Через 15 хв.");
		JButton selfOpinionButton = new JButton("<html>Відправлю <p> по-своєму!<html>");
		
		JLabel specialFunctionsLabel = new JLabel("  Спеціальні можливості");
		JLabel sentMessageLabel = new JLabel("<html>Відправити<p>повідомлення через: <html>");
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
		toBlockButton.setCursor(new Cursor(Cursor.MOVE_CURSOR));
		frame.setLocation(300, 100);
		frame.setLayout(null);
		
		/** Недороблений код з диспетчерами компоновки*/
	/*	frame.add(westPanel, BorderLayout.WEST);
		frame.add(eastPanel, BorderLayout.EAST);
		frame.add(northPanel, BorderLayout.NORTH);
		frame.add(southPanel, BorderLayout.SOUTH);
		
		westPanel.setLayout(new BoxLayout(westPanel, BoxLayout.Y_AXIS));
		westPanel.add(specialFunctionsLabel);
		westPanel.add(toBlockButton);
	//	toBlock.setVisible(false);
		westPanel.add(passwordField);
		westPanel.add(passwordButton);
		westPanel.add(defisLabel);
		
		westPanel.add(westPanelSouth, BorderLayout.CENTER);
		westPanelSouth.setLayout(new GridLayout(15, 0));
		westPanelSouth.add(sentMessageLabel);	
		westPanelSouth.add(inFifteenMinButton);
		westPanelSouth.add(optionLabel);
		westPanelSouth.add(minutesNumberField);
		westPanelSouth.add(selfOpinionButton);
		
		eastPanel.add(snakeButton);
	*/	

	/** Редагування без диспетчерів компоновки*/
	/** Верхня західна частина */		
		frame.add(specialFunctionsLabel);
		frame.add(toBlockButton);
		frame.add(passwordField);
		frame.add(passwordButton);
		frame.add(defisLabel);
		
	/** Нижня західна частина  */	
		frame.add(sentMessageLabel);
		frame.add(inFifteenMinButton);
		frame.add(optionLabel);
		frame.add(minutesNumberField);
		frame.add(selfOpinionButton);

	/** Налаштовуємо координацію */	
		specialFunctionsLabel.setBounds(20, 20, 150, 25);
		toBlockButton.setBounds(20, 50, 150, 25);
		passwordField.setBounds(20, 80, 150, 25);
		passwordButton.setBounds(20, 110, 150, 25);
		defisLabel.setBounds(20, 140, 150, 25);
		
		sentMessageLabel.setBounds(20, 200, 150, 25);
		inFifteenMinButton.setBounds(20, 230, 150, 25);
		optionLabel.setBounds(20, 260, 150, 25);
		minutesNumberField.setBounds(20, 290, 150, 25);
		selfOpinionButton.setBounds(20, 320, 150, 40);
		
	//	toBlockButton.addActionListener(new toBlockButtonEventListener());	
	//	passwordField.setText("Введіть парольку, будь ласка");
	//  passwordButton.addActionListener(new passwordButtonEventListener());
	//	snakeButton.addActionListener(new snakeButtonEventListener());
	//	frame.pack();
		}

			
		
	/*	
		public class toBlockButtonEventListener implements ActionListener {

			private boolean flag = true;
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				toBlockButton.setVisible(false);
				
				if (!flag) {
					frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
					toBlockButton.setText("Block screen");
					flag  = true;
					toBlock.setBackground(color);
				} else {
//					frame.setUndecorated(true); //забирає рамки
					frameButton.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);// робить хрестик не функціональним
					flag = false;
					toBlock.setText("Unblock screen");
					toBlock.setBackground(Color.RED);
				}
			}
*/
		
		
		
	/*	public class passwordButtonEventListener implements ActionListener {
			
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
*/
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



