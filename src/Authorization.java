import java.awt.*;
import javax.swing.*;

public class Authorization {

 static	JFrame registrationField = new JFrame("Авторизація");
	
	JLabel passwordLabel = new JLabel("            ↓ПАРОЛЬ↓ ");
	JLabel emailLabel = new JLabel("           ↓ПОШТА↓             i");
	JButton authorizationButton = new JButton("Авторизуватися");
	static JPasswordField AuthoPasswordField = new JPasswordField(10);
	static JTextField AuthoEmailField = new JTextField(10);	
	JPanel upper = new JPanel();
	JPanel center = new JPanel();
	
	
	public Authorization() {
		registrationField.setVisible(true);
		registrationField.setLayout(new BorderLayout());
		upper.setLayout(new GridLayout());
		center.setLayout(new GridLayout());
		
		registrationField.setLocation(550, 300);
		registrationField.add(upper, BorderLayout.NORTH);
		registrationField.add(center, BorderLayout.CENTER);
		
		upper.add(emailLabel);
		upper.add(passwordLabel);
		center.add(AuthoEmailField);
		center.add(AuthoPasswordField);
		
		registrationField.add(authorizationButton, BorderLayout.SOUTH);
		registrationField.pack();
		
		authorizationButton.addActionListener(new authorizationButtonEventListener());
	}
	
	
}
