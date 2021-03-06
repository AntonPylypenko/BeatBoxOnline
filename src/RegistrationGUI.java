import java.awt.*;
import javax.swing.*;

public class RegistrationGUI {

 static	JFrame registrationField = new JFrame("Реєстрація");
	
	JLabel passwordLabel = new JLabel("            ↓ПАРОЛЬ↓ ");
	JLabel emailLabel = new JLabel("           ↓ПОШТА↓             i");
	JButton registrationButton = new JButton("Зареєструвати");
	static JPasswordField passwordField = new JPasswordField(10);
	static JTextField emailField = new JTextField(10);	
	JPanel upper = new JPanel();
	JPanel center = new JPanel();
	
	
	public RegistrationGUI() {
		registrationField.setVisible(true);
		registrationField.setLayout(new BorderLayout());
		upper.setLayout(new GridLayout());
		center.setLayout(new GridLayout());
		
		registrationField.setLocation(550, 300);
		registrationField.add(upper, BorderLayout.NORTH);
		registrationField.add(center, BorderLayout.CENTER);
		
		upper.add(emailLabel);
		upper.add(passwordLabel);
		center.add(emailField);
		center.add(passwordField);
		
		registrationField.add(registrationButton, BorderLayout.SOUTH);
		registrationField.pack();
		
		registrationButton.addActionListener(new registrationButtonEventListener());
	}
	
	
}
