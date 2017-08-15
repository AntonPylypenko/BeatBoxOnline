import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class authorizationButtonEventListener implements ActionListener {

	FileReader fr;
	BufferedReader br = new BufferedReader(fr);
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		String enteredPass = "";
		
		File file = registrationButtonEventListener.file;
		try {
			 fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
		
		for (char pass : Authorization.AuthoPasswordField.getPassword()) {
			enteredPass += String.valueOf(pass);			
		}
		
		try {
			if(enteredPass.equals(br.readLine())&&Authorization.AuthoEmailField.getText().equals(br.readLine())) {
				new SimpleFirstGUi();
			}
		} catch (IOException e) {
			System.out.println("File not found!");
		}
		
	}

}
