import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class registrationButtonEventListener implements ActionListener {

	static File file = new File("emailpass.txt");
	private String password = null;
	boolean flag = false; 
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
		
		try {
			FileWriter fw = new FileWriter(file);

			fw.write(RegistrationGUI.emailField.getText());	
			fw.write("\r\n");
			fw.write(RegistrationGUI.passwordField.getPassword());
			fw.flush();
			fw.close();
		} catch (IOException e) {
			System.out.println("Some file problems!");
		}
		
		for (char pass : RegistrationGUI.passwordField.getPassword()) {
			password += String.valueOf(pass);
		}
		
		if (password.length() == 0) flag = true;
		
		if(!(RegistrationGUI.emailField.getText().isEmpty())) 
			if (!flag) RegistrationGUI.registrationField.setVisible(false);
		
	//	System.out.println(RegistrationGUI.emailField.getText());
	//	System.out.println(flag);
		
		
	}

}
