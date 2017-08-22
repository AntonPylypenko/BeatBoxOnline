import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleFirstGUi extends JFrame {
		
		JFrame frame = new JFrame("Спєц-проєкт)");
		
		JPasswordField passwordField = new JPasswordField();
		JTextField minutesNumberField = new JTextField("Введіть кількість хвилин...");
		JLabel defisLabel = new JLabel("-------------------------------------");
		JLabel eastDefisLabel = new JLabel("-------------------------------------");
		
		JButton toBlockButton = new JButton("Заблокувати вікно");
		Color color = toBlockButton.getBackground();
		
		JButton passwordButton = new JButton("Я ввів парольку");
		JButton snakeButton = new JButton("Хочу грати в Змійку!");
		JButton inFifteenMinButton = new JButton("Через 15 хв.");
		JButton selfOpinionButton = new JButton("<html>Відправлю <p> по-своєму!<html>");
		JButton paintButton = new JButton("<html>Намалювати<p>автопортрет!<html>");
		JButton exitButton = new JButton("EXIT  →");
		JButton windowSetButton = new JButton("<html>Set default <p>window size!<html>");
		
		JLabel specialFunctionsLabel = new JLabel("       Заблокувати вікно");
		JLabel sentMessageLabel = new JLabel("<html>Відправити<p>повідомлення через: <html>");
		JLabel optionLabel = new JLabel("Опціонально: ");
		JLabel entertainmentLabel = new JLabel("                 Розваги: ");
		
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
		frame.setLocationRelativeTo(null);
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
		toBlockButton.setVisible(false);
		frame.add(passwordField);
		frame.add(passwordButton);
		frame.add(defisLabel);
		
	/** Нижня західна частина  */	
		frame.add(sentMessageLabel);
		frame.add(inFifteenMinButton);
		frame.add(optionLabel);
		frame.add(minutesNumberField);
		frame.add(selfOpinionButton);

	/** Налаштовуємо координацію на заході*/	
		specialFunctionsLabel.setBounds(20, 20, 150, 25);
		toBlockButton.setBounds(20, 50, 150, 25);
		passwordField.setBounds(20, 80, 150, 25);
		passwordButton.setBounds(20, 110, 150, 25);
		defisLabel.setBounds(20, 140, 150, 25);
		
		sentMessageLabel.setBounds(20, 200, 150, 25);
		inFifteenMinButton.setBounds(20, 230, 150, 25);
		optionLabel.setBounds(20, 270, 150, 25);
		minutesNumberField.setBounds(20, 290, 150, 25);
		selfOpinionButton.setBounds(20, 320, 150, 40);
		
	/** Верхня східна частина */
		frame.add(entertainmentLabel);
		frame.add(snakeButton);
		frame.add(paintButton);
		frame.add(eastDefisLabel);
		frame.add(exitButton);
		frame.add(windowSetButton);
		
	/** Налаштовуємо координацію на сході*/
		entertainmentLabel.setBounds(610, 20, 150, 25);
		snakeButton.setBounds(610, 50, 150, 25);
		paintButton.setBounds(610, 80, 150, 50);
		eastDefisLabel.setBounds(610, 135, 150, 25);
		exitButton.setBounds(610, 320, 150, 40);
		windowSetButton.setBounds(610, 270, 150, 40);
		
	/** Налаштовую дієздатність кнопок */	
		toBlockButton.addActionListener(new toBlockButtonEventListener());	
	    passwordButton.addActionListener(new passwordButtonEventListener());
		snakeButton.addActionListener(new snakeButtonEventListener());
		paintButton.addActionListener(new paintButtonEventListener());
	//	frame.pack();
		}
		 
		
			
		
		
		private boolean flag = true;
		public class toBlockButtonEventListener implements ActionListener {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				toBlockButton.setVisible(false);
				
				if (!flag) {
					frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
					toBlockButton.setText("Block screen");
					flag  = true;
					toBlockButton.setBackground(color);
				} else {
//					frame.setUndecorated(true); //забирає рамки
					frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);// робить хрестик не функціональним
					flag = false;
					toBlockButton.setText("Unblock screen");
					toBlockButton.setBackground(Color.RED);
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
					toBlockButton.setVisible(true);
				} else {
					passwordButton.setText("ВВЕДІТЬ ЩЕ РАЗ!");
				}
		}
	}
	
		public class snakeButtonEventListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent arg0) {
						
		//	snakeButton.setVisible(false);
				
		//	GameSnake snake = new GameSnake();
			new GameSnake().go();
			}
		}
	
}


