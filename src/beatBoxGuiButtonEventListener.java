import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class beatBoxGuiButtonEventListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		new BeatBox().buildGUI();
	}

}
